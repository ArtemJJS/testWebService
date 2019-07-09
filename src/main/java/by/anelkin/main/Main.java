package by.anelkin.main;

import by.anelkin.ws.TestWebService;
import by.anelkin.ws.TestWebServiceImpl;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import javax.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        String soapServiceUrl = "http://localhost:8081/soap/testWebService";


//        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//        factoryBean.setServiceClass(TestWebService.class);
//        factoryBean.setAddress(soapServiceUrl);
//
//        TestWebService testWebService = (TestWebService) factoryBean.create();
//
//        System.out.println("Result: " + testWebService.testService());

        Endpoint.publish(soapServiceUrl, new TestWebServiceImpl());
    }
}
