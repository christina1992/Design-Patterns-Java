/**
 * Created by hnastevska on 8/15/2016.
 */
public class OnlineExam extends ExamTemplate {

    @Override
    public void takeExam() {
        System.out.println("Taking the online exam on a computer");
    }

    @Override
    public void checkAnswers() {
        System.out.println("Before submitting the answers you check them again");
    }

    @Override
    public void submitAnswers() {
        System.out.println("Finally you submit the answers to the online exam");
    }
}
