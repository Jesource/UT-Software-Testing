package ee.ut.cs.swt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MinimumBinaryHeapTest {

    private MinimumBinaryHeap heap;
    private List<Integer> result;

    @BeforeEach
    public void setUp() {
        heap = new MinimumBinaryHeap();
        result = new ArrayList<>();
        result.add(10);
        result.add(5);
        result.add(4);
        result.add(8);
        result.add(12);
    }

    @Test
    public void minHeapifyTest() {
        heap.minHeapify(result);
        assertEquals(4, heap.getArray().get(0), 0);
        assertEquals(5, heap.getArray().get(1), 0);
        assertEquals(10, heap.getArray().get(2), 0);

    }

    @Test
    public void extractMinTest() {
        heap.add(7);
        heap.add(1);
        heap.add(6);
        int min = heap.exractMin();
        assertEquals(1, min);
    }

    @Test
    public void swapTest() {
        heap.add(5);
        heap.add(8);
        heap.add(13);
        heap.swap(1, 2);
        assertEquals(5, heap.getArray().get(0), 0);
        assertEquals(13, heap.getArray().get(1), 0);
        assertEquals(8, heap.getArray().get(2), 0);
    }

    @Test
    public void addTest() {
        heap.add(10);
        heap.add(5);
        heap.add(4);
        heap.add(8);
        heap.add(12);
        assertEquals(4, heap.getArray().get(0), 0);
        assertEquals(5, heap.getArray().get(1), 0);
        assertEquals(10, heap.getArray().get(2), 0);
    }

    @Test
    public void removeTest() {
        heap.add(5);
        heap.add(3);
        heap.add(2);
        boolean b1 = heap.remove(3);

        assertEquals(true, b1);
    }

    @Test
    public void isEmptyTest() {
        heap = new MinimumBinaryHeap();
        assertEquals(true, heap.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        assertTrue(heap.isEmpty());
        heap.add(5);
        assertFalse(heap.isEmpty());
        heap.exractMin();
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testExtractMin() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        heap.add(5);
        heap.add(3);
        heap.add(7);
        heap.add(2);
        heap.add(8);
        assertEquals(2, heap.exractMin());
        assertEquals(3, heap.exractMin());
        assertEquals(5, heap.exractMin());
        assertEquals(7, heap.exractMin());
        assertEquals(8, heap.exractMin());
        assertTrue(heap.isEmpty());
    }


    @Test
    void testSwap() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        heap.add(5);
        heap.add(10);
        heap.add(15);
        heap.swap(0, 2);
        assertEquals(List.of(15, 10, 5), heap.getArray());
    }

    @Test
    void testMinHeapify() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        heap.add(15);
        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(25);
        heap.minHeapify(heap.getArray());
        assertEquals(List.of(5, 10, 15, 20, 25), heap.getArray());
    }

    @Test
    void testRemove() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        heap.add(5);
        heap.add(10);
        heap.add(15);
        heap.remove(10);
        assertEquals(List.of(5, 15), heap.getArray());
    }

    @Test
    void testExtractMin2() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        assertThrows(IllegalArgumentException.class, () -> heap.exractMin(),
                "Not IllegalArgumentException or no exceptions were thrown");
    }

    @Test
    void testRemove2() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        assertEquals(false, heap.remove(0));
    }

    @Test
    void testRemove3() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        heap.bubbleDown(0);
    }

    @Test
    void testBubbleUp() {
        MinimumBinaryHeap heap = new MinimumBinaryHeap();
        List<Integer> expected = Arrays.asList(1, 3, 2, 5, 4);
        List<Integer> actual = new ArrayList<>();

        heap.add(1);
        heap.add(2);
        heap.add(3);
        heap.add(4);
        heap.add(5);

        heap.bubbleUp(4); // bubble up the last element

        actual = heap.getArray();
        assertEquals(expected, actual);
    }
}

