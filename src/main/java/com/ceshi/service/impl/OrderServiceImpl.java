package com.ceshi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ceshi.bean.UserAddress;
import com.ceshi.service.OrderService;
import com.ceshi.service.UserService;

/**
 * @author lfy
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	UserService userService;
	public List<UserAddress> initOrder(String userId) {
		// TODO Auto-generated method stub
		System.out.println("userid"+userId);
		List<UserAddress> addressList = userService.getUserAddressList(userId);
		for (UserAddress userAddress : addressList) {
			System.out.println(userAddress.getUserAddress());
		}
		return addressList;
	}
	
	

}
