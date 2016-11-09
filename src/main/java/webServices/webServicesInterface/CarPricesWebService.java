package webServices.webServicesInterface;

import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Denys_Koval on 11/3/2016.
 */
@javax.jws.WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarPricesWebService {

    @WebMethod
    int getRatePer100Km(String nameOfCar);

    @WebMethod
    int addDistant(int addedAmount);

    @WebMethod
    boolean isCarGetToCity(String nameOfCar);

    @WebMethod
    int getFuelTank(String nameOfCar);

    @WebMethod
    int getCarDistant();
}
