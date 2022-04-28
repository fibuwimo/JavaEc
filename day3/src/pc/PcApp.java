package pc;

public class PcApp {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Pc pc=new Pc();
		pc.setusb(new USBMemory());
		pc.executeUSB();
		pc.setusb(new USBFan());
		pc.executeUSB();
		pc.setusb(new USBLight());
		pc.executeUSB();

	}

}
class USBMemory implements IUSB {
	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("データを保存します");

	}
}
class USBFan implements IUSB {
	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("涼しい風を送ります");

	}
}
class USBLight implements IUSB {
	@Override
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("光ります");

	}
}