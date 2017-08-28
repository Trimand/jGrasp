public class FlereVariabler{
   public static void main(String [] args){
      multiply (3,4);
      substract (10,5);
      square (6);
      addition (27.3,42.7);
     
   
   }
   public static void multiply(int n1, int n2){
      int answer = n1 * n2;
      System.out.println("answer is = " + answer);}

   public static void substract(int n3, int n4){
      int answer1 = n3 - n4;
      System.out.println("answer is = " +answer1); 
   }
   public static void square(double n5){
      double answer2 = Math.pow(n5,2);
      System.out.println("answer is = " + answer2);
   }
   public static void addition(double  n6, double n7){
      double answer3 = n6+n7;
      System.out.println("answer is = " + answer3);
   
   } 
}
