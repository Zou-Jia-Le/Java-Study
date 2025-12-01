package com.imooc.practice_14_17_7;

public class Book {
    //成员变量
    private String bookName;//书籍名

    //getter、setter方法
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //构造方法
    public Book() {
    }
    public Book(String bookName) {
        this.bookName = bookName;
    }

    //成员方法
    @Override
    public String toString() {
        return this.bookName;
    }
}
