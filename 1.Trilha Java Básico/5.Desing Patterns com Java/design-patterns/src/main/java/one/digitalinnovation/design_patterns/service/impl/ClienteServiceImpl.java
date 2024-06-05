package one.digitalinnovation.design_patterns.service.impl;

import one.digitalinnovation.design_patterns.model.Cliente;
import one.digitalinnovation.design_patterns.model.Endereco;
import one.digitalinnovation.design_patterns.repository.ClienteRepository;
import one.digitalinnovation.design_patterns.repository.EnderecoRepository;
import one.digitalinnovation.design_patterns.service.ClienteService;
import one.digitalinnovation.design_patterns.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
        return clienteEncontrado.get();
    }

    @Override
    public void inserir(Cliente novoCliente) {
        salvarClienteComCep(novoCliente);
    }

    @Override
    public void atualizar(Long id, Cliente clienteAtualizar) {
        Optional<Cliente> clienteBd = clienteRepository.findById(id);

        if (clienteBd.isPresent()) {
            //salva o cep do cliente em uma varivel
            salvarClienteComCep(clienteAtualizar);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }

    //método privado que salva o cliente com o ende
    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();

        //busca no db se o endereço existe ou não. caso não exista, cadastra o endereço no banco de dados
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        //vincula o novo endereço ao cliente a ser cadastrado
        cliente.setEndereco(endereco);

        //salva o novo cliente no db
        clienteRepository.save(cliente);
    }

}
