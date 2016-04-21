package com.qtp.selenium;


import org.testng.annotations.Test;

public class Test1 {
//	@Parameters("browser")

 @Test
 //(dataProvider="getData")
 public void abc(){
	System.out.println("****************************************|Printing abc*************************"); 
	//System.out.println(b);
	//Note always run this test from testng suite and not alone otherwise an exception will be thrown
	
/*	//Make the desired capability object as below
	DesiredCapabilities cap = null;
	//We get the value of b from arguments passed from the @parameters from parameters defined in testng.xml
	//We just need to give this command in testng.xml below the test name
	//<test name="Test 1">
	//<parameter name="browser" value="chrome"/>
	
	
	if(b.equals("firefox")){
	cap = DesiredCapabilities.firefox();
    cap.setBrowserName("firefox");
	//Platform can be windows mac etc so set to any
    cap.setPlatform(Platform.ANY);
	}
	if(b.equals("chrome")){
		cap = DesiredCapabilities.chrome();
	    cap.setBrowserName("chrome");
		//Platform can be windows mac etc so set to any
	    cap.setPlatform(Platform.ANY);
		}
	
	if(b.equals("iexplore")){
		cap = DesiredCapabilities.internetExplorer();
	    cap.setBrowserName("iexplore");
		//Platform SHOULD BE WINDOWS FOR IEPLORERER
	    cap.setPlatform(Platform.WINDOWS);
		}
	
	//For the below command import 
    //import java.net.MalformedURLException;
   // import java.net.URL;
    //and throw Malformed exception
//VVVVIMP dont forget to append wd/hub in the end in the below line
    WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
    //If the hub is on another machine instead of above command we type
  //  WebDriver driver = new RemoteWebDriver(new URL("http://l92.168.1.5:4444/wd/hub"), cap);

    
	driver.get("https://google.com/");
	driver.quit();

	
	
 }

	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object data[][] = new Object[2][1];
		data[0][0] ="firefox";
		data[1][0] ="chrome";
	    //If we want to run more no of browsers paralley and we gave max instances equal to 2 or 3 in cmd like
	//-maxSession 3 then more browsers  will only open if previously are closed
		//We can go to local host to see how many browsers are opne how many are pending etc.
		/*
		data[2][0] ="firefox";
	    data[3][0] ="chrome";
		data[4][0] ="chrome";
		data[5][0] ="chrome";
	
		return data;
	*/
 }
	
}
