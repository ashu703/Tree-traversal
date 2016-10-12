package com.apachertr10gmail.traversal;

import android.widget.TextView;

/**
 * Created by ashu on 10/11/2016.
 */ class Node
{
    Node left, right;
    int data;

    /* Constructor */
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
}

/* Class BST */
public class BST
{
    TextView gh;
    String cd="";
    private Node root;

    /* Constructor */
    public BST()
    {
        root = null;
    }
    /* Functions to insert data */
    public void insert(int data)
    {
        root = insert(root, data);
    }
    /* Function to insert data recursively */
    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }
    /* Function for inorder traversal */
    public String inorder()
    {cd="";
        return inorder(root);
    }
    private String inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.left);
            cd+=r.data+" ";
            inorder(r.right);
        }
        return cd;
    }
    /* Function for preorder traversal */
    public String preorder()
    { cd="";
       return preorder(root);
    }
    private String preorder(Node r)
    {
        if (r != null)
        {
            cd+=r.data+" ";

            preorder(r.left);
            preorder(r.right);
        }

        return  cd;
    }
    /* Function for postorder traversal */
    public String postorder()
    { cd="";
       return postorder(root);
    }
    private String postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            cd+=r.data+" ";
        }
        return  cd;
    }
}

