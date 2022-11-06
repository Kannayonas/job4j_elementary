package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1() {
        int[] data = new int[] {6, 0, 1, 8, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 5, 6, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {5, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 5};
        assertThat(result).containsExactly(expected);
    }

}