package com.nakhla.api.testcases;

import com.github.javafaker.Faker;
import com.nakhla.api.payload.User;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    Faker faker;
    User userPayload;
    User userPayload2;
    User userPayload3;
    User userPayload4;
    User userPayload5;
    User userPayload6;
    User userPayload7;
    User userPayload8;
    User userPayload9;
    User userPayload10;
    User userPayload11;
    User userPayload12;
    User userPayload13;
    User userPayload14;
    @BeforeClass
    public void generateTestData()
    {
        faker = new Faker();
        userPayload = new User();
//       userPayload.setEmail(faker.internet().safeEmailAddress());
//        userPayload.setUsername(faker.name().username());
//        userPayload.setPassword(faker.internet().password(5,10));

        userPayload.setEmail("niamul.islam3@gmail.com");
        userPayload.setUsername("Niamul12");
        userPayload.setPassword("Niamul@123");

    }
    @BeforeClass
    public void generateTestDataWithInvalidEmail()
    {
        faker = new Faker();
        userPayload2 = new User();
        userPayload2.setEmail(faker.name().firstName());
        userPayload2.setUsername(faker.name().username());
        userPayload2.setPassword(faker.internet().password(5,10));

    }

    @BeforeClass
    public void generateTestDataWithOutEmail()
    {
        faker = new Faker();
        userPayload3 = new User();
        //userPayload3.setEmail(faker.name().firstName());
        userPayload3.setUsername(faker.name().username());
        userPayload3.setPassword(faker.internet().password(5,10));

    }
    @BeforeClass
    public void generateTestDataWithUserNameLessThen3Char()
    {
        faker = new Faker();
        userPayload4 = new User();
        userPayload4.setEmail(faker.internet().safeEmailAddress());
        userPayload4.setUsername("rr");
        userPayload4.setPassword(faker.internet().password(5,10));

    }
    @BeforeClass
    public void generateTestDataWithOutUserName()
    {
        faker = new Faker();
        userPayload5 = new User();
        userPayload5.setEmail(faker.internet().safeEmailAddress());
        userPayload5.setPassword(faker.internet().password(5,10));

    }
    @BeforeClass
    public void generateTestDataWithDuplicateUserName()
    {
        faker = new Faker();
        userPayload6 = new User();
        userPayload6.setEmail(faker.internet().safeEmailAddress());
        userPayload6.setUsername("garry.schmitt");
        userPayload6.setPassword(faker.internet().password(5,10));

    }
    //User Registration  Password Less than 8 characters
    @BeforeClass
    public void generateTestDataPasswordLessThan6Characters()
    {
        faker = new Faker();
        userPayload7 = new User();
        userPayload7.setEmail(faker.internet().safeEmailAddress());
        userPayload7.setUsername(faker.name().username());
        userPayload7.setPassword("Ni@12");

    }
    //User Registration  Password Without contain numbers
    @BeforeClass
    public void generateTestDataPasswordWithoutContainNumbers()
    {
        faker = new Faker();
        userPayload8 = new User();
        userPayload8.setEmail(faker.internet().safeEmailAddress());
        userPayload8.setUsername(faker.name().username());
        userPayload8.setPassword("Niamul@Niamul");

    }
    //User Registration  Password Without contain special characters
    @BeforeClass
    public void generateTestDataPasswordWithoutContainSpecialNumbers()
    {
        faker = new Faker();
        userPayload9 = new User();
        userPayload9.setEmail(faker.internet().safeEmailAddress());
        userPayload9.setUsername(faker.name().username());
        userPayload9.setPassword("Niamul1234");

    }
    //User Registration  Password Without contain uppercase letters
    @BeforeClass
    public void generateTestDataPasswordWithoutContainUpperCaseLetters()
    {
        faker = new Faker();
        userPayload10 = new User();
        userPayload10.setEmail(faker.internet().safeEmailAddress());
        userPayload10.setUsername(faker.name().username());
        userPayload10.setPassword("niamul@1234");

    }
    //User Registration  Without Password
    @BeforeClass
    public void generateTestDataWithoutPassword()
    {
        faker = new Faker();
        userPayload11 = new User();
        userPayload11.setEmail(faker.internet().safeEmailAddress());
        userPayload11.setUsername(faker.name().username());
        userPayload11.setPassword("w");

    }
    //User Registration  Password Getter than 20 characters
    @BeforeClass
    public void generateTestDataPasswordGetterThan20Characters()
    {
        faker = new Faker();
        userPayload12 = new User();
        userPayload12.setEmail(faker.internet().safeEmailAddress());
        userPayload12.setUsername(faker.name().username());
        userPayload12.setPassword("Ni@12234567890oiuytj22");

    }
    @BeforeClass
    public void generateTestDataForLoginUser()
    {
        userPayload13 = new User();
        userPayload13.setIdentifier("shoishob554");
        userPayload13.setPassword("Asdfgh@11");

    }
    @BeforeClass
    public void generateTestDataForgetPassword()
    {
        userPayload14 = new User();
        userPayload14.setEmail("niamul.islam3@gmail.com");
    }
}
