package OOPs.Assignment1;

public class p6 {
    public static void main(String[] args) {
        movie m1 = new movie("RRR","S.S Production","4 star");
        movie m2 = new movie("Dangal", "Aamir Khan Productions", "5 star");
        movie m3 = new movie("Pathaan", "Yash Raj Films");
        movie m4 = new movie("Bahubali", "Arka Media Works", "5 star");
        movie m5 = new movie("3 Idiots", "Vinod Chopra Films");
        movie m6 = new movie("PK", "Vinod Chopra Films", "3 star");
        movie m7 = new movie("Jawan", "Red Chillies Entertainment", "5 star");
        movie m8 = new movie("Kantara", "Hombale Films");
        movie m9 = new movie("KGF", "Hombale Films", "4 star");
        movie m10 = new movie("Zindagi Na Milegi Dobara", "Excel Entertainment", "5 star");

        movie[] allmovies = {m1,m2,m3,m4,m5,m6,m7,m8,m9,m10};

        movie[] fiveStarMovies = movie.get5StarMovies(allmovies);

        for (int i = 0; i < fiveStarMovies.length; i++) {
            if (fiveStarMovies[i] == null) {
                continue;
            }
            else {
                System.out.println(fiveStarMovies[i].getTitle());
            }
        }
    }
}

class movie{
    private String title;
    private String studio;
    private String rating;

    public movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public static movie[] get5StarMovies(movie[] movies) {
        movie[] result = new movie[movies.length];
        int index = 0;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].rating == "5 star") {
                result[index] = movies[i];
                index++;
            }
        }
        return result;
    }
}
