/*
    Name: Justin Chhay
    Start Date: December 14, 2019
    Teacher: Mr. Afsari-Nejad
    Description: Program will determine how many times a specific substring occurs
		 within a larger string (case-sensitive). A integer return method
		 called numFullWords will be used to process the input and return
		 the answer. This is a program that uses graohics in the hsa.Console
		 window and uses JOptionPane to error trap and ask for input. Please
		 read the important message in the multi-line comment after!

		 **THIS IS FOR ICS3U #17 ASSIGNMENT**

*/

/*
    PLEASE READ THIS (IMPORTANT):
    ****************************************************************
    I have found one flaw in the Assignment #17 rubric which REQUIRES me to use .equals. However, I am NOT using it to calculate
    anything. I ONLY need it for the error trap, which is if the user doesn't enter ANYTHING for the findSubstring variable.
    This is because you cannot refer to a character in a String as "null" or empty. Therefore, I am ONLY uaing the .equals for the error trap.

*/


// The "StringReturn17_JustinChhay" class.
import java.awt.*;
import hsa.Console;
import javax.swing.*; //Allows for JOptionPane usage

public class StringReturn17_JustinChhay
{
    Console c;           // The output console
    
    //Global/Instance Variables
    String option;                          //Store string for user to choose options in menu
    String mainStr;                         //Store main string, input by user.
    String findSubstring;                   //Store string to find in main string, input by user.
    boolean pAskData, pDisplay = false;     //Allows user to pause and return to previous program.
    int timesFound = 0;                     //Needed to store answer in askData and access in display methods

    //Instance/Class GRAPHICS Variables
    Color background = new Color (50);             //Color - variable for background
    Font title = new Font ("MonoSpaced", Font.BOLD, 36);    //Font - Variable for title
    Font method = new Font ("MonoSpaced", Font.BOLD, 30);   //Font - Variable for method indicator text
    Font text = new Font ("MonoSpaced", Font.BOLD, 20);     //Font - Variable for general text

    //Return Method - Calculates how many times specified substring appears in main String and returns an int for the number of times it does.
    private int numFullWords (String mainStr, String findSubstring)
    {
	int timesFound = 0;//Variable which stores answer
	
	//For Loop - Will run from the first index to last index of main string
	for (int i = 0 ; i <= mainStr.length () - findSubstring.length () ; i++)
	{
	    boolean isMatch = true; //If letter matches, boolean variable set to true
	    
	    //For Loop - Will keep checking if the letters of substring is found in main string
	    for (int j = i ; j < i + findSubstring.length () ; j++)
	    {
		//If Structure - If the next letters after the first are not the same as the substring
		if (mainStr.charAt (j) != findSubstring.charAt (j - i))
		    isMatch = false; //if letters are not same, isMatch is false and won't run the below if structure after this nested for loop
	    }
	    
	    //If it passes the nested for loop above, one instance of the substring has been found and it's counted towards timesFound
	    
	    //If Structure - If isMatch is TRUE, adds one to timesFound
	    if (isMatch)
		timesFound++;
	}
	
	//Returns answer (how many times substring appears in main string)
	return timesFound;
    }


    //Title Method - Draws graphical program title and background
    public void title ()
    {
	//Clear Graphics on Screen
	c.clear ();

	//Program Background
	c.setColor (background);
	c.fillRect (0, 0, 640, 500);

	//Program Title
	c.setFont (title);
	c.setColor (Color.yellow);
	c.fillRoundRect (75, 30, 490, 50, 25, 25);
	c.setColor (Color.black);
	c.drawString ("SUBSTRING DETECTOR", 120, 65);

	//Program Credits
	c.setFont (new Font ("SansSerif", Font.BOLD, 14));
	c.setColor (Color.white);
	c.drawString ("programmed by Justin Chhay", 25, 480);
    }


    //SplashScreen Method - Animated introduction to program
    public void splashScreen ()
    {
	//Program Background
	c.setColor (background);
	c.fillRect (0, 0, 640, 500);

	//WORDS DESIGN ON SPLASHSCREEN (not the animation)
	c.setColor (Color.white);
	c.setFont (title);
	c.drawString ("WHILE TEST COMPUTER MOVIE DRAMA EVEN", -35, 10);
	c.drawString ("PUPPETS RECURSION CREATIVE FILM POSITIVE", -35, 60);
	c.drawString ("HELLO SUB MONEY OFFICE WORD POWER FANTASY", -35, 110);
	c.drawString ("NAME VIDEO STRING FUN EXIST LIVE GROUND ", -35, 160);
	c.drawString ("SENTENCE DOG DETECTOR FONT VARIABLE SWAB", -35, 210);
	c.drawString ("LOOPS SCARY ORIGINAL ICS3U COFFEE ERROR", -35, 260);
	c.drawString ("THINK KNOWLEDGE DUE:18.12.2019 MEMES ", -35, 310);
	c.drawString ("ANIME BY TREE VIBE CHECK FANTASY GOOD", -35, 360);
	c.drawString ("MYSTIC JUSTIN SPLIT ANIME TRAIN ROYALE", -35, 410);
	c.drawString ("FIBER CHHAY GLOBE AFSARI-NEJAD", -35, 460);
	c.drawString ("PROGRAMMING TECHNOLOGY WATCH DRINK", -35, 510);


	//Animation (whtie rectangles cover up words to reveal program assignment details
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.fillRect (0 + x, 0, 1, 30);
	    c.fillRect (639 - x, 30, 1, 40);
	    c.fillRect (-580 + x, 60, 30, 65);
	    c.fillRect (815 - x, 60, 30, 65);
	    c.fillRect (-450 + x, 120, 1, 60);
	    c.fillRect (1000 - x, 115, 80, 65);
	    c.fillRect (-420 + x, 175, 20, 65);
	    c.fillRect (1085 - x, 175, 30, 50);
	    c.fillRect (-250 + x, 220, 30, 50);
	    c.fillRect (1190 - x, 220, 30, 50);
	    c.fillRect (-360 + x, 270, 30, 50);
	    c.fillRect (800 - x, 315, 30, 60);
	    c.fillRect (-590 + x, 320, 30, 50);
	    c.fillRect (-590 + x, 370, 50, 50);
	    c.fillRect (900 - x, 370, 30, 50);
	    c.fillRect (-590 + x, 420, 30, 50);
	    c.fillRect (0 + x, 470, 1, 30);
	    c.fillRect (220, 1055 - x, 130, 1);

	    //Needed to animate (slows down positioning by 2 ms per 1 run of the forloop )
	    try
	    {
		Thread.sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}

	//Confirmation for user to advance to main menu
	JOptionPane.showMessageDialog (null, "Click OK to advance.");
	mainMenu ();
    }


    //MainMenu Method - Allows user to choose between options and direct program
    public void mainMenu ()
    {
	title (); //Clears screen and draws new title and background

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("MAIN MENU", 400, 480);

	//Text - Program Options
	c.setFont (title);
	c.setColor (Color.white);
	c.drawString ("1) START", 200, 170);
	c.drawString ("2) INSTRUCTIONS", 130, 220);
	c.drawString ("Any OTHER key to exit.", 80, 300);

	//Try Catch Loop - ErrorTrap FOR OPTION
	try
	{
	    //JOptionPane - Asks for user input on which method to run OR to call goodbye();
	    option = JOptionPane.showInputDialog (null, "CHOOSE OPTION:\n  1) Start\n  2) Instructions\n Enter ANY OTHER key to EXIT...");

	    //If Structure - Depending on user input, it will run the appropriate method to direct program flow
	    if (option.equals ("1"))
		askData (); //Run askData(); if user chooses an option
	    else if (option.equals ("2"))
		instructions ();
	    else
		goodbye (); //Run goodbye(); if user chooses ANY OTHER key (to exit)
	}
	catch (Exception e)
	{
	    //Error Trap - If user closes or cancels input, will call mainMenu method again
	    JOptionPane.showMessageDialog (null, "Invalid Input!\nPlease enter a number to choose an option.");
	    mainMenu ();
	}
    }


    //AskData Method - Asks user for 2 strings as input for return method parameters
    private void askData ()
    {
	title (); //Clears screen and draws new title and background
	c.setColor (Color.white);

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("ASK DATA", 400, 480);

	//JOptionPane - Asks if user wants to pause program
	int paused = JOptionPane.showConfirmDialog (null, "Would you like to PAUSE the program?");

	//If Structure - Will run pauseProgram(); or continue with askData(); depending on previous user input
	if (paused == JOptionPane.OK_OPTION)
	{
	    pAskData = true;  //Ensures that user returns back to ask data method
	    pauseProgram ();
	}
	else
	{
	    //Try-Catch - Error Trap in case user closes window (ensures program won't stop)
	    try
	    {
		//Draws prompt to screen for main string
		c.drawString ("Please enter the main string: ", 30, 150);
		mainStr = JOptionPane.showInputDialog (null, "Please enter the larger main string:");

		//Error Trap - Ensures user won't leave the following variable blank (mainStr)
		if (mainStr.equals (""))
		{
		    JOptionPane.showMessageDialog (null, "Invalid Input! Please do not leave it blank!");
		    askData ();
		}

		//Draws prompt to screen for substring
		c.drawString ("Please enter the substring: ", 30, 250);
		findSubstring = JOptionPane.showInputDialog (null, "Please enter the substring to find:");

		//Error Trap - Ensures user won't leave the following variable blank (findSubstring)
		if (findSubstring.equals (""))
		{
		    JOptionPane.showMessageDialog (null, "Invalid Input! Please do not leave it blank!");
		    askData ();
		}

	    }
	    catch (Exception e)
	    {
		JOptionPane.showMessageDialog (null, "Invalid Input!\nPlease enter a string!");
		askData (); //will run askData again if user closes JOptionPane window (part of error trap)
	    }

	    //Displays user's input for both variables onto screen
	    c.setFont (text);
	    c.drawString (mainStr + "", 50, 180);
	    c.drawString (findSubstring + "", 50, 280);
	}

	//JOptionPane - Needed so that the program allows user to stop and view output
	JOptionPane.showMessageDialog (null, "Click OK to ADVANCE.");
	display ();
    }


    //Display Method - Displays answer and allows user to return to main menu
    public void display ()
    {
	title (); //Clears screen and draws new title and background
	c.setColor (Color.white);

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("DISPLAY", 400, 480);

	//JOptionPane - Asks if user wants to pause program
	int paused = JOptionPane.showConfirmDialog (null, "Would you like to PAUSE the program?");

	//If Structure - Will run pauseProgram(); or continue with display(); depending on previous user input
	if (paused == JOptionPane.OK_OPTION)
	{
	    pDisplay = true;  //Ensures that user returns back to display method
	    pauseProgram ();
	}
	else
	{
	    //Call return method and use user input from askData for parameter data
	    timesFound = numFullWords (mainStr, findSubstring);

	    //Draws answers and inputs to display method output screen
	    c.setFont (text);
	    c.drawString ("In your main string which was:", 30, 120);
	    c.drawString (mainStr + "", 40, 150);
	    c.drawString ("We found your substring which was:", 30, 200);
	    c.drawString (findSubstring + "", 40, 230);
	    c.drawString ("Total Times Found: " + timesFound + "!", 30, 300);
	}

	//JOptionPane - Needed so that the program allows user to stop and view output
	JOptionPane.showMessageDialog (null, "Click OK to RETURN to MAIN MENU.");
	mainMenu ();
    }


    //PauseProgram Method - Pauses program, then returns user to previous method paused form
    public void pauseProgram ()
    {
	title (); //Clears screen and draws new title and background
	c.setColor (Color.white);

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("PAUSE PROGRAM", 400, 480);

	//Pause Statement
	c.setFont (text);
	c.drawString ("PROGRAM PAUSED", 225, 180);

	String prevMethod = ""; //Declares local variable. allows us to display previous method in pauseProgram

	//If Structure - Needed to remind user which method they came from
	if (pAskData == true)
	{
	    prevMethod = "ASK DATA";
	}
	else if (pDisplay == true)
	{
	    prevMethod = "DISPLAY";
	}

	//JOptionPane - Needed so that the program allows user to stop and view output
	JOptionPane.showMessageDialog (null, "Click OK to RETURN to " + prevMethod + " method.");

	//If structure waits for user to confirm resume
	if (pAskData == true)
	{
	    pAskData = false;  //Ensures that user returns back to askData method
	    askData ();        //Runs previous method (askData)
	}
	else if (pDisplay == true)
	{
	    pDisplay = false;  //Ensures that user returns back to display method
	    display ();        //Runs previous method (display)
	}
    }


    //Instructions Method - Lists instructions for program use
    public void instructions ()
    {
	title (); //Clears screen and draws new title and background
	c.setColor (Color.white);

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("INSTRUCTIONS", 400, 480);

	//Explanation and Instructions on how to use my program
	c.setFont (text);
	c.drawString ("This program will count the number of times", 30, 120);
	c.drawString ("a user-inputted substring appears inside a", 30, 140);
	c.drawString ("larger main string, also input by the user:", 30, 160);
	c.drawString ("Step 1) Input a key in the main menu to", 45, 210);
	c.drawString ("        choose an option.", 45, 230);
	c.drawString ("Step 2) First, enter a main string to read.", 45, 260);
	c.drawString ("Step 3) Next, enter a substring to find inside", 45, 290);
	c.drawString ("        the previously-inputted larger string.", 45, 310);
	c.drawString ("Step 3) Lastly, the display method prints the", 45, 340);
	c.drawString ("        answer of how many times it appears.", 45, 360);
	c.drawString ("You will then return back to the main menu, where", 35, 400);
	c.drawString ("you can repeat the program or exit it.", 35, 420);

	//Waits for confirmation to return to mainMenu();
	JOptionPane.showMessageDialog (null, "Click OK to return to main menu.");
	mainMenu ();
    }


    //Goodbye Method - Credits and exits program
    public void goodbye ()
    {
	title (); //Clears screen and draws new title and background
	c.setColor (Color.white);

	//Indicates which Method the user is on
	c.setFont (method);
	c.drawString ("GOODBYE", 400, 480);

	//Credits and Goodbye Statements
	c.setFont (text);
	c.drawString ("Thanks for using my program.", 140, 180);
	c.drawString ("Due Date: 18.12.2019", 190, 250);
	c.drawString ("Teacher: Mr.Afsari-Nejad", 190, 275);
	c.drawString ("Course Code: ICS3U", 190, 300);
	c.drawString ("Student: Justin Chhay", 190, 325);

	//Confirmation before exiting program
	JOptionPane.showMessageDialog (null, "Thanks for using my program. OK to exit.");
	System.exit (0);
    }



    //Class Constructor - needed to replace static Console c
    public StringReturn17_JustinChhay ()
    {
	c = new Console ("Substring Detector - by Justin Chhay  ");
    }


    //Main Method - Executes STARTING method
    public static void main (String[] args)
    {
	//Creates object of class for reference
	StringReturn17_JustinChhay x;
	x = new StringReturn17_JustinChhay ();

	//Starts program off with splash screen, program flow is directed later on inside void methods
	x.splashScreen ();
    }
} // StringReturn17_JustinChhay class
