package com.example.retrovolley.retrofit;

import com.example.retrovolley.model.Request;
import com.example.retrovolley.model.User;
import com.example.retrovolley.model.UserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface MethodHTTP {
    @GET("User_Registration.php")
    Call<UserResponse> getUser();

    @POST("User_Registration.php")
    abstract Call<Request> sendUser(@Body User user);
}



