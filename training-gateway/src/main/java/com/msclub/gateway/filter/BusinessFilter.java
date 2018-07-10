package com.msclub.gateway.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.msclub.base.rest.RestClient;
import com.msclub.gateway.filter.model.TokenRequest;
import com.msclub.gateway.filter.model.TokenResponse;
import com.msclub.training.web.stater.model.CommonResponse;
import com.msclub.training.web.stater.util.RestClientUtil;

@Component
public class BusinessFilter implements Filter {

	@Autowired
	private RestClient restClient;

	@Autowired
	private RestClientUtil restClientUtil;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String token = request.getHeader("token");

		try {
			if (StringUtils.isNotEmpty(token)) {
				TokenRequest tokenRequest = new TokenRequest();
				tokenRequest.setToken(token);
				HttpEntity<TokenRequest> requestEntity = new HttpEntity<TokenRequest>(tokenRequest);
				ResponseEntity<CommonResponse> commonResposneEntity = restClient.getResponse("/user/token",
						HttpMethod.POST, requestEntity, CommonResponse.class, null);

				CommonResponse commonResponse = commonResposneEntity.getBody();
				if (commonResponse.getStatus()) {
					TokenResponse tokenResponse = restClientUtil.convertResponseToObject(commonResponse,
							TokenResponse.class);
					request.setAttribute("username", tokenResponse.getUsername());
					request.setAttribute("userid", tokenResponse.getUserid());
					chain.doFilter(servletRequest, servletResponse);
					return;
				}
			}
		} catch (Exception e) {
		}
		PrintWriter out = null;
		try {
			out = response.getWriter();
			out.write(restClientUtil.buildFailedCommonResponseToString("权限验证失败，非法或者过期Token，请重新登录！"));
		} finally {
			if (out != null) {
				out.flush();
				out.close();
			}
		}
		return;
	}

	@Override
	public void destroy() {
	}

}
