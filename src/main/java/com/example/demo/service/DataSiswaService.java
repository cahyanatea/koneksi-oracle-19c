/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.dao.SiswaDao;
import com.example.demo.entity.Siswa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author okt19
 */
@Service
public class DataSiswaService {
    
    @Autowired
    private SiswaDao siswaDao;
    
    public Iterable<Siswa> getAllSiswa() {
        return siswaDao.findAll();
    }
    
    public Siswa getSiswaById(Integer id) {
        return siswaDao.findById(id).get();
    }
    
    public Siswa simpanSiswa(Siswa s) {
        return siswaDao.save(s);
    }
    
    public void hapusSiswa(Integer id) {
        siswaDao.deleteById(id);
    }
    
    public Siswa updateSiswa(Siswa s) {
        return siswaDao.save(s);
    }
    
    public Iterable<Siswa> cariAlamat(String alamat) {
        return siswaDao.getByAlamat(alamat);
    }
}
