import java.util.Arrays;
import java.util.List;

public class FirstDemo3 {

	public static void main(String[] args) {

		List<String> javacourses = Arrays.asList("corejava", "advjava", "springboot", "restapi", "microservices");

		javacourses.stream().limit(3).forEach(c -> System.out.println(c));

		javacourses.stream().skip(3).forEach(c -> System.out.println(c));

		List<String> names = Arrays.asList("raja", "rani", "raja", "rani", "guru");
		names.stream().distinct().forEach(name -> System.out.println(name));

	}
}