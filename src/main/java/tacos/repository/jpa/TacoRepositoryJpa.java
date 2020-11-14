package tacos.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.model.Taco;

public interface TacoRepositoryJpa extends CrudRepository<Taco, Long> {

}