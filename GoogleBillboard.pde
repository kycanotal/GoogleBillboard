public final static String e = "2.718281828459045235360287471352662497757247093699959574966967627724076630353547594571382178525166427427466391932003059";  
public void setup()  
{            
    for (int scan = 0; scan < e.length()-1; scan++)
     {
     	double truth = Double.parseDouble(e.substring(scan, scan+9));
     		if (isPrime(truth) == true)
     		{
     			System.out.println(truth);
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
    if(decimals % == 0)
    return false;//your code here   
    return true;  
} 


