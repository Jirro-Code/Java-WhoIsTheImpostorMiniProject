import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main
{
	public static void Whoistheimpostor(String[] args)throws InterruptedException {
	    //variables
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String[] word = {"Rice", "Goto", "Ball", "Chair", "Table",
		                 "Lamp", "Phone", "Book", "Pencil", "Bag",
		                 "Shoe", "Hat", "Clock", "Bottle", "Pillow",
		                 "Blanket", "Baseball Bat", "Gun", "Knife", "Plate",
		                 "Cup", "Pedestrian", "Chicken", "Pan", "Brush",
		                 "Mirror", "Soap", "Towel", "Toothbrush", "Scissors",
		                 "Tape", "Glue", "Ruler", "Eraser", "Stapler",
		                 "Notebook", "Folder", "Calculator", "Keyboard", "Map",
		                 "Mouse", "Artificial Intelligence", "Speaker", "Headphones", 
		                 "Charger", "Battery", "Flashlight", "Candle", "Match",
		                 "Umbrella", "Wallet", "Keys", "Ring", "Watch",
		                 "Glasses", "Belt", "Socks", "Shirt", "Pants",
		                 "Jacket", "Gloves", "Scarf", "Slippers", "Helmet",
		                 "Racket", "Dart", "Dice", "Card", "Chess",
		                 "Guitar", "Drum", "Flute", "Violin", "Piano",
		                 "Microphone", "Remote", "Television", "Radio", "Fan",
		                 "Aircon", "Refrigerator", "Iron", "Vacuum", "Ladder",
		                 "Hammer", "Screwdriver", "Wrench", "Saw", "Nail",
		                 "Rope", "Chain", "Lock", "Magnet", "Compass",
		                 "Globe", "suklay", "Camera"};
		int numPlayer;
		String answer;
		boolean isPlaying = true;
		System.out.println("WHO IS THE IMPOSTOR GAME");
		while(isPlaying){
		    try{
		        
		        System.out.print("Enter the number of players:");
		        numPlayer = scanner.nextInt();
		        scanner.nextLine();
		        if(numPlayer < 3){
		            System.out.println("*Players must be at least 3*");
		            continue;
		        }
		        
		        int impostor = random.nextInt(1, numPlayer + 1);
		        int numWord = random.nextInt(word.length);
		        
		        boolean isStarting = true;
		        while(isStarting){
		            System.out.print("Type (Start) to start the game:");
		            answer = scanner.nextLine();
		            if(!answer.equalsIgnoreCase("Start")){
		                System.out.println("*Invalid Response*");
		                continue;
		            }
		            else{
		                break;
		            }
		        }
		        
		        for(int i = 1; i<=numPlayer; i++){
		            if(i == impostor){
		                System.out.printf("\rPlayer:%d You are the impostor", i);
		                Thread.sleep(5000);
		                System.out.printf("\r*******PASS THE PHONE NOW!!**********");
		                Thread.sleep(7000);
		                continue;
		            }
		            else{
		                System.out.printf("\rPlayer:%d Your word is: %s", i, word[numWord]);
		                Thread.sleep(5000);
		                System.out.printf("\r*******PASS THE PHONE NOW!!**********");
		                Thread.sleep(7000);
		                continue;
		            }
		        }
		        isPlaying = false;
		        System.out.printf("\r!!PLAYERS YOU MAY NOW PLAY THE GAME!!");
		    }
		    catch(InputMismatchException e){
		        System.out.println("*Invalid Response*");
		        scanner.nextLine();
		        continue;
		    }
		    catch(ArrayIndexOutOfBoundsException e){
		        System.out.println("*Something went wrong*");
		        break;
		    }
		}
		scanner.close();
	}
}
