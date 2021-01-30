package com.sara.D_marT;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
public class Search extends Activity {
	String[] order={"pendrive","memory card","laptop","HeadSets"};
	AutoCompleteTextView at;
	ImageView p1,p2,p3,p4,p5,p6;
	LinearLayout l;
	String no;
	Bundle b=new Bundle();
	       /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);//remove Title
        setContentView(R.layout.shopping1);
        ArrayAdapter<String> aa=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item, order);
        at=(AutoCompleteTextView)findViewById(R.id.i1);
        at.setAdapter(aa);
        at.setThreshold(1);
        at.setDropDownBackgroundResource(R.color.green);
        //at.setBackgroundColor(Color.GREEN);
        
        
        l=(LinearLayout) findViewById(R.id.l1);
        Button search=(Button) findViewById(R.id.button1);
        p1=new ImageView(this);
        p2=new ImageView(this);
        p3=new ImageView(this);
        p4=new ImageView(this);
        p5=new ImageView(this);
        p6=new ImageView(this);
        
        no=getIntent().getStringExtra("no");

        /*final TableLayout table=new TableLayout(this);
		
		final TableRow r1=new TableRow(this);
		final TextView t1=new TextView(this);
		final TextView t2=new TextView(this);*/
	
        search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
		        		// TODO Auto-generated method stub
		String pro=at.getText().toString();
		if(pro.equals(order[1]))
		{
			l.removeAllViews();
			p1.setImageResource(R.drawable.mm1);
			p2.setImageResource(R.drawable.mm2);
			p3.setImageResource(R.drawable.mm3);
			p4.setImageResource(R.drawable.mm4);
			p5.setImageResource(R.drawable.mm5);
			p6.setImageResource(R.drawable.mm6);
			l.addView(p1);
			l.addView(p2);
			l.addView(p3);
			l.addView(p4);
			l.addView(p5);
			l.addView(p6);
			
			p1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm1);
					b.putString("Name","Memory card 64Gb");
					b.putString("Code","mc1");
					b.putString("Base", "Rs:1099");
					b.putString("Offer","40%");
					b.putString("Fair","Rs:659");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
					
				}
			});
			p2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm2);
					b.putString("Name","Memory card 32Gb");
					b.putString("Code","mc2");
					b.putString("Base", "Rs:799");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:641");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm3);
					b.putString("Name","Memory card 64Gb");
					b.putString("Code","mc3");
					b.putString("Base", "Rs:1199");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:960");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm4);
					b.putString("Name","Samsung 64Gb");
					b.putString("Code","mc4");
					b.putString("Base", "Rs:1000");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:800");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm5);
					b.putString("Name","Memory card 16Gb");
					b.putString("Code","mc5");
					b.putString("Base", "Rs:700");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:560");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.mm6);
					b.putString("Name","Memory card 64Gb");
					b.putString("Code","mc6");
					b.putString("Base", "Rs:1200");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:960");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);
				}
			});

		}
		if(pro.equals(order[0]))
		{
			l.removeAllViews();
			p1.setImageResource(R.drawable.pp1);
			p2.setImageResource(R.drawable.pp2);
			p3.setImageResource(R.drawable.pp3);
			p4.setImageResource(R.drawable.pp4);
			p5.setImageResource(R.drawable.pp5);
			p6.setImageResource(R.drawable.pp6);
			l.addView(p1);
			l.addView(p2);
			l.addView(p3);
			l.addView(p4);
			l.addView(p5);
			l.addView(p6);
			
			p1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp1);
					b.putString("Name","Pendrive HP 8Gb");
					b.putString("Code","pp1");
					b.putString("Base", "Rs:800");
					b.putString("Offer","50%");
					b.putString("Fair","Rs:400");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp2);
					b.putString("Name","Pendrive 2Gb");
					b.putString("Code","pp2");
					b.putString("Base", "Rs:300");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:240");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp3);
					b.putString("Name","Pendrive 4Gb");
					b.putString("Code","pp3");
					b.putString("Base", "Rs:450");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:360");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp4);
					b.putString("Name","Pendrive HP 64Gb");
					b.putString("Code","pp4");
					b.putString("Base", "Rs:1200");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:960");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp5);
					b.putString("Name","Pendrive 16Gb");
					b.putString("Code","pp5");
					b.putString("Base", "Rs:1000");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:800");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.pp6);
					b.putString("Name","Pendrive Sandisk 8Gb");
					b.putString("Code","pp6");
					b.putString("Base", "Rs:600");
					b.putString("Offer","10%");
					b.putString("Fair","Rs.540");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);
				}
			});


		}
		if(pro.equals(order[2]))
		{
			l.removeAllViews();
			p1.setImageResource(R.drawable.l1);
			p2.setImageResource(R.drawable.l2);
			p3.setImageResource(R.drawable.l3);
			p4.setImageResource(R.drawable.l4);
			p5.setImageResource(R.drawable.l5);
			p6.setImageResource(R.drawable.l6);
			l.addView(p1);
			l.addView(p2);
			l.addView(p3);
			l.addView(p4);
			l.addView(p5);
			l.addView(p6);
			
			p1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l1);
					b.putString("Name","Laptop HP");
					b.putString("Code","l1");
					b.putString("Base", "Rs:40000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:36000");
					b.putString("no",no);
					i.putExtras(b);
				
					startActivity(i);	
				}
			});
			p2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l2);
					b.putString("Name","Laptop HCL");
					b.putString("Code","l2");
					b.putString("Base", "Rs:40000");
					b.putString("Offer","5%");
					b.putString("Fair","Rs:38000");
					b.putString("no",no);
					i.putExtras(b);
					
					startActivity(i);	
				}
			});
			p3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l3);
					b.putString("Name","Laptop Samsung");
					b.putString("Code","l3");
					b.putString("Base", "Rs:50000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:45000");
					b.putString("no",no);
					i.putExtras(b);
			
					startActivity(i);	
				}
			});
			p4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l4);
					b.putString("Name","Laptop Asus");
					b.putString("Code","l4");
					b.putString("Base", "Rs:25000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:22500");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l5);
					b.putString("Name","Laptop Lenovo");
					b.putString("Code","l5");
					b.putString("Base", "Rs:60000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:54000");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.l6);
					b.putString("Name","Laptop Dell");
					b.putString("Code","l6");
					b.putString("Base", "Rs:45000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:40500");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);
				}
			});

			
		}
		if(pro.equals(order[3]))
		{
			l.removeAllViews();
			p1.setImageResource(R.drawable.ss1);
			p2.setImageResource(R.drawable.ss2);
			p3.setImageResource(R.drawable.ss3);
			p4.setImageResource(R.drawable.ss4);
			p5.setImageResource(R.drawable.ss5);
			p6.setImageResource(R.drawable.ss6);
			l.addView(p1);
			l.addView(p2);
			l.addView(p3);
			l.addView(p4);
			l.addView(p5);
			l.addView(p6);
			p1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.ss1);
					b.putString("Name","HeadSet JBL");
					b.putString("Code","ss1");
					b.putString("Base", "Rs:500");
					b.putString("Offer","30%");
					b.putString("Fair","Rs:350");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.ss2);
					b.putString("Name","HeadSet Sony");
					b.putString("Code","ss2");
					b.putString("Base", "Rs:1200");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:1080");
					b.putString("no",no);
					i.putExtras(b);
					startActivity(i);	
				}
			});
			p3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.ss3);
					b.putString("Name","HeadSet Sony");
					b.putString("Code","ss3");
					b.putString("Base", "Rs:2000");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:1800");
					b.putString("no",no);
					i.putExtras(b);
					
					startActivity(i);	
				}
			});
			p4.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.ss4);
					b.putString("Name","HeadSet Phillips");
					b.putString("Code","ss4");
					b.putString("Base", "Rs:350");
					b.putString("Offer","--");
					b.putString("Fair","Rs:350");
					b.putString("no",no);
					i.putExtras(b);
					
					startActivity(i);	
				}
			});
			p5.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putString("Name","HeadSet Boss");
					b.putInt("Image", R.drawable.ss5);
					b.putString("Code","ss5");
					b.putString("Base", "Rs:4500");
					b.putString("Offer","10%");
					b.putString("Fair","Rs:4050");
					b.putString("no",no);
					i.putExtras(b);
					
					startActivity(i);	
				}
			});
			p6.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) 
				{
					// TODO Auto-generated method stub
					Intent i=new Intent(Search.this,Details.class);
					b.putInt("Image", R.drawable.ss6);
					b.putString("Name","Bluetooth HeadSet");
					b.putString("Code","ss6");
					b.putString("Base", "Rs:1100");
					b.putString("Offer","20%");
					b.putString("Fair","Rs:880");
					b.putString("no",no);
					i.putExtras(b);
					
					startActivity(i);
				}
			});

		}
		
			}
			});
        
        
    }
}