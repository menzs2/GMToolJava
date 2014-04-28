package com.example.GMTool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.ListActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Thunderchild on 03.04.2014.
 */
public class selectNPCList extends ListActivity {


    List<String> mValues = new ArrayList<String>();


    protected void loadContent() {
        for (int i = 0; i < 12; i++) {
            mValues.add("NPC  " + String.valueOf(i + 1));
        }
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc_select);
        loadContent();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
              android.R.layout.simple_list_item_1  , mValues);

        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
    }

    public void startCreateNPCActivity(View view){
        Intent intent = new Intent(this, CreateNpcActivity.class);
        startActivity(intent);
    }


}