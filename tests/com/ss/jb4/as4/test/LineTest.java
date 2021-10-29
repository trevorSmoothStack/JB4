package com.ss.jb4.as4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.jb4.as4.Line;

public class LineTest {
	
	@Test(expected = ArithmeticException.class)
	public void getSlopeExceptionTest() {
		Line notALine = new Line(4, 7, 4, 9);
		notALine.getSlope();
	}

	Line line = new Line(0,2,2,4);
	
	@Test
	public void getSlopeTest() {
		assertEquals("Slope is not correct", 1, line.getSlope(), 0);
		assertNotEquals("Not calculating slope correctly", 2, line.getSlope(), 0);
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals("Distance is not correct:", Math.sqrt(8), line.getDistance(), 0);
		assertNotEquals("Not calculating distance correctly", 2, line.getDistance(), 0);
	}
	
	@Test
	public void parallelToTrueTest() {
		Line testLine = new Line(2,16,8,22);
		assertTrue("Parallel test is incorrect. Should be true, returned false.", line.parallelTo(testLine));
	}
	
	@Test
	public void parallelToFalseTest() {
		Line testLine = new Line(2,16,8,30);
		assertFalse("Parallel test is incorrect. Should be false, returned true.", line.parallelTo(testLine));
	}
}
