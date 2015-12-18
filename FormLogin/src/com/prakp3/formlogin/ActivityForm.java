package com.prakp3.formlogin;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityForm extends Activity {
	
	String pass;
	String username;
	String user="4513210027";
	String pwd="4513210027";
	EditText usrnm;
	EditText pwrd,tampil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        
        usrnm = (EditText)findViewById(R.id.txtusername);
        pwrd = (EditText)findViewById(R.id.txtpass);
        Button submit = (Button)findViewById(R.id.btnExit);
        submit.setOnClickListener(new click());
    }
    
    @SuppressLint("ShowToast")
    class click implements Button.OnClickListener {
    	@SuppressLint("ShowToast")
		public void onClick(View v) {
    		username = usrnm.getText().toString();
    		pass = pwrd.getText().toString();
    		if ((pass.equals(pwd)&&(username.equals(user)))) {
				Toast.makeText(getApplicationContext(), "Selamat Datang! Berhasil Login", 31).show();
				Intent i = new Intent(ActivityForm.this, ActivityWelcome.class);
				startActivity(i);
			} else 
				Toast.makeText(getApplicationContext(), "Username atau Password salah", 23).show();
				usrnm.setText("");
				pwrd.setText("");
		}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_form, menu);
        return true;
    }
    
}
