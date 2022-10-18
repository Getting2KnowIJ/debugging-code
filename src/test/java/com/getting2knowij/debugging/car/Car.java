package com.getting2knowij.debugging.car;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class Car {
  private final String make;
  private final String model;
  private final List<Wheel> wheels = new ArrayList<>(4);

  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public List<Wheel> getWheels() {
    return wheels;
  }

  public void addWheel(int index, Wheel wheel) {
    wheels.add(index, wheel);
  }
}
