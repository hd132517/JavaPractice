package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {
	public static void main(String[] args) {
		String imageurl = "http://wonjuni.co.kr/home/wp-content/themes/dt-the7/inc/presets/images/full/skin1.header-logo-regular.png";
		try {
			URL url = new URL(imageurl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")){
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
}
