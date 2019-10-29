package com.example.bestilvasketidapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.bestilvasketidapp2.Models.DTO_User;
import com.example.bestilvasketidapp2.Models.User;
import com.example.bestilvasketidapp2.Services.UserCalls;
import com.example.bestilvasketidapp2.Services.UserService;

public class MainActivity extends AppCompatActivity {

    EditText input_email, input_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_email=findViewById(R.id.ma_edtEmail);
        input_password=findViewById(R.id.ma_edtPassword);

    findViewById(R.id.ma_btnLogin).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //User user = new User(input_email.getText().toString(),input_password.getText().toString());
            new UserCalls().GetUserByEmail(input_email.getText().toString());
        }
    });

    }
}
