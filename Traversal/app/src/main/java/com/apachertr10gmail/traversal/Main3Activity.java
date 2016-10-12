package com.apachertr10gmail.traversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
static Main2Activity ss=new Main2Activity();
  static   int k=ss.number;
  static int nn=1;
    static int trav[]=new int[k];
    TextView tbn;
    EditText etb;
    Button bt;
    String c;
    static int ii=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ii=0;
        nn=1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tbn= (TextView) findViewById(R.id.textViewarr);
        etb= (EditText) findViewById(R.id.editText2);
        bt= (Button) findViewById(R.id.button2);
        tbn.setText("Enter number 1");
        }


    public void arra(View view) {
        c=etb.getText().toString();
        if (c.matches("")) {
            Toast.makeText(this, "No tree can be formed with 0 node", Toast.LENGTH_SHORT).show();
            return;
        }else {
            trav[ii] = Integer.parseInt(c);
            etb.setText("");

            ii++;
            nn++;
            tbn.setText("Enter number " + nn );

            if (ii == k) {
                Intent iiii = new Intent(this, Main4Activity.class);

                startActivity(iiii);
                finish();
            }
        }
    }
}
