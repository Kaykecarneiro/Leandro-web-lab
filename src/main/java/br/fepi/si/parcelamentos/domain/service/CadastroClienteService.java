package br.fepi.si.parcelamentos.domain.service;

import br.fepi.si.parcelamentos.domain.exception.NegocioException;
import br.fepi.si.parcelamentos.domain.model.Cliente;
import br.fepi.si.parcelamentos.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CadastroClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar (Cliente cliente) {
        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail()).
                filter(c -> !c.equals(cliente)).isPresent();

        if(emailEmUso) {
            throw new NegocioException("Email em uso, favor alterar.");
        }

        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir (Long clienteId){
        clienteRepository.deleteById(clienteId);
    }
}
