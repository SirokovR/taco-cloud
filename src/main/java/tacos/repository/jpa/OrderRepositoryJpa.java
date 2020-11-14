package tacos.repository.jpa;

import org.springframework.data.repository.CrudRepository;
import tacos.model.Order;

public interface OrderRepositoryJpa extends CrudRepository<Order, Long> {

}
