package javapractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStringByLengths {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("Java");
		list.add("Python");
		list.add("C");
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
