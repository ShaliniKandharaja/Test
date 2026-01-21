package javapractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromListInteger {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(3);
		
		System.out.println("List : "+list);
		
		Set<Integer> set=new HashSet<Integer>(list);
		
		System.out.println("Set : "+set);
		
		

	}

}
