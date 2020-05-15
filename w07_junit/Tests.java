package app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Tests {

    final Board place1 = new Board();
    final Board place2 = new Board();

    @Test
    public void test1() {
        assertTrue("X", place1.placeMark(0,0));
        assertTrue("O", place1.placeMark(1,0));
        assertTrue("X", place1.placeMark(0,1));
        assertTrue("O", place1.placeMark(1,1));
        assertTrue("X", place1.placeMark(0,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test2() {
        assertTrue("X", place2.placeMark(0,0));
        assertTrue("X", place2.placeMark(0,1));
        assertTrue("X", place2.placeMark(0,2));
        assertTrue(place2.checkWinner());
        assertTrue(place1.isFull() == false);
    }
    @Test
    public void test3() {
        assertTrue("X", place1.placeMark(1,0));
        assertTrue("X", place1.placeMark(1,1));
        assertTrue("X", place1.placeMark(1,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test4() {
        assertTrue("X", place1.placeMark(2,0));
        assertTrue("X", place1.placeMark(2,1));
        assertTrue("X", place1.placeMark(2,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test5() {
        assertTrue("O", place1.placeMark(0,0));
        assertTrue("X", place1.placeMark(0,1));
        assertTrue("O", place1.placeMark(0,2));
        assertTrue("X", place1.placeMark(1,0));
        assertTrue("O", place1.placeMark(1,1));
        assertTrue("X", place1.placeMark(1,2));
        assertTrue("X", place1.placeMark(2,0));
        assertTrue("O", place1.placeMark(2,1));
        assertTrue("O", place1.placeMark(2,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == true);
    }

    @Test
    public void test6() {
        assertTrue("O", place1.placeMark(0,0));
        assertTrue("O", place1.placeMark(0,1));
        assertTrue("O", place1.placeMark(0,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test7() {
        assertTrue("O", place1.placeMark(2,0));
        assertTrue("O", place1.placeMark(2,1));
        assertTrue("O", place1.placeMark(2,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test8() {
        assertTrue("O", place1.placeMark(2,0));
        assertTrue("O", place1.placeMark(2,1));
        assertTrue("O", place1.placeMark(2,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test9() {
        assertTrue("O", place1.placeMark(0,0));
        assertTrue("O", place1.placeMark(1,1));
        assertTrue("O", place1.placeMark(2,2));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }

    @Test
    public void test10() {
        assertTrue("O", place1.placeMark(0,2));
        assertTrue("O", place1.placeMark(1,1));
        assertTrue("O", place1.placeMark(2,0));
        assertTrue(place1.checkWinner());
        assertTrue(place1.isFull() == false);
    }


}