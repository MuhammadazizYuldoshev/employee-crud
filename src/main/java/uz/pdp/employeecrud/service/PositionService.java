package uz.pdp.employeecrud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.employeecrud.model.Position;
import uz.pdp.employeecrud.repository.PositionRepository;
import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionRepository positionRepository;

    public List<Position> getAllPositions(){
        return positionRepository.findAll();
    }

    public void savePosition(Position position){

        positionRepository.save(position);
    }


    public Position getPosition(Integer id){
        return positionRepository.findById(id).get();
    }

    public void delete(Integer id){
        positionRepository.deleteById(id);
    }


}
