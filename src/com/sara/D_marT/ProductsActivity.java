package com.sara.D_marT;

import android.app.TabActivity;
import android.os.Bundle;


@SuppressWarnings("deprecation")
public class ProductsActivity extends TabActivity {
    /** Called when the activity is first created. */
    Bundle b;  
    String name,code,offer,base,fair;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        
        b=getIntent().getExtras();
        name=b.getString("Name");
        code=b.getString("Code");
        offer=b.getString("Offer");
        base=b.getString("Base");
        fair=b.getString("Fair");
        
       
    }
}