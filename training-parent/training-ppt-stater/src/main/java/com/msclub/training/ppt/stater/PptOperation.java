package com.msclub.training.ppt.stater;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;

public class PptOperation {
	
public void pptToImage(String pptPath, String imagePath) throws Exception { 
        
		int lastIndex = pptPath.lastIndexOf("\\");
		String imageName = pptPath.substring(lastIndex, pptPath.length())
				.replace("\\", "");
		
        // creating an empty presentation
        File serverFile = new File(pptPath);
        XMLSlideShow ppt = new XMLSlideShow(new FileInputStream(serverFile));

        // getting the dimensions and size of the slide
        Dimension pgsize = ppt.getPageSize();
        List<XSLFSlide> slide = ppt.getSlides();
        BufferedImage img = null;
        FileOutputStream outPpt = null;

        for (int i = 0; i < slide.size(); i++) {
            img = new BufferedImage(pgsize.width, pgsize.height, BufferedImage.TYPE_INT_RGB);
            Graphics2D graphics = img.createGraphics();

            // clear the drawing area
            graphics.setPaint(Color.white);
            graphics.fill(new Rectangle2D.Float(0, 0, pgsize.width, pgsize.height));

            // render
            slide.get(i).draw(graphics);

            // creating an image file as output
            outPpt = new FileOutputStream(imagePath+imageName+"_"+i+".png");

            javax.imageio.ImageIO.write(img, "png", outPpt);
            ppt.write(outPpt);
        }
        
        outPpt.close();
    }
}
