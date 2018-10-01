package com.example.a503_08.btnevent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button hello, cat, dog, fine;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hello =(Button)findViewById(R.id.hello);
        cat =(Button)findViewById(R.id.cat);
        dog=(Button)findViewById(R.id.dog);

        fine = (Button)findViewById(R.id.fine);


        img = (ImageView)findViewById(R.id.img);


        hello.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"안녕하세요!!^^",Toast.LENGTH_LONG).show();

            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.cat);
            }
        });

        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.setImageResource(R.drawable.dog);
            }
        });


        fine.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(MainActivity.this).setMessage("종료하시겠습니까?").setTitle("종료").setPositiveButton("네", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                }).setNegativeButton("아니오", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        closeContextMenu();
                    }
                }).setCancelable(false).show();




            }

        });
    }
}
