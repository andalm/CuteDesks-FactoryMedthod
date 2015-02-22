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
public abstract class Desk {
  private String model;
  private String material;
  private String color;

  /**
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * @param model the model to set
   */
  protected void setModel(String model) {
    this.model = model;
  }

  /**
   * @return the material
   */
  public String getMaterial() {
    return material;
  }

  /**
   * @param material the material to set
   */
  public void setMaterial(String material) {
    this.material = material;
  }

  /**
   * @return the color
   */
  public String getColor() {
    return color;
  }

  /**
   * @param color the color to set
   */
  public void setColor(String color) {
    this.color = color;
  }
  
  public abstract String getFeatures();
}
