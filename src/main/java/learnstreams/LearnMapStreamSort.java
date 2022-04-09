package learnstreams;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LearnMapStreamSort {

	public static void main(String[] args) {
		
		String str = "ZZSAZSAZZZZXCXXXSDESSXXXZSDFXX";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		for(char ch : str.toCharArray()) {
			
			if(hmap.containsKey(ch)) {
				hmap.put(ch, hmap.get(ch) + 1);
			}else {
				hmap.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> eachEntry : hmap.entrySet()) {
			System.out.print(eachEntry.getKey()+""+eachEntry.getValue()+"  ");
		}
		System.out.println(hmap);
		
		Map<Character, Integer> collect = hmap.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	
		for(Map.Entry<Character, Integer> eachEntry : collect.entrySet()) {
			System.out.println(eachEntry.getKey()+" "+eachEntry.getValue()+"  ");
		}
	}

}
