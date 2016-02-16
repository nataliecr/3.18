import java.util.Scanner;

public class ShippingCost {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the weight of the package: ");
      double weight = input.nextDouble();
      
      if (weight > 50)
          System.out.print("The package cannot be shipped. ");
      
      if ((weight > 0) && (weight <= 1))
          System.out.print("shipping cost is $3.5 ");
      
      if((weight > 1) && (weight <= 3))
          System.out.print("shipping cost is $5.5 ");
      
      if((weight > 3) && (weight <= 10))
          System.out.print("shipping cost is $8.5 ");
      
      if((weight > 10) && (weight <= 20))
          System.out.print("shipping cost is $10.5 ");
  }    // main
} // ShippingCost
