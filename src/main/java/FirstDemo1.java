import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstDemo1 {

	public static void main(String[] args) {

		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot");

		List<String> uicourses = Arrays.asList("html", "css", "bs", "js");

		List<List<String>> courses = Arrays.asList(javacourses, uicourses);
		
		//courses.stream().forEach(c -> System.out.println(c));
		
		Stream<String> fms = courses.stream().flatMap(s -> s.stream());
		
		fms.forEach(c -> System.out.println(c));

	}
}