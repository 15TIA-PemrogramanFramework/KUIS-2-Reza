/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.setia.Kuis_1070.controller;

import com.setia.Kuis_1070.entity.IPK;
import com.setia.Kuis_1070.service.IPKService;
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
@RequestMapping("/ipk")
public class IPKController {

    @Autowired
    private IPKService ipkService;

    @RequestMapping(method = RequestMethod.POST)
    public IPK insert(@RequestBody IPK ipk) {
        return ipkService.insert(ipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public IPK update(@RequestBody IPK ipk) {
        return ipkService.update(ipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipkService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public IPK getById(@PathVariable("id") Long id){
        return ipkService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<IPK> getAll(){
        return ipkService.getAll();
    }
}