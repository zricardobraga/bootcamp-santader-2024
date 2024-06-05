package one.digitalinnovation.design_patterns.repository;

import one.digitalinnovation.design_patterns.model.Endereco;
import org.springframework.data.repository.CrudRepository;


public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
