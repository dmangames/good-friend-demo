/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;
import java.util.*;

/**
 *
 * @author Dmangames
 */
public class FriendProcessor {
    public List<Friend> friendList;
    
    public FriendProcessor(){
        friendList = new ArrayList<Friend>();
    }
    
    public void AddFriend(String firstName, String lastName, String birthday, String comments){
        //adds a friend for us
        friendList.add(new Friend(firstName, lastName, birthday, comments));
        System.out.println(friendList.toString());
    }
}
