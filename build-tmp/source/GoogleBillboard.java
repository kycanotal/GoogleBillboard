import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class GoogleBillboard extends PApplet {

public final static String e = "2718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
    for (int scan = 0; scan < e.length()-1; scan++)
     {
     	double truth = Double.parseDouble(e.substring(scan, scan+10));
     		if (isPrime(truth) == true)
     		{
     			System.out.println(truth);
     			break;
     		}
     }
   //your code here 
}  
public void draw()  
{   
	//not needed for this assignment
}  
public boolean isPrime(double decimals)  
{   
    if(decimals < 2)
    return false;
    for(int i = 2; i <= Math.sqrt(decimals); i++)
    if(decimals % i == 0)
    return false;//your code here   
    return true;  
} 


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "GoogleBillboard" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
