package pl.sda.problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import pl.sda.problems.P01;

public class Problems {

    @Test
    public void shouldFindLastElementFromAListOfAlphabets() throws Exception {
        assertThat(P01.last(asList("a", "b", "c", "d")), is(equalTo("d")));
    }

    @Test
    public void shouldReverseAList() throws Exception {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertThat(P01.reverse(numbers), is(equalTo(Arrays.asList(5, 4, 3, 2, 1))));
    }
//
//    @Test
//    public void shouldReturnTrueWhenListIsPalindrome() throws Exception {
//        assertTrue(P01.isPalindrome(Arrays.asList("x", "a", "m", "a", "x")));
//    }
//
//    @Test
//    public void shouldReturnFalseWhenListIsNotPalindrome() throws Exception {
//        assertFalse(P01.isPalindrome(Arrays.asList(1, 2, 3, 4, 5)));
//    }
}