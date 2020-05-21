package DateAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TRADITIONAL METHOD
		/*{
			Calendar cal = Calendar.getInstance();
			cal.set(2014, 1, 10); // 0 - January, 1 -Feb, 2- March.....
			
			Date feb10th = cal.getTime();
			System.out.println("Date Feb10th: \n"+feb10th);
			
			cal.add(Calendar.DAY_OF_MONTH, 7);
			
			Date feb17th = cal.getTime();
			System.out.println("Date Feb17th: \n"+feb17th);
		}*/
		
		List<Person> persons = new ArrayList<>();
		
		try(
			BufferedReader reader = 
					new BufferedReader(
							new InputStreamReader(
									DateTimeAPI.class.getResourceAsStream("people.txt")));
			Stream<String> stream = reader.lines();
		)
		{
			stream.map(
					line -> {
						String[] s = line.split(" ");
						String name = s[0].trim();
						int year = Integer.parseInt(s[1]);
						Month month = Month.of(Integer.parseInt(s[2]));
						int day = Integer.parseInt(s[3]);
						Person p = new Person(name, LocalDate.of(year, month, day));
						persons.add(p);
						return p;
						
					})
					
					.forEach(System.out::println);
		}
		
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		
		LocalDate now = LocalDate.of(2020, Month.APRIL, 18);
		
		persons.stream().forEach(
				p -> {
					Period period = Period.between(p.getDateofBirth(),now);
					System.out.println(p.getName()+" was born on "+
							period.get(ChronoUnit.YEARS)+ " years and "+
							period.get(ChronoUnit.MONTHS)+ " months");
					
					System.out.println(p.getName()+" is now "+p.getDateofBirth().until(now, ChronoUnit.MONTHS)+" months old");
				});
		
	}

}
