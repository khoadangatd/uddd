package com.deitel.qlsv;

import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.uddd.adapter.adaptersubject;
import com.example.uddd.database.database;
import com.example.uddd.models.Subject;

import java.util.ArrayList;

public class ActivitySubject extends AppCompatActivity {

    Toolbar toolbar;
    ListView listViewSubject;
    ArrayList<Subject> ArrayListSubject;
    com.example.uddd.database.database database;
    com.example.uddd.adapter.adaptersubject adaptersubject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        toolbar = findViewById(R.id.toolbarSubject);
        listViewSubject = findViewById(R.id.listviewSubject);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        database = new database(this);
        ArrayListSubject = new ArrayList<>();
        Cursor cursor = database.getDataSubject();
        while(cursor.moveToNext()){
            int id = cursor.getInt(0);
            String title = cursor.getString(1);
            int credit = cursor.getInt(2);
            String time = cursor.getString(3);
            String place = cursor.getString(4);
            ArrayListSubject.add(new Subject(id,title,credit,time,place));

        }
        adaptersubject = new adaptersubject(ActivitySubject.this,ArrayListSubject);
        listViewSubject.setAdapter(adaptersubject);
        cursor.moveToFirst();
        cursor.close();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
}