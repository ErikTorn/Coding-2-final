import java.util.Random; 

public class Loading
{
    public int delay;
    
    public String[] miniJokes = {
        "There is no punchline.", "Welcome to Spanish class!",
        "Vacuum jokes suck.", "7 8 9"
    };
    
    public Loading(int delay)
    {
        this.delay = delay;
    }
    
    public void load()
    {
        Random rand = new Random(); 
        int jokeNum = rand.nextInt(4); 
        doAnimation(miniJokes[jokeNum]);
    }
    
    public void delay()
    {
        try 
        {
            Thread.sleep(delay);
        }
        catch (InterruptedException ex)
        {
            
        }
    }
    
    public void printSpacer(int num)
    {
        for (int i = 0; i < num; i++)
        {
            System.out.println();
        }
    }
    
    public void doAnimation(String joke)
    {
        for (int i = 0; i < 8; i++)
        {
            System.out.println("Loading");
            System.out.println("Mini-Joke: " + joke);
            System.out.println("˚**");
            delay();
            printSpacer(37);
            System.out.println("Loading");
            System.out.println("Mini-Joke: " + joke);
            System.out.println("*˚*");
            delay();
            printSpacer(37);
            System.out.println("Mini-Joke: " + joke);
            System.out.println("**˚");
            delay();
            printSpacer(37);
        }
    }
}
