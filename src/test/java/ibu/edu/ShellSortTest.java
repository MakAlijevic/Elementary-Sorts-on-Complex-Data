package ibu.edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
public class ShellSortTest{

    @Test
    @Order(1)
    void testShellSortReversed() {
        Comparable[] elements = {90, 53, 49, 42, 30, 19, 17, 16, 15, 11};

        ShellSort.sort(elements);

        assertEquals(11, elements[0]);
        assertEquals(19, elements[4]);
        assertEquals(90, elements[9]);
    }

    @Test
    @Order(2)
    void testShellSortSorted() {
        Comparable[] elements = {11, 15, 16, 17, 19, 30, 42, 49, 53, 90};

        ShellSort.sort(elements);

        assertEquals(11, elements[0]);
        assertEquals(19, elements[4]);
        assertEquals(90, elements[9]);
    }

    @Test
    @Order(3)
    void testShellSortRandom() {
        Comparable[] elements = {49, 16, 19, 17, 15, 53, 30, 90, 42, 11};

        ShellSort.sort(elements);

        assertEquals(11, elements[0]);
        assertEquals(19, elements[4]);
        assertEquals(90, elements[9]);
    }
}
