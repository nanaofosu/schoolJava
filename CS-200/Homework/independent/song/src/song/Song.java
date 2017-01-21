/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package song;

/**
 *
 * @author NANAO
 */
public class Song {

  //define properties
  private int number;
  private String title;
  private String author;
  private String scripture;
  private String category;

  //define constructor
  public Song(int number, String title, String author, String category){
    this.number = number;
    this.title = title;
    this.author = author;
    this.category = category;
  }
  
  public int songData(){
    System.out.println(this.number+"\n"+ this.title+"\n"+this.author+"\n"+this.category);
    return 1;
  }
  
  
  public static void main(String[] args) {
    
    Song test = new Song(112, "I hear God singing to me", "Steve Johnson", "Faithful");
    
    test.songData();
  }
  
}



