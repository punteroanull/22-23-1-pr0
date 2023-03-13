package edu.uoc.ds.adt;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0FibArrayTest {

    PR0FibArray pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0FibArray();

        assertNotNull(this.pr0Array);
    }

    @After
    public void release() {
        this.pr0Array = null;
    }

    @org.junit.Test
    public void arrayTest() {
        int[] v = this.pr0Array.getArray();
        assertEquals(0, v[0]);
        assertEquals(1, v[1]);
        assertEquals(1, v[2]);
        assertEquals(2, v[3]);
        assertEquals(3, v[4]);
        assertEquals(5, v[5]);
        assertEquals(8, v[6]);
// ..
        assertEquals(4181, v[19]);
    }
    @org.junit.Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(4);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(21);
        assertEquals(8, index);
        index = this.pr0Array.getIndexOf(4181);
        assertEquals(19, index);
    }
    @org.junit.Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(8);
        assertEquals(6, index);
    }

}
