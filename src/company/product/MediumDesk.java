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
public class MediumDesk extends Desk{
  public MediumDesk(String color, String material)
  {
    super.setColor(color);
    super.setMaterial(material);
    super.setModel("Medium Desk");
  }

  @Override
  public String getFeatures() 
  {
    return "This is a " + super.getModel() + 
           " with color " + super.getColor() + 
           " and " + super.getMaterial() + " material";
  }
}
