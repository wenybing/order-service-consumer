package com.wenyb.service;

import com.wenyb.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wenyabing
 * @Date 2019/2/13 16:34
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private UserService userService;

    public void initOrder(String s) {
        /**
         * 查询用户收货地址
         */
        List<UserAddress> userAddressList = userService.getUserAddressList("1");
        for (UserAddress userAddress : userAddressList) {
            System.out.println(userAddress.getUserAddress());
        }
    }
}
