/**
 * Created by hnastevska on 8/15/2016.
 */
public class TemplateMethodPatternClient {
    public static void main(String... args) {
        System.out.println("Online Exam Instance.....");

        ExamTemplate onlineExam = new OnlineExam();
        onlineExam.takingExamProcess();

        System.out.println("Paper Exam Instance");

        ExamTemplate paperExam = new PaperExam();
        paperExam.takingExamProcess();


    }
}
