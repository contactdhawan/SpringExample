package sf.crom.SearchSpring.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class QuickSort implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("QuickSort");
		return numbers;
	}

}
