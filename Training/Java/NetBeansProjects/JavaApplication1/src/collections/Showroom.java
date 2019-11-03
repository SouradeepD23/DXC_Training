/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Map;

/**
 *
 * @author sdas301
 */
public class Showroom {
    private String showroomName;
    private Map<String,Car> cars;

    public String getShowroomName() {
        return showroomName;
    }

    public Map<String,Car> getCars() {
        return cars;
    }

    public void setShowroomName(String showroomName) {
        this.showroomName = showroomName;
    }

    public void setCars(Map<String,Car> cars) {
        this.cars = cars;
    }
}
