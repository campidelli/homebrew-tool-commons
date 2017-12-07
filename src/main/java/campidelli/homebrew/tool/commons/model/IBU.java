package campidelli.homebrew.tool.commons.model;

/**
 * Definition of IBU (international biterness unit).
 * @author campidelli
 */
public class IBU {

  private Double value;

  /**
   * Construct a new IBU
   */
  public IBU() {
    this.value = 0.0;
  }

  /**
   * Construct a new IBU
   * @param value the value
   */
  public IBU(Double value) {
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