package com.springmvc.log4j;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.PropertyConfigurator;

public class SanchaLogInfo{
	static{
		Layout l= new HTMLLayout();
		Appender ap = null;
		try
		{
			ap = new FileAppender(l,"D://error.html");
			BasicConfigurator.configure(ap);
			//PropertyConfigurator.configure("/WEB-INF/sancha-log4j.properties");
		}catch(Exception e)
		{e.printStackTrace();}
	}

}
