/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1070.service;

import com.setia.Kuis_1070.entity.Identitas;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setia.Kuis_1070.repo.IdentitasRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("identitasService")
@Transactional
public class IdentitasService {

    @Autowired
    private IdentitasRepo repo;

    public Identitas insert(Identitas identitas) {
        return repo.save(identitas);
    }
    
    public Identitas update(Identitas identitas) {
        return repo.save(identitas);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas> getAll(){
        return repo.findAllIdentitas();
    }
}
