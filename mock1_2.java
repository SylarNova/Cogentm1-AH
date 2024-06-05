package mock1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mock1_2 {

	public static void print(int n) {
		System.out.println("----------Q " + n + " -----------");
	}

	public static void main(String[] args) {
		print(1);
		factorial(8);
		print(2);
		isPrime(4);
		print(3);
		Fibonacci(2);
		print(4);
		palindrome("racecar");
		print(5);
		reverse("Reverse");
		print(6);
		LeapChecker(2004);
		print(7);
		int[] array1 = { 5, 6, 2, 3, 6, 1, 2, 9, 3, 4 };
		bubbleSort(array1);
		print(8);
		int[] array2 = { 90, 70, 62, 87, 99, 55, 81, 72 };
		Report(array2);
		print(9);
		int[][] a1 = { { 5, 6, 7 }, { 4, 2, 1 }, { 9, 8, 7 } };
		int[][] b1 = { { -5, -6, -7 }, { -2, -6, -7 }, { -2, -3, -4 } };
		matrices(a1, b1);
		print(10);
		Bank b = new Bank(500);
		b.deposit(500);
		b.CheckBalance();
		b.withdraw(1100);
		b.CheckBalance();
		b.withdraw(800);
		b.CheckBalance();
		print(11);
		Manager();
		print(12);
	}

//	Write a Java program to find the factorial of a given number.
	public static void factorial(int n) {
		float result = 1;
		for (int i = n; i > 0; i--) {
			result = result * i;
		}
		System.out.println(result);
	}

//	Write a Java program to check whether a number is prime or not.
	public static void isPrime(int n) {
		boolean result = true;
		for (int i = n / 2; i >= 2; i--) {
			if (n % i == 0) {
				result = false;
			}
		}
		System.out.println(result);
	}

//	Write a Java program to print the Fibonacci series up to a given number.
	public static void Fibonacci(int n) {
		int a = 0;
		int b = 1;
		for (int i = a + b; i <= n; i = a + b) {
			System.out.print(i + ", ");
			int b1 = b;
			b = i;
			a = b1;
		}
		System.out.println();
	}

//	Write a Java program to check if a string is a palindrome.
	public static void palindrome(String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			reverse.append(str.charAt(i));
		}
		System.out.println(str.equals((reverse).toString()) ? "Is a palindrome" : "Not a palindrome");
	}

//	Write a Java program to reverse a string.
	public static void reverse(String str) {
		StringBuilder reverse = new StringBuilder();
		for (int i = str.length() - 1; i > -1; i--) {
			reverse.append(str.charAt(i));
		}
		System.out.println(reverse);
	}

//	Write a Java program to check whether a year is a leap year or not.
	public static void LeapChecker(int year) {
		System.out.println(((year % 4 == 0 || year % 100 != 0) && year % 400 == 0) ? "Leap Year" : "not a leap year");
	}

//	Write a Java program to sort an array of integers using bubble sort.
	public static void bubbleSort(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length - 1 - i; j++) {
				if (ary[j] > ary[j + 1]) { // moves through ary
					int temp = ary[j + 1]; // swapping as it
					ary[j + 1] = ary[j]; // Then repeats ary.length times
					ary[j] = temp;
				}
			}
		}
		for (int i : ary) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

//	Write a Java program to calculate the average grade of students and determine the highest and lowest grades.
	public static void Report(int[] Students) {
		float average = 0;
		int Max = 0;
		int Min = 100;
		for (int s : Students) {
			average += s;
			Max = (Max < s) ? s : Max;
			Min = (Min > s) ? s : Min;
		}
		average = average / (Students.length - 1);
		System.out.println("average: " + average + " Heighest: " + Max + " Lowest: " + Min);
	}

//	Write a Java program to multiply two matrices.
	public static void matrices(int[][] a, int[][] b) {
		int[][] result = new int[a.length][b.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				for (int k = 0; k < result.length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}
//	Create a Java class to manage a bank account with functionalities to deposit, withdraw, and check balance.
	public static class Bank{
		private int balance;
		
		Bank(int n){
			this.balance= n;
		}
		
		public void deposit(int n) {
			this.balance +=n;
		}
		public void withdraw(int n) {
			if(this.balance < n) {
				System.out.println("not enough balance to withdraw: "+n);
			} else {
				System.out.println(n+ " has been withdrawn");
				this.balance -= n;
			}
		}
		public void CheckBalance() {
			System.out.println(this.balance);
		}
	}
//	Create a Java program to manage employees with functionalities to add, remove, and display employee details.
	public static class Employee{
		private String name;

		public Employee(String details) {
			this.details = details;
		}

		public void display() {
			System.out.println(this.details);
		}

		public void Remove() {
			this.details = "";
		}
		public void add(String details) {
			this.details = this.details.concat(details);
		}
				
	}
	public static void Manager() {
		Employee e1 = new Employee("name, salary,description");
		e1.display();
		e1.add(", title");
		e1.display();
		e1.Remove();
		e1.display();
		e1.add("new info");
		e1.display();
	}
//	Write a Java program to create a simple calculator using switch case statements.
	public static void calcualtor(Scanner input) {
		System.out.println("Enter the operation: +,-,/,*,%");
		String operation = input.next();
		switch(operation) {
		case "+":
		break;
		case "-":
			break;
		case "/":
			break;
		case "*":
			break;
		case "%":
			break;
		default: System.out.println("invalid input");
		}
	}
	public static List<Double> calculatorHelper(Scanner input) {
		System.out.println("Enter the Operands, type done when done");
		String check = input.next();
		List<Double> ls = new ArrayList<Double>();
		while(!check.equals("done")) {
			double value;
			try {
				value = Double.parseDouble(check);
			} catch(Exception e){
				System.out.println("not a number");
				continue;
			}
			ls.add(value);
			System.out.println("enter next number");
			check = input.next();
		}
		return ls;
	}
	
	public static Double calculatorHelper2(String op, List<Double> ls) {
		Double result = ls.get(0);
		
		return result;
	}
	
	
//	Write a Java program to implement the binary search algorithm for a sorted array.

}
