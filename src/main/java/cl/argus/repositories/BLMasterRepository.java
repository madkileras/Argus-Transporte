package cl.argus.repositories;

import cl.argus.models.BLMaster;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface BLMasterRepository extends CrudRepository<BLMaster,Long>{
}