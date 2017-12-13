/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1070.controller;

import com.setia.Kuis_1070.entity.Identitas;
import com.setia.Kuis_1070.service.IdentitasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas")
public class IdentitasController {

    @Autowired
    private IdentitasService identitasService;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas insert(@RequestBody Identitas identitas) {
        return identitasService.insert(identitas);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas update(@RequestBody Identitas identitas) {
        return identitasService.update(identitas);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitasService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas getById(@PathVariable("id") Long id){
        return identitasService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas> getAll(){
        return identitasService.getAll();
    }
}