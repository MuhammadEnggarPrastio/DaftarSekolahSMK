package com.example.Sekolahku;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.Sekolahku.databinding.ActivityHomeBinding;
import com.example.Sekolahku.databinding.LayoutTentangBinding;
public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnList.setOnClickListener(v->{
            Intent nextpage = new Intent(this,MainActivity.class);
            startActivity(nextpage);
        });

        binding.btnMaps.setOnClickListener(v->{
            Intent nextpage = new Intent(this,MapsActivity.class);
            startActivity(nextpage);
        });

        binding.btnAbout.setOnClickListener(v->{
            Dialog dl = new Dialog(this);
            LayoutTentangBinding bDl = LayoutTentangBinding.inflate(LayoutInflater.from(this));
            dl.setContentView(bDl.getRoot());
            bDl.btnOkAbout.setOnClickListener(v1->{
                dl.dismiss();
            });
            dl.show();
        });

        binding.btnExit.setOnClickListener(v->{
            new AlertDialog.Builder(this)
                    .setTitle("Keluar")
                    .setMessage("Apakah anda yakin ingin keluar ?")
                    .setPositiveButton("Ya", (dialog, which)-> {
                        HomeActivity.this.finish();
                    }).setNegativeButton("Tidak",(dialog,which)-> {
                    dialog.dismiss();
            }).show();
        });
    }
    @Override
    public void onBackPressed() {

    }
}