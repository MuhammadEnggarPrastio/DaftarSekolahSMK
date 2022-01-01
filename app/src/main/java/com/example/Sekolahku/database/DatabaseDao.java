package com.example.Sekolahku.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DatabaseDao {

    @Query("SELECT * FROM datavariabel")
    List<datavariabel> getAllData();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long insertData(datavariabel data);

    @Query("SELECT  COUNT(*) FROM datavariabel")
    Long getCount();

}
