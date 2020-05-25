package com.LINDA.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String[] fruit;
    private ListView ls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fruit =getResources().getStringArray(R.array.fruit);
        ls=findViewById(R.id.ls);
        ArrayAdapter<String>  ad = new ArrayAdapter<>(this,android.R.layout.simple_list_item_multiple_choice, fruit);
        ls.setAdapter(ad);
        ls.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

    }

    public void btnOK(View view) {
        String str = "";
        for(int i=0 ; i< fruit.length; i++){
            if(ls.isItemChecked(i))
                str += fruit[i] + "\n";
        }

        TextView txvShow = findViewById(R.id.txvshow);
        txvShow.setText(str);
//        for (int i = 0; i< favorite.length; i++){
//            if (ls.isItemChecked(i))
//                str += favorite[i] + "\n";
//        }
//        TextView txvshow =findViewById(R.id.txvshow);
//        txvshow.setText(str);
    }
}
