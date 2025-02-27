package uz.pdp.employeecrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uz.pdp.employeecrud.model.Employee;
import uz.pdp.employeecrud.model.Position;
import uz.pdp.employeecrud.service.EmployeeService;
import uz.pdp.employeecrud.service.PositionService;

import java.util.List;

@Controller()
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PositionService positionService;


    @GetMapping("/employees/list")
    public String listEmployees(Model model){
        List<Employee> allEmployees = employeeService.getAllEmployees();
        model.addAttribute("employees",allEmployees);

        return "employees-page";

    }

    @GetMapping("/employees/new")
    public String createEmployeeForm(Model model){
        List<Position> allPositions = positionService.getAllPositions();

        model.addAttribute("employees", new Employee());
        model.addAttribute("positions", allPositions);

        return "employees-form";

    }

    @PostMapping("/employees/save")
    public String saveEmployees(Employee employee){
        employeeService.saveEmployee(employee);

        return "redirect:/employees/list";
    }


    @GetMapping("/employees/edit/{id}")
    public String editEmployee(@PathVariable("id") int id, Model model){
        Employee employee = employeeService.getEmployee(id);
        model.addAttribute("employees",employee);

        List<Position> allPositions = positionService.getAllPositions();

        model.addAttribute("positions", allPositions);


        return "employees-form";

    }

    @GetMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable("id") int id,Model model) {

        employeeService.delete(id);

        return "redirect:/employees/list";

    }

}
