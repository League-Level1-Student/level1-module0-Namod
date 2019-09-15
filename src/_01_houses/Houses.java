package _01_houses;

import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r2d2 = new Robot();
	
public static void main(String[] args) {
	int size = 200;
	r2d2.penDown();
//	String x = JOptionPane.showInputDialog("What color do you want the robot to draw on?");
	r2d2.setSpeed(500);	
	for (int i = 0; i < 10; i++) {
		   int x = new Random().nextInt(3);
		         
if(  x ==0) {
	house("small");
}
else if(x==1) {
	house("medium");
	
}
else if (x==2) {
	house("large");

}

	

	size+=10;
	house("rand");
	


}
}

static void house(String height){
	int size;
	size = 0;
	r2d2.setPenColor(Color.BLACK);
	if( height.equals("small")) {
 size=60;
}
else if( height.equals("medium")) {
	 size = 120;
}
else if(height.equals("large")) {
	
	size =250;

	
}
	r2d2.move(size);
	r2d2.turn(90);
	drawPointyRoof();
	r2d2.turn(90);
	r2d2.move(size);
	r2d2.turn(-90);
	r2d2.setPenColor(0,128,0);
	r2d2.move(10);
	r2d2.turn(-90);
	
}
static void drawPointyRoof() {
	r2d2.setPenColor(Color.BLACK);
	r2d2.turn(-45);
	r2d2.move(10);
	r2d2.turn(90);
	r2d2.move(10);
	r2d2.turn(-45);

}

}


