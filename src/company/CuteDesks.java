/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company;

import company.product.*;

/**
 *
 * @author Adam
 */
public abstract class CuteDesks {
  public Desk makeDesk(String color, String material)
  {
    return factoryMethod(color, material);
  }
  
  protected abstract Desk factoryMethod(String color, String material);
}
