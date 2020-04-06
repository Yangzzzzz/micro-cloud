package cn.ihzgnay.micro.service.impl;

import cn.ihzgnay.micro.dao.ProductMapper;
import cn.ihzgnay.micro.model.Product;
import cn.ihzgnay.micro.service.ProductService;
import cn.ihzgnay.micro.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/04/06.
 */
@Service
@Transactional
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {
    @Resource
    private ProductMapper productMapper;

}
