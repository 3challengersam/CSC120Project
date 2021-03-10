import java.util.Scanner;

public class project_reyes_samuel
{
   public static void main(String[] args)
   {
      int gpu = 0;
      int cpu = 0;
      int core = 0;
      int choice = 0;
     
      double performance = 0.0;
      double multiplier = 0.0;
      int graphics = 0;
      
      final double one = 1.0;
      final double two = 0.75;
      final double three = 0.55;
      final double four = 0.35;
      
      
      final double ultra = 1;
      final double high = 2;
      final double medium = 3;
      final double low = 4;
      final double unable = 5;
      
      
     Scanner keyboard = new Scanner(System.in);
     
     System.out.print("What is the clock speed of your graphics card? ");
         gpu = keyboard.nextInt();
      
      System.out.print("What is the clock speed of your processor in megahertz? ");
         cpu = keyboard.nextInt();
      
      System.out.print("What is the number of cores that your processor has? ");
         core = keyboard.nextInt();
      
      System.out.println("What is the resolution of your monitor?");
         System.out.println("1. 1280 x 720");
         System.out.println("2. 1920 x 1080");
         System.out.println("3. 2560 x 1440");
         System.out.println("4. 3840 x 2160");
      
      System.out.print("\nEnter your choice: ");
         choice = keyboard.nextInt();
         
      if(choice == one)
      {
         multiplier = one;       
      }
      else if(choice == two)
      {
         multiplier = two;
      }
      else if(choice == three)
      {
         multiplier = three;
      }
      else
      {
         multiplier = four;
      }
               
         performance = ((5 * gpu) + (core * cpu)) * multiplier;         
          
      
  
        
         if(performance >= 17000)
      {
         graphics = 1;       
      }
       else if(performance >= 15000)
      {
         graphics = 2;       
      }
       else if(performance >= 13000)
      {
         graphics = 3;       
      }
       else if(performance >= 11000)
      {
         graphics = 4;       
      }
       else if(performance <= 11000)
      {
         graphics = 5;       
      }
      
      switch (graphics)
      {
         case 1:
            System.out.println("ultra");
            break;  
         case 2:
            System.out.println("high");
            break;  
         case 3:
            System.out.println("medium");
            break; 
         case 4:
            System.out.println("low");
            break;  
        case 5:
            System.out.println("unalbe to play");
            break; 
        }
              
      System.out.printf("Your performance is " + gpu + "\n" );
      System.out.printf("Your performance is " + cpu + "\n");
      System.out.printf("Your performance is " + core + "\n");
      System.out.printf("Your performance is " + choice + "\n");
      System.out.printf("Your performance is " + performance*.1  + "\n");
      System.out.printf("Your performance is " + graphics + "\n");
    }
}