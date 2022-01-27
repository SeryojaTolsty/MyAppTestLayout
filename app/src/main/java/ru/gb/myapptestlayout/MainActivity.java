package ru.gb.myapptestlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSend = findViewById(R.id.send_button);
        buttonSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent duck = new Intent(this, MainActivity2.class);
        startActivity(duck);
    }
}