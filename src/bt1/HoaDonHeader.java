/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.time.*;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author Lân
 */
public class HoaDonHeader {
    private String maHoaDon;
    private LocalDate ngayBan;
    private String tenKhachHang;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String maHoaDon, String ngayBan, String tenKhachHang) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.maHoaDon = maHoaDon;
        this.ngayBan = LocalDate.parse(ngayBan, formatter);
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public LocalDate getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(LocalDate ngayBan) {
        this.ngayBan = ngayBan;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Ma hoa don: ").append(maHoaDon)
                .append("\nNgay Ban: ").append(ngayBan.toString())
                .append("\nTen khach hang: ").append(tenKhachHang);
        return b.toString();
    }
    
}
