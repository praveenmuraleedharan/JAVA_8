package Streams;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamAndPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> stream = Stream.of("one","two","three","four","five");
		
		Predicate<String> p1 = s -> s.length() > 3;
		Predicate<String> p2 = Predicate.isEqual("three");
		
//		stream	.filter(p1)
//				.filter(p2)
//				.forEach(s->System.out.println(s));

		stream	.filter(p1.or(p2))
				.forEach(s->System.out.println(s));

		
	}

}
