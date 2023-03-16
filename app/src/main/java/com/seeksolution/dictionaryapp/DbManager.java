package com.seeksolution.dictionaryapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {
    public DbManager(Context context) {
        super(context, "dictdb", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "create table dict(word text , meaning text)";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
