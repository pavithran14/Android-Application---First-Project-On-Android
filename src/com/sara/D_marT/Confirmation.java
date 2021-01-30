package com.sara.D_marT;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;


public class Confirmation extends Activity {
	Bundle bb;
	TextView t1,t2,t3,t4,t5,t6,t7,t8,t;
	ImageView iv;
	int pic;
	SQLiteDatabase db;
	String product,code,name,ph,add,amo,pay;
		       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.final_list);
        t1=(TextView)findViewById(R.id.TextView05);
        t2=(TextView)findViewById(R.id.TextView07);
        t3=(TextView)findViewById(R.id.TextView08);
        t4=(TextView)findViewById(R.id.TextView09);
        t5=(TextView)findViewById(R.id.TextView10);
        t6=(TextView)findViewById(R.id.TextView11);
        t7=(TextView)findViewById(R.id.TextView12);
        iv=(ImageView)findViewById(R.id.imageView1);
        db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS c_order(pn VARCHAR,code VARCHAR,un VARCHAR,ph VARCHAR,addr VARCHAR,amo VARCHAR,pay VARCHAR,del VARCHAR);");

        bb=getIntent().getExtras();
        product=bb.getString("product");
        code=bb.getString("Code");
        name=bb.getString("name");
        ph=bb.getString("no");
        add=bb.getString("addr");
        amo=bb.getString("Fair");
        pay=bb.getString("pay");
        pic=bb.getInt("Image");
        iv.setImageResource(pic);
        t1.setText(product);
        t2.setText(code);
        t3.setText(name);
        t4.setText(ph);
        t5.setText(add);
        t6.setText(amo);
        t7.setText(pay);
        t=(TextView)findViewById(R.id.textView5);
        
        t.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				db.execSQL("INSERT INTO c_order VALUES('"+product+"','"+code+"','"+name+"','"+ph+"','"+add+"','"+amo+"','"+pay+"','Pending');");
				Intent i=new Intent(Confirmation.this,TabsActivity.class);
				i.putExtra("no", ph);
				startActivity(i);
				
			}
		});
    }
}