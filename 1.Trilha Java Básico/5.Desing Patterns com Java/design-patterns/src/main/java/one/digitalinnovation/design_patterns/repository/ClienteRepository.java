package one.digitalinnovation.design_patterns.repository;

import one.digitalinnovation.design_patterns.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
