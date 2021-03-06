package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// get some numbers from user until -1, sort number and print mid
		runPrintMiddleOfNumbersExercise(sc);
		
		// get line from user ... print reverse ... use stack
		runPrintReverseLineExercise(sc);
		
		// get line from user ... ',' print middle
		runMiddleSentencesOfLineExercise(sc);
		
		// get some words ... print first and last
		runPrintFirstAndLastWordOfLineExercise(sc);
	}

	private static void runPrintMiddleOfNumbersExercise(Scanner sc) {
		System.out.println("Enter numbers until -1:");
		ArrayList<Integer> numbers = new ArrayList<>();
		int number;
		while(true){
			try{
				number = sc.nextInt();
			}catch(Exception e){
				System.out.println(e.getMessage());
				return;
			}
			if(number == -1)
				break;
			numbers.add(number);
		}
		Integer middleNumber = middleOfNumbers(numbers);
		System.out.println("The middle number is: " + middleNumber);
	}

	public static int middleOfNumbers(ArrayList<Integer> numbers) {
		numbers = sortNumbers(numbers);
		int middleIndex = numbers.size()/2;
		Integer middleNumber = numbers.get(middleIndex);
		return middleNumber;
	}

	private static ArrayList<Integer> sortNumbers(ArrayList<Integer> numbers) {
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer number1, Integer number2) {
				if(number1 > number2)
					return 1;
				if(number1 < number2)
					return -1;
				return 0;
			}
		});
		
		return numbers;
	}

	private static void runPrintReverseLineExercise(Scanner sc) {
		System.out.println("Enter one line:");
		String line = sc.nextLine();
		System.out.println("Reverse line is: " + reverseLine(line));
	}

	public static String reverseLine(String line) {
		String[] splittedLine = line.split("\\s+");
		Stack<String> stackLine = new Stack<>();
		if(splittedLine != null && splittedLine.length>0)
			for(String word : splittedLine)
				stackLine.push(word);
		int size = stackLine.size();
		StringBuilder reverseLine = new StringBuilder();
		for(int i=0; i<size; i++)
			reverseLine.append(stackLine.pop() + " ");
		return reverseLine.toString();
	}
	
	private static void runMiddleSentencesOfLineExercise(Scanner sc) {
		System.out.println("Enter one line separated by camma:");
		String line = sc.nextLine();
		System.out.println(middleOfSentences(line));
	}

	public static String middleOfSentences(String line) {
		String[] splittedLine = line.split(",");
		int length = splittedLine.length;
		String middleSentences = splittedLine[length/2];
		return middleSentences != null ? middleSentences.trim() : "";
	}
	
	private static void runPrintFirstAndLastWordOfLineExercise(Scanner sc) {
		System.out.println("Enter some words:");
		String line = sc.nextLine();
		System.out.println("First and last word is: " + firstAndLastOfSentences(line));
	}

	public static String firstAndLastOfSentences(String line) {
		String[] splittedLine = line.split("\\s+");
		int length = splittedLine.length;
		String result = "";
		if(length >= 1){
			String firstWord = splittedLine[0];
			result = firstWord;
			if(length >= 2)
				result += " " + splittedLine[length-1];
		}
		return result;
	}

}
