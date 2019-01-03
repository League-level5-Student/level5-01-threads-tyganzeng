package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	
	static int winner = 0;
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
		boolean reachedFinish = false;
		
		
		Thread r1 = new Thread(()->{
			while(robot[0].getY() > 0)
			robot[0].move(r.nextInt(500));
			
			if(winner == 0) {
				winner = 1;
				System.out.println("The winner is robot " + winner);
			}
			
		});
		
		Thread r2 = new Thread(()->{
			while(robot[1].getY() > 0)
			robot[1].move(r.nextInt(500));

			if(winner == 0) {
				winner = 2;
				System.out.println("The winner is robot " + winner);
			}
		});
		
		Thread r3 = new Thread(()->{
			while(robot[2].getY() > 0)
			robot[2].move(r.nextInt(500));

			if(winner == 0) {
				winner = 3;
				System.out.println("The winner is robot " + winner);
			}
		});
		
		Thread r4 = new Thread(()->{
			while(robot[3].getY() > 0)
			robot[3].move(r.nextInt(500));

			if(winner == 0) {
				winner = 4;
				System.out.println("The winner is robot " + winner);
			}
		});
		
		Thread r5 = new Thread(()->{
			while(robot[4].getY() > 0)
			robot[4].move(r.nextInt(500));
			
			if(winner == 0) {
				winner = 5;
				System.out.println("The winner is robot " + winner);
			}
		});
		
		/*Thread r6 = new Thread(()->{
			while(!reachedFinish) {
				if( || robot[1].getY() < 0 || robot[2].getY() < 0 || robot[3].getY() < 0 || robot[4].getY() < 0 ) {
					reachedFinish = true;
					if(robot[0].getY() < 0) {
						System.out.println("Robot 0 is the winner!");
					} else if(robot[1].getY() < 0) {
						System.out.println("Robot 1 is the winner!");
					} else if(robot[2].getY() < 0) {
						System.out.println("Robot 2 is the winner!");
					} else if(robot[3].getY() < 0) {
						System.out.println("Robot 3 is the winner!");
					} else if(robot[4].getY() < 0) {
						System.out.println("Robot 4 is the winner!");
					} 
					
				}
			}
				
		});*/
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		
		
		

	}
	
	
}
