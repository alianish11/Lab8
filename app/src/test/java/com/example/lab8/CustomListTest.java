package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    void testHasCity() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true, list.hasCity(city)); //check if mockcity in list
    }

    @Test
    void testDelete() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);

        //delete the newly added city and check the size again
        list.delete(city);
        assertEquals(0, list.getCities().size());
        assertFalse(list.getCities().contains(city));
    }

    @Test
    void testCount(){
        list = MockCityList();
        assertEquals(0, list.countCities());

        //add two cities
        City city1 = new City("Estevan", "SK");
        list.addCity(city1);

        City city2 = new City("Calgary", "AB");
        list.addCity(city2);

        //Test count again
        assertEquals(2, list.countCities());
    }


}
