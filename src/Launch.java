
import java.util.Random;
import java.util.Scanner;
class Guess{	
  public static void player(int comp) {
         Scanner sc = new Scanner(System.in);
         for(int i=1;i<=3;i++) {
      	   System.out.println("Guess no : " + i);
      	   System.out.print("Enter your Guess : ");
      	   int player =sc.nextInt();
      	   if(player<=10) {
      	   if(player == comp) {
      		   System.out.println("Congratulation you have guessed Correctly!!");
      		   break;
      	   }
      	   else {
      		   if(i<3) {
      			   System.out.println("you are wrong!, Please try again\n");
      		   }
      		   else {
      			   System.out.println("Your attempts are over,You Lose Loser!\n");
      		   }
      	   }
      	   }
      	   else {
      		   System.out.println("Invalid Input!,Please try again");
      		   i--;
      	   }
         }
  }
}
class Player{
	public void noOFPlayers() {
		Scanner sc = new Scanner(System.in);
		  Random r = new Random();
	      int comp =  r.nextInt(11);
		for(int j=1;j<4;j++) {
			System.out.println("User No."+j);
			Guess.player(comp);
		}
	}
}
public class Launch{
	public static void main(String[] args){
	System.out.println("****Welcome To My GuesserGame");
	System.out.println("you have 3 attempts to guess the correct number between 0 to 10");
	   Player p = new Player();
	   p.noOFPlayers();
           
	}

}
