package Lambda;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> strings= Arrays.asList("Apple","Mango","Orange");
		
		//Empty Set
		List<String> result = new ArrayList<String>();
		
		//Consumer<String> c1 = s -> System.out.println(s);
		Consumer<String> c1 = System.out::println;
		
		strings.forEach(c1);

		//Consumer<String> c2 = s -> result.add(s);
		Consumer<String> c2 = result::add;
		
		strings.forEach(c2);
		System.out.println("\nSecond Example:\n");
		strings.forEach(c1.andThen(c2));
	}

}
