package firstWebService;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.jws.WebParam;

/**
 * Created by Denys_Koval on 11/3/2016.
 */
@javax.jws.WebService(endpointInterface = "firstWebService.CarPricesWebService")
public class CarPricesServiceImpl implements CarPricesWebService {
    private Integer fuelLevel = 0;

    public CarPricesServiceImpl() {
        prices = new HashMap<String,Integer>();
        prices.put("Ford Fiesta", 6000);
        prices.put("Nissan Almera", 6500);
    }

    /**
     * Prices with by future cars
     */
    private Map<String, Integer> prices;



    @Override
    public double getPrice(@WebParam(name = "description") String description) {
        Integer price = prices.get(description);
        return price == null ? 0 : price;
    }


    @Override
    public int addFuel(@WebParam(name = "addedAmount") int addedAmount) {
        String message = "adding " + addedAmount;
        usageLog(message);
        return fuelLevel + addedAmount;
    }

    @Override
    public int getFuelLevel() {
        return fuelLevel;
    }

    private void usageLog(String message) {
        Date now = new Date();
        System.out.println(now + " " + message);
    }
}
