package com.facens.poo.sistema.sistema.services;

import java.util.ArrayList;
import java.util.List;

import com.facens.poo.sistema.sistema.dto.ClientDTO;
import com.facens.poo.sistema.sistema.entities.Client;
import com.facens.poo.sistema.sistema.repositories.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    
    @Autowired
    private ClientRepository repo;

    public List<ClientDTO> getClients(){

        List<Client> list = repo.geClients();
        List<ClientDTO> listDTO = new ArrayList<>();
        for(Client c : list){
            listDTO.add(new ClientDTO(c.getId(), c.getName()));
        }

        return listDTO;
    }

}
