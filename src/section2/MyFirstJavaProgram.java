package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
	Robot walle=new Robot();
	walle.penDown();
	for (int i = 0; i < 4 ;i++) {
		walle.move(100);
		walle.turn(90);
	}
	
		
	}
}
