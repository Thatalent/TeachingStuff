package DreamExampleTest;

import static org.junit.Assert.*;

import org.junit.Test;

import DreamExample.Dream;


public class DreamServiceImplTest {

	@Test
	public void testFindNoDreams() {
		
		Dream mockDream = new Dream(0, 5);
		
		int results = Dream.findNoDreams(mockDream);
		
		assertEquals(6, results);
	}
}
