/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cutedesks;

import company.*;
import company.department.*;
import company.product.*;
import java.util.Scanner;

/**
 *
 * @author Adam
 */
public class Client {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws Exception {
    CuteDesks deparment = chooseDepartment();    
    String color = chooseColor();
    String material = chooseMaterial();
    
    Desk product = deparment.makeDesk(color, material);
    System.out.println(product.getFeatures());
  }
  
  private static CuteDesks chooseDepartment() throws Exception
  {
    CuteDesks deparment;
    Scanner read = new Scanner(System.in);    
    System.out.println("Choose a deparment\n1. Big Desks\n2. Medium Desks\n3. Small Desks");
    byte opt = Byte.parseByte(read.nextLine());
    switch(opt)
    {
      case 1:
        deparment = new BigDesks();
        break;
      case 2:
        deparment = new MediumDesks();
        break;
      case 3:
        deparment = new SmallDesks();
        break;
      default:
        throw new Exception("WTF!!, you are very sick :(");
    }
    
    return deparment;
  }
  
  private static String chooseColor() throws Exception
  {
    String color;
    Scanner read = new Scanner(System.in);    
    System.out.println("Choose a color\n1. Blue\n2. Green\n3. White");
    byte opt = Byte.parseByte(read.nextLine());
    switch(opt)
    {
      case 1:
        color = "Blue";
        break;
      case 2:
        color = "Green";
        break;
      case 3:
        color = "White";
        break;
      default:
        throw new Exception("WTF!!, you are very sick :(");
    }
    
    return color;
  }
  
  private static String chooseMaterial() throws Exception
  {
    String material;
    Scanner read = new Scanner(System.in);    
    System.out.println("Choose a material\n1. Wood\n2. Metal\n3. Plastic");
    byte opt = Byte.parseByte(read.nextLine());
    switch(opt)
    {
      case 1:
        material = "Wood";
        break;
      case 2:
        material = "Metal";
        break;
      case 3:
        material = "Plastic";
        break;
      default:
        throw new Exception("WTF!!, you are very sick :(");
    }
    
    return material;
  }
  
}
