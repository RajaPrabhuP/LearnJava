package learnstreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LearnFlatMap {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> colList = Arrays.asList(list1,list2,list3);
		List<Integer> flat=colList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(flat);
		
		List<Integer> collect = colList.stream().flatMap(x->x.stream().filter(elm->elm%2==0).map(elm->elm+100)).collect(Collectors.toList());
		Collections.sort(collect, (i,j)->i<j?1:-1);
		System.out.println(collect);
		collect.forEach(elm->System.out.println(elm));
	}
}
