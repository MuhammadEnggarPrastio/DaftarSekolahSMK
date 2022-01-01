package com.example.Sekolahku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.Sekolahku.database.datavariabel;
import com.example.Sekolahku.databinding.ActivityMainBinding;
import com.example.Sekolahku.database.AppDatabase;
import com.example.Sekolahku.database.DatabaseDao;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Listsekolah adapter;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarList.setNavigationOnClickListener(v->{
            this.finish();
        });
        setupRecycler();
    }
    private void setupRecycler(){
        adapter = new Listsekolah(this);
        binding.rcSekolah.setLayoutManager(new LinearLayoutManager(this));
        binding.rcSekolah.setAdapter(adapter);

        adapter.setNewList(initDb());
    }
    private List<ModelSekolah> getData(){
        List<ModelSekolah> newList = new ArrayList<>();


    newList.add(new ModelSekolah(Databasesekolah.AlMuhtadin, Databasesekolah.gambarAlMuhtadin, Databasesekolah.akreditasiAlMuhtadin, Databasesekolah.jurusanAlMuhtadin, Databasesekolah.eskulAlMuhtadin,
    Databasesekolah.fasilitasAlMuhtadin, Databasesekolah.visiAlMuhtadin, Databasesekolah.misiAlMuhtadin, Databasesekolah.kontakAlMuhtadin, Databasesekolah.websiteAlMuhtadin, Databasesekolah.emailAlMuhtadin));

    newList.add(new ModelSekolah(Databasesekolah.Assalamah, Databasesekolah.gambarAssalamah, Databasesekolah.akreditasiAssalamah, Databasesekolah.jurusanAssalamah, Databasesekolah.eskulAssalamah,
    Databasesekolah.fasilitasAssalamah, Databasesekolah.visiAssalamah, Databasesekolah.misiAssalamah, Databasesekolah.kontakAssalamah, Databasesekolah.websiteAssalamah, Databasesekolah.emailAssalamah));

    newList.add(new ModelSekolah(Databasesekolah.BhaktiKarya, Databasesekolah.gambarBhaktiKarya, Databasesekolah.akreditasiBhaktiKarya, Databasesekolah.jurusanBhaktiKarya, Databasesekolah.eskulBhaktiKarya,
    Databasesekolah.fasilitasBhaktiKarya, Databasesekolah.visiBhaktiKarya, Databasesekolah.misiBhaktiKarya, Databasesekolah.kontakBhaktiKarya, Databasesekolah.websiteBhaktiKarya, Databasesekolah.emailBhaktiKarya));

    newList.add(new ModelSekolah(Databasesekolah.KusumaBangsa, Databasesekolah.gambarKusumaBangsa, Databasesekolah.akreditasiKusumaBangsa, Databasesekolah.jurusanKusumaBangsa, Databasesekolah.eskulKusumaBangsa,
    Databasesekolah.fasilitasKusumaBangsa, Databasesekolah.visiKusumaBangsa, Databasesekolah.misiKusumaBangsa, Databasesekolah.kontakKusumaBangsa, Databasesekolah.websiteKusumaBangsa, Databasesekolah.emailKusumaBangsa));

    newList.add(new ModelSekolah(Databasesekolah.Negeri1Depok, Databasesekolah.gambarNegeri1Depok, Databasesekolah.akreditasiNegeri1Depok, Databasesekolah.jurusanNegeri1Depok, Databasesekolah.eskulNegeri1Depok,
    Databasesekolah.fasilitasNegeri1Depok, Databasesekolah.visiNegeri1Depok, Databasesekolah.misiNegeri1Depok, Databasesekolah.kontakNegeri1Depok, Databasesekolah.websiteNegeri1Depok, Databasesekolah.emailNegeri1Depok));

    newList.add(new ModelSekolah(Databasesekolah.Negeri2Depok, Databasesekolah.gambarNegeri2Depok, Databasesekolah.akreditasiNegeri2Depok, Databasesekolah.jurusanNegeri2Depok, Databasesekolah.eskulNegeri2Depok,
    Databasesekolah.fasilitasNegeri2Depok, Databasesekolah.visiNegeri2Depok, Databasesekolah.misiNegeri2Depok, Databasesekolah.kontakNegeri2Depok, Databasesekolah.websiteNegeri2Depok, Databasesekolah.emailNegeri2Depok));

    newList.add(new ModelSekolah(Databasesekolah.Negeri4Depok, Databasesekolah.gambarNegeri4Depok, Databasesekolah.akreditasiNegeri4Depok, Databasesekolah.jurusanNegeri4Depok, Databasesekolah.eskulNegeri4Depok,
    Databasesekolah.fasilitasNegeri4Depok, Databasesekolah.visiNegeri4Depok, Databasesekolah.misiNegeri4Depok, Databasesekolah.kontakNegeri4Depok, Databasesekolah.websiteNegeri4Depok, Databasesekolah.emailNegeri4Depok));

    newList.add(new ModelSekolah(Databasesekolah.Perintis2Depok, Databasesekolah.gambarPerintis2Depok, Databasesekolah.akreditasiPerintis2Depok, Databasesekolah.jurusanPerintis2Depok, Databasesekolah.eskulPerintis2Depok,
    Databasesekolah.fasilitasPerintis2Depok, Databasesekolah.visiPerintis2Depok, Databasesekolah.misiPerintis2Depok, Databasesekolah.kontakPerintis2Depok, Databasesekolah.websitePerintis2Depok, Databasesekolah.emailPerintis2Depok));

    newList.add(new ModelSekolah(Databasesekolah.SetiaNegara, Databasesekolah.gambarSetiaNegara, Databasesekolah.akreditasiSetiaNegara, Databasesekolah.jurusanSetiaNegara, Databasesekolah.eskulSetiaNegara,
    Databasesekolah.fasilitasSetiaNegara, Databasesekolah.visiSetiaNegara, Databasesekolah.misiSetiaNegara, Databasesekolah.kontakSetiaNegara, Databasesekolah.websiteSetiaNegara, Databasesekolah.emailSetiaNegara));

    newList.add(new ModelSekolah(Databasesekolah.FarmasiHarapanMassa, Databasesekolah.gambarFarmasiHarapanMassa, Databasesekolah.akreditasiFarmasiHarapanMassa, Databasesekolah.jurusanFarmasiHarapanMassa, Databasesekolah.eskulFarmasiHarapanMassa,
    Databasesekolah.fasilitasFarmasiHarapanMassa, Databasesekolah.visiFarmasiHarapanMassa, Databasesekolah.misiFarmasiHarapanMasssa, Databasesekolah.kontakFarmasiHarapanMassa, Databasesekolah.websiteFarmasiHarapanMassa, Databasesekolah.emailFarmasiHarapanMassa));

    return newList;
    }
    private List<datavariabel> initDb(){
        long totalData = AppDatabase.getInstance(this).dbDao().getCount();
        DatabaseDao db = AppDatabase.getInstance(this).dbDao();
            if (totalData == 0) {
            List<ModelSekolah> newList = getData();

            for(int i =0 ; i < newList.size(); i++){
                datavariabel model = new datavariabel();
                model.id = i+1;
                model.name = newList.get(i).getName();
                model.akreditasi = newList.get(i).getAkreditasi();
                model.jurusan = newList.get(i).getJurusan();
                model.eskul = newList.get(i).getEskul();
                model.fasilitas = newList.get(i).getFasilitas();
                model.visi = newList.get(i).getVisi();
                model.misi = newList.get(i).getMisi();
                model.nomorhp = newList.get(i).getNomorhp();
                model.email = newList.get(i).getEmail();
                model.website = newList.get(i).getWebsite();
                model.gambar = newList.get(i).getGambar();
                db.insertData(model);
            }
        }
        return db.getAllData();
    }

}