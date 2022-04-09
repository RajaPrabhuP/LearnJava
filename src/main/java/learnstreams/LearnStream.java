package learnstreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream {
	public static void main(String[] args) {

		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		hmap.put('a', 5);
		hmap.put('b', 10);
		hmap.put('c', 8);
		hmap.put('d', 7);
		hmap.put('e', 6);
		hmap.put('f', 99);
		System.out.println(hmap);	

		System.out.println(hmap);



		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(100);
		list.add(90);
		list.add(2);
		list.add(8);
		list.add(25);
		list.add(9);
		list.add(17);
		System.out.println(list);
		Collections.sort(list);		
		System.out.println(list);
		Collections.sort(list, (i, j)-> (i < j) ?1:-1);
		System.out.println(list);
		List<Integer> collect = list.stream().filter(elm->elm>50).map(elm->elm+1000).collect(Collectors.toList());

		System.out.println(collect);
		list.stream().filter(elm->elm<1100).map(elm->elm / 2).forEach(elm->System.out.println(elm));

	}
}





