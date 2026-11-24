package labgrade;

/**
 *
 * @author ELORCHA_CPE113
 */
public class LabGrade {

    private String studentName;
    private int quizScore;
    private int labScore;

    public LabGrade(String studentName, int quizScore, int labScore) {
        this.studentName = studentName;

        //validate quiz score
        if (quizScore >= 0 && quizScore <= 100) {
            this.quizScore = quizScore;
        } else {
            this.quizScore = 0;
        }

        // validate lab score
        if (labScore >= 0 && labScore <= 100) {
            this.labScore = labScore;
        } else {
            this.labScore = 0;
        }
    }

    //
    boolean updateScores(int quizScore, int labScore) {

        //validate both scores before updating
        if (quizScore < 0 || quizScore > 100 || labScore < 0 || labScore > 100) {
            return false;
        }

        this.quizScore = quizScore;
        this.labScore = labScore;

        return true;
    }

    double getFinalGrade() {
        return (this.quizScore * 0.40) + (this.labScore * 0.60);
    }

    //check passing
    boolean isPassing() {
        return getFinalGrade() >= 75.0;
    }

    //
    public String getStudentName() {
        return this.studentName;
    }
}
