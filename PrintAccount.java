package printaccount;

/**
 *
 * @author ELORCHA_CPE113
 */
public class PrintAccount {

    private String studentName;
    private int credits;

    public PrintAccount(String studentName, int credits) {
        this.studentName = studentName;

        if (credits < 0) {
            this.credits = 0;
        } else {
            this.credits = credits;
        }
    }

    boolean addCredits(int amount) {
        if (amount <= 0) {
            return false;
        }
        this.credits += amount;
        return true;
    }

    boolean printPages(int pages) {
        if (pages <= 0 || pages > this.credits) {
            return false;
        }

        this.credits -= pages;
        return true;
    }

    int getCredits() {
        return this.credits;
    }

    public String getStudentName() {
        return this.studentName;

    }
}
