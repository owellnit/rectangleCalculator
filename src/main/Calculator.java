package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Calculator {

	public static void main(String[] args) throws IOException {

		double sideA, sideB, result;
		int operation;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("Rectangle calculator\n");
	
		//Ask for parameters
		pw.println("Enter side A: ");
		sideA = Double.parseDouble(br.readLine());
		
		pw.println("Senter side B: ");
		sideB = Double.parseDouble(br.readLine());

		pw.println("<1> for area calculation, <2> for circumference calculation:");
		operation = Integer.parseInt(br.readLine());
		
		Rectangle rectangle = new Rectangle(sideA, sideB);

		switch (operation) {
		case 1: {
			result = rectangle.calculateArea();
			pw.println("The area is " + result + " squaremeters!");
			break;
		}
		case 2: {
			result = rectangle.calculateCircumference();
			pw.println("The circumference is " + result + " meters!");
			break;
		}
		default:
			pw.println("The function is not available!");
		}
		
		
		pw.println("Program will shut down.");
	}

}
