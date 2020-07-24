package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader 
{
  public Properties p;
  public ConfigReader() throws Exception
  {
  File f= new File("config.properties");
  FileInputStream fis= new FileInputStream(f);
  p= new Properties();
  p.load(fis);
  System.out.println(p.getProperty("URL"));
  }
 
  public String URL()
  {
	System.out.println(p.getProperty("URL"));
	return p.getProperty("URL"); 
  }
  public String mobilenum()
  {
	System.out.println(p.getProperty("mobile"));
	return p.getProperty("mobile"); 
  }
  public String pwd()
  {
	  return p.getProperty("pwd");
  }
}

