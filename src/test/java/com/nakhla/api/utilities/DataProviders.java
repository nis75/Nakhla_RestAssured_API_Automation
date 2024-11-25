package com.nakhla.api.utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name="UserRegistrationData")
    public String [][] UserRegistrationDataProvider()
    {
        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet2");
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
        {
            for (int colNo=0; colNo<ttlColCnt; colNo++)
            {
                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet2",rowNo,colNo);
            }
        }
        return userData;
    }
    @DataProvider(name="UserRegistrationWithInvalidEmailData")
    public String [][] UserRegistrationWithInvalidEmailDataProvider()
    {
        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet3");
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet3");

        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
        {
            for (int colNo=0; colNo<ttlColCnt; colNo++)
            {
                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet3",1,colNo);
            }
        }
        return userData;
    }
    @DataProvider(name="UserLoginData")
    public String [][] UserLoginDataProvider()
    {
        String fName = System.getProperty("user.dir")+"/TestData/DDT_DATA.xlsx";
        int ttlRowCnt = ReadExcelFile.getRowCount(fName, "Sheet2");
        int ttlColCnt = ReadExcelFile.getColCount(fName, "Sheet2");

        String userData[][]=new String[ttlRowCnt-1][ttlColCnt];
        for (int rowNo=1; rowNo<ttlRowCnt; rowNo++)
        {
            for (int colNo=0; colNo<ttlColCnt; colNo++)
            {
                userData[rowNo-1][colNo]=ReadExcelFile.getSellValue(fName,"Sheet2",rowNo,colNo);
            }
        }
        return userData;
    }
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
