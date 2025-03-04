import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    public QuestionService(){
        questions[0] = new Question(1, "When was Java released?", "1990", "1991", "1995","1996", "1995");
        questions[1] = new Question(2,"Size of int?","1", "2" , "4", "8","4");
        questions[2] = new Question(3,"Size of double?","1", "2" , "4", "8","8");
        questions[3] = new Question(4,"Size of float?","1", "2" , "4", "8","4");
        questions[4] = new Question(5,"Size of char?","1", "2" , "4", "8","1");
    }
    public void playQuiz(){
        int i = 0;
        for(Question q: questions){
            System.out.print("Q."+q.getId()+": ");
            System.out.println(q.getQuestion());
            System.out.println("(a): "+q.getOpt1()+"        (b): "+q.getOpt2());
            System.out.println("(c): "+q.getOpt3()+"        (d): "+q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
//        for(String s : selection){
//            System.out.println(s);
//        }
    }
    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("Your Score is : "+score+"/5");
    }
}

