package workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import workshop.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
