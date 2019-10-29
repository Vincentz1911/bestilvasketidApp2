package com.example.bestilvasketidapp2.Services;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.example.bestilvasketidapp2.MainActivity;
import com.example.bestilvasketidapp2.Models.DTO_User;
import com.example.bestilvasketidapp2.Models.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserCalls extends MainActivity {

    private UserService userService;

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

        }

        public void GetUserByEmail(String email)
        {
            userService = ServiceBuilder.buildService(UserService.class);

            Call<DTO_User> request = userService.getUserByEmail(email);
            request.enqueue(new Callback<DTO_User>()
            {
                @Override
                public void onResponse(Call<DTO_User> call, Response<DTO_User> response) {
                    if (response == null)
                        Toast.makeText(UserCalls.this, "User not found!", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(UserCalls.this, "Welcome " + response, Toast.LENGTH_LONG).show();
                    //FillDataSheet(response.body());
                    //textView.setText("Found " + response.body().getName());
                }
                @Override
                public void onFailure(Call<DTO_User> call, Throwable t) {
                    //textView.setText(t.getMessage());
                }
            });
        }

}
