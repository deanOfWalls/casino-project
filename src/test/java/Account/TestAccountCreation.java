package Account;

import com.dean.casino.Account.Manager;
import org.junit.Test;

public class TestAccountCreation {
    @Test
    public void testCreate(){
        //given
        String accountName = "dean";
        String password = "changeit";
        float initialBalance = 100.0f;

        //when
        Account createdAccount = Manager.createAccount(accountName, password, initialBalance);

        //then

    }


}
