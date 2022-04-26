package day1;

public class Wand {
	private String name;
	private double power;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name.length()<3) {
			throw new IllegalArgumentException("名前が3文字未満である、処理を中断");
		}
		this.name=name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if(power<0.5 || power>100) {
			throw new IllegalArgumentException("数値がおかしい、処理を中断");
		}
		this.power=power;
	}

}
