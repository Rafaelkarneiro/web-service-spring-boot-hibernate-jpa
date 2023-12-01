package workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import workshop.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
