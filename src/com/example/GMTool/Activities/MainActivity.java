package com.example.GMTool.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.example.GMTool.R;

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
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }

    public void openCampaignActivity(View view){
        Intent intent = new Intent(this, CampaignActivity.class);
        startActivity(intent);
    }

    public boolean  onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){

            case R.id.action_refresh:
                Toast.makeText(getApplicationContext(), "not implemented yet",
                        Toast.LENGTH_LONG).show();
                break;

            case R.id.newCampaignButton:
                Toast.makeText(getApplicationContext(), "not implemented yet",
                        Toast.LENGTH_LONG).show();
                break;
            default:
                break;


        }
        return true;

    }
}
