/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manager;

/**
 *
 * @author Ihsan
 */
public class Manager {

    String Judul;
    String Penulis;
    int Tahun;

    // Konstruktor
    public Manager(String Judul, String Penulis, int Tahun) {
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Tahun = Tahun;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public int getTahun() {
        return Tahun;
    }

    public void setTahun(int Tahun) {
        this.Tahun = Tahun;
    }

     // Menampilkan informasi buku
    @Override
    public String toString() {
        return "Buku: " + Judul + " - " + Penulis + " (" + Tahun + ")";
    }
   
    
}
