

package lab3jhazel4595;
// you will notice a few unused imports I tried many different methods unsuccessfully to try to remove and modify the 
// The arraylist  I believe the iterator.remove method would have been the answer I just never could understand what
// it wanted as far as (Object o)

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

/*************************************
* Programmer: James Hazel III
* classID: jhazel4495
* Lab3
* CIS 2600: Business Application Programming
* Fall 2016
* Due date:11/14/16
* Date completed: 11/14/16
**************************************
* Using Arrays and in this instance the ListArray 
**************************************/
//   above this line is an example of java Block comments that start with /* and end with */ Which allow you to keep 
//   keep commenting line after line until you close with */

// The two forward Slashes at the start of this sentence only blocks out the line  that they are on. Note: you cant use 
// back slashes \\ they wont work! 

// they are usefull for blocking out code for trouble shooting also.

/* package  ex2jhazel4495 is the name of  this paticular Java program group of files Since I created it it is called a user
-defined package which surrounds the group of classes, interfaces and sub packages that I create or use.  Built in pac-
kages are like java.lang where Java supplies them. The format is package <package name>.
*/
public class Lab3Jhazel4595 {
// declaring the ArrayLIst<the class that builds the Objects> theVariableNameoflist = new Arraylist. 
         public static ArrayList<SalesPerson> salesPeopleData = new ArrayList<> ();

    public static void main(String[] args) {
        // declaring all sorts of stuff :) old hat 
        Scanner scan = new Scanner(System.in);
       char charAnswer = ' ';
       String strAnswer = " ";
       String strSalesName = "";
       int intIdNumber= 0;
       double dblSalesAmt = 0.0;
       int removeIdNumber = 0;
       // This is important the while loop keeps running whats between the curly brackets  until its logic test is satisfied
       // i chose to use the char primative type as what the user would input. to make it easier I used the != not equals 
       // operator it makes better sense to me when i read it outloud "while th variable does not equal q" run loop
     while(charAnswer != 'Q'){     
    // using a char  means the char primitive type can not be directly passed by the scanner method so you will notice I
    // passed it to a String first and then an parsed it to upper case then changed it to a char using only the first positon 
    // of zero passing that to charAnswer
System.out.println("Do you want to (A)dd , (D)elete, (C)hange, or (Q)uit;  ");
strAnswer=scan.next();
strAnswer = strAnswer.toUpperCase();
charAnswer =strAnswer.charAt(0);

// to handle the different jobs of add delete and change or quit i used a switch structure to take the char input and 
// then run the methods then break out and recheck if user wanted to continue adding or deleteing or quiting the array

     
    switch(charAnswer) {
        case 'A':
         // done scanner inputs plenty 
             System.out.println("Please enter Salespersons ID number  ");
             intIdNumber=scan.nextInt();
             
             System.out.println("Please enter Salespersons Name   ");
             strSalesName = scan.next();
             
             System.out.println("Please enter Sales amount  ");
             dblSalesAmt = scan.nextDouble();
             // important part this is how each new object was added to the listArray
             salesPeopleData.add (new SalesPerson(intIdNumber,strSalesName,dblSalesAmt));
            // System.out.println( "Whole list=" + salesPeopleData );
             // to output the array i used and enhanced for loop  
         for (SalesPerson sp : salesPeopleData ){
       System.out.println("Salesperson's ID number:"+sp.getIntIdNumber()+",Salesperson's Name:"+ 
               sp.getStrSalesName()+",Sales Amount: "+sp.getDblSalesAmt()); 
         }
                        // my failed attempts at printing and sorting 
                                         //  System.out.println(sp + " ");}
                                         //salesPeopleData.forEach(System.out:: print);}
                                       //  SalesPerson.salesPeopleData.sort(Comparator.comparing(sp ::getIntIdNumber());   
         // once completed it kicks out at the break back to the while loop 
         break;
         // when d for delete was selected the program would skip to case D then run its contents I had it output the 
         // array so far so the user could see all of the sales id numbers to pick from to delete i had it ask for the id number 
         // and passed it to a variable but never could figure out how to remove without know the element number and 
         // i know it can be found by ietration but never found an example i could understand
               case 'D':
                      for (SalesPerson sp : salesPeopleData ){
       System.out.println("Salesperson's ID number:"+sp.getIntIdNumber()+",Salesperson's Name:"+ 
               sp.getStrSalesName()+",Sales Amount: "+sp.getDblSalesAmt()); 
         }
                   System.out.println ("Please enter Salespersons ID number  you wish to remove  ");
                   removeIdNumber =scan.nextInt();
                                            
                 // salesPeopleData.remove ( (Object)"111");
                //System.out.println("What is index of 111 in this list ;  "+ salesPeopleData.indexOf(SalesPerson));
                   break;
         
             }
                // woulhavd also had case C for change and used the method to do that but got stuck on delete
                // please fee free to show example  i would love to learn how!! arraylist are way more useful than arrays
             
             
     } 
             
         }
           
    }
    
    
//    public void addSalesPersonData() {
//     
//    }


