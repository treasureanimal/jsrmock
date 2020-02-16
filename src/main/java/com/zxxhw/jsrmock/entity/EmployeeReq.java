package com.zxxhw.jsrmock.entity;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

public class EmployeeReq {

    @ApiParam("基本信息主键")
    private String id;

    @NotEmpty(message = "请选择员工类型")
    private String employeesType;

    @NotEmpty(message = "请输入员工姓名")
    private String name;

    public interface updateinsert{}

    @ApiParam("年龄")
    @PositiveOrZero(message = "年龄不能为负数")
    private Integer myage;

    @ApiParam("电子邮件")
    @Email
    private String Email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeesType() {
        return employeesType;
    }

    public void setEmployeesType(String employeesType) {
        this.employeesType = employeesType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMyage() {
        return myage;
    }

    public void setMyage(Integer myage) {
        this.myage = myage;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
