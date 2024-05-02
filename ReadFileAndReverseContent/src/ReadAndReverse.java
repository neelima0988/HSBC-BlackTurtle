
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadAndReverse {

	public static void main(String[] args) {
		System.out.println("Welcome HSBC, Thank You for Considering my Candidature for the Role");
		System.out.println("Reading input file input.txt in the project");
		System.out.println("#####################");
		
		
		
		try(PrintWriter out = 
		        new PrintWriter(Files.newBufferedWriter(Paths.get("output.txt")))) {
		    Files.lines(Paths.get("input.txt"))
		    .flatMap(line -> Stream.of(new StringBuilder(line.toString()).reverse()))
		          .collect(Collectors.toCollection(LinkedList::new))
		         .iterator()
		         .forEachRemaining(out::println);
		    
			System.out.println("Writing Reversed content of the input file to output.txt file in the project");
			System.out.println("#####################");
		}catch (Exception e) {
			System.out.println(" There was an error while reading or Writing File, PLease check exception for details"+e.getMessage());
		}
		System.out.println("##########THANK YOU ###########");
	}
}
