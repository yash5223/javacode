package keystone;

import java.util.Scanner;

public class books {
   private String name;
   private String author;
   private double price;
   private int edition;
   
   public String getName() {
       return name;
   }
   public String getauthor() {
       return author;
   }
   public Double getprice() {
       return price;
   }
   public Integer getedition() {
       return edition;
   }
   
   public void setName(String name) {
       this.name = name;
   }
   public void setauthor(String author) {
       this.author = author;
   }
   public void setprice(Double price) {
       this.price = price;
   }
   public void setedition(Integer edition) {
       this.edition = edition;
   }
   
   public static void main(String[] args) {
       books book1 = new books();
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter your name: ");
       book1.setName(scanner.nextLine());
       System.out.print("Enter your Authors name: ");
       book1.setauthor(scanner.nextLine());
       System.out.print("Enter The Price: ");
       book1.setprice(scanner.nextDouble());
       System.out.print("Enter The Edition: ");
       book1.setedition(scanner.nextInt());

       System.out.println("Name: " + book1.getName());
       System.out.println("Author: " + book1.getauthor());
       System.out.println("Price: " + book1.getprice());
       System.out.println("Edition: " + book1.getedition());

       scanner.close();
   }



}
