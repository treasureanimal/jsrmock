package com.zxxhw.jsrmock.reponse;

import com.zxxhw.jsrmock.entity.EmployeeReq;

public class PersonalProfileResult extends ResponseResult {
    EmployeeReq employeeReq;

    public EmployeeReq getEmployeeReq() {
        return employeeReq;
    }

    public void setEmployeeReq(EmployeeReq employeeReq) {
        this.employeeReq = employeeReq;
    }

    public PersonalProfileResult(ResultCode resultCode, EmployeeReq employeeReq) {
        super(resultCode);
        this.employeeReq = employeeReq;

    }

    @Override
    public String toString() {
        return "PersonalProfileResult{" +
                "employeeReq=" + employeeReq +
                ", success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
