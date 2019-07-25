package com.proto.sun.prototype;

public class Book implements Cloneable{

    private String title;

    private int pageNum;

    private  Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
