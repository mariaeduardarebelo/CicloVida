package com.example.merdc.ciclovida;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

/**
 * Created by mer on 23/10/2017.
 */

public class SecondaryActivity extends AppCompatActivity {

    Button mSecScreenBtn;
    SecondaryActivity mSecActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondary_activity);

        mSecScreenBtn = (Button) findViewById(R.id.secScreenBtn);

        mSecActivity = this;

        mSecScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(mSecActivity, MainActivity.class);
                startActivity(it);
            }
        });

        Log.i("SecondaryActivity", "::onCreate() sendo chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("SecondaryActivity", "::onStart() sendo chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("SecondaryActivity", "::onResume() sendo chamado");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i("SecondaryActivity", "::onPause() sendo chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("SecondaryActivity", "::onStop() sendo chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("SecondaryActivity", "::onRestart() sendo chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("SecondaryActivity", "::onDestroy() sendo chamado");
    }

}
