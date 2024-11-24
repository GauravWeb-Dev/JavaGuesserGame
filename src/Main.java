
import java.util.Random;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		System.out.println("****Welcome to GusserGame****");
           Random r = new Random();
           Long comp =r.nextLong(11);// 0 to 10
          System.out.println("You Have 3 attempts to guess the Number in between 0 to 10\n"+
                              "Computer guessed the number");
        //  System.out.println(comp);
          Scanner sc =new Scanner(System.in);
          int user;
          int attempts = 0;
           for(int i=1;i<=3;i++) {
        		   System.out.print("Guess no " + i +"\n"+"Enter your guess:");
        		   user = sc.nextInt();
        		   if(user<=10) {
		        		   if(user==comp) 
		        		   {
		        			   System.out.println("you have guessed correctly \n"+
		        		                          "You Won the game in "+i+" attempts");
		        			   break;
		        		   }
		        		   else 
		        		   {
		        			   attempts++;
		        			   if(i<=2)
		        			   System.out.println("Wrong Guess! Try again\n");
		        			   else
		        			   System.out.print("Wrong Guess!\n");   
		        		   }
        		   }
        		   else 
        		   {
        			   System.out.println("Invalid Input ! Please try again\n");
        			   i--;
        		   }
        		  }
        		 
           if(attempts ==3) {
        	   System.out.println("your attempts are over,You lose!");
        	   System.out.println("computer guess is :"+comp);
           }
           
           
           
	}

}
