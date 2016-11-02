/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extracredit7;

/**
 *
 * @author Robyn
 */
import java.util.*;
import java.util.Random;

public class Credit {

    private String Name;//instance variable
   
    //constructor
  public Credit(String name)
  {
     Name=name;    
  }      
        //method 
    public void setName(String name)
    {
    Name=name;
    }
    public String getName()
    {
        return Name;
    }
    public void quote()
    {
    System.out.printf("Your first name is so interesting %s\n",getName());
    }
}//class

