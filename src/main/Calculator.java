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

		Rectangle rectangle = new Rectangle(sideA, sideB);

		pw.println("Program will shut down.");
	}

}
