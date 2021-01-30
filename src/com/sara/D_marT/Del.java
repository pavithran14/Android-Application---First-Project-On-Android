package com.sara.D_marT;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Del extends Activity {
    /** Called when the activity is first created. */
	SQLiteDatabase db;
	Cursor c;
	int i=0;
	Button b;
	EditText ed;
	@Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delete1);
        db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
        c=db.rawQuery("Select * FROM profile", null);
        //Toast.makeText(getApplicationContext(), c.getCount(), Toast.LENGTH_LONG).show();
        ed=(EditText)findViewById(R.id.ed1);
        b=(Button)findViewById(R.id.d);
        b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				c=db.rawQuery("Select * FROM profile WHERE pho='"+ed.getText()+"'", null);
				if(c.moveToFirst())
				{
					db.execSQL("DELETE FROM profile WHERE pho='"+ed.getText()+"'");
					Toast.makeText(getApplicationContext(), "SuccessFull" , Toast.LENGTH_LONG).show();
				}
				
			}
		});
       }
}