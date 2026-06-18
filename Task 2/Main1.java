
class Main1 {
    int[] scores = {85, 90, 95};

    void printFirstScore() {
        System.out.println("First Score: " + scores[0]);
    }
}

public class ContestStats {
    public static void main(String[] args) {
        Main1 contest = new Main1();
        contest.printFirstScore();
    }
}
