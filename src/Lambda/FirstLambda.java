package Lambda;
import java.io.File;
import java.io.FileFilter;


public class FirstLambda {

	public static void main(String[] args) {
		// Traditional Way of Implementing Anonymous Class
		
		FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".docx");
			}
		};
			
		File dir = new File("C:/Users/AG25591/Desktop");
		File[] files=dir.listFiles(filter);
		System.out.println("Traditional Way: \n");
		for(File f: files){
			System.out.println(f);
		}
		
		// Lambda Expression Way
		
		FileFilter filterLambda = (File pathname) -> pathname.getName().endsWith(".docx");
		
		File dir2 = new File("C:/Users/AG25591/Desktop");
		File[] files2=dir.listFiles(filterLambda);
		System.out.println("\nLambda Expression Way:\n");
		for(File f: files2){
			System.out.println(f);
		}
	}

}
