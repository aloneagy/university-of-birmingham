package WS1three;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Alexandros Evangelidis and Manfred Kerber
 * @version 2019-10-28
 */
public class GenerateClassTests {

	private GenerateClass TEST1, TEST2;

	@BeforeEach
	public void test() {
		String classname1 = "company";
		String[] variableNames1 = { "sumPeople", "salary" };
		String[] variableTypes1 = { "int", "double" };
		TEST1 = new GenerateClass(classname1, variableNames1, variableTypes1);

		String classname2 = "university";
		String[] variableNames2 = { "teacher", "grade", "major" };
		String[] variableTypes2 = { "int", "double", "String" };
		TEST2 = new GenerateClass(classname2, variableNames2, variableTypes2);

	}
	@Test
	public void test1() {
		String expectedFields = "  private int sumPeople;\n" + "  private double salary;\n\n";
		String actualFields = TEST1.makeFields();
		assertEquals(expectedFields, actualFields);
	}

	@Test
	public void test2() {
		String expectedConstructor = "  public company(int sumPeople, double salary){\n" + "    this.sumPeople = sumPeople;\n"
				+ "    this.salary = salary;\n" + "  }\n";
		String actualConstructor = TEST1.makeConstructor();
		assertEquals(expectedConstructor, actualConstructor);
	}

	@Test
	public void test3() {
		String expectedGetters = "  public int getSumPeople(){\n" + "    return sumPeople;\n" + "  }\n"
				+ "  public double getSalary(){\n" + "    return salary;\n" + "  }\n";
		String actualGetters = TEST1.makeGetters();
		assertEquals(expectedGetters, actualGetters);
	}

	@Test
	public void test4() {
		String expectedSetters = "  public void setSumPeople(int sumPeople){\n" + "    this.sumPeople = sumPeople;\n" + "  }\n"
				+ "  public void setSalary(double salary){\n" + "    this.salary = salary;\n" + "  }\n";
		String actualSetters = TEST1.makeSetters();
		assertEquals(expectedSetters, actualSetters);
	}

	@Test
	public void test5() {
		String expectedFields = "  private int teacher;\n" + "  private double grade;\n" + "  private String major;\n\n";
		String actualFields = TEST2.makeFields();
		assertEquals(expectedFields, actualFields);
	}

	@Test
	public void test6() {
		String expectedConstructor = "  public university(int teacher, double grade, String major){\n"
				+ "    this.teacher = teacher;\n" + "    this.grade = grade;\n" + "    this.major = major;\n" + "  }\n";
		String actualConstructor = TEST2.makeConstructor();
		assertEquals(expectedConstructor, actualConstructor);
	}

	@Test
	public void test7() {
		String expectedGetters = "  public int getTeacher(){\n" + "    return teacher;\n" + "  }\n"
				+ "  public double getGrade(){\n" + "    return grade;\n" + "  }\n" + "  public String getMajor(){\n"
				+ "    return major;\n" + "  }\n";
		String actualGetters = TEST2.makeGetters();
		assertEquals(expectedGetters, actualGetters);
	}

	@Test
	public void test8() {
		String expectedSetters = "  public void setTeacher(int teacher){\n" + "    this.teacher = teacher;\n" + "  }\n"
				+ "  public void setGrade(double grade){\n" + "    this.grade = grade;\n" + "  }\n"
				+ "  public void setMajor(String major){\n" + "    this.major = major;\n" + "  }\n";
		String actualSetters = TEST2.makeSetters();
		assertEquals(expectedSetters, actualSetters);
	}



}
