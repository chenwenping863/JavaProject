
/**
 * Created by chenwenping on 17/3/4.
 */
public class ChenWenTestMain {

    public static void  main(String arg[]) {
        //sixth questions
        SixthQuestions sixthQuestions = new SixthQuestions();
        sixthQuestions.dfs("C", "C", 3);

        //seventh questions
        SeventhQuestions seventhQuestions = new SeventhQuestions();
        seventhQuestions.bfs("A", "C", 4);

        //eighth and ninth questions
        EighthAndNinthQuestions eighthAndNinthQuestions = new EighthAndNinthQuestions();
        eighthAndNinthQuestions.dfs("C", "A", 0);
        eighthAndNinthQuestions.dfs("B", "B", 0);

        //tenth questions
        TenthQuestions tenthQuestions = new TenthQuestions();
        tenthQuestions.dfs("C", "C", 0);
    }

}
