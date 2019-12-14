/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totaBook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tota
 */
public class BookMarketMenu {
     static ArrayList<Book> Books=new ArrayList<>();
     static ArrayList<Integer> indexer=new ArrayList<>();
    static  java.util.Scanner in=new java.util.Scanner(System.in);
    static int index=0;
    static Book a;
  public static void Menu(){
       System.out.println("******Main Menu******");
       System.out.println("a.Add Book");
       System.out.println("b.Update Book details");
       System.out.println("c.Display Books Data");
       System.out.println("d.Delete Books data");
       System.out.println("e.Sort the Books");
       System.out.println("f.Buy Book");
       System.out.println("g.Exit");
       System.out.print("Enter choice:");
       
  }  
  public static void  AddNewBook(){
       System.out.println("Enter ISBN:");
       int ISBN=in.nextInt();
      
       System.out.println("Enter Title of Book:");
       String Title=in.next();
      
       System.out.println("Enter Author of Book:");
       String Author=in.next();
       System.out.println("Enter publisher of Book:");
       String publisher=in.next();
       System.out.println("Enter Amount of Book:");
       double Amount=in.nextDouble();
       System.out.println("Enter Price of Book:");
       double Price=in.nextDouble();
       a=new Book(ISBN,Title,Author,publisher,Price,Amount);
       Books.add(index, a);
       indexer.add(index, ISBN);
       index++;
       System.out.println("Successfully Inserted.");
  }
  public static void DeleteBook(){
       System.out.println("Enter ISBN:");
       int ISBN=in.nextInt();
       if(findIndex(ISBN)>=0){
       Books.remove(findIndex(ISBN));
       }else{
            System.out.println("there is no ISBN Like this.Try again.....");
            }
  
  
  }
  
 public static void InsertionSort()
 {
      int in,out;
      Object tem[]= Books.toArray();
     for(out=1;out<tem.length;out++)
     {
         Book temp=(Book) tem[out];
         in=out;
         while(in>0&&((Book)tem[in-1]).getISBN()>=temp.getISBN())
           {
           tem[in]=tem[--in];
           }
     tem[in]=temp;
     }
     Books.removeAll(Books);
  for(int i=0;i<tem.length;i++)
       Books.add(i, (Book) tem[i]);
  
  
 }
  public static void UpdateBookDetails(){
   System.out.println("Enter ISBN:");
       int ISBN=in.nextInt();
       if(findIndex(ISBN)>=0){
       
       UpdateMenu(findIndex(ISBN));
       }else{
            System.out.println("there is no ISBN Like this.Try again.....");
            }
  
  
  
                                        }
  public static  void UpdateMenu(int index){
       System.out.println("1.Title");
       System.out.println("2.Author");
       System.out.println("3.publisher");
       System.out.println("4.Amount");
       System.out.println("5.price");
       System.out.print("Enter choice:");
       int choice=in.nextInt();
        switch(choice){
           case 3:
                System.out.println("Enter publisher of Book:");
                String publisher=in.next(); 
                a=Books.get(index);
                a.setPublisher(publisher);
                break;
           case 1:     
                System.out.println("Enter Title of Book:");
                String Title=in.next();
                 a=Books.get(index);
                 a.setTitle(Title);
                break;
           case 2:
                System.out.println("Enter Author of Book:");
                String Author=in.next();
                a=Books.get(index);
                a.setAuthor(Author);
                break;
           case 4:
                System.out.println("Enter Amount of Book:");
                double Amount=in.nextDouble();
                a=Books.get(index);
                a.setAmount(Amount);
                break;
           case 5:
                System.out.println("Enter Price of Book:");
                double Price=in.nextDouble();
                a=Books.get(index);
                a.setPrice(Price);
                
                break;
           default:
                System.out.println(" you are not select the mention it....!!");
                    
        
          }
                       
            }
  public static int findIndex(int ISBN){
  Object a[]=indexer.toArray();
  Object I=ISBN;
  return Arrays.binarySearch(a, I)>=0?(Arrays.binarySearch(a, I)):-1;
  
  }
  
  public static void DisplayBooksData(){
       int i=0;
   while(i<Books.size())
            System.out.println(Books.get(i++).toString());
   
                               }
 public static void main(String []args)
 {

 char choice=' ';
 do{
      Menu();
      choice=in.next().charAt(0);
      switch(choice){
           case 'a':AddNewBook();break;
           case 'b':UpdateBookDetails();break;
           case 'c':DisplayBooksData(); break;
           case 'd':DeleteBook();;break;
           case 'e':InsertionSort();DisplayBooksData();break;
           case 'f':break;
           case 'g':break;
           default:
                
                    }
      System.out.println("");
      System.out.println("");
 
 }while(choice!='g');
 
 
 }    
}
