package com.cgi.client.service;


import com.cgi.client.entity.ClientVisit;
import com.cgi.client.repository.ClientVisitRepository;
import com.cgi.client.vo.ClientVisitVO;
import org.hibernate.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public
class ClientVisitService {
    @Autowired
    private ClientVisitRepository clientVisitRepository;
    @Autowired
    private ModelMapper modelMapper;

    public ClientVisitService() {
    }

    @Transactional(readOnly = true)
    public List<ClientVisitVO> getAll(Long clientId) {
        return clientVisitRepository.findAllByClientIdOrderByDateDesc(clientId).stream().map(item -> modelMapper.map(item, ClientVisitVO.class)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ClientVisitVO get(Long id) {
        ClientVisit clientVisit = clientVisitRepository.findById(id).orElse(null);
        if (clientVisit == null)
            return null;
        return modelMapper.map(clientVisit, ClientVisitVO.class);
    }

    public ClientVisitVO create(@NotNull @Valid ClientVisitVO clientVisit) {
        ClientVisit clientVisitEntity = clientVisitRepository.save(modelMapper.map(clientVisit, ClientVisit.class));
        return modelMapper.map(clientVisitEntity, ClientVisitVO.class);
    }

    public ClientVisitVO update(Long id, @NotNull @Valid ClientVisitVO clientVisit) {
        if (!clientVisitRepository.existsById(id)) {
            throw new ObjectNotFoundException(id, ClientVisit.class.getSimpleName());
        }
        ClientVisit clientVisitEntity = clientVisitRepository.save(modelMapper.map(clientVisit, ClientVisit.class));
        return modelMapper.map(clientVisitEntity, ClientVisitVO.class);
    }

    public void delete(Long id) {
        if (!clientVisitRepository.existsById(id)) {
            throw new ObjectNotFoundException(id, ClientVisit.class.getSimpleName());
        }
        clientVisitRepository.deleteById(id);
    }
}
