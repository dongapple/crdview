package com.example.expandalble;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Versions> versionsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        initDate();
        setRecyclerView();
    }

    private void setRecyclerView() {
        VersionsAdapter versionsAdapter = new VersionsAdapter(versionsList);
        recyclerView.setAdapter(versionsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initDate() {

        versionsList = new ArrayList<>();

        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));
        versionsList.add(new Versions("제목", "과목","시간", "설명 이것저것 많이"));


    }
}