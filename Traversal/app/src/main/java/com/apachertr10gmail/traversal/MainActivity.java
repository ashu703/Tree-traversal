package com.apachertr10gmail.traversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer _t,timer;
    int _count=1;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        im= (ImageView) findViewById(R.id.imageView);
        final Intent i =new Intent(this,Main2Activity.class);
        _t = new Timer();
        _t.scheduleAtFixedRate( new TimerTask() {
            @Override
            public void run() {

                _count++;

                runOnUiThread(new Runnable() //run on ui threa
                {
                    public void run()
                    {

                        if(_count<=3)
                        {
                            im.setImageResource(R.drawable.tw);
                        }
                        else
                        {
                            _t.cancel();

                            startActivity(i);
                            finish();
                        }
                    }
                });
            }
        }, 1000, 1000 );

    }
}
