import java.util.Scanner;

public class  Movie {
  private String title;
  private String rating;
  private int year;
  private int runtime;

  public Movie(String title, String rating, int year, int runtime){
    this.title = title;
    this.rating = rating;
    this.year = year;
    this.runtime = runtime;
  }

  public String getMovieTitle(){
    return title;
  }

  public void setMovieTile(String title){
    this.title = title;
  }

}
