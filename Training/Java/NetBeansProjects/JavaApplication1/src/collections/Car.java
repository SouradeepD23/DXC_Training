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
public class Car {

    private String carName;
    private String brandName;
    private String carType;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Car(String carName, String brandName, String carType) {
        this.carName = carName;
        this.brandName = brandName;
        this.carType = carType;
    }

    @Override
    public String toString() {

        return getCarName()+ " " + getBrandName()+ " " + getCarType();
    }

}
