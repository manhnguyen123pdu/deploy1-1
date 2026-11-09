package com.example.demoSQL.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {
//     khóa chính
    @Id  // chỉ định đây là thuộc tính khóa chính
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id tự động tăng
    @Column(name = "ma_sv")  // tên cột trong bảng
    private int maSv;

    @Column(name = "ho_ten", nullable = false)
    private String hoTen;

    @Column(name = "ngay_sinh")
    private LocalDate ngaySinh;

    @Column(name = "gioi_tinh", length = 10)
    private String gioiTinh;

    @Column(name = "dia_chi", length = 200)
    private String diaChi;

    @Column(name = "dien_thoai", length = 15)
    private String dienThoai;

    @Column(name = "email", length = 100)
    private String email;

    public SinhVien() {
    }

    public SinhVien( String hoTen, LocalDate ngaySinh, String gioiTinh, String diaChi, String dienThoai, String email) {

        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
    }

    public int getMaSv() {
        return maSv;
    }

    public void setMaSv(int maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv=" + maSv +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", email='" + email + '\'' +
                "} \n";
    }
}
