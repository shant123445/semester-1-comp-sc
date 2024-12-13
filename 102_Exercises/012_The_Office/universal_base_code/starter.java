/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee Dwight = new Employee(1987,"Dwight", "Schrut", 12345);
		Dwight.employeeToString();
		
		Employee Jim = new Employee(1222,"Jim","Halpert",68686);
		Jim.employeeToString();
		
		Employee Pam = new Employee(1111,"Pam","Beesly",93939);
		Pam.employeeToString();
		
		Employee Joe = new Employee(9982,"Joe","Korduglanyan",666666);
		Joe.employeeToString();
		
		double x = Joe.getAnnualSalary();
		System.out.println("Joes annual salary is :" + x);
		double y = Pam.getAnnualSalary();
		System.out.println("Pam annual salary is :" + y);
		double s = Jim.getAnnualSalary();
		System.out.println("Jim annual salary is :" + s);
		double t = Dwight.getAnnualSalary();
		System.out.println("Dwight annual salary is :" + t);
		double a = michael.getAnnualSalary();
		System.out.println("Michael annual salary is :" + a);
		
		n = Joe.raiseSalary(100);
		System.out.println("Joes raised annual salary is :" + v);
		m = Pam.raiseSalary(16);
		System.out.println("Pan raised annual salary is :" + m);
		j = Jim.raiseSalary(0);
 		System.out.println("Jim raised annual salary is :" + j);
		k =	Dwight.raiseSalary(9);
		System.out.println("Dwight raised annual salary is :" + k);
		i =	Michael.raiseSalary(1);
		System.out.println("Michael raised annual salary is :" + i);
		
	}
}
