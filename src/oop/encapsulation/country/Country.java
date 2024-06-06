package oop.encapsulation.country;

public class Country {
    private int countryCode;
    private String countryName;
    private long countryPopulation;
    private double countryGeographicalArea;

    public Country() {

    }

    public Country(int countryCode, String countryName, long countryPopulation, double countryGeographicalArea) {
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryGeographicalArea = countryGeographicalArea;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public long getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(long countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    public double getCountryGeographicalArea() {
        return countryGeographicalArea;
    }

    public void setCountryGeographicalArea(double countryGeographicalArea) {
        this.countryGeographicalArea = countryGeographicalArea;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryCode=" + countryCode +
                ", countryName='" + countryName + '\'' +
                ", countryPopulation=" + countryPopulation +
                ", countryGeographicalArea=" + countryGeographicalArea +
                '}';
    }
}
