package com.example.demoSQL.repository;

import com.example.demoSQL.entity.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SinhVienRepo extends JpaRepository<SinhVien, Integer> {
    List<SinhVien> findByGioiTinh(String nam);

    List<SinhVien> findByHoTenContaining(String nameFind);

    List<SinhVien> findByDiaChiIgnoreCase(String diaChiFind);

    SinhVien findByDienThoai(String phoneNumber);

    @Query("SELECT sv from SinhVien sv where sv.email = ?1")
    SinhVien findByEmail(String email);
}
