/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.entity.Siswa;
import com.example.demo.service.DataSiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author okt19
 */
@RestController
@RequestMapping("/siswa")
public class SiswaController {
    
    @Autowired
    private DataSiswaService dataSiswaService;
    
    @GetMapping("")
    public Iterable<Siswa> allSiswa() {
        return dataSiswaService.getAllSiswa();
    }
    
    @GetMapping("/cari/{id}")
    public Siswa cari(@PathVariable(name = "id") Integer id) {
        return dataSiswaService.getSiswaById(id);
    }
    
    @PostMapping("/daftar")
    public Siswa daftar(@RequestBody Siswa s) {
        return dataSiswaService.simpanSiswa(s);
    }
    
    @PutMapping("/update")
    public Siswa update(@RequestBody Siswa s) {
        return dataSiswaService.updateSiswa(s);
    }
    
    @DeleteMapping("/hapus/{id}")
    public void hapus(@PathVariable(name = "id") Integer id) {
        dataSiswaService.hapusSiswa(id);
    }
    
    @GetMapping("/alamat/{alamat}")
    public Iterable<Siswa> cariByAlamat(@PathVariable(name = "alamat") String alamat) {
        return dataSiswaService.cariAlamat(alamat);
    }
}
