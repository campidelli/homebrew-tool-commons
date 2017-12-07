package campidelli.homebrew.tool.commons.model;

/**
 * Definition of gravity (or sugar density related with water density).
 * @author campidelli
 */
public class Gravity {

  public enum Type {
    SPECIFIC, ORIGINAL, FINAL
  }

  private Type type;
  private Double value;

  /**
   * Construct a new gravity
   */
  public Gravity() {
    this.type = Type.SPECIFIC;
    this.value = 0.0;
  }

  /**
   * Construct a new gravity
   * @param value the value
   */
  public Gravity(Double value) {
    this.type = Type.SPECIFIC;
    this.value = value;
  }

  /**
   * Construct a new gravity
   * @param type the type
   * @param value the value
   */
  public Gravity(Type type, Double value) {
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