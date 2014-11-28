package com.main.daily_question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.Reader;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.widget.TextView;

public class Questionbar extends Activity {

	public void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView (R.layout.questionbar);
		}

	
	
	

	protected void readtxt() throws IOException{
		
        TextView anzeige = (TextView) findViewById (R.id.editText1);

        
        try {
        	
  

			//BufferedReader auslesen = new BufferedReader(new FileReader("/Daily_Question/assets/Fragenkatalog.txt"));
			
        	InputStreamReader input = new InputStreamReader (getAssets().open("Fragenkatalog.txt"));
        	
        	BufferedReader br = new BufferedReader (input);
			
        	String i = br.readLine();

        	while (i != null ) {
                anzeige.setText(i);
                i = br.readLine();
                
                
            }
        	
        	anzeige.setText("mhm....");
			
		} catch (FileNotFoundException e) {
			anzeige.setText("geht wieder nicht");
		}
        
	
	
}}
