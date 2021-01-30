package com.sara.D_marT;


import android.app.Activity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class Search extends Activity {
	String[] order={"pendrive","memory card","laptop","speakers"};
	       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.shopping1);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, order);
        AutoCompleteTextView at=(AutoCompleteTextView)findViewById(R.id.i1);
        at.setAdapter(aa);
        at.setThreshold(1);
        at.setDropDownBackgroundResource(R.color.green);
        //at.setBackgroundColor(Color.GREEN);
	
    }
}