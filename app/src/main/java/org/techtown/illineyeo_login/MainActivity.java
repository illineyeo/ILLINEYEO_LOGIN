package org.techtown.illineyeo_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginProcess(v);
            }
        });
    }
    public void loginProcess(View v){
        String uid = userid.getText().toString();
        String upass = userpass.getText().toString();
        if(uid.equals("illineyeo") && upass.equals("0114")) {
            Toast.makeText(this, " " + uid, Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"일리네여 회원정보가 없습니다", Toast.LENGTH_LONG).show();
            userpass.setText("");
        }
    }
}