package map;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void whenAdd() {
        Citizen citizen = new Citizen("298444", "Danil");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenNotAdd() {
        Citizen citizen = (new Citizen("123123", "Tom"));
        Citizen citizen2 = (new Citizen("123123", "Tom"));
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        office.add(citizen2);
        assertFalse(office.add(citizen2));
    }
}