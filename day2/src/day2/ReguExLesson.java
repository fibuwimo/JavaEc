package day2;

public class ReguExLesson {

	public static void main(String[] args) {
		String s = "Java";
		if(s.matches("Java")) {
			System.out.println("Match!");
		};
		if(s.matches("JavaJava")) {
			System.out.println("Match!");
		};
		if(s.matches("java")) {
			System.out.println("Match!");
		};
		if(s.matches("J.va")) {
			System.out.println("Match!");
		};
		if("Jaaaaaaaaava".matches("Ja*va")) {
			System.out.println("Match!");
		};
		if("あいうxx019".matches(".*")) {
			System.out.println("Match!");
		};
		if("Madfghjk".matches("Ma.*")) {
			System.out.println("Match!");
		};
		if(s.matches("[a-z]{3}")) {
			System.out.println("Match!");
		};
		s="abc,def:ghi";
		String[] words=s.split("[,:]");
		for(String w:words) {
			System.out.print(w+"->");
		}
		String w =s.replaceAll("[beh]","X");
		System.out.println(w);

		Method(3,5,7,9);
		int[] data = {2,4,6,8};
		Method(data);
		System.out.println(sumOf(0,data));

	}

	public static void Method(int...args) {
		for(int i:args) {
			System.out.println(i);
		}

	}
	public static int sumOf(int n,int...nums) {
		int sum=n;
		for(int i:nums) {
			sum+=i;
		}
		return sum;
	}

}
