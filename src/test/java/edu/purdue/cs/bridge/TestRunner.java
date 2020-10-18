package edu.purdue.cs.bridge;

import edu.purdue.cs.barista.GradescopeGrader;

/**
 * {@link TestRunner} is used to run the test cases
 * inside of the Gradescope autograder.
 */
public class TestRunner {

    public static void main(String[] args) {
        System.setProperty("student.package.name", "");
        System.setProperty("solution.package.name", "edu.purdue.cs.bridge.lab00.solution");

        // Add your test suites here
        Class<?>[] testSuites = {};
        GradescopeGrader.run(testSuites, 100.0);
    }

}
