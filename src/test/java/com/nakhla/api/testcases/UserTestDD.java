package com.nakhla.api.testcases;

import com.nakhla.api.endpoints.UserEndPoints;
import com.nakhla.api.payload.User;
import com.nakhla.api.utilities.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserTestDD {

    @Test(priority = 1, dataProvider = "UserRegistration", dataProviderClass = DataProviders.class)
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

    @Test(priority = 2, dataProvider = "UserRegistrationWithInvalidEmail", dataProviderClass = DataProviders.class)
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
    @Test(priority = 3, dataProvider = "UserRegistrationWithUserNameLessThen3Char", dataProviderClass = DataProviders.class)
    public void testUserRegistrationWithUserNameLessThen3Char(String email, String userName, String password)
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
    @Test(priority = 4, dataProvider = "UserRegistrationWithoutUserName", dataProviderClass = DataProviders.class)
    public void testUserRegistrationWithoutUserName(String email, String userName, String password)
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
    @Test(priority = 5, dataProvider = "UserRegistrationWithDuplicateUserName", dataProviderClass = DataProviders.class)
    public void testUserRegistrationWithDuplicateUserName(String email, String userName, String password)
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
    @Test(priority = 6, dataProvider = "UserRegistrationPasswordLessThan6Characters", dataProviderClass = DataProviders.class)
    public void testUserRegistrationPasswordLessThan6Characters(String email, String userName, String password)
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
    @Test(priority = 7, dataProvider = "UserRegistrationPasswordWithoutContainNumbers", dataProviderClass = DataProviders.class)
    public void testUserRegistrationPasswordWithoutContainNumbers(String email, String userName, String password)
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
    @Test(priority = 8, dataProvider = "UserRegistrationPasswordWithoutContainSpecialCharacters", dataProviderClass = DataProviders.class)
    public void testUserRegistrationPasswordWithoutContainSpecialCharacters(String email, String userName, String password)
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
    @Test(priority = 9, dataProvider = "UserRegistrationPasswordWithoutContainUpperCaseLetters", dataProviderClass = DataProviders.class)
    public void testUserRegistrationPasswordWithoutContainUpperCaseLetters(String email, String userName, String password)
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
    @Test(priority = 10, dataProvider = "UserRegistrationWithoutPassword", dataProviderClass = DataProviders.class)
    public void testUserRegistrationWithoutPassword(String email, String userName, String password)
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
    @Test(priority = 11, dataProvider = "UserRegistrationPasswordGetterThan20Characters", dataProviderClass = DataProviders.class)
    public void testUserRegistrationPasswordGetterThan20Characters(String email, String userName, String password)
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

    @Test(priority = 12, dataProvider = "UserLoginWithWrongPassword", dataProviderClass = DataProviders.class)
    public void testUserLoginWithWrongPassword(String email, String userName, String password)
    {
        User  userPayload = new User();

        userPayload.setEmail(email);
        userPayload.setUsername(userName);
        userPayload.setPassword(password);
        Response response = UserEndPoints.UserLogin(userPayload);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),400);

    }

    @Test(priority = 14, dataProvider = "UserLogin", dataProviderClass = DataProviders.class)
    public void testLoginUser(String email,String userid, String password){
        User  userPayload = new User();
        userPayload.setIdentifier(userid);
        userPayload.setPassword(password);
        Response response = UserEndPoints.UserLogin(userPayload);
        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);
    }
    @Test(priority = 13, dataProvider = "ForgotPassword", dataProviderClass = DataProviders.class)
    public void testForgotPassword(String email, String userName, String password)
    {
        User  userPayload = new User();

        userPayload.setEmail(email);
        userPayload.setUsername(userName);
        userPayload.setPassword(password);
        Response response = UserEndPoints.ForgotPassword(userPayload);

        //log response
        response.then().log().all();
        //validation
        Assert.assertEquals(response.statusCode(),200);

    }
}
