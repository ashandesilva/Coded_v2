package com.example.ashan.coded;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    String code;

    EditText codeInput;
    TextView realMsg;

    Button decodeButton;

    public Main3Activity() {
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        codeInput = (EditText) findViewById(R.id.codeInput);
        realMsg = findViewById(R.id.realMsg);
        realMsg.setTextIsSelectable(true);

        decodeButton = (Button) findViewById(R.id.decodeButton);
        decodeButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                code = codeInput.getText().toString();
               //if (code[0] == "a"){
                    code = code.replaceAll("Z", "a");
                    code = code.replaceAll("Y", "b");
                    code = code.replaceAll("X", "c");
                    code = code.replaceAll("W", "d");
                    code = code.replaceAll("V", "e");
                    code = code.replaceAll("U", "f");
                    code = code.replaceAll("T", "g");
                    code = code.replaceAll("S", "h");
                    code = code.replaceAll("R", "i");
                    code = code.replaceAll("Q", "j");
                    code = code.replaceAll("P", "k");
                    code = code.replaceAll("O", "l");
                    code = code.replaceAll("N", "m");
                    realMsg.setText(code);

                showToast("Decode");
            }
        });
    }
    private void showToast(String text) {
        Toast.makeText(Main3Activity.this, text, Toast.LENGTH_SHORT).show();
    }
}
