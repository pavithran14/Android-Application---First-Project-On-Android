package com.sara.D_marT;


import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg extends Activity {
	Button b;
	String na,em,add,p1,ps,cp;
	Integer pho;
	SQLiteDatabase db;
	EditText usna,emai,phon,pass,conf,addr;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reg);  
        b=(Button)findViewById(R.id.b1);
        usna=(EditText)findViewById(R.id.usn);
        emai=(EditText)findViewById(R.id.mail);
        phon=(EditText)findViewById(R.id.pn);
        pass=(EditText)findViewById(R.id.pw);
        conf=(EditText)findViewById(R.id.cp);
        addr=(EditText)findViewById(R.id.addr);
        final Notification.Builder build=new Notification.Builder(this);
        
        b.setOnClickListener(new View.OnClickListener() {
        
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				na=usna.getText().toString();
		        em=emai.getText().toString();
		        p1=phon.getText().toString();
		        ps=pass.getText().toString();
		        cp=conf.getText().toString();
		        add=addr.getText().toString();
		        db=openOrCreateDatabase("project", Context.MODE_PRIVATE, null);
		        
		        if(usna.getText().toString().isEmpty() || emai.getText().toString().isEmpty() || phon.getText().toString().isEmpty() || pass.getText().toString().isEmpty()||conf.getText().toString().isEmpty()||addr.getText().toString().isEmpty())
				{
					Toast.makeText(getApplicationContext(), "Not Filled", Toast.LENGTH_LONG).show();
				}
		        else
		        {
		        	if(ps.toString().equals(cp.toString()))
		        	{
		        		if(p1.length()==10)
		        		{
		        			db.execSQL("CREATE TABLE IF NOT EXISTS log(numb VARCHAR,password VARCHAR);");
		        			db.execSQL("CREATE TABLE IF NOT EXISTS profile(un VARCHAR,ema VARCHAR,pho  VARCHAR PRIMARY KEY,ps VARCHAR,addr VARCHAR);");
		        			db.execSQL("INSERT INTO log VALUES('"+p1+"','"+ps+"');");
		        			try
		        			{
		        				db.execSQL("INSERT INTO profile VALUES('"+na+"','"+em+"','"+p1+"','"+ps+"','"+add+"');");
		        			}
		        			catch(Exception e)
		        			{
		        				Toast.makeText(getApplicationContext(), " A user with this phone number is found ", Toast.LENGTH_SHORT).show();
		        				phon.setText("");
		        				phon.requestFocus();
		        			}
		        			Intent i=new Intent(Reg.this,D_marTActivity.class);
		        			i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
		        			startActivity(i);
		        			finish();
		        			Toast.makeText(getApplicationContext(),"Registered Succesfully",Toast.LENGTH_LONG).show();

		        	        int icon=R.drawable.logot;
		        	        String text="D-mart Welcomes you!!!";
		        	   	        	        
		        	        NotificationManager mg=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
		        	        build.setContentText(text);
		        	        build.setSmallIcon(icon);
		        	        build.setContentTitle("nitification");
		        	        
		        	        mg.notify(0,build.getNotification());
		        	        
		        	       /* Context c=getApplicationContext();
		        	        Intent i1=new Intent(c,some.class);
		        	        
		        	        
		        	        PendingIntent pi= PendingIntent.getActivity(this, 0, i, icon);
		        	        no.setLatestEventInfo(c, "D_Mart", "D-Mart welcomes you", pi);
		        	        mg.notify(nid, no);*/

		        		}
		        		else
		        		{
		        			phon.setText("");
		        			phon.requestFocus();
		        			Toast.makeText(getApplicationContext(),"invalid phone number",Toast.LENGTH_LONG).show();

		        		}	
		        	}
		        	else
		        	{
				
		        		pass.setText("");
		        		conf.setText("");
		        		pass.requestFocus();
		        		Toast.makeText(getApplicationContext(),"Retype your password",Toast.LENGTH_LONG).show();
		        	}
		        }
		      }
    });
        //db.close();
}
}