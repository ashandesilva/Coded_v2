package com.example.ashan.coded;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button buttonD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonE);
        buttonD = findViewById(R.id.buttonD);

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDecode();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEncode();
            }
        });
    }
    public void openDecode(){
        Intent intent =new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
    public void  openEncode(){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
