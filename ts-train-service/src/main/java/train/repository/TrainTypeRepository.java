package train.repository;

import org.springframework.data.repository.CrudRepository;
import train.entity.TrainType;

import java.util.List;


public interface TrainTypeRepository extends CrudRepository<TrainType,String>{

    TrainType findOne(String id);
    @Override
    List<TrainType> findAll();
    void deleteById(String id);
}
