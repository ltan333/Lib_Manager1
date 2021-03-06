/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.manager;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Book implements Serializable{

    public double money;
    public String bookname;
    public String author;
    public String kind;
    public boolean borrowed;
    public String condition;
    public int amount;
    public String ID;

    public Book() {
        this.borrowed = false;
    }

    public Book(double money, String bookname, String Author, String kind, boolean borrowed, String condition) {
        this.money = money;
        this.bookname = bookname;
        this.author = Author;
        this.kind = kind;
        this.borrowed = borrowed;
        this.condition = condition;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String Author) {
        this.author = Author;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean getBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    transient Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("----------- NH???P TH??NG TIN S??CH -----------");
        System.out.print("- T??n: ");
        this.setBookname(sc.nextLine());
        System.out.print("- T??c gi???: ");
        this.setAuthor(sc.nextLine());
        System.out.print("- Th??? lo???i: ");
        this.setKind(sc.nextLine());
        System.out.print("- T??nh tr???ng: ");
        this.setCondition(sc.nextLine());
        System.out.print("- Gi?? ti???n (ngh??n VN??): ");
        this.setMoney(sc.nextDouble());
        sc.nextLine();
    }

    public void display() {
        System.out.println("----------- TH??NG TIN S??CH -----------");
        System.out.println("- M?? s??ch: " + this.getID());
        System.out.println("- T??n s??ch: " + this.getBookname());
        System.out.println("- T??c gi???: " + this.getAuthor());
        System.out.println("- Th??? lo???i s??ch: " + this.getKind());
        System.out.println("- T??nh tr???ng s??ch: " + this.getCondition());
        System.out.println("- Gi?? s??ch (ngh??n VN??): " + this.getMoney());
        System.out.println("- ??ang m?????n: " + this.getBorrowed());
    }

    public void displayF() {
        System.out.format("ID: %s   T??n: %s   Th??? lo???i: %s   T??c gi???: %s   S??? l?????ng: %d   ??ang m?????n: %s %n", this.getID(), this.getBookname(), this.getKind(), this.getAuthor(), this.getAmount(), this.getBorrowed());
    }
}
