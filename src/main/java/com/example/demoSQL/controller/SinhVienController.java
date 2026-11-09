package com.example.demoSQL.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class SinhVienController {
    //     lấy danh sách tât cả các sinh viên
    @GetMapping()
    public ResponseEntity<String> getALlStudent(){
        return ResponseEntity.ok("Danh sách sinh viên ");
    }
}
