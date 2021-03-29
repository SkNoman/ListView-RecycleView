package com.example.courses;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class Activity2 extends AppCompatActivity {


    RecyclerView Recyclerview;
    int [] images = {
            R.drawable.audi,
            R.drawable.bmw,
            R.drawable.bugati,
            R.drawable.cevrolet,
            R.drawable.ford,
            R.drawable.honda,
            R.drawable.hyundai,
            R.drawable.lamborgini,
            R.drawable.mercedes,
            R.drawable.volvo,
            R.drawable.volkswagen,
            R.drawable.toyota,
            R.drawable.ferari,
            R.drawable.rr,
            R.drawable.koenigsegg,
            R.drawable.nissan,

    };
    MyAdapter myAdapter;
    String [] title ,desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Recyclerview = findViewById(R.id.recyclerviewid);
        title = getResources().getStringArray(R.array.Cars);
        desc =  getResources().getStringArray(R.array.Cars_desc);

        myAdapter = new MyAdapter(this,title,desc,images);

        Recyclerview.setAdapter(myAdapter);
        Recyclerview.setLayoutManager(new LinearLayoutManager(this));




    }
}