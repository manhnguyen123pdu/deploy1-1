package com.example.demoSQL.service;

import com.example.demoSQL.entity.SinhVien;
import com.example.demoSQL.repository.SinhVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SinhVienService {
    @Autowired
    private SinhVienRepo sinhVienRepo;

//    lấy danh sách
    public List<SinhVien> getAll(){
        return sinhVienRepo.findAll();
    }

//    lấy theo id
    public SinhVien getSinhVienById(int id ){
        return sinhVienRepo.findById(id).orElseThrow(()-> new ResponseStatusException(
               HttpStatus.NOT_FOUND,
                "Student not found"
        ));
    }

//    xóa theo id
    public String deleteStudentByID(int id){
//        tìm xem trong csdl có tồn tại sinhvien là có id ko
        SinhVien sv = sinhVienRepo.findById(id).orElseThrow(()-> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found"
        ));
        sinhVienRepo.delete(sv);
        return "Student deleted";

    }

    public SinhVien addStudent(SinhVien sv){
        return sinhVienRepo.save(sv);
    }

//    cập nhập sv
    public SinhVien updateStudent(int id, SinhVien sv){
//        tìm xem trong csdl có tồn tại sinhvien là có id ko
        SinhVien svupdate = sinhVienRepo.findById(id).orElseThrow(()-> new ResponseStatusException(
                HttpStatus.NOT_FOUND,
                "Student not found"
        ));
        svupdate.setHoTen(sv.getHoTen());
        svupdate.setNgaySinh(sv.getNgaySinh());
        svupdate.setGioiTinh(sv.getGioiTinh());
        svupdate.setDiaChi(sv.getDiaChi());
        svupdate.setDienThoai(sv.getDienThoai());
        svupdate.setEmail(sv.getEmail());
        return sinhVienRepo.save(svupdate);

    }
}
