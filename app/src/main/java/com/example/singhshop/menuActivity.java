package com.example.singhshop;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.Menu;
import android.view.View;

public class menuActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String s1[], s2[];
    int images[]= { R.drawable.chocolate , R.drawable.stawberry , R.drawable.vanilla , R.drawable.hotcaramel , R.drawable.hotfudge,
    R.drawable.shamrock, R.drawable.mango, R.drawable.blueberrypomegranatesmoothie, R.drawable.ctriplemilkshake , R.drawable.striplemilkshake,
    R.drawable.vtripleshake,R.drawable.stawberrysmoothie};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        s1 = getResources().getStringArray(R.array.name);
        s2 = getResources().getStringArray(R.array.information);

        recyclerView = findViewById(R.id.recyclerView);


        MyAdapter myAdapter = new MyAdapter(this, s1,s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreatePanelMenu(int featureId, @NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
}
