import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String name;
        int choice;
        
        System.out.println("==============================");
        System.out.println("     Pirate Treasure Hunt");
        System.out.println("==============================");
        System.out.println();
        
        System.out.println("What is your name? "); //User Input
        name = input.nextLine();
        
        //Initial Welcome Screen where you can input which environment you want.
        System.out.println();
        System.out.println("Welcome, " + name + "!");
        System.out.println("After three weeks at sea your ship crashes");
        System.out.println("onto the mysterious Skull Island.");
        System.out.println();
        System.out.println("You see two paths ahead of you:");
        System.out.println("There are two paths.");
        System.out.println("1) Enter the jungle");
        System.out.println("2) Explore the beach");
        System.out.println("3) Enter the water");
        System.out.println("Choose a path: ");
        choice = input.nextInt();
        
        //Jungle Path
        if(choice == 1)
        {
            System.out.println();
            System.out.println("You enter the jungle and discover an old stone temple.");
            System.out.println("1) Open the door covered in gold symbols.");
            System.out.println("2) Open the door coveed in strange pirate writing.");
            System.out.println("Choose a door: ");
            choice = input.nextInt();

            //Golden Door
            if(choice == 1)
            {
                System.out.println();
                System.out.println("You open the golden door.");
                System.out.println("A giant cocount falls from the ceiling and knocks");
                System.out.println("you into a secret passage!");
                System.out.println();
                System.out.println("The passage leads to a giant treasure chest.");
                System.out.println("You found the porate treasure!");
                System.out.println();
                System.out.println("CONGRATULATIONS, " + name + "!");
                System.out.println("You are now the richest pirate on Skull Island.");
            }
            
            //Pirate Door
            else if(choice == 1)
            {
                System.out.println();
                System.out.println("You open the pirate door.");
                System.out.println("A trapdoor opens beneath your feet!");
                System.out.println("You fall into a room full of angry chickens.");
                System.out.println();
                System.out.println("The chickens chase you out of the temple.");
                System.out.println("You escape with your life, but no treasure.");
                System.out.println("ENDING: Defeated by chicken.");
            }
        
            //Incorrect Input
            else
            {
                System.out.println();
                System.out.println("You stand there staring at the doors.");
                System.out.println("A confused parrot flies down and steals your map.");
                System.out.println("ENDING: The parrot gets the treasure map.");
            }
        }
        
        //Beach Path
        else if(choice == 2)
        {
            System.out.println();
            System.out.println("You walk along the beach and discover a mysterious cave.");
            System.out.println("You hear something moving inside.");
            System.out.println();
            System.out.println("What do you do?");
            System.out.println("1) Enter the cave.");
            System.out.println("2) Throw a coconut into the cave.");
            System.out.println("Choose an option: ");
            choice = input.nextInt();
            
            //Enter the Cave
            if(choice == 1)
            {
                System.out.println();
                System.out.println("You carefully enter the cave.");
                System.out.println("Inside, you discover an old pirate chest!");
                System.out.println();
                System.out.println("You open the chest.");
                System.out.println("TREASURE!");
                System.out.println();
                System.out.println("You found 10,000 gold coins!");
                System.out.println("YOU FOUND THE TREASURE, " + name + "!");
            }
            
            //Throw a coconut
            else if(choice == 2)
            {
                System.out.println();
                System.out.println("You throw a coconut into the cave.");
                System.out.println("A giant crab throws it back at you.");
                System.out.println("You decide the treasure isn't worth fighting the crab.");
                System.out.println("ENDING: Defeated by an angry crab.");
            }
            
            //Invalid Choice
            else
            {
                System.out.println();
                System.out.println("You make an invalid choice.");
                System.out.println("A pirate parrot laughs at you.");
                System.out.println("ENDING: The parrot is made.");
            }
        }

        //Water Path
        else if(choice == 3)
        {
            System.out.println("You go into the water.");
            System.out.println("A mermaid grabs a hold of you and plunge into the water.");
            System.out.println("ENDING: You drowned");
        }
            
        //Invalid Path
        else
        {
            System.out.println();
            System.out.println("You choose an invalid path.");
            System.out.println("You walk in circles until you accidentally");
            System.out.println("find your way back to your ship.");
            System.out.println("ENDING: You leave Skull Island empty-handed.");
        }
    }
}
