import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Mobile{

	HashMap<String,ArrayList<String>>mobiles=new HashMap<String,ArrayList<String>>();

	public String addMobile(String company,String model) {
		ArrayList<String>list = new ArrayList<String>();
		if(mobiles.containsKey(company)==false){
			list.add(model);
			mobiles.put(company,list);
			return "model successfully added";
		}
		else{
			list = mobiles.get(company);
			list.add(model);
			mobiles.put(company,list);
			return "model successfully added";
		}
	}

	public ArrayList<String>getModels(String company){
		ArrayList<String>list1 = new ArrayList<String>();
		if((mobiles.containsKey(company)==false)|(mobiles.get(company)==null)){
			return null;
		}
		else{
			list1=mobiles.get(company);
			return list1;
		}
	}
	public String buyMobile(String company, String model){
		ArrayList<String>list1=new ArrayList<String>();
		list1=mobiles.get(company);

		if(mobiles.containsKey(company)==true&&list1.contains(model)==true){
			int j=0;
			if(list1.contains(model)){
				j=list1.indexOf(model);
				list1.remove(j);
			}

			mobiles.put(company,list1);
			return "mobile sold successfully";
		}
		else{
			return "item not available";
		}
	}
}

public class Source {
	public static void main(String args[] ) throws Exception {
		
	}
}