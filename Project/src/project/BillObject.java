/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author varun02
 */
public class BillObject {
    private int id;
    private String uname;
    private int price;
    private String d;

    public BillObject(int id, String uname, int price, String date) {
//        this.id = id;
        this.uname = uname;
        this.price = price;
//        this.bill = bill;
        this.d = d;
    }

    BillObject(String string, int aInt, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public int getBill() {
        return price;
    }

    public void setBill(int bill) {
        this.price = price;
    }

    public String getDate() {
        return d;
    }

    public void setDate(String date) {
        this.d = d;
    }
    
    
    
}
