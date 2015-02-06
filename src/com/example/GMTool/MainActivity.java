package com.example.GMTool;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void startSelectNPCActivity(View view){
        Intent intent = new Intent(this, selectNPCList.class);
        startActivity(intent);

    }
    public void startSelectFactionActivity(View view){
        Toast.makeText(getApplicationContext(), "not implemented yet",
                Toast.LENGTH_LONG).show();
    }
}
