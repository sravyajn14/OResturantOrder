package com.zappos.online_ordering.resturant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    private int userId;
    private String itemId;
    
    
    public String getMenuItemId() {
    return itemId;
    }
    
    public void setMenuItemId(String itemId) {
    this.itemId = itemId;
    }
    
   
    
    public int getUserId() {
    return userId;
    }
    
    public void setUserId(int userId) {
    this.userId = userId;
    }
    public int getResturantId() {
        return userId;
        }
        
   public void setResturantId(int userId) {
       this.userId = userId;
    }
    
}
