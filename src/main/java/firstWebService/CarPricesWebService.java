package firstWebService;

import javax.jws.WebMethod;
import javax.jws.soap.SOAPBinding;

/**
 * Created by Denys_Koval on 11/3/2016.
 */
@javax.jws.WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CarPricesWebService {
    @WebMethod
    double getPrice(String description);
    @WebMethod
    int addFuel(int addedAmount);

    @WebMethod
    int getFuelLevel();
}
