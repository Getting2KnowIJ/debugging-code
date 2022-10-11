package com.getting2knowij.debugging;

import com.getting2knowij.debugging.car.Car;
import com.getting2knowij.debugging.car.Wheel;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DebuggerTest {
  @Test
  void shouldBeAbleToSelectMethodToStepInto() {
    System.out.println(getCar().getWheels().get(1).getTyre().getBrand());
  }

  @Test
  void shouldBeAbleToRunToCursor() {
    // given
    Car car = getCar();
    Wheel wheel1 = new Wheel();
    car.addWheel(0, wheel1);
    Wheel wheel2 = new Wheel();
    car.addWheel(1, wheel2);
    Wheel wheel3 = new Wheel();
    car.addWheel(2, wheel3);
    Wheel wheel4 = new Wheel();
    car.addWheel(3, wheel4);

    // when
    List<Wheel> wheels = car.getWheels();

    // then
    assertEquals(4, wheels.size());
  }

  //<editor-fold desc="Helper methods">
  private Car getCar() {
    return new Car();
  }
  //</editor-fold>
}
