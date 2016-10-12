package com.apachertr10gmail.traversal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {
    Main3Activity jj = new Main3Activity();
    int o = 0;
    static String dde;
    TextView text;
    TextView asdf;
    BST bs=new BST();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        text = (TextView) findViewById(R.id.textView33);
        asdf= (TextView) findViewById(R.id.textView56);
        for (o = 0; o < jj.k; o++) {

        bs.insert(jj.trav[o]);

        }

    }

    public void pre(View view) {

        text.setText(bs.preorder());
        asdf.setText("Preorder traversal: To traverse a binary tree in Preorder, following operations are carried-out (i) Visit the root, (ii) Traverse the left subtree, and (iii) Traverse the right subtree");

    }

    public void post(View view) {
        text.setText(bs.postorder());

        asdf.setText("Postorder traversal: To traverse a binary tree in Postorder, following operations are carried-out (i) Traverse all the left external nodes starting with the left most subtree which is then followed by bubble-up all the internal nodes, (ii) Traverse the right subtree starting at the left external node which is then followed by bubble-up all the internal nodes, and (iii) Visit the root.");
    }

    public void inorder(View view) {
        text.setText(bs.inorder());

        asdf.setText("Inorder traversal: To traverse a binary tree in Inorder, following operations are carried-out (i) Traverse the left most subtree starting at the left external node, (ii) Visit the root, and (iii) Traverse the right subtree starting at the left external node.\n");

    }


}