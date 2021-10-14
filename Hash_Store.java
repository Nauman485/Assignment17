package geekster;

import java.util.HashMap;
import java.util.*;

public class Hash_Store {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> data=new HashMap<>();
		for(int i=1;i<=5;i++) {
			data.put(i, sc.nextLine());
		}
		sc.close();
        for(int i : data.keySet()) {
        	System.out.println(i+" "+data.get(i));
        }
	}

}
