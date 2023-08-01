package workintech.com.model;

import workintech.com.enums.Lamptype;

public class Lamp {

  private boolean battery;
  private int globRating;

  private Lamptype style; // enum

public Lamp(boolean battery, int globRating, Lamptype style) {
    this.battery = battery;
    this.globRating = globRating;
    this.style = style;
  }

    public void turnOn() {
        System.out.println("Lamp is being turned on.");
    }


  public boolean isBattery() {
    return battery;
  }

  public int getGlobRating() {
    return globRating;
  }

  public Lamptype getStyle() {
    return style;
  }


}
