//Shrestha
import java.util.Scanner; 
  public class Calculator{
  
      public static int Sum(int [] numbers){
        return numbers[0] += numbers[1]; }
      
      public static int Multiplication(int [] numbers){
        return numbers[0] *= numbers[1]; }   
      
      public static int Subtraction(int [] numbers){
         return numbers[0] - numbers[1]; }  
      
      public static int Division(int[] numbers){ 
         return numbers[0]/numbers[1]; } 
      
      public static double Exponent(int [] numbers){
        return Math.pow(numbers[0], numbers[1]); }   
      
    public static void main (String [] args){
      Scanner input = new Scanner(System.in);
      int numbers[] = new int[2];
       do{
       System.out.print("\nEnter an operand: ");
       char operand = input.next().charAt(0); 
       
       if (operand == 'E'){ System.out.print("Thank you for using Calculator"); System.exit(0);}
              
       System.out.print("Enter two numbers: ");
       for( int i = 0; i < numbers.length; i++){
         numbers[i] = input.nextInt(); }
                  
       if (operand == '+'){ System.out.print("Sum = "+ Sum(numbers) ); }
       
       else if (operand == '*'){ System.out.print("Multiplied Answer = "+ Multiplication(numbers)); }
         
       else if (operand == '-'){ System.out.print("Subtracted Answer = "+ Subtraction(numbers)); }  
         
       else if (operand == '^'){ System.out.print("Exponential Answer = "+ Exponent(numbers)); }
         
       else if (operand == '/'){ System.out.print("Division Answer = "+ Division(numbers)); }    
             
       else{System.out.print("Please Enter operand: +, -, /, ^, and * ");}
        
         } while (true);
    }
  }  
                  
      
