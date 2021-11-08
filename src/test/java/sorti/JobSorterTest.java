package sorti;

import org.junit.Test;
import three.User;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobSorterTest {

    @Test
    public void whenAscByName() {
        Comparator<Job> comp = new JobAscByName();
        int res = comp.compare(
                new Job("Abc task", 1),
                new Job("Zyx", 3)
        );
        assertThat(res, lessThan(-1));
    }

    @Test
    public void whenAscPriority() {
        Comparator<Job> comp = new JobAscByPriority();
        int res = comp.compare(
                new Job("Abc task", 1),
                new Job("Zyx", 3)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenDescByNameAndDescPriority() {
        Comparator<Job> comNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int res = comNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(res, lessThan(0));
    }

    @Test
    public void whenAscByNameAndAscPriority() {
        Comparator<Job> comb = new JobAscByName().thenComparing(new JobAscByPriority());
        int res = comb.compare(
                new Job("Abc task", 1),
                new Job("Zyx", 3)
        );
        assertThat(res, lessThan(0));
    }
}