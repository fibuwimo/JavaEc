package pc;

public class Pc {
	IUSB usb;

	public void setusb(IUSB usb) {
		this.usb=usb;
	}
	public void executeUSB() {
		this.usb.execute();
	}



}
