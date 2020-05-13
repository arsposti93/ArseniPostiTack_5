package com.company;

public enum EnumCars {

  MERSEDES("Mersedes", "German"),
  BMW("BMW", "German"),
  MAZDA("Mazda", "Japan"),
  TOYOTA("Toyota", "Japan"),
  LADA("Lada", "Russia"),
  VAZ("VAZ", "Russia"),
  RENAULT("Renault", "France"),
  PEUGEOT("Peugeot", "France");

  private String nameOfCorporation;
  private String countryOfOrigin;

  EnumCars(String nameOfCorporation, String countryOfOrigin) {
    this.nameOfCorporation = nameOfCorporation;
    this.countryOfOrigin = countryOfOrigin;
  }

  public String getInfo() {
    return "Made in " + getCountryOfOrigin() + ", " +
        "Name of corporation- " + getNameOfCorporation();
  }

    public String getNameOfCorporation() {
    return nameOfCorporation;
  }

  public void setNameOfCorporation(String nameOfCorporation) {
    this.nameOfCorporation = nameOfCorporation;
  }

  public String getCountryOfOrigin() {
    return countryOfOrigin;
  }

  public void setCountryOfOrigin(String countryOfOrigin) {
    this.countryOfOrigin = countryOfOrigin;
  }
}
