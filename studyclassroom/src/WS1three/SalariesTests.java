package WS1three;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class SalariesTests {
	public static final double TOLERANCE = 0.0000000001;
	private Salaries salaries;

	@BeforeEach
	public void test() {
		salaries = new Salaries();
		double[] salary1 = { 10, 10, 10, 10, 10, 10,10, 0, 0, 0, 0, 0 };
		double[] salary2 = { 0, 0, 0, 0, 0, 0, 70000, 70000, 0, 0, 0, 0 };
		salaries.add(salary1);
		salaries.add(salary2);
	}

	@Test
	public void test1() {
		double[] salary1 =  { 10, 10, 10, 10, 10, 10,10, 0, 0, 0, 0, 0 };
		double expectedAverage = 10;
		double actualAverage = Salaries.average(salary1);
		assertEquals(expectedAverage, actualAverage, TOLERANCE);
	}


	@Test
	public void test2() {
		double[] salary2 = { 0, 0, 0, 0, 0, 0, 70000, 70000, 0, 0, 0, 0 };
		double expectedAverage = 70000;
		double actualAverage = Salaries.average(salary2);
		assertEquals(expectedAverage, actualAverage, TOLERANCE);
	}



	@Test
	public void test3() {

		ArrayList<Double> expectedAverageSalaries = new ArrayList<>();
		expectedAverageSalaries.add(10.0);
		expectedAverageSalaries.add(70000.0);
		ArrayList<Double> actualAverageSalaries = salaries.averageSalaries();

		for (int i = 0; i < actualAverageSalaries.size(); i++) {
			assertEquals(expectedAverageSalaries.get(i), actualAverageSalaries.get(i), TOLERANCE);
		}
	}




	@Test
	public void test4() {
		double[] SalaryTestone = { 500, 400, 3000, 200, 100, 50, 30, 10, 0, 0, 0, 0 };
		salaries.add(SalaryTestone);
		Assertions.assertTrue(salaries.not3TimesHigher());
	}
	
	@Test
	public void test5() {
		double[] SalaryTesttwo = { 1000, 1000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Salaries salaries2 = new Salaries();
		salaries2.add(SalaryTesttwo);
		Assertions.assertTrue(salaries2.not3TimesHigher());
	}
}
