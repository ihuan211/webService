package com.pr2.pr2webservice.service;

import com.pr2.pr2webservice.domain.ProductBOutput;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService(name = "TestService", // 暴露服务名称
        targetNamespace = "http://pr2-webservice.pr2.com/"// 命名空间,一般是接口的包名倒序
)
public interface ReportService {
    /**
     * 获取B品产出、钣金报表
     * @return
     */
    @WebMethod
    List<ProductBOutput> getProductBOutputList();
}
