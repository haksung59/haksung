package test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    @Column(name = "id", nullable = false)
    private String id;
    @Column
    private String pw;
    @Column
    private String name;
    @Column
    private String sex;

    public Member(String id, String pw, String name, String sex) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.sex = sex;
    }

    public Member() {
    }

    public Member(String id, String pw) {
        this.id = id;
        this.pw = pw;
        this.name="";
        this.sex="";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
