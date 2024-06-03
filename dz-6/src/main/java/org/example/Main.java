package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> citiesList = new ArrayList<>();
        citiesList.add(new City("Rome", 1200));
        citiesList.add(new City("Paris", 2300));
        citiesList.add(new City("Berlin", 0));
        citiesList.add(new City("Tokio", 23400));
        citiesList.add(new City("Kiev", 45600));
        citiesList.add(new City("London", 50000));

        // remove city from list
        citiesList.remove("Paris");
        citiesList.remove(3);

        //Search city by name
        for (City city : citiesList) {
            if (city.getName().equals("Kiev")) {
                System.out.println("Kiev is find");
                break;
            }
        }

        for (City city : citiesList) {
            if (city.getPop() > 0) {
                continue;
            }
            city.setPop(10001);
        }

        for (City city : citiesList) {
            if (city.getPop() > 10000) {
                System.out.printf("%s has population: %d \n", city.getName(), city.getPop());
            }
        }

        //delete duplicates
        ArrayList<String> phones = new ArrayList<>(Arrays.asList("Iphone", "Samsung", "Nokia", "Samsung"));
        Set<String> newPhones = Main.removeDuplicates(phones);
        System.out.println(newPhones.toString());
    }

    public static Set removeDuplicates(ArrayList phones) {
        Set<String> set = new HashSet<>(phones);
        return set;
    }
}