package ternaryOperatorSample;

public class TernaryOperatorSample {

	public static void main(String[] args) {
		// declare variables
		int mark = 50;
		int passMark = 50;
		String result;
		
		//test to see if the mark is a pass or not
		/*
		if(mark >= passMark) {
			result = "Pass";
		} else {
			result = "Fail";
		}
		*/
		
		result = (mark >= passMark) ? "Pass" : "Fail";

		System.out.println(result);
	}

}
