/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company.product;

/**
 *
 * @author Adam
 */
public class SmallDesk extends Desk{
  public SmallDesk(String color, String material)
  {
    super.setColor(color);
    super.setMaterial(material);
    super.setModel("Small Desk");
  }

  @Override
  public String getFeatures() 
  {
    return "This is a " + super.getModel() + 
           " with color " + super.getColor() + 
           " and material " + super.getMaterial();
  }
}
