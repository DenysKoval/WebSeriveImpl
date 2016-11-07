package client;

import webServices.webServicesInterface.CarPricesWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

import static java.lang.System.out;

/**
 * Created by Denys_Koval on 11/7/2016.
 */
public class WebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8080/webServices/carsPrices?wsdl");
        QName priceName = new QName("http://webServices/", "CarPricesServiceImplService");
        Service priceNameService = Service.create(url, priceName);
        CarPricesWebService getPriceOfCar = priceNameService.getPort(CarPricesWebService.class);
       out.println(getPriceOfCar.getPrice("Nissan Almera"));
//       out.println(getPriceOfCar.addFuel(1));
//       out.println(getPriceOfCar.getFuelLevel());

    }
}
