package com.example.demoSQL.controller;


import com.example.demoSQL.entity.SinhVien;
import com.example.demoSQL.repository.SinhVienRepo;
import com.example.demoSQL.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class SinhVienController {
    @Autowired
    private SinhVienService sinhVienService;
    //     lấy danh sách tât cả các sinh viên
    @GetMapping()
    public ResponseEntity<String> getALlStudent(){
        return ResponseEntity.ok("Danh sách sinh viên ");
    }
    @GetMapping("/allStudents")
    public List<SinhVien> getAll() {
        return sinhVienService.getAll();
    }

    @GetMapping("/{maSV}")
    public SinhVien getById(@PathVariable String maSV) {
        return sinhVienService.getById(Integer.parseInt(maSV));
    }

    @PostMapping
    public SinhVien create(@RequestBody SinhVien sv) {
        return sinhVienService.create(sv);
    }

    @PutMapping("/{maSV}")
    public SinhVien update(@PathVariable String maSV, @RequestBody SinhVien sv) {
        return sinhVienService.update(Integer.parseInt(maSV), sv);
    }

    @DeleteMapping("/{maSV}")
    public void delete(@PathVariable String maSV) {
        sinhVienService.delete(Integer.parseInt(maSV));
    }

}
