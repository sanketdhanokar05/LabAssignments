import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Activity{
  //Implement Activity class here..
  String string1;
String string2;
String operator;
public Activity(String string1, String string2, String operator) {
this.string1 = string1;
this.string2 = string2;
this.operator = operator;
}
}

public class Source {
  //Implement the two function given in description in here...
  public String handleException(Activity a) {
String string;
try {
if (a.string1.equals(null) || a.string2.equals(null))
throw new NullPointerException("Null values found");
if (!(a.operator.equals("+")) && !(a.operator.equals("-")))
throw new Exception("Default exception"+a.operator);
}
catch (NullPointerException ex) {
string= "Null values found";
//System.out.println(string);
return string;
}
catch (Exception e) {
string= "Default Exception"+a.operator;
//System.out.println(string);
return string;
}
return "No Exception Found";
}
public String doOperation(Activity a){
//String string = a.operator;
String result= new String();
switch (a.operator) {
case "+":{result=a.string1.concat(a.string2);
//System.out.println(result);
return result;
}
case "-":{ String regex=a.string2;
result=a.string1.replaceAll(regex, "");
//System.out.println(result);
return result;
}
}
return result ;
}
  
	public static void main(String args[] ) throws Exception {
   Source source=new Source();
Activity activity = new Activity("Helloworld", "world", "+");
source.handleException(activity);
source.doOperation(activity);
	}
}