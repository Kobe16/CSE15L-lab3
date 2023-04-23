import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;


public class ListTests {

    @Test 
	public void testFilter1() {

        List<String> input1 = new ArrayList<>();
        input1.add("C"); 
        input1.add("Ball"); 
        input1.add("A"); 

        List<String> result1 = ListExamples.filter(input1, new MyStringChecking()); 
        assertArrayEquals(new String[]{ "Ball" }, result1.toArray());
	}

    @Test 
	public void testFilter2() {

        List<String> input1 = new ArrayList<>();
        input1.add("C"); 
        input1.add("Ball"); 
        input1.add("A"); 
        input1.add("Help"); 
        input1.add("byuo"); 

        List<String> result1 = ListExamples.filter(input1, new MyStringChecking()); 
        assertArrayEquals(new String[]{ "Ball", "Help", "byuo"}, result1.toArray());
	}

    @Test 
	public void testMerge1() {

        List<String> input1 = new ArrayList<>();
        input1.add("A"); 
        input1.add("C"); 
        input1.add("E"); 

        List<String> input2 = new ArrayList<>();
        input1.add("B"); 
        input1.add("D"); 
        input1.add("F"); 

        List<String> result1 = ListExamples.merge(input1, input2); 
        //System.out.println(result1); 
        assertArrayEquals(new String[]{ "A", "B", "C", "D", "E", "F"}, result1.toArray());
	}

}
