package day3;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<Animal> list =new ArrayList<>();
		list.add(new Dog("イッヌ"));
		list.add(new Cat("ネッコ"));
		list.add(new Pig("ポルコ"));
		list.add(new Pigeon("ハット"));
		list.add(new Eagle("ワッシ"));
		for(Animal a:list) {
			a.introduce();
			a.makeNoise();
			if(a instanceof Cat) {
				((Cat)a).sleep();
			}
			if(a instanceof Flyable) {
				((Flyable)a).fly();
			}
		}

	}

}
