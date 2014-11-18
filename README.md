AndroidSimpleGame_RockPaperScissors
===================================

<b><i>A simple Rock, Paper Scissors application where the user is against the computer</i></b>

 The application will contain 3 different activities

<b>MainScreen:</b>

   1. Contain one button and one imageview 
   2. Button 1 “Begin Game” will load the SelectorActivity to the screen

<b>ContactChooserActivity:</b>

   1. Will contain a list. The list will be populated with the choices “Rock”, “Paper”, “Scissors”
   2. When a list item is clicked, the GameActivity should be loaded
   3. The choice of the user will be passed to the next activity
   
<b>GameActivity:</b>

This activity will have two text fields and two buttons
   
   1. Textfield 1 – will display the choice of the application. Example: “The computer has chosen rock”. Use a randomly generated number from 1 – 3 to randomly select the choice of the user. Display this text when the user selects the Go button.
   2. Textfield 2 – will display the result (if you win or lose).
   3. Button 1 – Go button. Generate a randomly generated number and display the computers choice in textfield 1.
   4. Button 2 – Load the MainScreen Activity 
