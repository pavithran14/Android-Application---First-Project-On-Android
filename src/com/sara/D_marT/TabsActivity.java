package com.sara.D_marT;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class TabsActivity extends TabActivity {
    /** Called when the activity is first created. */
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        String no=getIntent().getStringExtra("no");
        
        TabHost t1=getTabHost();
        TabSpec ts1=t1.newTabSpec("Search");
        ts1.setIndicator("Search");
        Intent i1=new Intent(TabsActivity.this,Search.class);
        i1.putExtra("no", no);
        ts1.setContent(i1);
        
        TabSpec ts2=t1.newTabSpec("Offers");
        ts2.setIndicator("Offers");
       Intent i2=new Intent(TabsActivity.this,Offer.class);
       i2.putExtra("no", no);
        ts2.setContent(i2);
        
        TabSpec ts3=t1.newTabSpec("Profile");
        ts3.setIndicator("Profile");
        Intent i3=new Intent(TabsActivity.this,Edprofile.class);
        i3.putExtra("no", no);
        ts3.setContent(i3);
        
        t1.addTab(ts1);
        t1.addTab(ts2);
        t1.addTab(ts3);
    }
}