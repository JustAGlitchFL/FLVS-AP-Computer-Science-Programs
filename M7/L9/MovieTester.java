import java.lang.reflect.Array;

/**
 * Purpose: Access the movie object
 *
 * @author Aidan Procopio
 * @version 10/21/24
 *
 */
public class MovieTester {
    private static void printMovies(Movie[] movies){
        System.out.println("Movies:");
        System.out.printf("%-30s %4s   %-20s\n", "Title", "Year", "Studio");
        System.out.println("========================================================");
        for(Movie movie : movies){
            System.out.println(movie);
        }
    }

    private static Movie[] sortByTitle(Movie[] movies, int order){ // 1 for ascending, 2 for descending
        Movie[] sorted = new Movie[movies.length];
        if (order==1) {
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getTitle().compareTo(sorted[k-1].getTitle())>0){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        } else if (order==2) {
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getTitle().compareTo(sorted[k-1].getTitle())<0){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        }
        return sorted;       
    }

    private static Movie[] sortByYear(Movie[] movies, int order){
        Movie[] sorted = new Movie[movies.length];
        if (order==1) {
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getYear() > sorted[k-1].getYear()){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        } else if (order==2) {
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getYear() < sorted[k-1].getYear()){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        }
        return sorted;       
    }

    private static Movie[] sortByStudio(Movie[] movies, int order){
        Movie[] sorted = new Movie[movies.length];
        if (order==1){
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getStudio().compareTo(sorted[k-1].getStudio())>0){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        } else if (order==2) {
            for(int i=0; i<movies.length;i++){
                Movie next = movies[i];
                int insertIndex = 0;
                int k = i;
                while(k>0 && insertIndex==0){
                    if(next.getStudio().compareTo(sorted[k-1].getStudio())<0){
                        insertIndex = k;
                    }else{
                        sorted[k] = sorted[k-1];
                    }
                    k--;
                }
                sorted[insertIndex] = next;
            }
        }
        return sorted;       
    }
    public static void main(String[] args){
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Star Wars: A New Hope", 1977, "Lucasfilm");
        movies[1] = new Movie("THe Martian", 2015, "20th Century Fox");
        movies[2] = new Movie("The Matrix", 1999, "Warner Bros.");
        movies[3] = new Movie("2001: A Space Odyssey", 1968, "MGM");
        movies[4] = new Movie("Men in Black", 1997, "Columbia Pictures");
        movies[5] = new Movie("Jurassic Park", 1993, "Universal Pictures");
        movies[6] = new Movie("The Terminator", 1984, "Orion Pictures");
        movies[7] = new Movie("Inception", 2010, "Warner Bros.");
        movies[8] = new Movie("Tenet", 2020, "Warner Bros.");
        movies[9] = new Movie("Independence Day", 1996, "20th Century Fox");

        printMovies(movies);
        System.out.println("\nSorted by Title Ascending:");
        printMovies(sortByTitle(movies, 1));
        System.out.println("\nSorted by Title Descending:");
        printMovies(sortByTitle(movies, 2));
        System.out.println("\nSorted by Year Ascending:");
        printMovies(sortByYear(movies, 1));
        System.out.println("\nSorted by Year Descending:");
        printMovies(sortByYear(movies, 2));
        System.out.println("\nSorted by Studio Ascending:");
        printMovies(sortByStudio(movies, 1));
        System.out.println("\nSorted by Studio Descending:");
        printMovies(sortByStudio(movies, 2));
        
    }
}
