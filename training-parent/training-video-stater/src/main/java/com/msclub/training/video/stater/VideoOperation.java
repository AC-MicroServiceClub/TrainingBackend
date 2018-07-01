package com.msclub.training.video.stater;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class VideoOperation {
	
	private void getThumb(String videoFilename, String thumbFilename, int width,
            int height, int hour, int min, float sec) throws IOException,
            InterruptedException
    {
    	String systemTpye = System.getProperty("os.name").toLowerCase();
    	String ffmpegApp = "";
    	
    	if (systemTpye.indexOf("linux")>=0) {
    		ffmpegApp = "/usr/local/ffmpeg2/bin/./ffmpeg";    		
    	} else {
    		ffmpegApp = "C:\\Users\\dell\\Desktop\\NewIT\\MicroService\\ffmpeg\\bin\\ffmpeg.exe";
    	}
    	
        ProcessBuilder processBuilder = new ProcessBuilder(ffmpegApp, "-y",
                "-i", videoFilename, "-vframes", "1", "-ss", hour + ":" + min
                        + ":" + sec, "-f", "mjpeg", "-s", width + "*" + height,
                "-an", thumbFilename);

        Process process = processBuilder.start();

        InputStream stderr = process.getErrorStream();
        InputStreamReader isr = new InputStreamReader(stderr);
        BufferedReader br = new BufferedReader(isr);
        String line;
        while ((line = br.readLine()) != null)
            ;
        process.waitFor();
        
        if(br != null)
            br.close();
        if(isr != null)
            isr.close();
        if(stderr != null)
            stderr.close();
    }

    public void firstBlameToImage(String videoPath, String imagePath) throws Exception
    {
    	int lastIndex = videoPath.lastIndexOf("\\");
    	String videoName = videoPath.substring(lastIndex, videoPath.length());
    	String videoName2 = videoName.substring(1, videoName.length());
    	String imageName = videoName2 + ".png";
    	String imageFile = imagePath + imageName;
    	
    	VideoOperation videoThumbTaker = new VideoOperation();
        videoThumbTaker.getThumb(
        		videoPath,
        		imageFile,
        		800, 600, 0, 0, 1);
    }
}
