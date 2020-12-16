package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Student> set = new HashSet<>();
		
		char course = ' ';
		
		for(int i=1; i<=3; i++) {
			
			switch (i) {
			case 1: 
				course = 'A';
				break;
			case 2: 
				course = 'B';
				break;
			case 3: 
				course = 'C';
				break;
			}
			
			System.out.print("How many students for course " + course + "? ");
			
			int quantity = sc.nextInt();
			
			for(int j=0; j<quantity; j++) {
				int code = sc.nextInt();
				set.add(new Student(code));
			}
		}
		
		System.out.println("Total students: " + set.size());	
		
		sc.close();
	}
}