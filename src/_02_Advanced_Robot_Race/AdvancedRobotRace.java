package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot[] robot = new Robot[5];
		//3. use a for loop to initialize the robots.
		for(int i = 0; i<robot.length;i++) {
			robot[i] = new Robot();
			robot[i].setY(800);
			robot[i].setX(100 + 300*i);
		}
		Random r = new Random();
		
		Thread r1 = new Thread(()->{
			robot[0].move(r.nextInt(10));
		});
		
		r1.start();
		
		//stop when robot reache stop
	}
	
	
}
