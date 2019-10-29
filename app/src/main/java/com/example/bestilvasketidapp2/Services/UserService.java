package com.example.bestilvasketidapp2.Services;

import com.example.bestilvasketidapp2.Models.DTO_User;
import com.example.bestilvasketidapp2.Models.User;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface UserService {

    @GET("Student")
    Call<List<DTO_User>> getUserAll();

    @GET("Student/{id}")
    Call<DTO_User> getUserById(@Path("id") int id);

    @GET("User/{email}")
    Call<DTO_User> getUserByEmail(@Path("email") String email);

    @DELETE("Student/{id}")
    Call<ResponseBody> deleteUserById(@Path("id") int id);

    @POST("Student/{student}")
    Call<DTO_User> createUser(@Body DTO_User student);

    @PUT("Student/{id}")
    Call<ResponseBody> updateUser(@Path("id") int id, @Body DTO_User student);

}
