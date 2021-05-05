package com.example.splashscreen31;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int RECOGNIZE_SPEECH_ACTIVITY = 2;
    private static final int RECONOCEDOR_VOZ = 7;
    private android.widget.TextView escuchando;
    private android.widget.TextView respuesta;

    private TextToSpeech leer;
    private Object TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
      

        switch (keyCode) {
/*
            case KeyEvent.KEYCODE_DPAD_LEFT:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO


                }
                return true;
               */
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    Intent anterior = new Intent(MainActivity.this, Q_R_CODE.class);
                    startActivity(anterior);

                }


                return true;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    Intent anterior = new Intent(MainActivity.this, Arreglarmaquinaestragadanoarranca.class);
                    startActivity(anterior);


                }
                return true;
            case KeyEvent.KEYCODE_ENTER:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO
                    Intent anterior = new Intent(MainActivity.this, AtivaRechonecimentoVoz.class);
                    startActivity(anterior);
                }
                return true;
            default:
                return super.dispatchKeyEvent(event);
        }
    }

}