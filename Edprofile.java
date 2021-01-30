package com.sara.D_marT;


import android.app.Activity;

import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;


public class Edprofile extends Activity {
	String[] order={"pendrive","memory card","laptop","speakers"};
	       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.profile);
      
	
    }
}