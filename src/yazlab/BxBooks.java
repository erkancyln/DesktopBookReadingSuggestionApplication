/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yazlab;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author erkan
 */
@Entity
@Table(name = "bx-books", catalog = "db_yazilimlab_1", schema = "")
@NamedQueries({
    @NamedQuery(name = "BxBooks.findAll", query = "SELECT b FROM BxBooks b")
    , @NamedQuery(name = "BxBooks.findByIsbn", query = "SELECT b FROM BxBooks b WHERE b.isbn = :isbn")
    , @NamedQuery(name = "BxBooks.findByBookTitle", query = "SELECT b FROM BxBooks b WHERE b.bookTitle = :bookTitle")
    , @NamedQuery(name = "BxBooks.findByBookAuthor", query = "SELECT b FROM BxBooks b WHERE b.bookAuthor = :bookAuthor")
    , @NamedQuery(name = "BxBooks.findByYearOfPublication", query = "SELECT b FROM BxBooks b WHERE b.yearOfPublication = :yearOfPublication")
    , @NamedQuery(name = "BxBooks.findByPublisher", query = "SELECT b FROM BxBooks b WHERE b.publisher = :publisher")
    , @NamedQuery(name = "BxBooks.findByImageURLS", query = "SELECT b FROM BxBooks b WHERE b.imageURLS = :imageURLS")
    , @NamedQuery(name = "BxBooks.findByImageURLM", query = "SELECT b FROM BxBooks b WHERE b.imageURLM = :imageURLM")
    , @NamedQuery(name = "BxBooks.findByImageURLL", query = "SELECT b FROM BxBooks b WHERE b.imageURLL = :imageURLL")})
public class BxBooks implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "Book-Title")
    private String bookTitle;
    @Column(name = "Book-Author")
    private String bookAuthor;
    @Column(name = "Year-Of-Publication")
    private Integer yearOfPublication;
    @Column(name = "Publisher")
    private String publisher;
    @Column(name = "Image-URL-S")
    private String imageURLS;
    @Column(name = "Image-URL-M")
    private String imageURLM;
    @Column(name = "Image-URL-L")
    private String imageURLL;

    public BxBooks() {
    }

    public BxBooks(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        String oldIsbn = this.isbn;
        this.isbn = isbn;
        changeSupport.firePropertyChange("isbn", oldIsbn, isbn);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        String oldBookTitle = this.bookTitle;
        this.bookTitle = bookTitle;
        changeSupport.firePropertyChange("bookTitle", oldBookTitle, bookTitle);
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        String oldBookAuthor = this.bookAuthor;
        this.bookAuthor = bookAuthor;
        changeSupport.firePropertyChange("bookAuthor", oldBookAuthor, bookAuthor);
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        Integer oldYearOfPublication = this.yearOfPublication;
        this.yearOfPublication = yearOfPublication;
        changeSupport.firePropertyChange("yearOfPublication", oldYearOfPublication, yearOfPublication);
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        String oldPublisher = this.publisher;
        this.publisher = publisher;
        changeSupport.firePropertyChange("publisher", oldPublisher, publisher);
    }

    public String getImageURLS() {
        return imageURLS;
    }

    public void setImageURLS(String imageURLS) {
        String oldImageURLS = this.imageURLS;
        this.imageURLS = imageURLS;
        changeSupport.firePropertyChange("imageURLS", oldImageURLS, imageURLS);
    }

    public String getImageURLM() {
        return imageURLM;
    }

    public void setImageURLM(String imageURLM) {
        String oldImageURLM = this.imageURLM;
        this.imageURLM = imageURLM;
        changeSupport.firePropertyChange("imageURLM", oldImageURLM, imageURLM);
    }

    public String getImageURLL() {
        return imageURLL;
    }

    public void setImageURLL(String imageURLL) {
        String oldImageURLL = this.imageURLL;
        this.imageURLL = imageURLL;
        changeSupport.firePropertyChange("imageURLL", oldImageURLL, imageURLL);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (isbn != null ? isbn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BxBooks)) {
            return false;
        }
        BxBooks other = (BxBooks) object;
        if ((this.isbn == null && other.isbn != null) || (this.isbn != null && !this.isbn.equals(other.isbn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "yazlab.BxBooks[ isbn=" + isbn + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
