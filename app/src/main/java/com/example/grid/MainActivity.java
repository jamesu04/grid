package com.example.grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView grid;
    private String[] text = {"google", "facebook", "github", "instagram", "flicker", "line", "yahoo", "youtube"};
    private int[] imageId = {R.drawable.google, R.drawable.facebook, R.drawable.github,
            R.drawable.instagram, R.drawable.flicker, R.drawable.line, R.drawable.yahoo, R.drawable.youtube};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomGrid adapter = new CustomGrid(MainActivity.this, text, imageId);
        grid = (GridView) findViewById(R.id.grid);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //[+position] +的功用是?
                Toast.makeText(MainActivity.this, "你選取了" + text[+position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
