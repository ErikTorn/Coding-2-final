/**
    * Loading
    *
    * This program is the animation class for the Dad-Joke Generator
    * 
    * Erik Tornquist
    * Jared Skilowitz
    * 
    * 6-17-19
    * 
    * Revisions:
    *   6-17-19
    *       Version 1.0
    *           Initial Release
    * Notes:
**/
import java.util.Random; 

public class Loading
{
    // The frames per second
    public int delay;
    
    // Some mini-jokes to put when it's loading
    public String[] miniJokes = {
        "There is no punchline.", "Welcome to Spanish class!",
        "Vacuum jokes suck.", "7 8 9"
    };
    
    // Constructor
    public Loading(int delay)
    {
        this.delay = delay;
    }
    
    // Load the animation with a mini-joke
    public void load()
    {
        // Set up random
        Random rand = new Random(); 
        
        // Set random int
        int jokeNum = rand.nextInt(4); 
        
        // Start animation with the random joke
        doAnimation(miniJokes[jokeNum]);
    }
    
    // Wait before continuing 
    public void delay()
    {
        // I don't really know why we need this, only that we need it
        try 
        {
            // Wait
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