package uts.praktikum.pbo.soal4;

public class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;
    
    public LimasSegiEmpat() {
        luasAlas = 1;
        luasSelubungLimas = 1;
        tinggi = 1;
    }
    
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        luasAlas = luasAlasBaru;
        luasSelubungLimas = luasSelubungLimasBaru;
        tinggi = tinggiBaru;
    }
    
    public double getLuas() {
        return 0.33 * luasAlas * tinggi;
    }
    
    public double getVolume(){
        return luasAlas + luasSelubungLimas;
    }
    
    public void setLuasAlas(double luasAlasBaru) {
        luasAlas = luasAlasBaru;
    }
    
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        luasSelubungLimas = luasSelubungLimasBaru;
    }
    
    public void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
}