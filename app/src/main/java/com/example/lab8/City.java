package com.example.lab8;

import androidx.annotation.Nullable;

import java.util.Objects;

/**
 * This is a class that defines a City.
 * A City and Province make up this class
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * This method sets the values for the city and the province
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This method returns the city
     * @return
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This method returns the province
     * @return
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares a given city to a city in the list
     * @param city
     * @return
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }

    /**
     * Determines if two objects are considered equal
     * @param obj
     * @return
     */
    @Override
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;  // Check if they are the same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Check for null and class type
        }
        City cityObj = (City) obj;

        // Check if both city name and province match
        return this.city.equals(cityObj.getCityName()) &&
                this.province.equals(cityObj.getProvinceName());
    }

    /**
     * Checks if objects with same characteristics have the same hashcode
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}
