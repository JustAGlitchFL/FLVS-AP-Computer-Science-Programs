package M8.L2;

/**
 * Purpose: Use music object
 *
 * @author Aidan Procopio
 * @version 11/2/24
 *
 */
public class MusicTest2 {
    private static void printAll(Music[] songs) {
        System.out.println("All Songs");
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
        for (Music song : songs) {
            System.out.println(song);
        }
    }
/** old search methods
    private static void searchTitle(Music[] songs, String title) {
        System.out.println("Searching for: " + title);
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
        int songsFound=0;
        for (Music song : songs) {
            if (song.getTitle().equals(title)) {
                System.out.println(song);
                songsFound++;
            }
        }
        if (songsFound == 0) {
            System.out.println("Song not found");
        }
    }
    private static void searchYear(Music[] songs, int year) {
        System.out.println("Searching for songs from: " + year);
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
        int songsFound=0;
        for (Music song : songs) {
            if (song.getYear() == year) {
                System.out.println(song);
                songsFound++;
            }
        }
        if (songsFound == 0) {
            System.out.println("Song not found");
        }
    }
    private static void searchArtist(Music[] songs, String artist) {
        System.out.println("Searching for songs by: " + artist);
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
        int songsFound=0;
        for (Music song : songs) {
            if (song.getArtist().equals(artist)) {
                System.out.println(song);
                songsFound++;
            }
        }
        if (songsFound == 0) {
            System.out.println("Song not found");
        }
    }
*/
// selection sorters
    private static Music[] sortByTitle(Music[] songs) {
        for (int i = 0; i < songs.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < songs.length; j++) {
                if (songs[j].getTitle().compareTo(songs[minIndex].getTitle()) < 0) {
                    minIndex = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[minIndex];
            songs[minIndex] = temp;
        }
        return songs;
    }
    private static Music[] sortByYear(Music[] songs) {
        for (int i = 0; i < songs.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < songs.length; j++) {
                if (songs[j].getYear() < songs[minIndex].getYear()) {
                    minIndex = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[minIndex];
            songs[minIndex] = temp;
        }
        return songs;
    }
    private static Music[] sortByArtist(Music[] songs) {
        for (int i = 0; i < songs.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < songs.length; j++) {
                if (songs[j].getArtist().compareTo(songs[minIndex].getArtist()) < 0) {
                    minIndex = j;
                }
            }
            Music temp = songs[i];
            songs[i] = songs[minIndex];
            songs[minIndex] = temp;
        }
        return songs;
    }
// binary searches
    private static int searchTitle(Music[] songs, String title) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high-low>1) {
            probe = (high+low)/2;
            if(songs[probe].getTitle().compareTo(title) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if((low >= 0) && (songs[low].getTitle().compareTo(title) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    private static int searchYear(Music[] songs, int year) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high-low>1) {
            probe = (high+low)/2;
            if(songs[probe].getYear() > year) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if((low >= 0) && (songs[low].getYear() == year)) {
            return low;
        } else {
            return -1;
        }
    }
    private static int searchArtist(Music[] songs, String artist) {
        int high = songs.length;
        int low = -1;
        int probe;

        while(high-low>1) {
            probe = (high+low)/2;
            if(songs[probe].getArtist().compareTo(artist) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if((low >= 0) && (songs[low].getArtist().compareTo(artist) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Music[] songs = {new Music("Dreamer", 2022, "Throttle"),
                         new Music("Japan", 2022, "Throttle"),
                         new Music("Von Dutch", 2024, "Charli XCX"),
                         new Music("I'd Rather Pretend", 2024, "Bryant Barnes, d4vd"),
                         new Music("Northern Attitude", 2023, "Noah Kahan, Hozier"),
                         new Music("ICARUS", 2023, "Tony Ann"),
                         new Music("All I Want", 2013, "Kodaline"),
                         new Music("A Tear in Space (Airlock)", 2024, "Glass Animals"),
                         new Music("RNP", 2019, "Cordae, Anderson .Paak"),
                         new Music("KRYPTONITE", 2024, "Don Toliver"),}; //this would be a really awkward playlist with all these different genres but it's what i've been listening to lately
       //with results
       printAll(songs);
       System.out.println();
       searchTitle(songs, "All I Want");
       System.out.println();
       searchYear(songs, 2024);
       System.out.println();
       searchArtist(songs, "Throttle");
       System.out.println();

       //without results
       searchTitle(songs, "Where U Are");
       System.out.println();
       searchYear(songs, 2020);
       System.out.println();
       searchArtist(songs, "Tyler, The Creator");
       System.out.println();

    }
}
