/**
 * Author: Lakshmi Pachipulusu
 * Date: 03/04/22
 * 
 * ---------------------------------------------------------------------------------------------------------
 * 
 * What is this program all about?
 *      I wanted to create a program that you can communicate to when you are frustrated. Just like talking tom, talking angela, 
 *      talking ben and people like that. I wanted to create another original character just like that but with a little bit of 
 *      different functions!
 * 
 * How is this program going to work?
 *      I want to make a simple program where the bear is going to interact with the user, it is a very simple game and it mainly
 *      focused for younger kids. 
 * 
 *      I am going to make some actions, things that the bear and the user can interact with and just have a fun time with. 
 *      It is kind of like a stress reliever program where you can just pour out all your anger into this program. It is 
 *      kinda made for stress relief. 
 * 
 *      Some functions that it is going to have are, eating, dancing, sleeping, do an activity, make a call, interact with 
 *      the user, drinking something, and commanding it. 
 * 
 *      The interface is going to be very simple, it will starting give you some input commands that the user can use and based
 *      on what they enter into the terminal the bear is going to respond accordingly. 
 * 
 * Code Hierarchy:
 *      
 * 
 * Expected Output:
 * 
 * Comments After:
 * 
 * 
*/

// Import Statements
import java.util.*;
import java.util.Random;

public class TalkingBear {

    private static Scanner console = new Scanner(System.in);
    private Random r = new Random();
    private static String name;

    public static void main(String[] args) {
        intro();
        greetings();
    }

    private static void intro() {
        
    }

    private static void greetings() {
        System.out.printf("Hello there, my name is Bear!");
        System.out.print("What is your name?");
        name = console.next();
        System.out.println();
    }
}
