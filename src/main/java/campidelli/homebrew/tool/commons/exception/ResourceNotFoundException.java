package campidelli.homebrew.tool.commons.exception;

/**
 * Must be thrown when a searched resource is not found. 
 * @author campidelli
 */
public class ResourceNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public ResourceNotFoundException(String message) {
    super(message);
  }
}
