package com.wooreeweb.servicemp3;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by user on 2015-10-19.
 */
public class MusicService extends Service {

    MediaPlayer mp;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText( getApplicationContext(), "onCreate()", Toast.LENGTH_SHORT ).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Toast.makeText( getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT ).show();
        mp.stop();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        android.util.Log.i ( "서비스 테스트", "onStartCommand()" );
        mp = MediaPlayer.create ( this, R.raw.audio2 );
        mp.setLooping(true);
        mp.start();
        Toast.makeText( getApplicationContext(), "onStartCommand", Toast.LENGTH_SHORT ).show();
        return super.onStartCommand(intent, flags, startId);
    }
}

