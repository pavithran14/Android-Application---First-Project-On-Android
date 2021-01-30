package com.sara.D_marT;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Salesman2 extends Activity {
	       /** Called when the activity is first created. */
	Button b1,b2;
	TextView t1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.salesman1);
        b1=(Button)findViewById(R.id.pendeliver);
        b2=(Button)findViewById(R.id.up);
        t1=(TextView)findViewById(R.id.textView2);
        t1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Salesman2.this,D_marTActivity.class);
				startActivity(i);
			}
		});
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Salesman2.this,Delivery_Update.class);
				startActivity(i);
			}
		});
       
    }
}