package com.sara.D_marT;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Details extends Activity {

	       /** Called when the activity is first created. */
	Bundle b,bu;  
    String name,code,offer,base,fair,no;
    TextView t1,t2,t3,t5,t4,t6;
    Button b1;
    int pic;
    ImageView iv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        iv=(ImageView)findViewById(R.id.iv);
        t1=(TextView)findViewById(R.id.textView7);
        t2=(TextView)findViewById(R.id.textView8);
        t3=(TextView)findViewById(R.id.textView9);
        t4=(TextView)findViewById(R.id.textView10);
        t5=(TextView)findViewById(R.id.textView11);
        t6=(TextView)findViewById(R.id.ph);
        b1=(Button)findViewById(R.id.bn1);
        bu=new Bundle();
        
        b=getIntent().getExtras();
        name=b.getString("Name");
        code=b.getString("Code");
        offer=b.getString("Offer");
        
        base=b.getString("Base");
        fair=b.getString("Fair");
        pic=b.getInt("Image");
        iv.setImageResource(pic);
        no=b.getString("no");
        t1.setText(name);
        t2.setText(code);
        t3.setText(base);
        t4.setText(offer);
        t5.setText(fair);
        
       // t6.setText(no);
        b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
				Intent ii=new Intent(Details.this,Payment.class);
				bu.putInt("Image", pic);
				bu.putString("Name",name);
				bu.putString("Code",code);
				bu.putString("Fair",fair);
				bu.putString("no",no);
				ii.putExtras(bu);
				startActivity(ii);
				
			}
		});
       
    }
}