package com.irexchange.interview;

import java.util.Scanner;

public class ChildrensGame {

	// n - number of children, k = kth child to be removed
	protected static int play(int n, int k) {
		//Create the linked list of children in the game
	    CircularLinkedList list = new CircularLinkedList();
	    for(int i = 1; i  <= n; i++) {
	    	list.insertNextChild(new Child(i,null));
	    }
	    list.display();
	   
	   // System.out.println(k);
	    //Repeat while there is a single child left
	    while(list.getSize() > 1) {
	    	//find the position of child to be removed
	    	//System.out.println( list.getSize());
	    	int deletePosition = k % list.getSize();
	    	if(k <= list.getSize()) {
	    		deletePosition = k;
	    	}
	    	
	    	if(deletePosition == 0) {
	    		deletePosition = list.getSize();
	    	}
	    	
	    	
	    	//remove the child
	    	list.deleteChildAtPosition(deletePosition);
	    	//reset start and end
	    	list.resetStartAndEnd(deletePosition);
	    	list.display();
	    }
	    return list.start.getId();
	}
	
	public static void main(String args[]) {
	
		//Read input parameters
		Scanner reader = new Scanner(System.in);  
		System.out.println("Enter the number of children");
	    int n=0,k=0;
        do {
            try {
                n = Integer.parseInt(reader.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
                n=0;
            }
        }while (n <= 0);
        
		System.out.println("Enter k, where kth child will be removed");
		do {
            try {
                k = Integer.parseInt(reader.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
                k=0;
            }
        }while (k <= 0);
		
		reader.close();
		System.out.println("The winning child is "+ChildrensGame.play(n, k));
		
	}
}
