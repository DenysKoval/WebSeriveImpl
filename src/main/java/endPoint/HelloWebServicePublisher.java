<<<<<<< 89d0ba0d4f3b0ff2c79b4c8a590f11ea8c91fbc3
package endPoint;

import firstWebService.CarPricesServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by Denys_Koval on 11/3/2016.
 */
public class HelloWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/firstWebService/carsPrices", new CarPricesServiceImpl());
    }
}
