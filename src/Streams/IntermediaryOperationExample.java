package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryOperationExample {

	public static void main(String[] args) {

		// Intermediary Operations are streams that returns streams. Not final methods. 
		// it doesn't produce any final result. Every function is only a declaration and data is not processed
		
		Stream<String> stream = Stream.of("one","two","three","four","five");
		
		Predicate<String> p1 = Predicate.isEqual("two");
		Predicate<String> p2 = Predicate.isEqual("three");

		List<String> list = new ArrayList<String>();
		
		stream
				.peek(System.out::println)
				.filter(p1.or(p2))
				.forEach(list::add);
				//.peek(list::add);
		
		System.out.println("Done:");
		System.out.println("List size:"+ list.size());
		
	}

}
