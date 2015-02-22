/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.department;
import company.*;
import company.product.Desk;
import company.product.SmallDesk;

/**
 *
 * @author Adam
 */
public class SmallDesks extends CuteDesks{

  @Override
  protected Desk factoryMethod(String color, String material) {
    return new SmallDesk(color, material);
  }
  
}
