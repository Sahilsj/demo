package com.example.animatednavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class recycleview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myvenudata[] myvenudata = new myvenudata[]{

                new myvenudata("TCS","Wardhaman nagar nagpur",R.drawable.pho),
                new myvenudata("hasten","Wardhaman nagar nagpur",R.drawable.rfd),
                new myvenudata("Wipro","Ram naagr nagpur",R.drawable.r),

        };
        myvenuadapter myvenuadapter = new myvenuadapter(myvenudata,recycleview.this);
        recyclerView.setAdapter(myvenuadapter);

    }
}