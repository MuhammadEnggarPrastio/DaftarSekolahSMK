package com.example.Sekolahku;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.Sekolahku.database.datavariabel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class Listsekolah extends RecyclerView.Adapter<Listsekolah.CustomVH>{

    private Activity act;
    private List<datavariabel> listData;


    public Listsekolah(Activity act){
        this.act = act;
    }

    public void setNewList(List<datavariabel> newListData){
        listData = new ArrayList<>();
        listData.addAll(newListData);

    }

    @NonNull
    @Override
    public CustomVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CustomVH(LayoutInflater.from(act).inflate(R.layout.layout_list_sekolah,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CustomVH holder, int position) {
        Picasso.get().load(listData.get(position).gambar).into(holder.iv);
        holder.tv_title.setText(listData.get(position).name);
        holder.tv_description.setText(listData.get(position).akreditasi);

        holder.tv_title.setOnClickListener(v->{
            nextpage(position);
        });
        holder.iv.setOnClickListener(v->{
            nextpage(position);
        });
        holder.tv_description.setOnClickListener(v->{
            nextpage(position);
        });
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class CustomVH extends RecyclerView.ViewHolder {
        public CustomVH(@NonNull View itemView) {
            super(itemView);

        }
        public ImageView iv = itemView.findViewById(R.id.imageview);
        public TextView tv_title = itemView.findViewById(R.id.textview_title);
        public TextView tv_description = itemView.findViewById(R.id.textview_description);
    }

    private void nextpage(int pos){
        Intent detailpage = new Intent(act,DetailActivity.class);
        detailpage.putExtra("EXTRA_TITLE",listData.get(pos).name);
        detailpage.putExtra("EXTRA_AKREDITASI",listData.get(pos).akreditasi);
        detailpage.putExtra("EXTRA_JURUSAN",listData.get(pos).jurusan);
        detailpage.putExtra("EXTRA_ESKUL",listData.get(pos).eskul);
        detailpage.putExtra("EXTRA_FASILITAS",listData.get(pos).fasilitas);
        detailpage.putExtra("EXTRA_VISI",listData.get(pos).visi);
        detailpage.putExtra("EXTRA_MISI",listData.get(pos).misi);
        detailpage.putExtra("EXTRA_NOMORHP",listData.get(pos).nomorhp);
        detailpage.putExtra("EXTRA_EMAIL",listData.get(pos).email);
        detailpage.putExtra("EXTRA_WEBSITE",listData.get(pos).website);
        detailpage.putExtra("EXTRA_GAMBAR",listData.get(pos).gambar);
        act.startActivity(detailpage);
    }
}
