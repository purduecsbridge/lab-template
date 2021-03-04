import edu.purdue.cs.percolator.AutoGrader;
import edu.purdue.cs.percolator.StyleChecker;

/**
 * {@link TestRunner} is used to run the test cases
 * inside of the Gradescope autograder.
 */
public class TestRunner {

    public static void main(String[] args) {
        System.setProperty("student.package.name", "");
        // TODO: Change solution package name
        System.setProperty("solution.package.name", "edu.purdue.cs.bridge.lab00.solution");

        // TODO: Add your test suites here
        Class<?>[] testSuites = {};
        StyleChecker checker = StyleChecker.lint(
            "/autograder/submission",
            "/autograder/source/checkstyle_policy.xml"
        );
        AutoGrader.grade(testSuites)
            .onGradescope()
            .withMaxScore(100.0)
            .withStyleChecker(checker)
            .run();
    }

}
