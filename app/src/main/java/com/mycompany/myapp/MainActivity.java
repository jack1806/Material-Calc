package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;
import javax.xml.transform.sax.*;

public class MainActivity extends Activity 
{
	float temp=0;
	int typ=0;
	int codi=0;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    private void disp(String n)
    {
    	TextView ans = (TextView) findViewById(R.id.display);
    	ans.setText(n);
    }
	private void put(String n)
	{
		TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
		char tp = init.charAt(0);
		if(codi==1)
		{
			ans.setText("0");
			codi=0;
		}
		if(tp=='0')
		{
			ans.setText(" ");
		}
		init = ans.getText();
		init += n;
		ans.setText(init);
	}
	public void divide(View View)
	{
		/*TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
			String orig = init.toString();
			temp = temp/Float.parseFloat(orig);*/
			typ = 1;
			answer();
			//ans.setText("0");
	}
	public void mul(View View)
	{
		/*TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
		String orig = init.toString();
		temp *= Float.parseFloat(orig);*/
		typ = 4;
		answer();
		//ans.setText("0");
	}
	public void add(View View)
	{
		/*TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
		String orig = init.toString();
		temp += Float.parseFloat(orig);*/
		typ = 3;
		answer();
	}
	public void sub(View View)
	{
		/*TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
		String orig = init.toString();
		temp -= Float.parseFloat(orig);*/
		typ = 2;
		answer();
		//ans.setText("0");
	}
	
	
	public void call9(View View)
	{
		put("9");
	}
	public void call8(View View)
	{
		put("8");	
	}
	public void call7(View View)
	{
		put("7");	
	}
	public void call6(View View)
	{
		put("6");
	}
	public void call5(View View)
	{
		put("5");
	}
	public void call4(View View)
	{
		put("4");
	}
	public void call3(View View)
	{
		put("3");
	}
	public void call2(View View)
	{
		put("2");
	}
	public void call1(View View)
	{
		put("1");
	}
	public void call0(View View)
	{
		put("0");
	}
	public void calldot(View View)
	{
		put(".");
	}
	public void call00(View View)
	{
		put("00");
	}
	public void clear(View View)
	{
		TextView ans = (TextView) findViewById(R.id.display);
		ans.setText("0");
		temp = 0;
	}
	public void equal(View View)
	{
		answer();
	}
		
	public void answer()
	{
		TextView ans = (TextView) findViewById(R.id.display);
		CharSequence init = ans.getText();
		String orig = init.toString();
		float sec_number = Float.parseFloat(orig);
		if(typ==1)
		{
			float answer;
				if(temp==0){
					answer = sec_number;
				}
				else{
					answer = temp/sec_number;
				}
				temp = answer;
				orig = ""+answer;
				ans.setText(orig);
				codi=1;
		}
		if(typ==2)
		{
			float answer;
			if(temp==0){
				answer = sec_number;
			}
			else{
				answer = temp/sec_number;
			}	
				temp = answer;
				orig = ""+answer;
				ans.setText(orig);
				codi=1;
		}
		if(typ==3)
		{
			float answer;
			if(temp==0){
				answer = sec_number;
			}
			else{
				answer = temp/sec_number;
			}
				temp=answer;
				orig = ""+answer;
				ans.setText(orig);
				codi=1;
		}
		if(typ==4)
		{
				float answer;
				if(temp==0)
				{
					answer=sec_number;
				}
				else
				{
				answer = temp*sec_number;
				}
				temp=answer;
				orig = ""+answer;
				ans.setText(orig);
				codi=1;
		}
	}	
}