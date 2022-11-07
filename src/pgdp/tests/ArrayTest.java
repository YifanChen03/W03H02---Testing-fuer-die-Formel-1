package pgdp.tests;

import static org.junit.jupiter.api.Assertions.*;
import static pgdp.array.Array.print;
import static pgdp.array.Array.minAndMax;
import static pgdp.array.Array.invert;
import static pgdp.array.Array.intersect;
import static pgdp.array.Array.linearize;
import static pgdp.array.Array.bubbleSort;

import org.junit.jupiter.api.Test;
import pgdp.PinguLib;
import pgdp.array.ArrayInterface;

public class ArrayTest {

	@Test
	void test_print() {
		PinguLib.setup();
		print(new int[]{});
		assertEquals("{}", PinguLib.getConsoleOutput());
		PinguLib.reset();

		PinguLib.setup();
		print(new int[]{-3, -2, -1, 0, 1, 2, 3});
		assertEquals("{-3, -2, -1, 0, 1, 2, 3}", PinguLib.getConsoleOutput());
		PinguLib.reset();
	}

	@Test
	void test_minAndMax() {
		PinguLib.setup();
		minAndMax(new int[]{});
		assertEquals("", PinguLib.getConsoleOutput());
		PinguLib.reset();

		PinguLib.setup();
		minAndMax(new int[]{-3, -2, -1, 0, 1, 2, 3});
		assertEquals("Minimum = " + "-3" + ", Maximum = " + "3", PinguLib.getConsoleOutput());
		PinguLib.reset();
	}

	@Test
	void test_invert() {
		PinguLib.setup();
		int[] testArray = new int[]{};
		int[] testArray_r = new int[]{};
		invert(testArray);
		assertEquals(testArray_r, testArray);
		PinguLib.reset();

		PinguLib.setup();
		testArray = new int[]{-3, -2, -1, 0, 1, 2, 3};
		testArray_r = new int[]{3, 2, 1, 0, -1, -2, -3};
		invert(testArray);
		assertEquals(testArray_r, testArray);
		PinguLib.reset();
	}
}
