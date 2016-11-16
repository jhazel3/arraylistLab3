/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3jhazel4595;

/*************************************
* Programmer: James Hazel III
* classID: jhazel4495
* Lab3
* CIS 2600: Business Application Programming
* Fall 2016
* Due date: 11/14/2016
* Date completed: 11/14/2016
**************************************
* Using Arrays and in this instance the ListArray 
**************************************/
//   above this line is an example of java Block comments that start with /* and end with */ Which allow you to keep 
//   keep commenting line after line until you close with */

// The two forward Slashes at the start of this sentence only blocks out the line  that they are on. Note: you cant use 
// back slashes \\ they wont work! 

// they are usefull for blocking out code for trouble shooting also.

/* package  Lab3Jhazel4495  is the name of  this paticular Java program group of files Since I created it it is called a user
-defined package which surrounds the group of classes, interfaces and sub packages that I create or use.  Built in pac-
kages are like java.lang where Java supplies them. The format is package <package name>.
*/
public class SalesPerson {
    // this are the variables only for use by this class as part of the encapslation.
    private int intIdNumber;
    private String strSalesName;
    private double dblSalesAmt;
    // this is a constructor for my objects it passes in the variables that make up each object
    public SalesPerson ( int idNumber, String salesName,double salesAmt ){
        this.intIdNumber=idNumber;
        this.strSalesName=salesName;
        this.dblSalesAmt =salesAmt;
    }

    /**
     * @return the intIdNumber 
     */
    public int getIntIdNumber() {
        return intIdNumber;
    }

    /**
     * @param intIdNumber the intIdNumber to set
     * if i had not been stuck on the other parts I would have set up checks in the setter methods to make sure
     * they only put the data ranges i wanted in each of the set methods.
     */
    public void setIntIdNumber(int intIdNumber) {
        this.intIdNumber = intIdNumber;
    }

    /**
     * @return the strSalesName
     */
    public String getStrSalesName() {
        return strSalesName;
    }

    /**
     * @param strSalesName the strSalesName to set
     */
    public void setStrSalesName(String strSalesName) {
        this.strSalesName = strSalesName;
    }

    /**
     * @return the dblSalesAmt
     */
    public double getDblSalesAmt() {
        return dblSalesAmt;
    }

    /**
     * @param dblSalesAmt the dblSalesAmt to set
     */
    public void setDblSalesAmt(double dblSalesAmt) {
        this.dblSalesAmt = dblSalesAmt;
    }
    

}
