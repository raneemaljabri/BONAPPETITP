/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonappetitp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author noufa
 */
@Entity
@Table(name="Orders")
public class orders {
@Id
@Column(name="num")
private int num;
@Column(name="dishes")
private String dishes;
@Column(name="notes")
private String note;

    public orders() {
    }

    public String getdishes() {
        return dishes;
    }

    public void setdishes(String order) {
        this.dishes = order;
        num++;
    }
     public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }



    
     
}
