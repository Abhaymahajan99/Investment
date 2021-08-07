package com.Investment.generics;





import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;





public class Investment_Filelibrary {
	
		
		/**
		 * this method is used to read the data from property file		
		 * @param key
		 * @return the data from property file
		 * @throws IOException
		 */
		
		public String getPropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./Data/commondata.properties1");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		}

		
		
	}


