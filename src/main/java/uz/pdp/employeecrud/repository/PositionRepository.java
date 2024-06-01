package uz.pdp.employeecrud.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.employeecrud.model.Position;


@Repository
public interface PositionRepository extends JpaRepository<Position,Integer> {
}
