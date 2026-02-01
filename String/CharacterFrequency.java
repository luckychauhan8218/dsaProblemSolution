import java.util.Map;
import java.util.HashMap;
public class CharacterFrequency {
	public static void main(String[] args) {
		String str= "programming";
		Map<Character,Integer> freq=new HashMap<>();
		for(char ch:str.toCharArray()){
			freq.put(ch,freq.getOrDefault(ch, 0)+1);
		}
		for(Map.Entry<Character, Integer>e:freq.entrySet()) {
			System.out.println(e.getKey()+":"+ e.getValue());
		}
	}

}
