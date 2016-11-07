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
