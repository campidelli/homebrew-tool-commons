package campidelli.homebrew.tool.commons.model;

/**
 * Definition of ABV (alcohol by volume).
 * @author campidelli
 */
public class ABV {

  private Double value;

  /**
   * Construct a new ABV
   */
  public ABV() {
    this.value = 0.0;
  }

  /**
   * Construct a new ABV
   * @param value the value
   */
  public ABV(Double value) {
    this.value = value;
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