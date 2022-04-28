package day3;

public class Pigeon extends Animal implements Flyable{

	public Pigeon(String name) {
		super(name);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	void makeNoise() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ぽぽぽ");

	}
	public void fly() {
		System.out.println("ばさばさばさっ");
	}

}
