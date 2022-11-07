package pgdp.tests;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static pgdp.array.Array.print;
import static pgdp.array.Array.minAndMax;
import static pgdp.array.Array.invert;
import static pgdp.array.Array.intersect;
import static pgdp.array.Array.linearize;
import static pgdp.array.Array.bubbleSort;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import pgdp.array.ArrayInterface;

public class ArrayTest {
	private static final ByteArrayOutputStream out = new ByteArrayOutputStream() {
		// returns platform independent captured output
		@Override
		public synchronized String toString() {
			return super.toString().replace("\r", "");
		}
	};
	private static final PrintStream stdOut = System.out;
	@AfterEach
	public void resetBuffer() {
		out.reset();
	}

	@BeforeAll
	public static void setUpStreams() {
		System.setOut(new PrintStream(out));
	}

	@AfterAll
	public static void restoreStreams() {
		System.setOut(stdOut);
	}

	@Test
	void test_print() {
		print(new int[]{-12123, 123213, 3, 123, 0, 3, 4, 56, 43, 234, 234, 45, 0, 2});
		assertEquals("{-12123, 123213, 3, 123, 0, 3, 4, 56, 43, 234, 234, 45, 0, 2}\n", out.toString());
	}
}
