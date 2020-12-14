package application;

import java.util.ArrayList;
import java.util.List;

public class Program05 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		System.out.println(x);
		
//		list.add(20); // erro de compilacao
		
		List<Object> myObjs = new ArrayList<Object>();
		
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
//		Number x = myNums.get(0); // erro de compilacao

	}
}
