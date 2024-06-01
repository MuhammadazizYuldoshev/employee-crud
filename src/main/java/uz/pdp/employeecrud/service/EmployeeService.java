package uz.pdp.employeecrud.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.employeecrud.model.Employee;
import uz.pdp.employeecrud.repository.EmployeeRepository;


import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee){

        employeeRepository.save(employee);
    }

    public Employee getEmployee(Integer id){
        return employeeRepository.findById(id).get();
    }

    public void delete(Integer id){
        employeeRepository.deleteById(id);
    }
}
