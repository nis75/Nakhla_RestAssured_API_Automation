package com.nakhla.api.testcases;

import com.nakhla.api.endpoints.UserEndPoints;
import com.nakhla.api.payload.User;
import com.nakhla.api.utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTestDD {

    @Test(priority = 1, dataProvider = "UserRegistrationData", dataProviderClass = DataProviders.class)
    public void testUserRegistration(String email, String userName, String password) {
      User  userPayload = new User();

        userPayload.setEmail(email);
        userPayload.setUsername(userName);
        userPayload.setPassword(password);
        Response response = UserEndPoints.UserRegistration(userPayload);
        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(), 200);

    }

    @Test(priority = 2, dataProvider = "UserRegistrationWithInvalidEmailData", dataProviderClass = DataProviders.class)
    public void testUserRegistrationWithInvalidEmail(String email, String userName, String password)
    {
        User  userPayload = new User();

        userPayload.setEmail(email);
        userPayload.setUsername(userName);
        userPayload.setPassword(password);
        Response response = UserEndPoints.UserRegistration(userPayload);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 3, dataProvider = "UserLoginData", dataProviderClass = DataProviders.class)
    public void loginUser(String email,String userid, String password){
        User  userPayload = new User();
        userPayload.setIdentifier(userid);
        userPayload.setPassword(password);
        Response response = UserEndPoints.UserLogin(userPayload);
        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);
    }
}
