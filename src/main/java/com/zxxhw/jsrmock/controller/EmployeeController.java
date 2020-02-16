package com.zxxhw.jsrmock.controller;

import com.zxxhw.jsrmock.entity.EmployeeReq;
import com.zxxhw.jsrmock.reponse.ResponseResult;
import com.zxxhw.jsrmock.service.EmployeesReqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeesReqService employeesReqService;

    @PostMapping
    public ResponseResult update(EmployeeReq employeeReq){
        ResponseResult responseResult = employeesReqService.update(employeeReq);
        return responseResult;
    }

    @PostMapping
    public ResponseResult insert(EmployeeReq employeeReq){
        ResponseResult responseResult = employeesReqService.insert(employeeReq);
        return responseResult;
    }
}
