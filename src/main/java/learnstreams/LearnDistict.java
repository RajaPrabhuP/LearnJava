package learnstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.google.common.collect.Comparators;

public class LearnDistict {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(1,2,3,4,4,4,5,5,6,6,3,4,3,4,34,5,6,9,8,7);
		List<Integer> distintList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(distintList);
		
		Integer intVal = list.stream().distinct().min((val1, val2)->{
			return val1.compareTo(val2);
		}).get();
		System.out.println(intVal);
		
		System.out.println(list.stream().distinct().max((val1,val2)->{
			return val1.compareTo(val2);
		}).get());
		
		System.out.println(list.stream().filter(elm->elm<20).limit(5).map(elm->elm+100).max((val1,val2)->{
			return val1.compareTo(val2);
		}).get());
		
		Object[] array = list.parallelStream().toArray();
		
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		
		int[] arr = {1,2,3,4,5,6,7};
		Arrays.sort(arr);
		
		Collections.sort(list, Comparator.reverseOrder());
		System.out.println(list);
		
		//SecondMaximum
		
		Set<Integer> set = new HashSet<Integer>(list);
		List<Integer> collect = set.stream().filter(elm->elm<30).map(elm->elm+100).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("New Adding for Second commit");
		System.out.println("Third Commit..")
	}
	

}
