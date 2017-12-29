package com.example.demo.domain;

/**
 * Created by ${MIND-ZR} on 2017/12/29.
 */
public class User {
    private int id;
    private String m_Name;
    private  int m_Age;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", m_Name='" + m_Name + '\'' +
                ", m_Age=" + m_Age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public int getM_Age() {
        return m_Age;
    }

    public void setM_Age(int m_Age) {
        this.m_Age = m_Age;
    }
}
