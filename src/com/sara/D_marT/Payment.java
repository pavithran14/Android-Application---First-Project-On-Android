package com.sara.D_marT;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Payment extends Activity {
	       /** Called when the activity is first created. */
	RadioButton r1;
	SQLiteDatabase dbs;
	String name,code,fair,username,address;
	LinearLayout l1;
	Button b,db;
	String no;
	Bundle bu;
	TextView t;
	int pic;
	Bundle bb;
	EditText e1,e2,e3,e4;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay);
         b=new Button(this);
    	 t=new TextView(this);
    	 bu=new Bundle();
    	dbs=openOrCreateDatabase("project", Context.MODE_PRIVATE, null); 
    	r1=(RadioButton)findViewById(R.id.R1);
        l1=(LinearLayout)findViewById(R.id.l2);
        db=(Button)findViewById(R.id.dbb);
        e1=(EditText)findViewById(R.id.cno);
        e2=(EditText)findViewById(R.id.cna);
        e3=(EditText)findViewById(R.id.cvv);
        e4=(EditText)findViewById(R.id.exdate);
        bb=getIntent().getExtras();
        name=bb.getString("Name");
        code=bb.getString("Code");
        fair=bb.getString("Fair");
        pic=bb.getInt("Image");
        no=bb.getString("no");
        Cursor c=dbs.rawQuery("SELECT * FROM Profile WHERE pho='"+no+"'",null);
        if(c.moveToFirst())
		{
			username=c.getString(0);
			address=c.getString(4);
			//Toast.makeText(getApplicationContext(), username, Toast.LENGTH_SHORT).show();
			//Toast.makeText(getApplicationContext(), address, Toast.LENGTH_SHORT).show();
			
		}
        
		
        r1.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				l1.removeAllViews();
				t.setText("Cash On Delivery is successed");
				//t.setTextColor(R.color.green);
				//t.setTextSize(20);
				b.setBackgroundColor(R.color.green);
				b.setText("Next");
				
				b.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Intent p=new Intent(Payment.this,Confirmation.class);
						
						bu.putString("product",name);
						bu.putString("Code",code);
						bu.putInt("Image", pic);
						bu.putString("name",username);
						bu.putString("no",no);
						bu.putString("addr",address);
						bu.putString("Fair",fair);
						bu.putString("pay", "Cash on delivey");
						p.putExtras(bu);
						startActivity(p);
						
											}
				});
				l1.addView(t);
				l1.addView(b);

			}
		});
        db.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(e1.getText().toString().isEmpty() || e2.getText().toString().isEmpty() || e3.getText().toString().isEmpty() || e1.getText().toString().isEmpty())
				{
					Toast.makeText(getApplicationContext(), "Not Filled", Toast.LENGTH_LONG).show();
				}
				else
				{
					Intent p=new Intent(Payment.this,Confirmation.class);
					bu.putString("product",name);
					bu.putString("Code",code);
					bu.putInt("Image", pic);
					bu.putString("name",username);
					bu.putString("no",no);
					bu.putString("addr",address);
					bu.putString("Fair",fair);
					bu.putString("pay", "Paid");
					p.putExtras(bu);
					startActivity(p);
				}
				
			}
		});
	
    }
}