package Account;

import com.dean.casino.Account.Account;
import com.dean.casino.Account.AccountService;
import org.junit.Assert;
import org.junit.Test;

public class TestAccountCreation {
    @Test
    public void testCreate(){
        //given
        AccountService accountService = new AccountService();
        String expectedAccountName = "Dean";
        String expectedPassword = "changeit";
        float expectedInitialBalance = 100.0f;

        //when
        Account account = accountService.createAccount(expectedAccountName, expectedPassword, expectedInitialBalance);

        //then
        Assert.assertNotNull(account);
        Assert.assertEquals((expectedAccountName), account.getAccountName());
        Assert.assertEquals(expectedPassword, account.getPassword());
        Assert.assertEquals(expectedInitialBalance, account.getBalance());

    }


}
