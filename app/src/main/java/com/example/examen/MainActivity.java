package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

   ListView listView;
   SeekBar seekBar;
   TextView textView;
   View view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        final ClassAdapter adapter = new ClassAdapter(ListDataHelper.provideItems());
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view2, int i, long id) {
                        adapter.getItem(i);
                view.setBackgroundColor(ContextCompat.getColor(view.getContext(), adapter.getItem(i).getColorid()));

            }
        });

        textView = findViewById(R.id.textView);
        seekBar = findViewById(R.id.seekBar);
        view =findViewById(R.id.view);


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textView.setText("alpha:" + i + "%");

                float alpha = i/100f;
                view.setAlpha(alpha);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }


        });
    }
}