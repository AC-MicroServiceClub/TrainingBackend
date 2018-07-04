package com.msclub.gateway.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BusinessFilter implements Filter {

	@Value("${login.failed.redirect}")
	private String redirect;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		String token = request.getHeader("token");
		String username = request.getHeader("username");
		if (StringUtils.isEmpty(token) || !token.equals(username + "token")) {
			response.sendRedirect(redirect);
			return;
		}
		chain.doFilter(servletRequest, servletResponse);
	}

	@Override
	public void destroy() {
	}

}
