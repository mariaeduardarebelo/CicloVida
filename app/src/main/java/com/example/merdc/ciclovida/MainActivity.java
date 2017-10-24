package com.example.merdc.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mMainScreenBtn;
    MainActivity mMainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainActivity = this;

        mMainScreenBtn = (Button) findViewById(R.id.mainscrBtn);

        mMainScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(mMainActivity, SecondaryActivity.class);
                startActivity(it);
            }
        });
        Log.i("MainActivity", "::onCreate() sendo chamado");
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i("MainActivity", "::onStart() sendo chamado");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i("MainActivity", "::onResume() sendo chamado");
    }

    @Override
    public void onPause() {
        super.onPause();

        Log.i("MainActivity", "::onPause() sendo chamado");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("MainActivity", "::onStop() sendo chamado");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i("MainActivity", "::onRestart() sendo chamado");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("MainActivity", "::onDestroy() sendo chamado");
    }
}
