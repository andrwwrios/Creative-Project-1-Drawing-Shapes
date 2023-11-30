//Andrew Rios
//10/14/2023

import java.util.*;

/* This class I will achieve 4 tasks; drawing a pentagon,
drawing a pentagon many times, option 1 and option 2 */
public class Shapes {
    public static void main(String[] args) {
    	
    	//creating turtle that will be used for all tasks
    	Turtle andrew = new Turtle();
		andrew.accessiblePrinting(true); 
    	
    	
        // TASK 1: Draw a Pentagon shape
    	int totalSides = 5;
    	for (int side = 1; side <= totalSides; side++ ) {
    		andrew.forward(50);
    		andrew.left(72); 
    	}
    	
    	
    	//move andrew to a different place
    	andrew.up();
    	andrew.left(90);
    	andrew.forward(200);
    	andrew.right(90);
    	andrew.backward(200);
    	andrew.down();
    	
    	
        // TASK 2: Draw a pentagon shape many times
    	int count = 10; //create iteration count
    	
    	for(int counter = 1; counter <= count; counter++) { // outer loop to iterate 10 times 
    		
    		//after each iteration move andrew so the shapes partially overlap
    		andrew.up();
    		andrew.forward(30);
    		andrew.down();
    		
    		for(int side = 1; side <= totalSides; side++) { // inner loop to create each side of the shape
    			andrew.forward(50);
        		andrew.left(72); 
    		}
    	} 
    	
    	
    	//move andrew to a different spot
    	andrew.up();
    	andrew.backward(700);
    	andrew.down();

    	
        // APPLICATION A: Option 3
  
    	// I will change the size of a Star, starting small, getting bigger
    	int maxLength = 121; //max side length of star sides
    		
    	//this loop creates the star as a whole and increase each side length n
    	for(int n = 20; n <= maxLength; n++ ) { 
    		andrew.left(27); // side 1
		andrew.forward(n);

		andrew.right(72); // side 2
		andrew.forward(n);

		andrew.left(144); // side 3
		andrew.forward(n);

		andrew.right(72); //side 4
		andrew.forward(n);

		andrew.left(144); //side 5
		andrew.forward(n);

		andrew.right(72); //side 6
			andrew.forward(n);

		andrew.left(144); //side 7
		andrew.forward(n);

		andrew.right(72); //side 8
		andrew.forward(n);

		andrew.left(144); //side 9
            	andrew.forward(n);

            	andrew.right(72); //side 10 final side
            	andrew.forward(n); 
            
           	andrew.left(126);
    	} 
    	
    	
    	//move andrew to a different location
    	andrew.up();
    	andrew.forward(1500);
    	andrew.down();
    	
    	
        // APPLICATION B: Option 2
    	
    	// In this task I will create a square a random number of times, after each iteration the 
    	// square will change to a random size and move to a different location
    	
    	Random r = new Random(); // creates Random object r
		 // creates Random object for max length
		count = r.nextInt(5) + 8; // creates random iteration with range 5 - 10 both included
		
		
		for (int counter = 1; counter <= count; counter++){ // how many times a shape is created
			int angle = r.nextInt();
			int move = r.nextInt(100) + 1; //range 1 - 100 inclusive
			maxLength = r.nextInt(100) + 1; 
			/* 
			* square changes size after each iteration
			* length size range 1 - 100 both included
			*/
			//move andrew after every iteration
			andrew.up();
			andrew.left(angle); //changes direction a random angle
			andrew.forward(move); //moves forward a random number in angle above
			andrew.down();
			
			for(int length = 1; length < maxLength; length++){ //creates square with random side length
				andrew.forward(length);
				andrew.right(90);
			}
		} 

    }
}
