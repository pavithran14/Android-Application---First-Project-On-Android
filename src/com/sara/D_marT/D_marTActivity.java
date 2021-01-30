package com.sara.D_marT;

import java.util.Date;

import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.SetCookie;

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

public class D_marTActivity extends Activity {
	TextView t;
	EditText e1,e2;
	Button b;
	String username,password; 
	SQLiteDatabase db;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.main);
        t=(TextView)findViewById(R.id.nu);
        e1=(EditText)findViewById(R.id.u);
        e2=(EditText)findViewById(R.id.p);
        b=(Button)findViewById(R.id.log);
        db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
        t.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(D_marTActivity.this,Reg.class);
				startActivity(i);
			}
		}); 
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			String no =e1.getText().toString();
			String ps=e2.getText().toString();
			try
			{
				//Toast.makeText(getApplicationContext(), us+"dd"+ps, Toast.LENGTH_LONG).show();
				Cursor c=db.rawQuery("SELECT * FROM log WHERE numb='"+no+"'",null);
				
				if(c.moveToFirst())
				{
					username=c.getString(0);
					password=c.getString(1);
					//Toast.makeText(getApplicationContext(), username+"dd"+password, Toast.LENGTH_LONG).show();
				}
				if(no.toString().equals(username)&& ps.toString().equals(password))
				{
					if(username.equals("0000000000"))
					{
						Intent i=new Intent(D_marTActivity.this,Admin.class);
						//i.putExtra("no", no);
						startActivity(i);
					}
					else if(username.equals("0000000001"))
					{
						Intent i=new Intent(D_marTActivity.this,Salesman1.class);
						//i.putExtra("no", no);
						startActivity(i);
					}
					else if(username.equals("0000000002"))
					{
						Intent i=new Intent(D_marTActivity.this,Salesman2.class);
						//i.putExtra("no", no);
						startActivity(i);
					}
					else
					{
						Intent i=new Intent(D_marTActivity.this,TabsActivity.class);
						i.putExtra("no", no);
						startActivity(i);
					}
				}
				else
				{
					e1.setText("");
					e2.setText("");
					e1.requestFocus();
					Toast.makeText(getApplicationContext(), "Invalid Id",Toast.LENGTH_SHORT).show();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				Toast.makeText(getApplicationContext(), e.toString(),Toast.LENGTH_LONG).show();
			}
		}
        });
	
    }
}