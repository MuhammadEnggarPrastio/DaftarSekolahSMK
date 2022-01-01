package com.example.Sekolahku;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Sekolahku.databinding.ActivityDetailBinding;
import com.squareup.picasso.Picasso;
public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        TextView lokasi = (TextView) findViewById(R.id.tv_Lokasi);
        lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this,MapsActivity.class);
                startActivity(intent);
            }
        });

        String nama = getIntent().getStringExtra("EXTRA_TITLE");
        String akreditasi = getIntent().getStringExtra("EXTRA_JUMLAHRESEP");
        String jurusan = getIntent().getStringExtra("EXTRA_JURUSAN");
        String eskul = getIntent().getStringExtra("EXTRA_ESKUL");
        String fasilitas = getIntent().getStringExtra("EXTRA_FASILITAS");
        String visi = getIntent().getStringExtra("EXTRA_VISI");
        String misi = getIntent().getStringExtra("EXTRA_MISI");
        String nomorhp = getIntent().getStringExtra("EXTRA_NOMORHP");
        String email = getIntent().getStringExtra("EXTRA_EMAIL");
        String website = getIntent().getStringExtra("EXTRA_WEBSITE");
        String gambar = getIntent().getStringExtra( "EXTRA_GAMBAR");

        binding.toolbarDetail.setTitle(nama);
        binding.toolbarDetail.setNavigationOnClickListener(v->{
            this.finish();
        });
        binding.textviewTitledetail.setText(nama);
        binding.isiJurusan.setText(jurusan);
        binding.isiEkstrakurikuler.setText(eskul);
        binding.isiFasilitas.setText(fasilitas);
        binding.isiVisi.setText(visi);
        binding.isiMisi.setText(misi);
        binding.Nohandphone.setText(nomorhp);
        binding.email.setText(email);
        binding.website.setText(website);

        Picasso.get().load(gambar).into(binding.imageviewDetail);
    }
}