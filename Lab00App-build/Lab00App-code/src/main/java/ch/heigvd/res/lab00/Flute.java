package ch.heigvd.res.lab00;

/**
 *
 * @author Jonathan Dreyer
 */
public class Flute implements IInstrument {

  @Override
  public String play() {
    return "pffff";
  }

  @Override
  public int getSoundVolume() {
    return 3;
  }

  @Override
  public String getColor() {
    return "";
  }
    
}
