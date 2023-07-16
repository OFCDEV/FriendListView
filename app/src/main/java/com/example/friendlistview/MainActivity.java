package com.example.friendlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView friendListView = (ListView) findViewById(R.id.friendListView);

        ArrayList<String> myFriend = new ArrayList<String>();
        myFriend.add("Bila");
        myFriend.add("Mu");
        myFriend.add("Omm");
        myFriend.add("Nigga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,myFriend);

        friendListView.setAdapter(arrayAdapter);
    }
}