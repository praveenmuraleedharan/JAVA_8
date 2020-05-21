package Streams;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(10,10,10);
		
		Integer red=
		list.stream()
					//.reduce(0, (i1,i2) -> i1+i2);
					.reduce(0,Integer::sum);
		
		System.out.println("Red: "+red);
		
		List<Integer> list2 = Arrays.asList(10);
		
		Integer red2=
		list2.stream()
					//.reduce(0, (i1,i2) -> i1+i2);
					.reduce(100,Integer::sum);
		

		System.out.println("Red - When reduce has incorrect identity element: "+red2);
		
		
		List<Integer> list3 = Arrays.asList();
		
		Integer red3=
		list3.stream()
					//.reduce(0, (i1,i2) -> i1+i2);
					.reduce(100,Integer::sum);
		

		System.out.println("Red - When list is empty: "+red3);
		
		List<Integer> list4 = Arrays.asList(10,20,30);
		
		Integer red4=
		list4.stream()
					//.reduce(0, (i1,i2) -> i1+i2);
					.reduce(100,Integer::max);
		

		System.out.println("MAX - When the max of arraylist values and identity element: "+red4);

		List<Integer> list5 = Arrays.asList(-10,-20);
		
		Optional<Integer> red5=
		list5.stream()
					//.reduce(0, (i1,i2) -> i1+i2);
					.reduce(Integer::max);
		

		System.out.println("OPTIONAL MAX - When the max of arraylist values and identity element (Negative Value): "+red5);

	
	}

}
