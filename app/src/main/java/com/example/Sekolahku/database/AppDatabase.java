package com.example.Sekolahku.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {datavariabel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract DatabaseDao dbDao();

    private static AppDatabase instance = null;

    public static AppDatabase getInstance(Context contxet){

        if (instance == null){

            instance = Room.databaseBuilder(contxet,AppDatabase.class,"datasekolah").allowMainThreadQueries().build();

        }
        return instance;

    }
}
