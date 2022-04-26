package day1;

public class BattleApp {

	public static void main(String[] args) {
		Wizard wi = new Wizard();
		wi.setName("ウィズ");
		wi.setHp(100);
		wi.setMp(100);

		Wand wa = new Wand();
		wa.setName("つえA");
		wa.setPower(1.5);

		wi.setWand(wa);


		Hero h = new Hero();
		h.setName("勇者");
		h.setHp(100);

		wi.heal(h);

		System.out.println(h);

	}

}
