package pl.sda.problems;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;

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

    @Test
    public void shouldReturnFalseWhenListIsNotPalindrome() throws Exception {
        assertFalse(P01.isPalindrome(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    public void shouldFlattenAListOfList() throws Exception {
        List<String> flatten = P01.flatten(asList("a", asList("b", asList("c", "d")), "e"), String.class);
        assertThat(flatten, hasSize(5));
        assertThat(flatten, hasItems("a", "b", "c", "d", "e"));
    }

    @Test
    public void shouldDropEveryNthElement() throws Exception {
        List<String> result =
                P01.dropEveryNth(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"), 3);
        assertThat(result, hasSize(8));
        assertThat(result, contains("a", "b", "d", "e", "g", "h", "j", "k"));
    }
    @Test
    public void shouldSplitInTwoHalves() throws Exception {
        Map<Boolean, List<String>> result =
                P01.split(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3);
        assertThat(result.get(true), contains("a", "b", "c"));
        assertThat(result.get(false), contains("d", "e", "f", "g", "h", "i", "k"));
    }

    @Test
    public void shouldGiveSliceOfAList() throws Exception {
        List<String> slice = P01.slice(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "k"), 3, 7);
        assertThat(slice, hasSize(5));
        assertThat(slice, contains("c", "d", "e", "f", "g"));
    }

    @Test
    public void shouldInsertElementAtSecondPosition() throws Exception {
        List<String> input = Stream.of("a", "b", "c", "d").collect(toList());
        List<String> result = P01.insertAt(input, 2, "alfa");
        assertThat(result, hasSize(5));
        assertThat(result, contains("a", "alfa", "b", "c", "d"));
    }
}