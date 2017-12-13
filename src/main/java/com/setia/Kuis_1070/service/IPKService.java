/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1070.service;

import com.setia.Kuis_1070.entity.IPK;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.setia.Kuis_1070.repo.IPKRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("ipkService")
@Transactional
public class IPKService {

    @Autowired
    private IPKRepo repo;

    public IPK insert(IPK ipk) {
        return repo.save(ipk);
    }
    
    public IPK update(IPK ipk) {
        return repo.save(ipk);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public IPK getById(Long id){
        return repo.findOne(id);
    }
    
    public List<IPK> getAll(){
        return repo.findAllIPK();
    }
}
