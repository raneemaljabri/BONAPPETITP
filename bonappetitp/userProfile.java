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
@Table(name="USERPROFILE")
public class userProfile {
@Id
@Column(name="PhoneNum")
private int phone ;
@Column(name="Fullname")
private String name;
@Column(name="Email")
private String Email;
@Column(name="passwords")
private String password;
@Column(name="dop")
private String dop;
//@Column(name="dishes")
//private String dish;
@Column(name="City")
private String city;
@Column(name="Gender")
private String gender;

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDop(String dop) {
        this.dop = dop;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public String getDop() {
        return dop;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }


    public userProfile() {
    }

    public userProfile(String fullname, int phoneNum) {
        this.name = fullname;
        this.phone = phoneNum;
    }

    public String getFullname() {
        return name;
    }

    public int getPhoneNum() {
        return phone;
    }
//
//    public String getDish() {
//        return dish;
//    }
//
//    public void setDish(String dish) {
//        this.dish = dish;
//    }
//    

    public String getName() {
        return name;
    }

    public void setFullname(String fullname) {
        this.name = fullname;
    }

    public void setPhoneNum(int phoneNum) {
        this.phone = phoneNum;
    }
    
}
