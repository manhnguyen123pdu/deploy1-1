package com.example.demoSQL.service;


import com.example.demoSQL.entity.SinhVien;
import com.example.demoSQL.repository.SinhVienRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SinhVienService {

    private final SinhVienRepo repo;

    public List<SinhVien> getAll() {
        return repo.findAll();
    }

    public SinhVien getById(int maSV) {
        return repo.findById(maSV)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy SV: " + maSV));
    }

    public SinhVien create(SinhVien sv) {
        return repo.save(sv);
    }

    public SinhVien update(int maSV, SinhVien sv) {
        SinhVien old = getById(maSV);
        old.setHoTen(sv.getHoTen());
        old.setNgaySinh(sv.getNgaySinh());
        old.setGioiTinh(sv.getGioiTinh());
        old.setDiaChi(sv.getDiaChi());
        old.setEmail(sv.getEmail());
        old.setDienThoai(sv.getDienThoai());
        return repo.save(old);
    }

    public void delete(int maSV) {
        repo.deleteById(maSV);
    }
}