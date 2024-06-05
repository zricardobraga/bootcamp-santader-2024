package one.digitalinnovation.design_patterns.controller;

import one.digitalinnovation.design_patterns.model.Cliente;
import one.digitalinnovation.design_patterns.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> buscarTodos() {
        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable long id) {
        return ResponseEntity.ok(clienteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente) {
        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        clienteService.deletar(id);
    return ResponseEntity.ok().build();
    }

}
