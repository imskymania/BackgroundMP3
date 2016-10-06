package com.wooreeweb.servicemp3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Intent intent;
    Button btnStart, btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("서비스 - 백그라운드 음악 재생");

        intent = new Intent ( this, MusicService.class );
        btnStart = ( Button ) findViewById( R.id.btnStart );
        btnStop = ( Button ) findViewById( R.id.btnStop );

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService( intent );
                android.util.Log.i("서비스", "startService()");
                finish();
            }
        });

        btnStop.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(intent);
                android.util.Log.i("서비스", "stopService()");
            }
        });
    }
}
