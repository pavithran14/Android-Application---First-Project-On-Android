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



public class Delivery_Update extends Activity {
	       /** Called when the activity is first created. */
	Button b1;
	EditText t1;
	Cursor c;
	SQLiteDatabase db;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.update);
        
        b1=(Button)findViewById(R.id.button1);
        t1=(EditText)findViewById(R.id.editText1);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
				 c=db.rawQuery("SELECT * FROM c_order WHERE ph='"+t1.getText()+"'",null);
				 if(c.moveToFirst())
					{
						db.execSQL("UPDATE c_order SET del='delivered' WHERE ph='"+t1.getText()+"'");
						Toast.makeText(getApplicationContext(), "Success Full Update", Toast.LENGTH_LONG).show();
					}
			}
		});
        
    }
}