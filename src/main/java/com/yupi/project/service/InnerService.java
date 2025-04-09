package com.yupi.project.service;


import com.yupi.project.model.entity.User;

public interface InnerService {
    User getInvokeUser(String accessKey);

    String sayHello(String name);
}
