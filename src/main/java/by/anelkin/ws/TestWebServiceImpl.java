package by.anelkin.ws;


import by.anelkin.model.WeatherInfo;

import javax.jws.WebService;

@WebService(endpointInterface = "by.anelkin.ws.TestWebService",
serviceName = "TestWebService")
public class TestWebServiceImpl implements TestWebService{

    public String testService() {
        return "Hello World";
    }

    public WeatherInfo receiveWeatherInTheCity(String city) {
        return new WeatherInfo(city);
    }
}
