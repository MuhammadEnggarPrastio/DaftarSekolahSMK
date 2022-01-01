package com.example.Sekolahku;
public class ModelSekolah {

    private String name;
    private String gambar;
    private String akreditasi;
    private String jurusan;
    private String eskul;
    private String fasilitas;
    private String visi;
    private String misi;
    private String nomorhp;
    private String website;
    private String email;

    public String getName() {
        return name;
    }
    public ModelSekolah(String name, String gambar, String akreditasi, String jurusan, String eskul, String fasilitas, String visi, String misi, String nomorhp, String website, String email) {
        this.name = name;
        this.gambar = gambar;
        this.akreditasi = akreditasi;
        this.jurusan = jurusan;
        this.eskul = eskul;
        this.fasilitas = fasilitas;
        this.visi = visi;
        this.misi = misi;
        this.nomorhp = nomorhp;
        this.website = website;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAkreditasi() {
        return akreditasi;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getEskul() {
        return eskul;
    }

    public void setEskul(String eskul) {
        this.eskul = eskul;
    }

    public String getFasilitas (){
        return fasilitas;
    }

    public void setFasilitas (String fasilitas) {
        this.fasilitas = fasilitas;
    }

    public String getVisi (){
        return visi;
    }

    public void setVisi (String visi) {
        this.visi = visi;
    }

    public String getMisi (){
        return misi;
    }

    public void setMisi (String misi) {
        this.misi = misi;
    }

    public String getNomorhp (){
        return nomorhp;
    }

    public void setNomorhp (String nomorhp) {
        this.nomorhp = nomorhp;
    }

    public String getWebsite (){
        return website;
    }

    public void setWebsite (String website) {
        this.website = website;
    }

    public String getEmail (){
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
