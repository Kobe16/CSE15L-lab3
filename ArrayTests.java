import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace1() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 1, 2 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 2, 1 }, input1);
	}

  @Test 
	public void testReverseInPlace3() {
    int[] input1 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input1);
	}




  // @Test
  // public void testReversed1() {
  //   int[] input1 = { };
  //   assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  // }

  // @Test
  // public void testReversed2() {
  //   int[] input1 = { 2, 3};
  //   assertArrayEquals(new int[]{ 3, 2}, ArrayExamples.reversed(input1));
  // }

  @Test
  public void testReversed1() {
    int[] input1 = { 4, 5, 3, 2, 1};
    assertArrayEquals(new int[]{1, 2, 3, 5, 4}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = {0, 0, 0};
    assertArrayEquals(new int[]{0, 0, 0}, ArrayExamples.reversed(input1));
  }

  // @Test
  // public void testaverageWithoutLowest1() {
  //   double[] input1 = {5.0, 3.0, 3.0};
  //   assertEquals(4.0, ArrayExamples.averageWithoutLowest(input1), 1);
  // }

}
