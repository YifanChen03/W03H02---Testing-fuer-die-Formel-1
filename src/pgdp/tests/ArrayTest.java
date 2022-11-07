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
	}
}
