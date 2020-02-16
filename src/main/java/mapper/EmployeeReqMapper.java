package mapper;

import com.zxxhw.jsrmock.entity.EmployeeReq;

import java.util.List;

public interface EmployeeReqMapper {
    EmployeeReq queryEmployeeById(Integer id);
    List<EmployeeReq> query();
    Integer insert(EmployeeReq employeeReq);
    Integer update(EmployeeReq employeeReq);
    Integer delete(Integer id);
}
