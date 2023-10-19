package com.example.afuego;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PageEdit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_edit);

        ImageView flechaedit = findViewById(R.id.flechaedit);
        flechaedit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),PagePerfil.class);
                startActivityForResult(intent, 0);
            }
        });


    }
}
