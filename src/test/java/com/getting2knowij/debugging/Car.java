package com.getting2knowij.debugging;

import java.util.List;

public class Car {
  public List<Wheel> getWheels() {
    return List.of(new Wheel());
  }

  class Wheel {
    public Tyre getTyre() {
      return new Tyre();
    }
  }

  class Tyre {
    public String getBrand() {
      return "Brand name";
    }
  }
}
