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

////     lấy danh sách tât cả các sinh viên
//    @GetMapping()
//    public ResponseEntity<List<SinhVien>> getALlStudent(){
//        return ResponseEntity.ok(sinhVienService.getAll());
//    }
//
////     lấy sinh viên theo id
//    @GetMapping("/{id}")
//    public ResponseEntity<SinhVien> getStudentById(@PathVariable int id){
////        như nhau
////        return ResponseEntity.ok(sinhVienService.getSinhVienById(id));
//        return ResponseEntity.status(200).body(sinhVienService.getSinhVienById(id));
//    }
//
////    xóa sinh viên theo id
//    @DeleteMapping("{id}")
//    public ResponseEntity<String> deleteStudentById(@PathVariable int id){
//        return ResponseEntity.status(200).body(sinhVienService.deleteStudentByID(id));
//    }
//
////   thêm mới sinh viên
//    @PostMapping()
//    public ResponseEntity<SinhVien> addStudent(@RequestBody SinhVien sinhVien){
//        return ResponseEntity.status(201).body(sinhVienService.addStudent(sinhVien));
//    }
//
////     update sinh viên dựa vào id
//    @PutMapping("/{id}")
//    public ResponseEntity<SinhVien> updateStudent(@PathVariable int id, @RequestBody SinhVien sinhVien){
//        return ResponseEntity.status(200).body(sinhVienService.updateStudent(id, sinhVien));
//    }
}
