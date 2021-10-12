package com.example.recaylerviev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<STATE> states = new ArrayList<STATE>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInit();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_v);
        AdapterRecV adapterRecV = new AdapterRecV(this,states);
        recyclerView.setAdapter(adapterRecV);
    }
    private void setInit(){
        states.add(new STATE("Sharipov","Ilgiz"));
        states.add(new STATE("Adilbek uulu","Atabek"));
        states.add(new STATE("Talanbek uulu","Abdurahim"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
        states.add(new STATE("name","sss"));
    }
}