import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	// Create two objects of java file GradeBook.
	GradeBook g1,
			g2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Create an instance of the objects created using class GradeBook.
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		//Using the addScore method to add values to the two array object.
		g1.addScore(60);
		g1.addScore(100);
		g1.addScore(20);
		g1.addScore(40);
		g1.addScore(80);
		
		g2.addScore(25);
		g2.addScore(50); 
		g2.addScore(75);
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		/*
		 * Compare the contents of what is in the scores array vs. what is expected to be in the
		 * scores array and compare the scoreSize to the expected number of scores entered
		 */
		g2.addScore(2.0);
		assertEquals(g1.getScoreSize(),5);
		assertEquals(g2.getScoreSize(),4); 
		}

	@Test
	void testSum() {
		// Compare what is returned by sum() to the expected sum of the scores entered
		assertEquals(300.0, g1.sum(), 0.0001);
		assertEquals(150.0, g2.sum(), 0.0001);
	}

	@Test
	void testMinimum() {
		// Compare what is returned by minimum() to the expected minimum of the scores entered
		assertEquals(20.0, g1.minimum(), 0.0001);
		assertEquals(25.0, g2.minimum(), 0.0001);
	}

	@Test
	void testFinalScore() {
		assertEquals(280.0, g1.finalScore(), 0.0001);
		assertEquals(125.0, g2.finalScore(), 0.0001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(g1.getScoreSize(), 5);
		assertEquals(g1.getScoreSize(), 5);
	}

	@Test
	void testToString() {
		assertEquals(g1.toString(),"60.0 100.0 20.0 40.0 80.0 ");
		assertEquals(g2.toString(),"25.0 50.0 75.0 ");	
	
	}

}
