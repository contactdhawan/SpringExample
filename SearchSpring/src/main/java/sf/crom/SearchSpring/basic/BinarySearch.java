package sf.crom.SearchSpring.basic;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component

public class BinarySearch {

	@Autowired
	@Qualifier("quick")
	SortAlgo sortAlgo;

	public BinarySearch() {
	}

	/*public BinarySearch(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}
*/
	public int search(int[] numbers, int numberToSearch) {
		int[] sortedNumbers = sortAlgo.sort(numbers);
		// search numberToSearch in sorted numbers
		return 5;
	}

}
