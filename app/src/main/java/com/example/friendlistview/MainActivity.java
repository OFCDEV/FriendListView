package com.example.friendlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView friendListView = (ListView) findViewById(R.id.friendListView);

        ArrayList<String> myFriend = new ArrayList<String>();
        myFriend.add("Bila");
        //myFriend.add("Mu");
        myFriend.add("Omm");
        myFriend.add("Nigga");
        myFriend.add("Halua");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,myFriend);

        friendListView.setAdapter(arrayAdapter);

        friendListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(getApplicationContext(), "Gandi Mara mgh  "+myFriend.get(i), Toast.LENGTH_SHORT).show();
            }
        });
    }
}