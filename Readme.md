PhoneGap Toast Plugin
--------------------------

+ Author: munnadroid
+ License: The MIT License
+ Test on PhoneGap 2.0.0 (cordova 2.0.0)
+ Test on PhoneGap 2.7.0

Installation Instruction
--------------------------

1. Copy **ToastPlugin.java** to your src folder in package **com.phonegap.munnadroid.plugin**
2. Edit res\xml\plugins.xml, add `<plugin name="ToastPlugin" value="com.phonegap.munnadroid.plugin.ToastPlugin"/>` into `<plugins> </plugins>`
4. Import **Toast-Plugin.js** in your .html

How To Use ?
---------------

 1. Normal Use
	window.plugins.Toast.show( Message, Duration, SuccessCallback, FailureCallback);
	
 2.Use Toast.longshow
	Toast.longshow( Message, SuccessCallback, FailureCallback); 
	
 3.Use Toast.longshow
		Toast.shortshow( Message, SuccessCallback, FailureCallback);
	
	
Example
----------
	
	Toast.show("Hello Hi, I am Toast and bite me ! :p" , 500);
		
	Toast.longshow("Hello, I am long Toast");
	
	Toast.shortshow("Hello, I am short Toast");
	