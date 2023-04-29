package demo;

import org.testng.annotations.DataProvider;

public class LoginDP {
    @DataProvider(name="Login_Data")
    public static Object [][] loginData(){
        Object [][] data = new Object[3][3];

        data[0][0] = "Test_1@gmail.com";  data[0][1] = "test_pass_1";  data[0][2] = true;
        data[1][0] = "Test_2@gmail.com";  data[1][1] = "test_pass_2";  data[1][2] = false;
        data[2][0] = "Test_3@gmail.com";  data[2][1] = "test_pass_3";  data[2][2] = true;

        return data;
    }
}
