package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, DataCar> maps = new HashMap<>();
        maps.put(new Car(12345,1898),new DataCar(2000,"Avensis",5500,"Black-pearl"));
        maps.put(new Car(12345,1898),new DataCar(2004,"Toyota",9500,"White-pearl"));
        maps.put(new Car(12345,1898),new DataCar(2006,"Mercedes",8500,"Yellow-pearl"));
        maps.put(new Car(12345,1898),new DataCar(2008,"Honda",6500,"Red-pearl"));
        maps.put(new Car(12345,1898),new DataCar(2009,"BMW",7500,"Green-pearl"));

        for (Map.Entry abc: maps.entrySet() ) {
            System.out.println(abc.getKey()+" "+abc.getValue());
            System.out.println();
        }
    }
}
