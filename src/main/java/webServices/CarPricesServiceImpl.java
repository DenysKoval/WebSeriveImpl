package webServices;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam;

import webServices.webServicesInterface.CarPricesWebService;

/**
 * Created by Denys_Koval on 11/3/2016.
 */
@javax.jws.WebService(endpointInterface = "webServices.webServicesInterface.CarPricesWebService")
public class CarPricesServiceImpl implements CarPricesWebService {
    private Integer fuelTankCapacity;
    private Integer distantForEachCar;

    public CarPricesServiceImpl() {
        liters = new HashMap<String, Integer>();
        distant = new HashMap<String, Integer>();
        rate = new HashMap<String, Integer>();
        liters.put("Ford Fiesta", 40);
        liters.put("Nissan Almera", 45);
        distant.put("Odessa", 500);
        distant.put("Lviv", 650);
        distant.put("Donetsk", 600);
        rate.put("Ford Fiesta", 5);
        rate.put("Nissan Almera", 8);
    }

    /**
     * Liters of fuel
     */
    private Map<String, Integer> liters;
    /**
     * Distance from Kiev to city
     */
    private Map<String, Integer> distant;
    /**
     * Rate cars per 1km
     */
    private Map<String, Integer> rate;

    @Override
    public int getRatePer100Km(@WebParam(name = "nameOfCar") String nameOfCar) {
        return rate.get(nameOfCar);
    }

    @Override
    public int addDistant(@WebParam(name = "addedAmount") int addedAmount) {
        distantForEachCar = distantForEachCar + addedAmount;
        return distantForEachCar;
    }

    @Override
    public int getFuelTank(@WebParam(name = "nameOfCar") String nameOfCar) {
        fuelTankCapacity = liters.get(nameOfCar);
        return fuelTankCapacity;
    }

    @Override
    public boolean isCarGetToCity(@WebParam(name = "nameOfCar") String nameOfCar) {
        return (distantForEachCar / 100) * rate.get(nameOfCar) < liters.get(nameOfCar);
    }

    @Override
    public int getCarDistant(){
        return distantForEachCar;
    }
}
