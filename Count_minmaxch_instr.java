package geekster;

import java.util.HashMap;

public class Count_minmaxch_instr {
	public static void main(String []args) {
		String str="Tit for tat is a proverb";
		str=str.toLowerCase();
		HashMap<Character,Integer> dataMap =new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
          char ch=str.charAt(i);
          if(ch>='a' && ch<='z') {
        	  if(dataMap.containsKey(ch)) {
        		  Integer value=dataMap.get(ch);
        		  value++;
        		  dataMap.put(ch, value);
        	  }
        	  else {
        		  dataMap.put(ch, 1);
        	  }
          }
		}
		int max=0;
		int min=Integer.MAX_VALUE;
		char charmax=0;
		char charmin=0;
		for(Character key: dataMap.keySet()) {
			if(max<dataMap.get(key)) {
			max=dataMap.get(key);
			charmax=key;
		}
			if(min>dataMap.get(key)) {
				min=dataMap.get(key);
				charmin=key;
			}
	}
	System.out.println(charmax+" "+max);
	System.out.println(charmin+" "+min);
 }
}

