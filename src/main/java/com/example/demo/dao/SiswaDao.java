/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dao;

import com.example.demo.entity.Siswa;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author okt19
 */

public interface SiswaDao extends CrudRepository<Siswa, Integer>{
    
    public Iterable<Siswa> getByAlamat(String alamat);
}
