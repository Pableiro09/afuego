package com.example.afuego;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PageEdit extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_edit);

        ImageView flechaedit = findViewById(R.id.flechaedit);
        ImageView suma1 = findViewById(R.id.suma1);
        ImageView imagen1 = findViewById(R.id.imagen1);


        flechaedit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(),PagePerfil.class);
                startActivityForResult(intent, 0);
            }
        });
        
        suma1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para abrir el explorador de archivos
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(intent, 1);
            }
        });




    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK && data != null) {
            // Obtener la URI de la imagen seleccionada
            Uri imageUri = data.getData();

            // Establecer la imagen en la ImageView
            imagen1.setImageURI(imageUri);
        }
    }

}
