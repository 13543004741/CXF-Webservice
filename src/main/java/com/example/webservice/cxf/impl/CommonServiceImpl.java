package com.example.webservice.cxf.impl;

import com.example.webservice.cxf.CommonService;
import org.springframework.stereotype.Component;
import javax.jws.WebService;
@WebService(serviceName = "CommonService", //与接口中指定的name一直
        targetNamespace = "http://cxf.webservice.example.com/", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.example.webservice.cxf.CommonService"//接口地址
)
@Component
public class CommonServiceImpl implements CommonService {
    @Override
    public String sayHello(String name) {
        return "Hello ,"+name;
    }
}
