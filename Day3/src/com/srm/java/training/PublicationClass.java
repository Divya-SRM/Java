package com.srm.java.training;

public class PublicationClass {
	public static void main(String a[])
    {
    Publication book1=new Book("Java Book",20,300);
       book1.display();
     Publication cd1=new CD("AR Rahman Songs",12.5f,120);
     cd1.display();
   }

}
class Publication
{
	private String title;
	private float price;
	  
	   Publication(String title,float price)
	   {
	   this.title=title;
	   this.price=price;
	   
	   }
	  void display()
	   {
	   System.out.println("Title:"+title);
	   System.out.println("Price: Rs."+price);
	   
	   }
}
class Book extends Publication
{
	private int pages;
    Book(String title,int pages,float price)
     {
    super(title,price);
    this.pages=pages;
     }
   void display()
    {
    super.display();
    System.out.println("No of Pages:"+pages);
    }
	
}
class CD extends Publication
{
	private float playingtime;
    CD(String title,float playingtime,float price)
     {
    super(title,price);
    this.playingtime=playingtime;
     }
   void display()
    {
    super.display();
    System.out.println("Playing Time:"+playingtime);
    }
}
