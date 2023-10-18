package JavaPrograms;
import java.util.*;   
import java.io.*;   
import java.lang.Math;  
public class RomanToInt 
{   
  int value(char romanNum)   
  {   
    if (romanNum == 'I')   
      return 1;   
    if (romanNum == 'V')   
      return 5;   
    if (romanNum == 'X')   
      return 10;   
    if (romanNum == 'L')   
      return 50;   
    if (romanNum== 'C')   
      return 100;   
    if (romanNum== 'D')   
      return 500;   
    if (romanNum== 'M')   
      return 1000;   
    return -1;   
  }   
  int convertRomanToInt(String s)   
  {   
    int res= 0;   

    for (int i=0; i<s.length(); i++)   
    {   
      int v1 = value(s.charAt(i));   
      if (i+1 <s.length())   
      {   
        int v2 = value(s.charAt(i+1));     
        if (v1 >= v2)   
        {    
          res = res + v1;   
        }   
        else  
        {   
          res = res- v1;   
        }   
      }   
      else  
      {   
        res = res + v1;   
      }   
    }   
    return res;   
  }   
  public static void main(String args[])   
  {   
    RomanToInt romanToInte = new RomanToInt();  
    String romanStr= "IX"; 
    System.out.println("The coversion of RomanToInteger value is: "+romanToInte.convertRomanToInt(romanStr));   
    romanStr="I";
    System.out.println("The coversion of RomanToInteger value is: "+romanToInte.convertRomanToInt(romanStr));   
    romanStr="IV";
    System.out.println("The coversion of RomanToInteger value is: "+romanToInte.convertRomanToInt(romanStr));   
    romanStr="LC";
    System.out.println("The coversion of RomanToInteger value is: "+romanToInte.convertRomanToInt(romanStr));   
    romanStr="DM";
    
    System.out.println("The coversion of RomanToInteger value is: "+romanToInte.convertRomanToInt(romanStr));   
  }   
}  