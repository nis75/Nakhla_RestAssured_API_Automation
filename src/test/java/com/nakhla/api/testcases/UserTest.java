package com.nakhla.api.testcases;

import com.nakhla.api.endpoints.UserEndPoints;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTest extends BaseTest{

    @Test(priority = 0)
    public void testUserRegistration()
    {
        Response response = UserEndPoints.UserRegistration(userPayload);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);

    }
    @Test(priority = 1)
    public void testUserRegistrationWithInvalidEmail()
    {
        Response response = UserEndPoints.UserRegistration(userPayload2);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 2)
    public void testUserRegistrationWithoutEmail()
    {
        Response response = UserEndPoints.UserRegistration(userPayload3);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }



    @Test(priority = 3)
    public void testUserRegistrationWithUserNameLessThen3Char()
    {
        Response response = UserEndPoints.UserRegistration(userPayload4);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }

    @Test(priority = 4)
    public void testUserRegistrationWithoutUserName()
    {
        Response response = UserEndPoints.UserRegistration(userPayload5);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 5)
    public void testUserRegistrationWithDuplicateUserName()
    {
        Response response = UserEndPoints.UserRegistration(userPayload6);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 6)
    public void testUserRegistrationPasswordLessThan6Characters()
    {
        Response response = UserEndPoints.UserRegistration(userPayload7);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 7)
    public void testUserRegistrationPasswordWithoutContainCharacters()
    {
        Response response = UserEndPoints.UserRegistration(userPayload8);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 8)
    public void testUserRegistrationPasswordWithoutContainSpecialNumbers()
    {
        Response response = UserEndPoints.UserRegistration(userPayload9);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 9)
    public void testUserRegistrationPasswordWithoutContainUpperCaseLetters()
    {
        Response response = UserEndPoints.UserRegistration(userPayload10);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 10)
    public void testUserRegistrationWithoutPassword()
    {
        Response response = UserEndPoints.UserRegistration(userPayload11);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 11)
    public void testUserRegistrationPasswordGetterThan20Characters()
    {
        Response response = UserEndPoints.UserRegistration(userPayload12);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }
    @Test(priority = 12)
    public void loginUser(){
        Response response = UserEndPoints.UserLogin(userPayload13);
        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test(priority = 13)
    public void ForgotPassword(){
        Response response = UserEndPoints.ForgotPassword(userPayload14);
        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);
    }


}
