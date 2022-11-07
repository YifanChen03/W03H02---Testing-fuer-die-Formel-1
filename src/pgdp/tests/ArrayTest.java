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
import java.util.Arrays;

public class ArrayTest {

	@Test
	void test_print() {
		//test für leeres Array
		PinguLib.setup();
		print(new int[]{});
		assertEquals("{}", PinguLib.getConsoleOutput());
		PinguLib.reset();

		//test für standard integer inklusive negative Werte
		PinguLib.setup();
		print(new int[]{-3, -2, -1, 0, 1, 2, 3});
		assertEquals("{-3, -2, -1, 0, 1, 2, 3}", PinguLib.getConsoleOutput());
		PinguLib.reset();
	}

	@Test
	void test_minAndMax() {
		//test für leeres Array
		PinguLib.setup();
		minAndMax(new int[]{});
		assertEquals("", PinguLib.getConsoleOutput());
		PinguLib.reset();

		//test für standard integer inklusive negative Werte
		PinguLib.setup();
		minAndMax(new int[]{-3, -2, -1, 0, 1, 2, 3});
		assertEquals("Minimum = " + "-3" + ", Maximum = " + "3", PinguLib.getConsoleOutput());
		PinguLib.reset();
	}

	@Test
	void test_invert() {
		//test für leeres Array
		PinguLib.setup();
		int[] testArray = new int[]{};
		int[] testArray_r = new int[testArray.length];
		for (int i = 0; i < testArray.length / 2; i++) {
			int temp = testArray[i];
			testArray_r[i] = testArray[testArray.length - 1 - i];
			testArray_r[testArray.length - 1 - i] = temp;
		}
		invert(testArray);
		assertArrayEquals(testArray_r, testArray);
		PinguLib.reset();

		//test für standard integer inklusive negative Zahlen
		PinguLib.setup();
		testArray = new int[]{-3, -2, -1, 0, 1, 2, 3};
		testArray_r = new int[testArray.length];
		for (int i = 0; i < testArray.length / 2; i++) {
			int temp = testArray[i];
			testArray_r[i] = testArray[testArray.length - 1 - i];
			testArray_r[testArray.length - 1 - i] = temp;
		}
		invert(testArray);
		assertArrayEquals(testArray_r, testArray);
		PinguLib.reset();
	}

	@Test
	void test_intersect() {
		//test mit standard integern inklusive negative Zahlen
		PinguLib.setup();
		assertEquals("[-3, -2, -1, 0, 1]", Arrays.toString(intersect(new int[]{-3, -2, -1, 0, 1, 2, 3}, 5)));
		PinguLib.reset();

		//test mit standard integern inkl. negative, Länge ist größer als Array
		PinguLib.setup();
		assertEquals("[-3, -2, -1, 0, 1, 2, 3, 0, 0]", Arrays.toString(intersect(new int[]{-3, -2, -1, 0, 1, 2, 3}, 9)));
		PinguLib.reset();

		//test mit leerem Array, Länge ist größer als Array
		PinguLib.setup();
		assertEquals("[0, 0, 0]", Arrays.toString(intersect(new int[]{}, 3)));
		PinguLib.reset();

		//test mit leerem Array, Länge ist 0
		PinguLib.setup();
		assertEquals("[]", Arrays.toString(intersect(new int[]{}, 0)));
		PinguLib.reset();

		//test mit standard integern inkl. negative, Länge ist negativ
		PinguLib.setup();
		assertEquals("[]", Arrays.toString(intersect(new int[]{-3, -2, -1, 0, 1, 2, 3}, -5)));
		PinguLib.reset();
	}

	@Test
	void test_linearize() {
		//test für standard Zahlen und zwei Arrays
		PinguLib.setup();
		assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4, 5, 6, 7}, linearize(new int[][]{{-1, 0, 1}, {2, 3, 4, 5, 6}, {7}, {}}));
		PinguLib.reset();

		//test für leeren Arrays
		PinguLib.setup();
		assertArrayEquals(new int[]{}, linearize(new int[][]{{}, {}, {}, {}}));
		PinguLib.reset();
	}
}
