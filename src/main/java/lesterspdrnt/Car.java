package lesterspdrnt;

public class Car {
  private String manufacturer;
  private String name;

  public Car(String manufacturer, String name) {
    this.manufacturer = manufacturer;
    this.name = name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getName() {
    return name;
  }
}
