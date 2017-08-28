public class Time{
   public static void main(String [] args){
   
   
      int hour = 10;
      int minute = 50;
      int second = 25;
      float percentage; 
      percentage = (39025/864);
   
      System.out.println(hour + ":" + minute + ":" + second);
   
   
      System.out.println("Number of seconds since midnight");
      System.out.println((60*hour*60) + (60*minute) + second);
      System.out.println("Remaining seconds of the day");
      System.out.println((hour+13)*60*60);
      System.out.println("Shows current percentage of the day that have passed");
      System.out.println(percentage + "%");
   
   }
}