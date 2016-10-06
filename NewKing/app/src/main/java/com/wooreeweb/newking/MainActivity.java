package com.wooreeweb.newking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(this);
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        if (v == btn1) {
            intent.putExtra("btn", "1");
        } else if (v == btn2) {
            intent.putExtra("btn", "2");
        } else if (v == btn3) {
            intent.putExtra("btn", "3");
        } else if (v == btn4) {
            intent.putExtra("btn", "4");
        } else if (v == btn5) {
            intent.putExtra("btn", "5");
        } else if (v == btn6) {
            intent.putExtra("btn", "6");
        }

        startActivity(intent);
    }
}

