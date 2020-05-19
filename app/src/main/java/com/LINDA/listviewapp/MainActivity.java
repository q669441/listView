package com.LINDA.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] favorite;
    private ListView ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        favorite =getResources().getStringArray(R.array.favorite);
       ls=(ListView)findViewById(R.id.ls);
        ArrayAdapter<String>  ad =new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,favorite);
        ls.setAdapter(ad);
        ls.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }

    public void btnOK(View view) {
        String str ="";
        for (int i = 0;i<favorite.length;i++){
            if (ls.isItemChecked(i))
                str += favorite[i] +"\n";
        }
        TextView txvshow =(TextView)findViewById(R.id.txvshow);
        txvshow.setText(str);
    }
}
