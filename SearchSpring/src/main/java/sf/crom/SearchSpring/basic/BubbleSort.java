package sf.crom.SearchSpring.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class BubbleSort implements SortAlgo {

	@Override
	public int[] sort(int[] numbers) {
		System.out.println("BubbleSort");
		return numbers;
	}

}
