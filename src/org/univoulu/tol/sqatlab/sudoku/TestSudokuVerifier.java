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
	public void testIfVerificationFailsWithTooManyCharacters(){
		SudokuVerifier sudoku = new SudokuVerifier();
		String tooManyDigits = "417369825632158947958724316825437169791586432346912723432458289643571573291684164875293";
		assertEquals(-1, sudoku.verify(tooManyDigits));
	}
	
	@Test
	public void testIfAllRowsAreInvalidWithIncorrectString() {
		
		SudokuVerifier sudoku = new SudokuVerifier(); 
		String incorrectString = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		assertEquals(0, sudoku.verify(incorrectString));
	}

}
