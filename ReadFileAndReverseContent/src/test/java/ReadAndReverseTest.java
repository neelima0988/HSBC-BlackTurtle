package test.java;
import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ReadAndReverse;

public class ReadAndReverseTest {

	@Test
	public void testSuccess() {
		ReadAndReverse operationRead = new ReadAndReverse();
		String result = operationRead.readAndReverseFileContent("input.txt", "output.txt");
		System.out.println("testSuccess  result : "+result);
		assertEquals("PASS", result);
	}

	@Test
	public void testInputFile() {
		ReadAndReverse operationRead = new ReadAndReverse();
		String result = operationRead.readAndReverseFileContent("", "out1.txt");
		System.out.println("testInputFile  result : "+result);
		assertEquals("FAIL", result);
	}

	@Test
	public void testOutputFile() {
		ReadAndReverse operationRead = new ReadAndReverse();
		String result = operationRead.readAndReverseFileContent("input.txt", "");
		System.out.println("testOutputFile  result : "+result);
		assertEquals("FAIL", result);
	}

}
