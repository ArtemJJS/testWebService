package by.anelkin.client;

import by.anelkin.ws.TestWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:8081/soap/testWebService?wsdl");
        QName qName = new QName("http://ws.anelkin.by/", "TestWebService");

        Service service = Service.create(url, qName);

        System.out.println(service.getPort(TestWebService.class).receiveWeatherInTheCity("Minsk"));
    }
}
