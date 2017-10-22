package com.aplikasiku.miftah.foodrecipe;

/**
 * Created by Miftah on 11/10/2017.
 */

public class Resep {

    private String Judulresep;
    private String deskripsimakanan;
    private int Gambar;
    private String isiResep;
    private String menuBar;

    public Resep(String Judulresep, String deskripsimakanan, int Gambar, String isiResep, String menuBar){
        this.Judulresep = Judulresep;
        this.deskripsimakanan = deskripsimakanan;
        this.Gambar = Gambar;
        this.isiResep = isiResep;
        this.menuBar = menuBar;
    }

    public String getJudulresep() {return Judulresep;}
    public String getDeskripsimakanan() {return  deskripsimakanan;}
    public int getGambar() {return Gambar;}
    public String getIsiResep(){return isiResep;}
    public String getMenuBar() {return menuBar;}
}
