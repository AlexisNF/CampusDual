package org.campusdual.bootcamp.ingenieros;

import java.util.Date;

public class Comment {

    private String texto;
    private Date date;
    private int userId;

    public Comment(String texto, Date date, int userId) {
        this.texto = texto;
        this.date = date;
        this.userId = userId;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    /*
    Comentarios. Los comentarios tendrán un texto, una fecha y un propietario que ha de ser un usuario.

 */
}
