/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Cuahang;

/**
 *
 * @author PM_T7
 */
public class sanpham {
    
    private String masp;
    private String mancc;
    private String tenncc;
    private String diachincc;
    private String tensp;
    private int soluong;
    private int gia;

    public sanpham() {
    }

    public sanpham(String masp, String mancc, String tenncc, String diachincc, String tensp, int soluong, int gia) {
        this.masp = masp;
        this.mancc = mancc;
        this.tenncc = tenncc;
        this.diachincc = diachincc;
        this.tensp = tensp;
        this.soluong = soluong;
        this.gia = gia;
    }

    public String getMasp() {
        return masp;
    }

    public String getMancc() {
        return mancc;
    }

    public String getTenncc() {
        return tenncc;
    }

    public String getDiachincc() {
        return diachincc;
    }

    public String getTensp() {
        return tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public void setTenncc(String tenncc) {
        this.tenncc = tenncc;
    }

    public void setDiachincc(String diachincc) {
        this.diachincc = diachincc;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
