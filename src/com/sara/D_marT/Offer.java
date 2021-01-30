package com.sara.D_marT;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class Offer extends Activity {
	       /** Called when the activity is first created. */
	ImageView v1,v2,v3,v4,v5;
	Bundle b;
	String no;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.offer);
        no=getIntent().getStringExtra("no");
        b=new Bundle();
        v1=(ImageView)findViewById(R.id.imageView1);
        v2=(ImageView)findViewById(R.id.imageView2);
        v3=(ImageView)findViewById(R.id.imageView4);
        v4=(ImageView)findViewById(R.id.imageView3);
        v5=(ImageView)findViewById(R.id.imageView5);
        v1.setOnClickListener(new View.OnClickListener() {	
        	@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Offer.this,Details.class);
				b.putInt("Image", R.drawable.c1);
				b.putString("Name","pendrive(8Gb)+card(8Gb)");
				b.putString("Code","c1");
				b.putString("Base", "Rs:1099");
				b.putString("Offer","40%");
				b.putString("Fair","Rs:659");
				b.putString("no",no);
				i.putExtras(b);
				startActivity(i);	
			}
		});
        v2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Offer.this,Details.class);
				b.putInt("Image", R.drawable.c2);
				b.putString("Name","pendrive(8Gb)+card(16Gb)");
				b.putString("Code","c2");
				b.putString("Base", "Rs:799");
				b.putString("Offer","20%");
				b.putString("Fair","Rs:641");
				b.putString("no",no);
				i.putExtras(b);
				startActivity(i);
			}
		});
        v3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Offer.this,Details.class);
				b.putInt("Image", R.drawable.c4);
				b.putString("Name","pendrive(2Gb)+HeadSet");
				b.putString("Code","c2");
				b.putString("Base", "Rs:1199");
				b.putString("Offer","20%");
				b.putString("Fair","Rs:960");
				b.putString("no",no);
				i.putExtras(b);
				startActivity(i);
			}
		});
        v4.setOnClickListener(new View.OnClickListener() 
        {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(Offer.this,Details.class);
				b.putInt("Image", R.drawable.c3);
				b.putString("Name","pendrive(2Gb)+card(32Gb)");
				b.putString("Code","c2");
				b.putString("Base", "Rs:1200");
				b.putString("Offer","20%");
				b.putString("Fair","Rs:980");
				b.putString("no",no);
				i.putExtras(b);
				startActivity(i);

			}
		});
        v5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(Offer.this,Details.class);
				b.putInt("Image", R.drawable.c5);
				b.putString("Name","card(16Gb+16Gb)");
				b.putString("Code","c2");
				b.putString("Base", "Rs:1200");
				b.putString("Offer","20%");
				b.putString("Fair","Rs:980");
				b.putString("no",no);
				i.putExtras(b);
				startActivity(i);
				
			}
		});
	
    }
}