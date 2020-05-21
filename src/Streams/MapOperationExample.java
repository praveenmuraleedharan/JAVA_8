package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class MapOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> list2 = Arrays.asList(2,4,6);
		List<Integer> list3 = Arrays.asList(3,5,7);
		
		List<List<Integer>> list4 = Arrays.asList(list1,list2,list3);
		
		Function<List<?>, Integer> size = List::size;
		Function<List<Integer>, Stream<Integer>> flatmapper = l -> l.stream(); 
		
		System.out.println("List of lists:"+list4);
		System.out.println("List size: \n");
		list4.stream()
						//.map(l->l.size())
						//.map(flatmapper)
						.flatMap(flatmapper)
						.forEach(System.out::println);

	}

}
