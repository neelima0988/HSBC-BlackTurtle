package main.java;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.Resource;

public class ReadAndReverse {

	public String readAndReverseFileContent(String inputFileName, String outputFileName) {
		// LogRecord log = new LogRecord(Level.INFO, "Welcome HSBC, Thank You
		// for Considering my Candidature for the Role");
		// log.
		System.out.println("Welcome HSBC, Thank You for Considering my Candidature for the Role");
		System.out.println("Reading input file input.txt in the project");
		try{
		System.out.println("########## INPUT FILENAME ###########" +inputFileName);
		System.out.println("########## OUTPUT FILENAME ###########" +outputFileName);
		}catch (Exception e) {
			// TODO: handle exception
		}
		String result = "";

		try (PrintWriter out = new PrintWriter(Files.newBufferedWriter(Paths.get(outputFileName)))) {
			Files.lines(Paths.get(inputFileName))
					.flatMap(line -> Stream.of(new StringBuilder(line.toString()).reverse()))
					.collect(Collectors.toCollection(LinkedList::new)).iterator().forEachRemaining(out::println);
			result = "PASS";
		} catch (Exception e) {
			result = "FAIL";
			System.out.println(" There was an error while reading or Writing File, PLease check exception for details"
					+ e.getMessage());
			e.printStackTrace();
			return result;
		}
		System.out.println("########## OUTPUT FILENAME ###########" + outputFileName);
		return result;
	}
}
