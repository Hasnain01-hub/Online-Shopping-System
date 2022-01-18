/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Void
 */
public class BillObject {
    private int id;
    private String uname;
    private int bill;
    private String date;

   public  BillObject( String uname, int bill, String date) {
//        this.id = id;
        this.uname = uname;
        this.bill = bill;
        this.date = date;
    }

//    BillObject(String string, int aInt, String string0) {
//         //To change body of generated methods, choose Tools | Templates.
//    }
//    
//
//    BillObject(String string, int aInt, String string0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
// 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    
}
