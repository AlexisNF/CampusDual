package org.campusdual.bootcamp.ingenieros;

import java.util.Date;
import java.util.LinkedList;

public class Post {
    private Date date;
    private String text;
    private String imageTitle;
    private String imageDimension;
    private String videoTitle;


    public Post(Date date, String text, String imageTitle, String imageDimension, String videoTitle, LinkedList<Comment> comments) {
        this.date = date;
        this.text = text;
        this.imageTitle = imageTitle;
        this.imageDimension = imageDimension;
        this.videoTitle = videoTitle;
        this.comments = comments;
    }

    private LinkedList<Comment> comments = new LinkedList<Comment>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /*Post. Contendrá fecha y lista de comentarios.
    Además, podrá ser un texto (que deberá tener un String con el contenido),
    una imagen (deberá tener un título y dimensiones) o un vídeo (que tendrá título,
    calidad y duración en segundos).
    */

}
