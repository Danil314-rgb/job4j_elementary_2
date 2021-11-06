package set;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr", "eDer341"),
                new Account("323", "Petr", "0001f")
        );
        HashSet<Account> expected = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr", "eDer341"),
                        new Account("323", "Petr", "0001f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), is(expected));
    }
}