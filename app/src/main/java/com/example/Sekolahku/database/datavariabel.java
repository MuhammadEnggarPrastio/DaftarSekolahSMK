package com.example.Sekolahku.database;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class datavariabel {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo
    public String name;

    @ColumnInfo
    public String akreditasi;

    @ColumnInfo
    public String jurusan;

    @ColumnInfo
    public String eskul;

    @ColumnInfo
    public String fasilitas;

    @ColumnInfo
    public String visi;

    @ColumnInfo
    public String misi;

    @ColumnInfo
    public String nomorhp;

    @ColumnInfo
    public String website;

    @ColumnInfo
    public String email;

    @ColumnInfo
    public String gambar;
}
