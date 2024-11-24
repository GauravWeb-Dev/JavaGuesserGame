

import java.util.Random;
import java.util.Scanner;

public class inputgame extends abstractgame
{
	Scanner sc= new Scanner(System.in);	
	
	
//	public void login() 
//	{
//       
//	 System.out.println("LOGIN");
//	 System.out.println(" entre Userid and Pass");
//	 String id=sc.next();
//	 System.out.println(id);
//	 
//	 int pass=sc.nextInt();
//	 System.out.println(pass);
//	 
//	 if((id.equals("radha") && (pass==12)) ||  (id.equals("aarya") && (pass==2121)) ||
//	    (id.equals("suchita") && (pass==123)) || (id.equals("jayashree") && (pass==1234)))
//	 {
//		System.out.println("LOGIN SUCCSESFULLY"); 
//	 }
//	 else
//	 {
//		 System.out.println("LOGIN FAILED....REGISTRE HERE ");
//		 registre();
//	 }
//	}
//	
	
	public void registre() 
	{
		
	  System.out.println("entre first name ");
	  String a=sc.next();
	  String str=a.toUpperCase();
	  System.out.println("entre last name ");
	  String a1=sc.next();
	  System.out.println("username pass must in capital");
	  String str1=a1.toUpperCase();
	  String result=str.concat(str1);
	  System.out.println(result);
	  
	  
	  System.out.println("entre email adress or phone_no");
	  String a3=sc.next();
	  System.out.println(a3);
	  
	  
	  System.out.println("entre password ");
	  int a4=sc.nextInt();
	  System.out.println(a4);
	  
	  System.out.println("registre succsesfully");
	 // login();
	  
		
	}
	
		
	
	

//******************************* this method takes numbers from Players
public void userguess() 
	{
		System.out.println("system generate no");
		Random r = new Random();
	    Long comp =r.nextLong(11);
	    System.out.println(comp);

	
 System.out.println("you have three attempt to guess the no\nLET'S START...........");
	
 
 //****************************** 1st player
     for(int i=1;i<=3;i++) {
 
     System.out.println("LOGIN");
  	 System.out.println("player one entre Userid and Pass");
  	 String id=sc.next();
  	 System.out.println(id);
  	 
  	 int pass=sc.nextInt();
  	 System.out.println(pass);
  	   if((id.equals("radha") && pass==12))
  	   {
  		System.out.println("login succsesfully play the game");
  	
  	   }
         
        System.out.println("player 1 entre no to be guess");
        int a1=sc.nextInt();
        System.out.println(a1);
        
        if(a1==comp) 
        {
        	System.out.println("congratulation!..player 1 you own the game");
        }

        else
        {
        	System.out.println("you loose");
        }
        
        
  	
 //********************************* 2nd player
  	 System.out.println("LOGIN");
	 System.out.println("player 2 entre Userid and Pass");
	 String id1=sc.next();
	 System.out.println(id1);
	 
	 int pass1=sc.nextInt();
	 System.out.println(pass1);
	 
	 if(id.equals("aarya")&& pass1==123) 
	 {
	   System.out.println("login succsesfully play the game");
     }  

        System.out.println("player 2 entre no to be guess");
        int a2=sc.nextInt();
        System.out.println(a2);
        
        if(a2==comp) 
        {
        	System.out.println("congratulation!..player 2 you own the game");
            
        }
        else
        {
        	System.out.println("you loose");
        }
  
 //*************************** 3rd player
        
        System.out.println("player 3 entre id and pass");
        String id3=sc.next();
        System.out.println(id3);
        
        int pass3=sc.nextInt();
        System.out.println(pass3);
	
       if(id.equals("umesh")&&pass==1234)
       {
     	System.out.println("login succsesfully play the game");
       } 
     
       System.out.println("player 3 entre no to be guess");
       int a3=sc.nextInt();
       System.out.println(a3);
     
       if(a3==comp) 
        {
        	System.out.println("congratulation!.. player 3 you own the game");
        }
        
        else
        {
        	System.out.println("you loose");
        }
        
        
        }
        System.out.println("sorry!..your attempts are over");
	}
        
        
	








	








	
		
	}
	

