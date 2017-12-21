package sf.crom.SearchSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import sf.crom.SearchSpring.basic.BinarySearch;

@SpringBootApplication
public class SearchSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SearchSpringApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);
		System.out.println("Binary Search " + binarySearch + " binarySearch1 " + binarySearch1);
		printresult(binarySearch);
	}

	public static void printresult(BinarySearch binarySearch) {
		binarySearch.search(new int[] { 1, 2, 3, 4 }, 5);
	}
}
