package com.pr2.pr2webservice.mapper;

import com.pr2.pr2webservice.domain.ProductBOutput;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductBOutputMapper {
    public List<ProductBOutput> selectProductBOutputList(ProductBOutput productBOutput);
}
