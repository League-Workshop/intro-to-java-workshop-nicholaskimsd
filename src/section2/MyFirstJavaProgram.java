package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot tetothepig = new Robot();	
tetothepig.setSpeed(200);
tetothepig.turn(-90);
tetothepig.move(300);
tetothepig.turn(-90);
tetothepig.move(100);
tetothepig.turn(180);
tetothepig.penDown();
tetothepig.move(100);
tetothepig.setAngle(130);

for(int i = 0;i<4;i++) {
	tetothepig.move(200);
	tetothepig.turn(90);
}
for(int i = 0;i<4;i++) {
	tetothepig.turn(360);
}
}
	}

