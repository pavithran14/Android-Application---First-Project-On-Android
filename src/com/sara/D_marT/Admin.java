package com.sara.D_marT;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class Admin extends Activity {
	       /** Called when the activity is first created. */
	Button b1,b2,b3;
	TextView t1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.adminpage);
        b3=(Button)findViewById(R.id.del);
        b1=(Button)findViewById(R.id.order);
        b2=(Button)findViewById(R.id.Button02);
        t1=(TextView)findViewById(R.id.textView2);
        t1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Admin.this,D_marTActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
				startActivity(i);
				finish();
			}
		});
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				finish();
				Intent i=new Intent(Admin.this,DynamicTabActivity.class);
				startActivity(i);
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Admin.this,View_Pro.class);
				startActivity(i);
	
			}
		});
        b3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Admin.this,Del.class);
				startActivity(i);
			}
		});
        }
    
}