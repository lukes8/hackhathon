package com.cgi.client.service;


import com.cgi.client.entity.FutureClient;
import com.cgi.client.repository.FutureClientRepository;
import com.cgi.client.vo.FutureClientVO;
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
class FutureClientService {
    @Autowired
    private FutureClientRepository futureClientRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Transactional(readOnly = true)
    public List<FutureClientVO> getAll() {
        return futureClientRepository.findAll().stream().map(item -> modelMapper.map(item, FutureClientVO.class)).collect(Collectors.toList());
    }

    public FutureClientVO create(@NotNull @Valid FutureClientVO futureClient) {
        FutureClient clientEntity = futureClientRepository.save(modelMapper.map(futureClient, FutureClient.class));
        return modelMapper.map(clientEntity, FutureClientVO.class);
    }

    public void delete(Long id) {
        if (!futureClientRepository.existsById(id)) {
            throw new ObjectNotFoundException(id, FutureClient.class.getSimpleName());
        }
        futureClientRepository.deleteById(id);
    }

    @Transactional(readOnly = true)
    public List<String> getAllEmailAdresses() {
        return futureClientRepository.findAll().stream().map(item -> modelMapper.map(item.getEmail(), String.class)).collect(Collectors.toList());
    }
}
