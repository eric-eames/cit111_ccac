/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinosaur;
import java.util.Scanner;
/**
 *
 * @author eric.eames
 */
public class DinosaurLand {
    public static void main(String[] args){
        Scanner userInputScanner = new Scanner(System.in);
        //boolean for the while system the entire program runs in
        boolean pickDino = true;
     //Weight in pounds
     //Height in inches
     
     //Dinos listed here
     //Therozinosaur
    Dinosaur therozinosaur = new Dinosaur();
    therozinosaur.name = "Therozinosaur";
    therozinosaur.weight = 2205;
    therozinosaur.aquatic = false;
    therozinosaur.canFly = false;
    therozinosaur.food = "Berries";
    therozinosaur.feathers = true;
    therozinosaur.height = 98;
    
    //Dimorphadon
    Dinosaur dimorphadon = new Dinosaur();
    dimorphadon.name = "Dimorphadon";
    dimorphadon.weight = 5;
    dimorphadon.aquatic = false;
    dimorphadon.canFly = true;
    dimorphadon.food = "Meat";
    dimorphadon.feathers = false;
    dimorphadon.height = 40;
    
    //Quetzal
    Dinosaur quetzal = new Dinosaur();
    quetzal.name = "Qeutzal";
    quetzal.weight = 495;
    quetzal.aquatic = false;
    quetzal.canFly = true;
    quetzal.food = "Meat";
    quetzal.feathers = false;
    quetzal.height = 118;
    
    //Mosasaurus
    Dinosaur mosasaurus = new Dinosaur();
    mosasaurus.name = "Mosasaurus";
    mosasaurus.weight = 30000;
    mosasaurus.aquatic = true;
    mosasaurus.canFly = false;
    mosasaurus.food = "Meat";
    mosasaurus.feathers = false;
    mosasaurus.height = 600;
    
    //Plesiosaur
    Dinosaur plesiosaur = new Dinosaur();
    plesiosaur.name = "Plesiosaur";
    plesiosaur.weight = 330000;
    plesiosaur.aquatic = true;
    plesiosaur.canFly = false;
    plesiosaur.food = "Meat";
    plesiosaur.feathers = false;
    plesiosaur.height = 672;
    
    //Make your own Dino   
    Dinosaur myDino = new Dinosaur();
    //Aquatic set to false eitherwise it would crash if you do attack village
    // since Aquatic is null, neither true or false until defined
    myDino.aquatic = false;
    
    //Main Menu
    while (pickDino == true){
        System.out.println("*******************************************");
        System.out.println("Pick a Dino!");
        System.out.println("1 - Therozinosaur");
        System.out.println("2 - Dimorphadon");
        System.out.println("3 - Qeutzal");
        System.out.println("4 - Mosasaur");
        System.out.println("5 - Plesiosaur");
        System.out.println("6 - My Dino");
        System.out.println("7 - Make a Dino");
        System.out.println("8 - Exit Program");
        int choice = userInputScanner.nextInt();
        switch(choice){
            
            //Therozinosaur Menu
            case 1:
                System.out.println("You've picked Therozinosaur!");
                boolean therozinosaurLoop = true;
                while (therozinosaurLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Therozinosaur?");
                    System.out.println("1 - Feed Therozinosaur");
                    System.out.println("2 - Attack Village");
                    System.out.println("3 - Display Therozinosaur Stats");
                    System.out.println("4 - Go Back to Previous Page"); 
                    System.out.println("5 - Exit Program");
                    int therozinosaurChoice = userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                        if(therozinosaurChoice == 1){
                            therozinosaur.feed();
                        }else if(therozinosaurChoice == 2){
                            therozinosaur.attackTown();
                        }else if(therozinosaurChoice == 3){
                            displayDinoStats(therozinosaur);
                        }else if(therozinosaurChoice == 4){
                            break;
                        }else if(therozinosaurChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("Sorry, I couldn't understand that! Please try again");
                        }
                    
                }
            break;
            
            //Dimorphadon Menu
            case 2:
                System.out.println("You've picked Dimorphadon!");
                boolean dimorphadonLoop = true;
                while (dimorphadonLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Dimorphadon?");
                    System.out.println("1 - Feed Dimorphadon");
                    System.out.println("2 - Attack Village");
                    System.out.println("3 - Display Dimorphadon Stats");
                    System.out.println("4 - Go Back to Previous Page");
                    System.out.println("5 - Exit Program");
                    int dimorphadonChoice= userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                        if(dimorphadonChoice == 1){
                            dimorphadon.feed();
                        }else if(dimorphadonChoice == 2){
                            dimorphadon.attackTown();
                        }else if(dimorphadonChoice == 3){
                            displayDinoStats(dimorphadon);
                        }else if(dimorphadonChoice== 4){
                            break;
                        }else if(dimorphadonChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("That language isn't acceptable! Or it might be. I don't know what you said... Try again please");
                        }
                    
                }
            break;
            
            //Quetzal Menu
            case 3:
                System.out.println("You've picked Quetzal!");
                boolean quetzalLoop = true;
                while (quetzalLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Quetzal?");
                    System.out.println("1 - Feed Quetzal");
                    System.out.println("2 - Attack Village");
                    System.out.println("3 - Display Quetzal Stats");
                    System.out.println("4 - Go Back to Previous Page");
                    System.out.println("5 - Exit Program");
                    int quetzalChoice = userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                        if(quetzalChoice == 1){
                            quetzal.feed();
                        }else if(quetzalChoice == 2){
                            quetzal.attackTown();
                        }else if(quetzalChoice == 3){
                            displayDinoStats(quetzal);
                        }else if(quetzalChoice== 4){
                            break;
                        }else if(quetzalChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("That language isn't acceptable! Or it might be. I don't know what you said... Try again please");
                        }
                    
                }
            break;
            
            //Mosasaurus Menu
            case 4:
                System.out.println("You've picked Mosasaurus!");
                boolean mosasaurusLoop = true;
                while (mosasaurusLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Mosasuarus?");
                    System.out.println("1 - Feed Mosasaurus");
                    System.out.println("2 - Attack Atlantis");
                    System.out.println("3 - Display Mosasaurus Stats");
                    System.out.println("4 - Go Back to Previous Page");
                    System.out.println("5 - Exit Program");
                    int mosasaurusChoice = userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                        if(mosasaurusChoice == 1){
                            mosasaurus.feed();
                        }else if(mosasaurusChoice == 2){
                            mosasaurus.attackAtlantis();
                        }else if(mosasaurusChoice == 3){
                            displayDinoStats(quetzal);
                        }else if(mosasaurusChoice== 4){
                            break;
                        }else if(mosasaurusChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("Hey! I didn't understand that! You better try again!");
                        }
                    
                }
            break;
            
            //Plesiosaur Menu
            case 5:
                System.out.println("You've picked Plesiosaur!");
                boolean plesiosaurLoop = true;
                while (plesiosaurLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Plesiosaur?");
                    System.out.println("1 - Feed Plesiosaur");
                    System.out.println("2 - Attack Atlantis");
                    System.out.println("3 - Display Plesiosaur Stats");
                    System.out.println("4 - Go Back to Previous Page");
                    System.out.println("5 - Exit Program");
                    int plesiosaurChoice = userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                        if(plesiosaurChoice == 1){
                            plesiosaur.feed();
                        }else if(plesiosaurChoice == 2){
                            plesiosaur.attackAtlantis();
                        }else if(plesiosaurChoice == 3){
                            displayDinoStats(quetzal);
                        }else if(plesiosaurChoice== 4){
                            break;
                        }else if(plesiosaurChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("Hey! I didn't understand that! You better try again!");
                        }
                    
                } 
            break;
            
            //My Dino actions
            case 6:
                System.out.println("You've picked My Dino!");
                boolean myDinoLoop = true;
                while (myDinoLoop = true){
                    System.out.println("*******************************************");
                    System.out.println("What would you like to do with Your Dino?");
                    System.out.println("1 - Feed My Dino");
                    System.out.println("2 - Attack Village/Atlantis");
                    System.out.println("3 - Get My Dino's Stats");
                    System.out.println("4 - Go Back to Previous Page");
                    System.out.println("5 - Exit Program");
                    int myDinoChoice= userInputScanner.nextInt();
                    //if/else embedded in switch. Didn't want to embbed a switch in a switch
                    //Feeds Dino
                        if(myDinoChoice == 1){
                            myDino.feed();
                            //Makes it attack village if not aqautic
                            //Attacks atlantis if aquatic
                        }else if(myDinoChoice == 2){
                            if (myDino.aquatic == true){
                                myDino.attackAtlantis();
                            }else{
                                myDino.attackTown();
                            }
                        }else if(myDinoChoice == 3){
                            displayDinoStats(myDino);
                        }else if(myDinoChoice== 4){
                            break;
                        }else if(myDinoChoice == 5){
                            System.exit(0);
                        }else{
                            System.out.println("That language isn't acceptable! Or it might be. I don't know what you said... Try again please");
                        }
                    
                }
            break;

            //Build your own Dino
            case 7:
                System.out.println("You've picked Build your own Dino!");
                boolean myDinoLoop2 = true;
                while(myDinoLoop2 = true){
                System.out.println("*******************************************");
                System.out.println("What would you like to do?");
                System.out.println("1 - Input My Dino's Name");
                System.out.println("2 - Input My Dino's Height");
                System.out.println("3 - Input My Dino's Weight");
                System.out.println("4 - Make My Dino have feathers");
                System.out.println("5 - Make My Dino as Aquatic");
                System.out.println("6 - Make My Dino a Flyer");
                System.out.println("7 - Input what your dino eats");
                System.out.println("8 - Display My Dino's Stats");
                System.out.println("9 - Go back to previous menu");
                System.out.println("10 - Exit program");
                System.out.println("*******************************************");
                int myDinoChoice2 = userInputScanner.nextInt();
                //if/else embedded in switch. Didn't want to embbed a switch in a switch
                //Sets Dino name. Had problem with .nextLine(); repeating menu, and couldn't find work around besides .next();
                    if(myDinoChoice2 == 1){
                        System.out.println("What would you like to name your Dinosaur? (No Spaces)");
                        myDino.name = userInputScanner.next();
                    }else if(myDinoChoice2 == 2){
                        //Sets Dino height
                        System.out.println("What is your Dino's height (In inches)");
                        myDino.height = userInputScanner.nextInt();
                        //Sets Dino weight
                    }else if(myDinoChoice2 == 3){
                        System.out.println("What is your Dino's weight (In pounds)");
                        myDino.weight = userInputScanner.nextInt();
                        //Sets if Dino has feathers or not
                    }else if(myDinoChoice2 == 4){
                        System.out.println("Does your Dino have feathers? True or False");
                        myDino.feathers = userInputScanner.nextBoolean();
                        //Sets if Dino is aquatic or not
                    }else if(myDinoChoice2 == 5){
                        System.out.println("Is your dino aquatic? True or False");
                        myDino.aquatic = userInputScanner.nextBoolean();
                        //Sets if Dino can fly or not
                    }else if(myDinoChoice2 == 6){
                        System.out.println("Can your Dino fly? True or False");
                        myDino.canFly = userInputScanner.nextBoolean();
                        //User sets what the Dino eats, had troubles with .nextLine() repeating menu
                    }else if(myDinoChoice2 == 7){
                        System.out.println("Does your Dino eat meat or berries? (No Spaces)");
                        myDino.food = userInputScanner.next();
                        //Display Dino Stats
                    }else if(myDinoChoice2 == 8){
                        displayDinoStats(myDino);
                        //Go back to main menu
                    }else if(myDinoChoice2 == 9){
                        break;
                        //Exit Program
                    }else if(myDinoChoice2 == 10){
                        System.exit(0);
                    }else{
                        System.out.println("I'm sorry, what? Try that again please");
                    }
                }
            break;
            
            //Exit Program
            case 8:
                System.out.println("Exiting Program");
                System.exit(0);
            break;
            
            default:
                System.out.println("Invalid Input! Please try again");
        }
    }
    

}
    //Displays Stats of Dinos
        public static void displayDinoStats(Dinosaur anyDinoObject){
        System.out.println("************STATS************");
        System.out.println("Name: " + anyDinoObject.name);
        System.out.println("Height: " + anyDinoObject.height + " inches");
        System.out.println("Weight: " + anyDinoObject.weight + " pounds");
        System.out.println("Eats: " + anyDinoObject.food);
        System.out.println("Aquatic: " + anyDinoObject.aquatic);
        System.out.println("Able to fly: " + anyDinoObject.canFly);
        System.out.println("Feathers: " + anyDinoObject.feathers);
        System.out.println("*****************************");
        }
}