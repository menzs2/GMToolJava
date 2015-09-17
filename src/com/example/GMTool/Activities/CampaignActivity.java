package com.example.GMTool.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.GMTool.R;

/**
 * Created by Thunderchild on 11.09.2015.
 */
public class CampaignActivity extends Activity {

    private String campaingName = "Campaign Name";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign);
        TextView detail = (TextView)findViewById(R.id.campaignName);
        detail.setText(campaingName);
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