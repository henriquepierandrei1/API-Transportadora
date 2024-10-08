package com.Monitoramento.API_Transportadora.services;

import com.Monitoramento.API_Transportadora.models.OrderModel;
import com.Monitoramento.API_Transportadora.models.UserModel;
import com.Monitoramento.API_Transportadora.repositories.OrderRepository;
import com.Monitoramento.API_Transportadora.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired private UserRepository userRepository;
    @Autowired private OrderRepository orderRepository;

    public Optional<UserModel> getUserByEmail(String email){
        Optional<UserModel> userModel = this.userRepository.findByEmail(email);
        return userModel;
    }

    public void save(UserModel user){
        this.userRepository.save(user);
    }

    public OrderModel getOrders(String code){
        Optional<OrderModel> orderModel = orderRepository.findByCode(code);
        return orderModel.get();
    }
}