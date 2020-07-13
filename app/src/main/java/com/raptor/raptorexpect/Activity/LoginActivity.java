package com.raptor.raptorexpect.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.raptor.raptorexpect.R;

public class LoginActivity extends AppCompatActivity {

    EditText edtusername,edtpassword;
    TextView txtlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }
    private void initView() {
        edtusername = (EditText)findViewById(R.id.edtusername);
        edtpassword = (EditText)findViewById(R.id.edtpassword);
        txtlogin = (TextView)findViewById(R.id.loginTextView);
        Typeface font = Typeface.createFromAsset(getAssets(), "sanregular.ttf");
        Typeface font1 = Typeface.createFromAsset(getAssets(), "robotobold.ttf");
        edtusername.setTypeface(font);
        edtpassword.setTypeface(font);
        txtlogin.setTypeface(font1);
        txtlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtusername.getText().toString().equals("raptor")&&edtpassword.getText().toString().equals("raptor")){
                    Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
