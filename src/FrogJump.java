/*
 * Shaun Mbateng
 * Frog Jump
 * This program computes the minimum number of jumps needed
 * 		given a start location, end location, and jump distance
 * This Programs has an O(1) Time Complexity
 */

import java.util.*;

public class FrogJump 
{
	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		int posX; //Start Position
		int posY; //Finish Position
		int dist; //Jump Distance
		int jumps; //Number of Jumps
		
		//Get Input Values
		System.out.print("Enter position X: ");
		posX = cin.nextInt();
		System.out.print("Enter position Y: ");
		posY = cin.nextInt();
		System.out.print("Enter jump distance: ");
		dist = cin.nextInt();
		System.out.println("");
		cin.close(); //Close cin, No Longer Needed
		
		jumps = minJumps(posX, posY, dist); //Call Function to Compute Minimum Jumps
		
		System.out.println("The frog needs to jump at least "+jumps+" times.");//Output Answer
	}
	
	static int minJumps(int X, int Y, int D) //Function to Compute Minimum Jump. O(1) Time Complexity
    {
        int count = (Y-X)/D; //Solve for Minimum Number Using Simple Formula
        
        if ((Y-X)%D != 0) //If There is A Remainder
            count++;	  //Increment by One
        
        return count; //Return Count
    }
}
