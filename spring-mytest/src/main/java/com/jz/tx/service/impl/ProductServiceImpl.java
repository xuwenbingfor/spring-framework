package com.jz.tx.service.impl;

import com.jz.tx.dao.ProductDao;
import com.jz.tx.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductDao productDao;

	@Override
	@Transactional
	public void insertProduct() {
		productDao.insert();
		System.out.println("insertProduct Ok");
		// 如果每加事务管理，那么抛出异常同样会保存到数据库成功
		throw new RuntimeException();
	}
}
