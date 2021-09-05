import java.awt.*;
import java.awt.event.InputEvent;

public class AutoClicker {
	public static void main(String[] args) {
		while(true){
			try {
				Robot r = new Robot();
				int button = InputEvent.BUTTON1_DOWN_MASK;
				System.out.println("blick");
				r.mousePress(button);
				Thread.sleep(25);
				r.mouseRelease(button);
				Thread.sleep(50);
			} catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}