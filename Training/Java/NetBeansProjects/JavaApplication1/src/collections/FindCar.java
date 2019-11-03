/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author sdas301
 */
public class FindCar {

    public static void main(String[] args) {

        Car c1 = new Car("M2 Competition", "BMW", "Coupe");
        Car c2 = new Car("M3 GTR", "BMW", "Sedan");
        Car c3 = new Car("X7", "BMW", "SUV");

        Showroom s1 = new Showroom();
        s1.setShowroomName("BMW");

        HashMap<String, Car> cars = new HashMap<>();
        cars.put(c1.getCarName(), c1);
        cars.put(c2.getCarName(), c2);
        cars.put(c3.getCarName(), c3);

        s1.setCars(cars);

        Car c4 = new Car("R8", "Audi", "Coupe");
        Car c5 = new Car("A3", "Audi", "Sedan");
        Car c6 = new Car("Q4", "Audi", "SUV");

        Showroom s2 = new Showroom();
        s2.setShowroomName("Audi");

        HashMap<String, Car> carz = new HashMap<>();
        carz.put(c1.getCarName(), c4);
        carz.put(c2.getCarName(), c5);
        carz.put(c3.getCarName(), c6);

        s2.setCars(carz);

        HashMap<String, Map<String, Car>> showrooms = new HashMap<>();

        showrooms.put(s1.getShowroomName(), s1.getCars());
        showrooms.put(s2.getShowroomName(), s2.getCars());

        String findCarFromShowroom = "BMW";

        Set<Map.Entry<String, Map<String, Car>>> srname = showrooms.entrySet();
        System.out.println(srname.size());
        Iterator it=srname.iterator();
        System.out.println("CARS IN " + findCarFromShowroom + " ARE:");
        while(it.hasNext()){
            Map.Entry mapElement = (Map.Entry)it.next();
            if(mapElement.getKey()==findCarFromShowroom){
//                System.out.println("xxxxxxxx");
                  System.out.println(mapElement.toString());
            }
        }
//
//        for (Car<> isbn : isbns) {
//            System.out.println(stateLibraryBooks.get(isbn));
//        }

    }
}
