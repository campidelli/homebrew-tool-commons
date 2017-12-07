package campidelli.homebrew.tool.commons.model;

/**
 * Definition of color.
 * @author campidelli
 */
public class Color {

  public enum Type {
    SRM, EBC, LOVIBOND
  }

  private Type type;
  private Double value;

  /**
   * Construct a new color
   */
  public Color() {
    this.type = Type.SRM;
    this.value = 0.0;
  }

  /**
   * Construct a new color
   * @param value the value
   */
  public Color(Double value) {
    this.type = Type.SRM;
    this.value = value;
  }

  /**
   * Construct a new color
   * @param type the type
   * @param value the value
   */
  public Color(Type type, Double value) {
    this.type = type;
    this.value = value;
  }

  /**
   * @return the type
   */
  public Type getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(Type type) {
    this.type = type;
  }

  /**
   * @return the value
   */
  public Double getValue() {
    return value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(Double value) {
    this.value = value;
  }
}