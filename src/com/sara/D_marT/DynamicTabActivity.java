package com.sara.D_marT;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class DynamicTabActivity extends Activity {
    /** Called when the activity is first created. */
	SQLiteDatabase db;
	Cursor c;
	int i=0;
	@Override
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dtab);
        db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
        c=db.rawQuery("Select * FROM c_order", null);
        //Toast.makeText(getApplicationContext(), c.getCount(), Toast.LENGTH_LONG).show();
        init();
    }
    public void init() {
        TableLayout stk = (TableLayout) findViewById(R.id.table_main);
        TableRow tbrow0 = new TableRow(this);
        TextView tv0 = new TextView(this);
        tv0.setText(" Sl.Number ");
        tv0.setTextColor(Color.WHITE);
        tbrow0.addView(tv0);
        TextView tv1 = new TextView(this);
        tv1.setText("    Product    ");
        tv1.setTypeface(Typeface.DEFAULT_BOLD);
        tv1.setTextColor(Color.WHITE);
        tbrow0.addView(tv1);
        TextView tv2 = new TextView(this);
        tv2.setText(" Code ");
        tv2.setTextColor(Color.WHITE);
        tbrow0.addView(tv2);
        TextView tv3 = new TextView(this);
        tv3.setText(" UserName ");
        tv3.setTextColor(Color.WHITE);
        tbrow0.addView(tv3);
        TextView tv4 = new TextView(this);
        tv4.setText(" Mobile number ");
        tv4.setTextColor(Color.WHITE);
        tbrow0.addView(tv4);
        TextView tv5 = new TextView(this);
        tv5.setText("      Address ");
        tv5.setTextColor(Color.WHITE);
        tbrow0.addView(tv5);
        TextView tv6 = new TextView(this);
        tv6.setText(" Amount ");
        tv6.setTextColor(Color.WHITE);
        tbrow0.addView(tv6);
        TextView tv7 = new TextView(this);
        tv7.setText(" Payment ");
        tv7.setTextColor(Color.WHITE);
        tbrow0.addView(tv7);
        TextView tv8 = new TextView(this);
        tv8.setText("    Report ");
        tv8.setTextColor(Color.WHITE);
        tbrow0.addView(tv8);
        
        stk.addView(tbrow0);
        while (c.moveToNext()) 
        {
            TableRow tbrow = new TableRow(this);
            TextView t1v = new TextView(this);
            t1v.setText("" + i++);
            t1v.setTextColor(Color.WHITE);
            t1v.setGravity(Gravity.CENTER);
            tbrow.addView(t1v);
            TextView t2v = new TextView(this);
            t2v.setText(c.getString(0));
            t2v.setTextColor(Color.WHITE);
            t2v.setGravity(Gravity.CENTER);
            tbrow.addView(t2v);
            TextView t3v = new TextView(this);
            t3v.setText(c.getString(1));
            t3v.setTextColor(Color.WHITE);
            t3v.setGravity(Gravity.CENTER);
            tbrow.addView(t3v);
            TextView t4v = new TextView(this);
            t4v.setText(c.getString(2));
            t4v.setTextColor(Color.WHITE);
            t4v.setGravity(Gravity.CENTER);
            tbrow.addView(t4v);
            TextView t5v = new TextView(this);
            t5v.setText(c.getString(3));
            t5v.setTextColor(Color.WHITE);
            t5v.setGravity(Gravity.CENTER);
            tbrow.addView(t5v);
            TextView t6v = new TextView(this);
            t6v.setText(c.getString(4));
            t6v.setTextColor(Color.WHITE);
            t6v.setGravity(Gravity.CENTER);
            tbrow.addView(t6v);
            
            TextView t7v = new TextView(this);
            t7v.setText(c.getString(5));
            t7v.setTextColor(Color.WHITE);
            t7v.setGravity(Gravity.CENTER);
            tbrow.addView(t7v);
            
            TextView t8v = new TextView(this);
            t8v.setText(c.getString(6));
            t8v.setTextColor(Color.WHITE);
            t8v.setGravity(Gravity.CENTER);
            tbrow.addView(t8v);
            
            TextView t9v = new TextView(this);
            t9v.setText(c.getString(7));
            t9v.setTextColor(Color.WHITE);
            t9v.setGravity(Gravity.CENTER);
            tbrow.addView(t9v);
            stk.addView(tbrow);
        }

    }
}