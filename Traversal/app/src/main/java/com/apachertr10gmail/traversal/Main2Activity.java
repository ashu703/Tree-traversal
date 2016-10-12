package com.apachertr10gmail.traversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
EditText et;
  static   int number;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    et= (EditText) findViewById(R.id.editText);

        }

    public void enter(View view) {
        s=et.getText().toString();
        if (s.matches("")||s.matches("0")) {
            Toast.makeText(this, "Please enter valid input", Toast.LENGTH_SHORT).show();
            return;
        }else {
            number = Integer.parseInt(s);
            Intent i = new Intent(this, Main3Activity.class);
            startActivity(i);
            finish();
        }
    }
}
