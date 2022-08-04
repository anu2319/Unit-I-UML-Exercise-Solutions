public class Riddle
{
    private String question;
    private String answer;

    public Riddle(String question, String answer)
    {
        this.question = question;
        this.answer = answer;
    }

    public void getRiddle()
    {
        System.out.println("Question : " + question);
        System.out.println("Answer : "  + answer);
    }

    public static void main(String[] args)
    {
        Riddle riddle = new Riddle("What is your name","Anusuya");
        riddle.getRiddle();
    }
}
