/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Dmangames
 */
public class Friend {
    private String firstName;
    private String lastName;
    private String birthday;
    private String comments;
    
    public Friend(String p_firstName, String p_lastName, String p_birthday, String p_comments){
        firstName = p_firstName;
        lastName = p_lastName;
        birthday = p_birthday;
        comments = p_comments;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s %s, DoB: %s", firstName, lastName, birthday);
    }
    
    public void test123(){
        
    }
}
