package kg.megacom;

import java.util.Date;

public class Library {
    private String writer;
    private int yearOfPublished;
    private Date dateOfReceived;
    private String composition;

    public Library() {
    }

    public Library(String writer, int yearOfPublished, Date dateOfReceived, String composition) {
        this.writer = writer;
        this.yearOfPublished = yearOfPublished;
        this.dateOfReceived = dateOfReceived;
        this.composition = composition;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public Date getDateOfReceived() {
        return dateOfReceived;
    }

    public void setDateOfReceived(Date dateOfReceived) {
        this.dateOfReceived = dateOfReceived;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String  toString() {
        return "Library{" +
                "writer='" + writer + '\'' +
                ", yearOfPublished=" + yearOfPublished +
                ", dateOfReceived=" + dateOfReceived +
                ", composition='" + composition + '\'' +
                '}';
    }
}
