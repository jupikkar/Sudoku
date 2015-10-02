package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		
		List<String> rows = splitEqually(candidateSolution, 9);
		
		for (String row : rows){
			verifyRow(row.toString());
		}
		return 1;
	}
	
	public int verifyRow(String candidateRow) {
		return 0;
	}
	
	//Credit for splitting method to Jon Skeet:
	//http://stackoverflow.com/questions/3760152/split-string-to-equal-length-substrings-in-java
	public static List<String> splitEqually(String text, int size) {
	    // Give the list the right capacity to start with. You could use an array
	    // instead if you wanted.
	    List<String> ret = new ArrayList<String>((text.length() + size - 1) / size);

	    for (int start = 0; start < text.length(); start += size) {
	        ret.add(text.substring(start, Math.min(text.length(), start + size)));
	    }
	    return ret;
	}

}
