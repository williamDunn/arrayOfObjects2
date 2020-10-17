import java.util.Scanner;

//Author: William Dunn
//Date:2/6/17
//165 02
//Assignment 3

public class MusicInvetoryReporting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicCollection collection = new MusicCollection();
		
		collection.printInventory();
		
		collection.printAlbumsInCollection();
		
		collection.printArtistInCollection();
		
		collection.endRpt();

		System.out.print("Please enter the song you'd like to look up: ");

		Scanner kbd = new Scanner (System.in);
		String song = kbd.next();
		
		Song song2 = collection.binarySearch(song);
				
			if(song2 != null){
				System.out.println("Song is in this collection. I was performed by " + song2.getArtist() + "on the " + song2.getAlbum() + "album. Here are the specifics:");
				song2.toString();
			}
			else
				System.out.println("There is no song named '" + song + "' in this collection.");
			
			
			boolean answer = true;
			while (answer){
			System.out.print("Do you want to continue (y/n)? ");

			String yesno;

			yesno = kbd.next();

		
			if (yesno.equalsIgnoreCase("n")){
				answer = false;
			}
				else if (yesno.equalsIgnoreCase("y")){	
					
			System.out.print("Please enter the song you'd like to look up: ");
			song = kbd.nextLine();
			
			collection.binarySearch(song);
					
				if(song2 != null){
					System.out.println("Song is in this collection. I was performed by " + song2.getArtist() + "on the " + song2.getAlbum() + "album. Here are the specifics:");
					song2.toString();
				}
				else
					System.out.println("There is no song named '" + song + "' in this collection.");
		}
				else
					System.err.println("ERROR: Invalid choice\n");
		kbd.close();
		}
	}
	
		
	}	
	


