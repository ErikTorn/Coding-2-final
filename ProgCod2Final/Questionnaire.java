/**
    * Questionnaire;
    *
    * This program is the controlling class for the Dad-Joke Generator
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
import java.util.Scanner;

public class Questionnaire
{
    // Set up the Joke class
    public Joke joke = new Joke();
    
    // Set up the animation class Loading
    public Loading load = new Loading(200);
    
    // Set up the scanner
    public Scanner scanner = new Scanner(System.in);
    
    // This will be used to play the animations
    public int i = 0;
    
    // Constructor
    public Questionnaire()
    {
        // Have user set up their screen size
        System.out.println("To see all jokes make sure you can see the whole line below");
        System.out.println("|--------------------------------------------------------------------------------------------------------------|");
        System.out.print("Press enter to continue:");
        String should = scanner.nextLine();
        
        // Start the jokes
        Start();
    }
    
    // Run the code for the jokes
    public void Start()
    {
        // Ask user if they would like to see a joke
        System.out.print("Would you like a joke? (y/n): ");
        String should = scanner.nextLine();
        if (should.equals("y"))
        {
            // Print a joke
            GetJoke();
        }
        else
        {
            // Say goodbye
            System.out.println("Why did you open this then?");
            System.out.println("Fine, whatever.");
        }
    }
    
    // Print a joke
    public void GetJoke()
    {
        // Add one to i
        i++;
        
        // Get a joke
        joke.getJoke();
        
        // Ask user if they want another joke
        checkContinue();
    }
    
    // Ask user if they want another joke
    public void checkContinue()
    {
        System.out.print("Would you like another joke? (y/n): ");
        String should = scanner.nextLine();
        if (should.equals("y"))
        {
            // Check if user has requested 5 jokes
            if (i == 5)
            {
                // Play animation
                load.load();
                i = 0;
            }
            // Print a joke
            GetJoke();
        }
        else
        {
            // Say goodbye
            end();
        }
    }
    
    public void end()
    {
        // Say goodbye
        System.out.println("Have fun with your new dad jokes.");
    }
}
