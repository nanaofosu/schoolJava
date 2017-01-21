/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanacontacts;

/**
 *
 * @author NANAO
 */
public class Contact {
  
  public String firstName;
  public String lastName;
  public String middleInitial;
  public String jobTitle;
  public String phone;
  public String email;
  public String address;
  
  public Contact(String firstname, String lastname, String middleinitial, String phone, String email){
    this.firstName = firstname;
    this.lastName = lastname;
    this.middleInitial = middleinitial;
    this.phone = phone;    
    this.email = email;
  }
  
  public String showContact(){
    return "Full name: "+ this.firstName + " "+ this.lastName;
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
  }
  
}
