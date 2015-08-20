package sampletest;

import org.junit.Test;
import static junit.framework.Assert.*;
import sample.*;

public class MyConcatenatorTest {

	@Test
	public void testConcatenate() {
		String concatenated = MyConcatenator.concatenate("one", "two", "three",
				"four");

		assertEquals("onetwo,three,four", concatenated);
	}
}