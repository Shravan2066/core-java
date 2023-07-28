package com.xworkz.encapsulation;

public class Newspaper {
    private String name;
    private String publisher;
    private String language;
    private int totalPages;
    private String datePublished;

    // Getters
    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public String getDatePublished() {
        return datePublished;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", totalPages=" + totalPages +
                ", datePublished='" + datePublished + '\'' +
                '}';
    }
}
