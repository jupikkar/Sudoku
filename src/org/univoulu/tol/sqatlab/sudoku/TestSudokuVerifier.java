package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void testIfVerifyMethodAcceptsCorrectSolution() {
		
		SudokuVerifier sudoku = new SudokuVerifier(); 
		String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(1, sudoku.verify(correctString));
	}
	
	@Test
	public void testIfFirstRowsAreValid() {
		
		SudokuVerifier sudoku = new SudokuVerifier(); 
		String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(1, sudoku.verify(correctString));
	}

}
