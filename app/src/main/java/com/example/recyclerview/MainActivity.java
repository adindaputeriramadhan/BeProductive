package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,R.drawable.task,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources(). getStringArray(R.array.reminder);
        s2 = getResources(). getStringArray(R.array.description);

        MyAdapter myAdapter = new MyAdapter( this, s1, s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}