/**
 * Created by hnastevska on 8/15/2016.
 */
public abstract class ExamTemplate {
    //Taking the Exam
    public abstract void takeExam();

    //Double check the answers you wrote
    public abstract void checkAnswers();

    //Submitting the answers
    public abstract void submitAnswers();

    public final void takingExamProcess() {
        takeExam();
        checkAnswers();
        submitAnswers();
    }

}
