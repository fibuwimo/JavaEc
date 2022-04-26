package day1;

import java.util.HashMap;
import java.util.Map;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("!!!!!");


	Map<String,Integer> prefs =new HashMap<>();
	prefs.put("東京",1300);
	prefs.put("神奈川",900);
	prefs.put("熊本",500);
	System.out.println(prefs);

	}
}
