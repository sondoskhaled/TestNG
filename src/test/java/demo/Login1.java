package demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login1 {
    @Test (dataProviderClass = LoginDP.class , dataProvider = "Login_Data")
    public void login (String email , String password , boolean success){
            System.out.println("login credentials" + "\n"
                     +"Email" + email + "\n"
                     + "Password" + password + "\n"
                     + "Successful log in" + success + "\n" ) ;
    }


}
