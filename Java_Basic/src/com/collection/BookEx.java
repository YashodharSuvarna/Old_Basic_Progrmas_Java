package com.collection;

import java.util.*;  
class BookEx {  
int id;  
String name,author,publisher;  
int quantity;  
public BookEx(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
class ArrayListExample {  
public static void main(String[] args) {  
    //Creating list of Books
    HashSet<BookEx> list=new HashSet<BookEx>();  

    //List<BookEx> list=new ArrayList<BookEx>();  
    //Creating Books  
    BookEx b1=new BookEx(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    BookEx b2=new BookEx(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    BookEx b3=new BookEx(103,"Operating System","Galvin","Wiley",6);  
   
    //Adding Books to list  
    list.add(b1);  
    list.add(b3);
    list.add(b2);  

    //Traversing list  
    for(BookEx b:list){  
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  
