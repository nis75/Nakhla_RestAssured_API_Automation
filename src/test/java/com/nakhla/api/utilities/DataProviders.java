package com.nakhla.api.utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="UserRegistration")
    public String[][] UserRegistrationDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 2, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithInvalidEmail")
    public String[][] UserRegistrationWithInvalidEmailDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 3, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithUserNameLessThen3Char")
    public String[][] UserRegistrationWithUserNameLessThen3CharDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 4, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithoutUserName")
    public String[][] UserRegistrationWithoutUserNameDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 5, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithDuplicateUserName")
    public String[][] UserRegistrationWithDuplicateUserNameDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 6, colNo);
        }
        return userData;
    }

    @DataProvider(name="UserRegistrationPasswordLessThan6Characters")
    public String[][] UserRegistrationPasswordLessThan6CharactersDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 7, colNo);
        }
        return userData;
    }

    @DataProvider(name="UserRegistrationPasswordWithoutContainNumbers")
    public String[][] UserRegistrationPasswordWithoutContainNumbersDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 8, colNo);
        }
        return userData;
    }


    @DataProvider(name="UserRegistrationPasswordWithoutContainSpecialCharacters")
    public String[][] UserRegistrationPasswordWithoutContainSpecialCharactersDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 9, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationPasswordWithoutContainUpperCaseLetters")
    public String[][] UserRegistrationPasswordWithoutContainUpperCaseLettersDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 10, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithoutPassword")
    public String[][] UserRegistrationWithoutPasswordDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 11, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationPasswordGetterThan20Characters")
    public String[][] UserRegistrationPasswordGetterThan20CharactersDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 12, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserLoginWithWrongPassword")
    public String[][] UserLoginWithWrongPasswordDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 13, colNo);
        }
        return userData;
    }
    @DataProvider(name="UserLogin")
    public String [][] UserLoginDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 14, colNo);
        }
        return userData;
    }
    @DataProvider(name="ForgotPassword")
    public String [][] ForgotPasswordDataProvider()
    {
        String fName = System.getProperty("user.dir") + "/TestData/DDT_DATA.xlsx";
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        // Need Only one row (2nd row), so array size is [1][ttlColCnt]
        String userData[][] = new String[1][ttlColCnt];
        for (int colNo = 0; colNo < ttlColCnt; colNo++) {
            userData[0][colNo] = ReadExcelFile.getSellValue(fName, "Sheet2", 15, colNo);
        }
        return userData;
    }



//    @DataProvider(name="UserRegistrationData2")
//    public String [][] UserRegistrationDataProvider2()
//    {
//        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
//        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet2");
//        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");
//
//        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
//        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
//        {
//            for (int colNo=0; colNo<ttlColCnt; colNo++)
//            {
//                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet2",rowNo,colNo);
//            }
//        }
//        return userData;
//    }
//    @DataProvider(name="UserRegistrationWithInvalidEmailData")
//    public String [][] UserRegistrationWithInvalidEmailDataProvider()
//    {
//        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
//        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet3");
//        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet3");
//
//        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
//        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
//        {
//            for (int colNo=0; colNo<ttlColCnt; colNo++)
//            {
//                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet3",1,colNo);
//            }
//        }
//        return userData;
//    }
//    @DataProvider(name="UserLoginData")
//    public String [][] UserLoginDataProvider()
//    {
//        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
//        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet2");
//        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");
//
//        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
//        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
//        {
//            for (int colNo=0; colNo<ttlColCnt; colNo++)
//            {
//                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet2",rowNo,colNo);
//            }
//        }
//        return userData;
//    }
//    @DataProvider(name="UserEmailData")
//    public String [] UserEmailDataProvider()
//    {
//        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
//        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet2");
//
//        String userEmailData[]=new String[ttlRowCnt-1];
//        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
//        {
//
//            userEmailData[rowNo-1]=ReadExcelFile.getSellValue(fName,"Sheet2",rowNo,1 );
//
//        }
//        return userEmailData;
//    }
}
