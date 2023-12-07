package com.example.simplelistagainpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  lIstFragment.onItemClicked {

    TextView tvDetail;
    ArrayList<String> phones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

         phones = new ArrayList<>();

        phones.add("000");
        phones.add("001");
        phones.add("002");
        phones.add("003");

        // Make sure tvDetail is not null before setting text
        if (tvDetail != null && phones.size() > 0) {
            tvDetail.setText(phones.get(0));
        }



    }

    @Override
    public void itemClicked(int position) {
        tvDetail.setText(phones.get(position));
    }


    void init()
    {

        tvDetail = findViewById(R.id.tvDetail);
    }
}