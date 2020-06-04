package Test;

import java.util.Scanner;

public class c1 {
	
	

	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		double tax = 0.05;
		
      int num;
      System.out.println("Enter 1 or 2\n1: Calculate Tax\n2: Calculate Discount");
      num = reader.nextInt();
      if(num == 1) {
    	  float value;
    	  System.out.println("Enter a value");
    	  value = reader.nextInt();
    	  double r = value+ value*tax;
    	  System.out.println(r);
      } else if(num == 2) {
    	  float value;
    	  System.out.println("Enter a value");
    	  value = reader.nextInt();
    	  double r = value- value*tax;
    	  System.out.println(r);
      } else {
    	  System.out.println("Why?");
      }
     
  //  student mystudent = new student();
  //  System.out.println(mystudent.getStudentInfo());
	}
}
