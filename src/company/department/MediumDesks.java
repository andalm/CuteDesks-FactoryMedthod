/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.department;

import company.CuteDesks;
import company.product.Desk;
import company.product.MediumDesk;

/**
 *
 * @author Adam
 */
public class MediumDesks extends CuteDesks{

  @Override
  protected Desk factoryMethod(String color, String material) {
    return new MediumDesk(color, material);
  }
  
}
