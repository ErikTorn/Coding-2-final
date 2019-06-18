/**
    * Joke;
    *
    * This program is the joke Generator class for the Dad-Joke Generator
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
import java.util.ArrayList;

public class Joke
{
    // This array holds the starting jokes
    public String[] jokes = {
        "Today, my son asked ‘Can I have a book mark?’ and I burst into tears.",
        "My wife is really mad at the fact that I have no sense of direction.", 
        "How do you make holy water?", "I bought some shoes from a drug dealer.", 
        "Did you know the first French fries weren't actually cooked in France?", 
        "If a child refuses to sleep during nap time,", 
        "The secret service isn't allowed to yell ‘Get down!’ anymore when the president is about to be attacked.",
        "I'm reading a book about anti-gravity.", "What do you call someone with no body and no nose?", 
        "What is the least spoken language in the world?",
        "My daughter screeched, ‘Daaaaaad, you haven't listened to one word I've said, have you!?’",
        "A slice of apple pie is $2.50 in Jamaica and $3.00 in the Bahamas.", 
        "My wife tried to unlatch our daughter's car seat with one hand and said, ‘How do one armed mothers do it?’",
        "When a dad drives past a graveyard: Did you know that's a popular cemetery?", 
        "My friend keeps saying ‘cheer up man it could be worse, you could be stuck underground in a hole full of water.’", 
        "Justice is a dish best served cold,", "The fattest knight at King Arthur’s round table was Sir Cumference.",
        "MOM: ‘How do I look?’", "Why can't you hear a pterodactyl go to the bathroom?",
        "What does a zombie vegetarian eat?", "Spring is here!", "Did you hear the news? FedEx and UPS are merging.", 
        "Don't trust atoms."
        };
    
    // This arraylist holds the remaining jokes
    public ArrayList<String> jokeList = new ArrayList<String>();
    
    // This array holds the starting secondary parts of the joke
    public String[] answers = {
        "11 years old and he still doesn't know my name is Brian.",
        "So I packed up my stuff and right.", "You boil the hell out of it.",
        "I don't know what he laced them with, but I was tripping all day!", 
        "They were cooked in Greece.", "are they guilty of resisting a rest?",
        "Now they have to yell ‘Donald, duck!’", "It's impossible to put down!", 
        "Nobody knows.", "Sign language.", "What a strange way to start a conversation with me…",
        "These are the pie rates of the Caribbean.", 
        "Without missing a beat I replied, ‘Single handedly.’", 
        "Yep, people are just dying to get in there!", "I know he means well.", 
        "if it were served warm it would be justwater.", "He acquired his size from too much pi.",
        "DAD: ‘With your eyes.’", "Because the pee is silent.", "‘GRRRAAAAAIIIINNNNS!’",
        "I got so excited I wet my plants!", "They’re going to go by the name Fed-Up from now on.", 
        "They make up everything!"
        };
        
    // This arraylist holds the remaining secondary parts of the joke
    public ArrayList<String> answerList = new ArrayList<String>();
    
    // This is the delay between the first and second parts of the joke
    public static final int delay = 800;
    
    // This is the constructor 
    public Joke()
    {
        // Set the remianing jokes to the starting jokes
        for (int i = 0; i< jokes.length; i++)
        {
            jokeList.add(jokes[i]);
            answerList.add(answers[i]);
        }
    }
    
    // Print out a joke
    public void getJoke()
    {
        // Set up random
        Random rand = new Random(); 
        
        //
        if (jokeList.size() == 0)
        {
            System.out.println("Looks like we ran out of jokes!");
        }
        else
        {
            int jokeNum = rand.nextInt(jokeList.size());
            System.out.println(jokeList.get(jokeNum));
            delay();
            System.out.println(answerList.get(jokeNum));
            jokeList.remove(jokeNum);
            answerList.remove(jokeNum);
        }
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
}