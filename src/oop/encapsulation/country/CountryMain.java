package oop.encapsulation.country;

public class CountryMain {
    public static void main(String[] args) {
        Country country = new Country();

        country.setCountryCode(91);
        country.setCountryName("India");
        country.setCountryPopulation(1548795623);
        country.setCountryGeographicalArea(154689.23658);

        System.out.println(country);
    }
}
