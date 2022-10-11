package com.getting2knowij.debugging.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
  private final List<Wheel> wheels = new ArrayList<>(4);

  public List<Wheel> getWheels() {
    return wheels;
  }

  public void addWheel(int index, Wheel wheel) {
    wheels.add(index, wheel);
  }
}
