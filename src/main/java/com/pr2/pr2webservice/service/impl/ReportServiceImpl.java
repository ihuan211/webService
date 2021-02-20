package com.pr2.pr2webservice.service.impl;

import com.pr2.pr2webservice.domain.ProductBOutput;
import com.pr2.pr2webservice.mapper.ProductBOutputMapper;
import com.pr2.pr2webservice.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import java.util.List;

@WebService(name = "TestService", // 暴露服务名称
        targetNamespace = "http://pr2-webservice.pr2.com/",// 命名空间,一般是接口的包名倒序
        endpointInterface = "com.pr2.pr2webservice.service.ReportService"// 接口地址
)
@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private ProductBOutputMapper productBOutputMapper;

    @Override
    public List<ProductBOutput> getProductBOutputList() {
        return productBOutputMapper.selectProductBOutputList(new ProductBOutput());
    }
}
