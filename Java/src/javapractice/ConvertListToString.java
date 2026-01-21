package javapractice;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToString {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Learn");
		list.add("Selenium");
		list.add("with");
		list.add("Core Java");
		
		System.out.println("List is: "+list);
		
		String result=String.join(" ", list);
		System.out.println(result);
		
	}

}
