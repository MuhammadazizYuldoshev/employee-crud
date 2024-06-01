package uz.pdp.employeecrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.employeecrud.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
