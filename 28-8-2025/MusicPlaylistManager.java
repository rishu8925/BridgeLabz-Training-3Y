
import java.util.Scanner;

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of songs in playlist: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        
        String[] songs = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter song " + (i + 1) + ": ");
            songs[i] = sc.nextLine();
        }

        int choice;
        
        
        while (true) {
            
            System.out.println("\n===== Music Playlist Manager =====");
            System.out.println("1. Play all songs");
            System.out.println("2. Play a song by index");
            System.out.println("3. Search for a song by name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.println("\nPlaying all songs:");
                    for (int i = 0; i < songs.length; i++) {
                        System.out.println((i+1) + ". " + songs[i]);
                    }
                    break;

                case 2: 
                    System.out.print("Enter song index (1-" + songs.length + "): ");
                    int index = sc.nextInt();
                    if (index >= 1 && index <= songs.length) {
                        System.out.println("Now playing: " + songs[index - 1]);
                    } else {
                        System.out.println("Invalid index! Please try again.");
                    }
                    break;

                case 3: 
                    System.out.print("Enter song name to search: ");
                    String searchSong = sc.nextLine();
                    boolean found = false;
                    for (String song : songs) {
                        if (song.equalsIgnoreCase(searchSong)) {
                            System.out.println("Found and playing: " + song);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Song not found in playlist.");
                    }
                    break;

                case 4: 
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    sc.close();
                    return; 

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
