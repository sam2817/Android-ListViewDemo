package com.example.listviewdemo.listviewdemo;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView fruitListView;
    String fruits[];
    // String desc[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources(); // calling the res folder (resource folder)
        fruits = res.getStringArray(R.array.fruit_names);


        fruitListView = (ListView) findViewById(R.id.listView);

        fruitListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits));

        // ANONYMOUS CLASS
        fruitListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), fruits[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
