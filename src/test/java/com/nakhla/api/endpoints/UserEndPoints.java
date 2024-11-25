package com.nakhla.api.endpoints;

import com.nakhla.api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static com.nakhla.api.endpoints.Routes.*;
import static io.restassured.RestAssured.given;

public class UserEndPoints {
    public static Response UserRegistration(User payload){

       Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(payload)

                .when()
                .post(post_url);
       return response;


    }
    public static Response UserLogin(User payload){

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(payload)

                .when()
                .post(post_login_url);
        return response;


    }
    public static Response ForgotPassword(User payload){

        Response response = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(payload)

                .when()
                .post(post_forgot_password_url);
        return response;
    }
}
