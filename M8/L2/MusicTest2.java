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
    private static void printHeader() {
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
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
// insertion sorts
    public static void sortTitle(Music[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getTitle().compareTo(key.getTitle()) > 0) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    public static void sortYear(Music[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getYear() > key.getYear()) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    public static void sortArtist(Music[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getArtist().compareTo(key.getArtist()) > 0) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    // binary searches
    public static int binarySearchTitle(Music[] songs, String title) {
        printHeader();
        sortTitle(songs);
        int high = songs.length;
        int low = -1;
        int probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getTitle().compareTo(title) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if ((low >= 0) && (songs[low].getTitle().compareTo(title) == 0)) {
            return low;
        } else {
            return -1;
        }
    }
    public static int binarySearchYear(Music[] songs, int year) {
        printHeader();
        sortYear(songs);
        int high = songs.length;
        int low = -1;
        int probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getYear() > year) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if ((low >= 0) && (songs[low].getYear() == year)) {
            return low;
        } else {
            return -1;
        }
    }
    public static int binarySearchArtist(Music[] songs, String artist) {
        printHeader();
        sortArtist(songs);
        int high = songs.length;
        int low = -1;
        int probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getArtist().compareTo(artist) > 0) {
                high = probe;
            } else {
                low = probe;
            }
        }
        if ((low >= 0) && (songs[low].getArtist().compareTo(artist) == 0)) {
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
    }

}
