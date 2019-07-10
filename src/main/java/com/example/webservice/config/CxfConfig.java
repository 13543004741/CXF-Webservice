package com.example.webservice.config;

import com.example.webservice.cxf.CommonService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired(required = false)
    private Bus bus;
    @Autowired(required = false)
    CommonService commonService;
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint=new EndpointImpl(bus,commonService);
        endpoint.publish("/CommonService");
        System.out.println("CXFWebService 启动了...");
        return endpoint;
    }
}
