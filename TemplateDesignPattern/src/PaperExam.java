/**
 * Created by hnastevska on 8/15/2016.
 */
public class PaperExam extends ExamTemplate {
    @Override
    public void takeExam() {
        System.out.println("Writing the answers of the exam on the paper");
    }

    @Override
    public void checkAnswers() {
        System.out.println("Before you give the exam, you check the answers again");
    }

    @Override
    public void submitAnswers() {
        System.out.println("Finally you give the paper to the person responsible");
    }
}
