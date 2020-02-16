package com.zxxhw.jsrmock.service;

import com.zxxhw.jsrmock.entity.EmployeeReq;
import com.zxxhw.jsrmock.reponse.CommonCode;
import com.zxxhw.jsrmock.reponse.ResponseResult;
import io.swagger.models.auth.In;
import mapper.EmployeeReqMapper;
import org.springframework.transaction.annotation.Transactional;

public class EmployeesReqService {

    private EmployeeReqMapper employeeReqMapper;
    //更新客户基本信息
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult update(EmployeeReq employeeReq){
        Integer integer = employeeReqMapper.update(employeeReq);
        if (integer <= 0||integer == null) {
            throw new RuntimeException("修改错误");
        }
        return ResponseResult.SUCCESS();
    }

    //添加客户信息
    @Transactional(rollbackFor = Exception.class)
    public ResponseResult insert(EmployeeReq employeeReq){
        Integer integer = employeeReqMapper.insert(employeeReq);
        if (integer <= 0 || integer == null) {
            throw  new RuntimeException("添加错误");
        }
        return ResponseResult.SUCCESS();
    }
}
