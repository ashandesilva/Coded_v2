package com.example.ashan.coded;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    String msg, type;

    EditText msgInput;
    EditText typeInput;
    TextView codedMsg;

    Button encodeButton;

    public Main2Activity() {
    }

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        msgInput = (EditText) findViewById(R.id.msgInput);
        typeInput = (EditText) findViewById(R.id.typeInput);
        codedMsg = findViewById(R.id.codedMsg);
        codedMsg.setTextIsSelectable(true);

        encodeButton = (Button) findViewById(R.id.encodeButton);
        encodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = msgInput.getText().toString();
                type = typeInput.getText().toString();
                if (type.equals("a")){
                    msg = msg.replaceAll("a", "Z");
                    msg = msg.replaceAll("b", "Y");
                    msg = msg.replaceAll("c", "X");
                    msg = msg.replaceAll("d", "W");
                    msg = msg.replaceAll("e", "V");
                    msg = msg.replaceAll("f", "U");
                    msg = msg.replaceAll("g", "T");
                    msg = msg.replaceAll("h", "S");
                    msg = msg.replaceAll("i", "R");
                    msg = msg.replaceAll("j", "Q");
                    msg = msg.replaceAll("k", "P");
                    msg = msg.replaceAll("l", "O");
                    msg = msg.replaceAll("m", "N");
                    codedMsg.setText(String.format("a%s", msg));
                } else if (type.equals("b")){
                    msg = msg.replaceAll("c", "W");
                    msg = msg.replaceAll("a", "Y");
                    msg = msg.replaceAll("b", "X");
                    msg = msg.replaceAll("d", "V");
                    msg = msg.replaceAll("e", "U");
                    msg = msg.replaceAll("f", "T");
                    msg = msg.replaceAll("g", "S");
                    msg = msg.replaceAll("h", "R");
                    msg = msg.replaceAll("i", "Q");
                    msg = msg.replaceAll("j", "P");
                    msg = msg.replaceAll("k", "O");
                    msg = msg.replaceAll("l", "N");
                    codedMsg.setText(String.format("b%s", msg));
                }else if (type.equals("c")) {
                    msg = msg.replaceAll("a", "X");
                    msg = msg.replaceAll("b", "W");
                    msg = msg.replaceAll("c", "V");
                    msg = msg.replaceAll("d", "U");
                    msg = msg.replaceAll("e", "T");
                    msg = msg.replaceAll("f", "S");
                    msg = msg.replaceAll("g", "R");
                    msg = msg.replaceAll("h", "Q");
                    msg = msg.replaceAll("i", "P");
                    msg = msg.replaceAll("j", "O");
                    msg = msg.replaceAll("k", "N");
                    msg = msg.replaceAll("l", "Z");
                    msg = msg.replaceAll("m", "Y");
                    codedMsg.setText(String.format("c%s", msg));
                }
               //codedMsg.setText(msg);








                showToast("Encode");

            }
        });


    }

    private void showToast(String text){
        Toast.makeText(Main2Activity.this, text, Toast.LENGTH_SHORT).show();
    }
}
