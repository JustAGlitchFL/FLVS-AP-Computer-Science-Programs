package M8.L2;

/**
 * Purpose: Use Music4 object
 *
 * @author Aidan Procopio
 * @version 11/2/24
 *
 */
public class Music4Test2 {
    private static void printAll(Music4[] songs) {
        System.out.println("All Songs");
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
        for (Music4 song : songs) {
            System.out.println(song);
        }
    }
    private static void printHeader() {
        System.out.println("Title                     Year   Artist");
        System.out.println("=========================================");
    }

    public static void sortTitle(Music4[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music4 key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getTitle().compareTo(key.getTitle()) > 0) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    public static void sortYear(Music4[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music4 key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getYear() > key.getYear()) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    public static void sortArtist(Music4[] songs) {
        for (int i = 1; i < songs.length; i++) {
            Music4 key = songs[i];
            int j = i - 1;
            while (j >= 0 && songs[j].getArtist().compareTo(key.getArtist()) > 0) {
                songs[j + 1] = songs[j];
                j = j - 1;
            }
            songs[j + 1] = key;
        }
    }
    // binary searches
    public static int binarySearchTitle(Music4[] songs, String title) {
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
    public static int binarySearchYear(Music4[] songs, int year) {
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
    public static int binarySearchArtist(Music4[] songs, String artist) {
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
    public static void linearPrintTitle(Music4[] songs, int low, String title) {
        if (low == -1) {
            System.out.println("Title not found");
            return;
        }
        int i;
        int start = low;
        int end = low;

        //verify starting point of matches
        i = low-1;
        while (i >= 0 && songs[i].getTitle().compareTo(title) == 0) {
            start = i;
            i--;
        }
        //find end of matches
        i = low+1;
        while (i < songs.length && songs[i].getTitle().compareTo(title) == 0) {
            end = i;
            i++;
        }
        //print all matches
        for (i = start; i <= end; i++) {
            System.out.println(songs[i]);
        }
    }

    public static void linearPrintYear(Music4[] songs, int low, int year) {
        if (low == -1) {
            System.out.println("Year not found");
            return;
        }
        int i;
        int start = low;
        int end = low;

        //verify starting point of matches
        i = low-1;
        while (i >= 0 && songs[i].getYear() == year) {
            start = i;
            i--;
        }
        //find end of matches
        i = low+1;
        while (i < songs.length && songs[i].getYear() == year) {
            end = i;
            i++;
        }
        //print all matches
        for (i = start; i <= end; i++) {
            System.out.println(songs[i]);
        }
    }

    public static void linearPrintArtist(Music4[] songs, int low, String artist) {
        if (low == -1) {
            System.out.println("Artist not found");
            return;
        }
        int i;
        int start = low;
        int end = low;

        //verify starting point of matches
        i = low-1;
        while (i >= 0 && songs[i].getArtist().compareTo(artist) == 0) {
            start = i;
            i--;
        }
        //find end of matches
        i = low+1;
        while (i < songs.length && songs[i].getArtist().compareTo(artist) == 0) {
            end = i;
            i++;
        }
        //print all matches
        for (i = start; i <= end; i++) {
            System.out.println(songs[i]);
        }
    }

    public static void main(String[] args) {
        Music4[] songs = {new Music4("Dreamer", 2022, "Throttle"),
                         new Music4("Japan", 2022, "Throttle"),
                         new Music4("Von Dutch", 2024, "Charli XCX"),
                         new Music4("I'd Rather Pretend", 2024, "Bryant Barnes, d4vd"),
                         new Music4("Northern Attitude", 2023, "Noah Kahan, Hozier"),
                         new Music4("ICARUS", 2023, "Tony Ann"),
                         new Music4("All I Want", 2013, "Kodaline"),
                         new Music4("A Tear in Space (Airlock)", 2024, "Glass Animals"),
                         new Music4("RNP", 2019, "Cordae, Anderson .Paak"),
                         new Music4("KRYPTONITE", 2024, "Don Toliver"),}; //this would be a really awkward playlist with all these different genres but it's what i've been listening to lately
        //with results
        printAll(songs);
        System.out.println();
        
        System.out.println("Search for Title: RNP");
        linearPrintTitle(songs, binarySearchTitle(songs, "Dreamer"), "Dreamer");
        System.out.println();
        System.out.println("Search for Year: 2024");
        linearPrintYear(songs, binarySearchYear(songs, 2024), 2024);
        System.out.println();
        System.out.println("Search for Artist: Throttle");
        linearPrintArtist(songs, binarySearchArtist(songs, "Throttle"), "Throttle");
        System.out.println();

        //without results
        System.out.println("Search for Title: Only the Wild Ones");
        linearPrintTitle(songs, binarySearchTitle(songs, "Only the Wild Ones"), "Only the Wild Ones");
        System.out.println();
        System.out.println("Search for Year: 2017");
        linearPrintYear(songs, binarySearchYear(songs, 2017), 2017);
        System.out.println();
        System.out.println("Search for Artist: Dispatch");
        linearPrintArtist(songs, binarySearchArtist(songs, ""), "");
    }

}
