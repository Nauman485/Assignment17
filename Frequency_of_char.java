package geekster;

import java.util.HashMap;

public class Frequency_of_char {
	public static void main(String []args) {
		String str="aaabbbcccddeeeffffksacd";
		HashMap<Character,Integer> data=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z') {
				if(data.containsKey(ch)) {
					Integer value=data.get(ch);
					System.out.println(data.get(ch));
					value++;
					data.put(ch, value);
				}
				else {
					data.put(ch,1);
				}
			}
		}
		for(Character key:data.keySet()) {
				System.out.println(key +" : "+data.get(key));
		}
	}

}