package com.example.kuis;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.kuis.dao.MhsDao;
import com.example.kuis.model.Mhs;

@Database(entities = {Mhs.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract MhsDao mhsDao();
}
