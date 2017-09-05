import java.util.Random;

public class Game{   
   public static void main(String[] args)
   { // MAIN STARTER HER
   
      int weWin = 0;
      int systemWin = 0;
   
      for (int i=0; i<50; i++)
      { // FOR STATEMENT
         if (playDice() == 7)
            weWin++;
         else
            systemWin++;
      }
      System.out.println("we win; " + weWin);
      System.out.println("System win; " + systemWin);
      playDice();
   } //MAIN SLUTTER
   
   
   
   public static int playDice() {
      //Definerer vores variabler
      int die1; 
      int die2;   
      int sum;
      
      Random r = new Random(); 
      
      die1 = r.nextInt(6) +1;
      die2 = r.nextInt(6) +1;
      
      sum = die1 + die2;
      
         return sum;
      }
   }

