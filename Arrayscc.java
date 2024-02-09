import java.util.*;
public class javabasic1{
  public static void guessnumber (){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the guess no.:");
    int number=1+(int)(100 * Math.random());
  int n= 50;
  int i,guess;
  System.out.println("A number chosen between 1 to 100,"+"guess the number with in 3 tries.");
  for(i=0;i<n;i++){
    System.out.println("round 1");
    guess=sc.nextInt();
         if(guess==n){
          System.out.println("congratulation! you guessed the number");
          System.out.println("you won=1");
          break;
         }else if(guess<n&&i!=n){
          System.out.println("your guess is less than generat number");
          System.out.println("you lost=0");

         }else if(guess>n&&i!=n){
          System.out.println("your guess is greater than generate number");
          System.out.println("you lost=0");

         }if(i==guess){
          System.out.println("you have exhausted with than time");
          System.out.println("the number was"+ number);

         }
     System.out.println("round 2");
     guess=sc.nextInt();
         if(guess==n){
          System.out.println("congratulation! you guessed the number");
          System.out.println("you won=1");
          break;
         }else if(guess<n&&i!=n){
          System.out.println("your guess is less than generate number");
          System.out.println("you lost=0");

         }else if(guess>n&&i!=n){
          System.out.println("your guess is greater than generate number");
          System.out.println("you lost=0");

         }if(i==guess){
          System.out.println("you have exhausted with n time");
          System.out.println("the number was"+ number);

         }
     
     System.out.println("round 3");
         guess=sc.nextInt();
         if(guess==n){
          System.out.println("congratulation! you guessed the number");
          System.out.println("you won=1");
          break;
         }else if(guess<n&&i!=n){
          System.out.println("your guess is less than generate number");
          System.out.println("you lost=0");

         }else if(guess>n&&i!=n){
          System.out.println("your guess is greater than generate number");
          System.out.println("you lost=0");

         }if(i==guess){
          System.out.println("you have exhausted with n time");
          System.out.println("the number was"+ number);

         }
       }

  }
public static void main(String[] args) {
  guessnumber();
}
}
  


