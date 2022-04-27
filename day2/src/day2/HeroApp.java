package day2;

public class HeroApp {

	public static void main(String[] args) {
		Hero h1=new Hero("ロト",100);
		Hero h2=new Hero("ロト",200);
		Hero h3=new Hero("ゼシカ",100);
		String str = new String("a");
		String str2 = new String("a");

		if(h1!=h2) {
		System.out.println("同値ではない");
		}
		if(h1.equals(h2)) {
		System.out.println("等価です");
		}
		if(!h1.equals(h3)) {
		System.out.println("等価はありません");
		}
		if(str=="a") {
		System.out.println("文字が同じ");
		}
		if(str==str2) {
		System.out.println("文字が同じ");
		}
	}

}
