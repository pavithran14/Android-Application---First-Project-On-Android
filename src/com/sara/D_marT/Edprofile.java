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
import android.widget.TextView;
import android.widget.Toast;


public class Edprofile extends Activity {
	String s;
	SQLiteDatabase db;
	String username,pass,addr,no,ema;
	EditText e1,e2,e3,e4,e5;
	TextView t;
	Button b;
	Cursor c,c1;
	       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        s=getIntent().getStringExtra("no");
        b=(Button)findViewById(R.id.button1);
        t=(TextView)findViewById(R.id.textView2);
        t.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Edprofile.this,D_marTActivity.class);
				i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
				startActivity(i);
				finish();
			}
		});
    	db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
		 c=db.rawQuery("SELECT * FROM profile WHERE pho='"+s+"'",null);
		if(c.moveToFirst())
		{
			username=c.getString(0);
			ema=c.getString(1);
			no=c.getString(2);
			pass=c.getString(3);
			addr=c.getString(4);
		}
		e1=(EditText)findViewById(R.id.editText1);
		e2=(EditText)findViewById(R.id.editText2);
		e3=(EditText)findViewById(R.id.editText4);
		e4=(EditText)findViewById(R.id.editText5);
		e5=(EditText)findViewById(R.id.editText6);
		e1.setText(username);
		e2.setText(ema);
		e3.setText(no);
		e4.setText(pass);
		e5.setText(addr);
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				 c=db.rawQuery("SELECT * FROM profile WHERE pho='"+no+"'",null);
				 if(c.moveToFirst())
					{
						db.execSQL("UPDATE profile SET un='"+e1.getText()+"',ema='"+e2.getText()+
									"',pho='"+e3.getText()+"',ps='"+e4.getText()+"',addr='"+e5.getText()+"'WHERE pho='"+e3.getText()+"'");
						//Toast.makeText(getApplicationContext(), "Success Full Update", Toast.LENGTH_LONG).show();
					}
				c1=db.rawQuery("SELECT * FROM log WHERE numb='"+no+"'",null);
				if(c1.moveToFirst())
				{
					db.execSQL("UPDATE log SET numb='"+e3.getText()+"',password='"+e4.getText()+"'WHERE numb='"+no+"'");
				}
				Toast.makeText(getApplicationContext(), "Successfull Update", Toast.LENGTH_LONG).show();
			}
		});
    }
}