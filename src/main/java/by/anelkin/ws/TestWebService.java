package by.anelkin.ws;

import by.anelkin.model.WeatherInfo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TestWebService {
    @WebMethod
    String testService();

    @WebMethod
    WeatherInfo receiveWeatherInTheCity(String city);
}
