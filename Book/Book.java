/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author Tota
 */
public class Book {
     private int ISBN;
     private String Title;
     private String author;
     private String publisher;
     private double price;
     private double Amount;

     public double getAmount() {
          return Amount;
     }

     public void setAmount(double Amount) {
          this.Amount = Amount;
          this.price=this.price*Amount;
     }
     
  public Book(int ISBN, String Title, String author, String publisher, double price,double Amount) {
          this.ISBN = ISBN;
          this.Title = Title;
          this.author = author;
          this.publisher = publisher;
          this.price = price*Amount;
          this.Amount=Amount;
          
     }

     public int getISBN() {
          return ISBN;
     }

     public void setISBN(int ISBN) {
          this.ISBN = ISBN;
     }

     public String getTitle() {
          return Title;
     }

     public void setTitle(String Title) {
          this.Title = Title;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public String getPublisher() {
          return publisher;
     }

     public void setPublisher(String publisher) {
          this.publisher = publisher;
     }

     public double getPrice() {
          return price;
     }

     @Override
     public String toString() {
          return "Book{" + "ISBN=" + ISBN + ", Title=" + Title + ", author=" + author + ", publisher=" + publisher + ", price=" + price + ", Amount=" + Amount + '}';
     }

     
  
  
     
}
