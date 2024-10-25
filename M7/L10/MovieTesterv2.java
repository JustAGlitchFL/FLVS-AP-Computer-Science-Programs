package M7.L10;
/**
 * Purpose: Access the movie object rewritten for selection sort
 *
 * @author Aidan Procopio
 * @version 10/21/24
 *
 */
public class MovieTesterv2 {
    private static void printMovies(Movie[] movies){
        System.out.println("Movies:");
        System.out.printf("%-30s %4s   %-20s\n", "Title", "Year", "Studio");
        System.out.println("========================================================");
        for(Movie movie : movies){
            System.out.println(movie);
        }
    }

    private static Movie[] sortByTitle(Movie[] movies, int order){ // 1 for ascending, 2 for descending
        int k;
        int posMax;
        Movie temp;
        for(int i=movies.length-1; i>=0; i--){
            posMax = 0;
            for(k=1; k<=i; k++){
                if(order==1){
                    if(movies[k].getTitle().compareTo(movies[posMax].getTitle())<0){
                        posMax = k;
                    }
                }else if(order==2){
                    if(movies[k].getTitle().compareTo(movies[posMax].getTitle())>0){
                        posMax = k;
                    }
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        }
        return movies;
    }

    private static Movie[] sortByYear(Movie[] movies, int order){
        int k;
        int posMax;
        Movie temp;
        for(int i=movies.length-1; i>=0; i--){
            posMax = 0;
            for(k=1; k<=i; k++){
                if(order==1){
                    if(movies[k].getYear()<movies[posMax].getYear()){
                        posMax = k;
                    }
                }else if(order==2){
                    if(movies[k].getYear()>movies[posMax].getYear()){
                        posMax = k;
                    }
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        }
        return movies;
    }

    private static Movie[] sortByStudio(Movie[] movies, int order){
        int k;
        int posMax;
        Movie temp;
        for(int i=movies.length-1; i>=0; i--){
            posMax = 0;
            for(k=1; k<=i; k++){
                if(order==1){
                    if(movies[k].getStudio().compareTo(movies[posMax].getStudio())<0){
                        posMax = k;
                    }
                }else if(order==2){
                    if(movies[k].getStudio().compareTo(movies[posMax].getStudio())>0){
                        posMax = k;
                    }
                }
            }
            temp = movies[i];
            movies[i] = movies[posMax];
            movies[posMax] = temp;
        }
        return movies;
    }
    public static void main(String[] args){
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Star Wars: A New Hope", 1977, "Lucasfilm");
        movies[1] = new Movie("The Martian", 2015, "20th Century Fox");
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
