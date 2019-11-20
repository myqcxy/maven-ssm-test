package mybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import mybatis.bean.Employee;

@Mapper
public interface EmployeeMapper {
	public Employee getEmployeeById(Integer id);
	public List<Employee> getEmps();
}
