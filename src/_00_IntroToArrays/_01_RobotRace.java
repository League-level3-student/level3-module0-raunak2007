package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		
		//2. create an array of 5 robots.
        Robot[] rob=new Robot[5];
        Robot winner;
        boolean reached=false;
        int numWinner=0;
		//3. use a for loop to initialize the robots.
        for(int i=0;i<5;i++) {
        	rob[i]=new Robot();
        	rob[i].setX(100*i+20);
        	rob[i].setY(500);
        }
			//4. make each robot start at the bottom of the screen, side by side, facing up
	
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
        while(reached==false) {
        	for(int j=0;j<5;j++) {
        		rob[j].setSpeed(15);
        		int rand=new Random().nextInt(50);
        		int currentY=rob[j].getY();
        		rob[j].moveTo(100*j+20,currentY-rand);
        		if(rob[j].getY()<=10) {
        			reached=true;
        			if(numWinner<=0) {
        				int winnerNum;
        				winnerNum=j;
        				winner=rob[j];
        				JOptionPane.showMessageDialog(null, "Robot "+winnerNum+" won!");
        			}
        			numWinner++;
        		}
        	}
        }
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.

	
}
}