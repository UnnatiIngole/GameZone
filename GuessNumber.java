// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Package java.util.random
import java.util.Random;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Random R1=new Random();
	Scanner R2=new Scanner(System.in);
	GameZone O1=new GameZone();
	//nextInt(int bound):
	
	System.out.println("Please Select Your level:");
	System.out.println("Enter 1 for Hard");
	System.out.println("Enter 2 for Easy");
	int Ookat=R2.nextInt();
	
	switch(Ookat){
	case 1:
	//hard
	int Hard=R1.nextInt(100);
	System.out.println("Guess tha number between 1-100:");
	O1.numberGuess(R2,Hard);
	break;
	
	//easy
	case 2:
	int min=50;
	int max=60;
	int Easy=R1.nextInt(max - min + 1) + min;
	System.out.println("Guess tha number between 50-60:");
	O1.numberGuess(R2,Easy);
	break;
	}
}}
public class GameZone{
   
   
   
   //number guesssing game
    void numberGuess(Scanner R2,int Rno){
        int x;
        do{
            System.out.println("Enter Your number");
     x=R2.nextInt();
	//System.out.println(x2);
	if(Rno==x){
	    System.out.println("*Congratulation You Won*");
	}
	else{
	    System.out.println("Sorry!!You guessed it Wrong!!");
	    System.out.println("Please try again");	}
    }while(Rno!=x);
    }
    
}
