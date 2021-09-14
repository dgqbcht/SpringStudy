package org.dgqbcht.springstudy.bean;

/**
 * 注入8种原生数据类型+String
 */
public class Person2 {
    private byte myByte;
    private short myShort;
    private int myInt;
    private long myLong;
    private float myFloat;
    private double myDouble;
    private char myChar;
    private boolean myBoolean;
    private String myString;

    public void setMyByte(byte myByte) {
        this.myByte = myByte;
    }

    public void setMyShort(short myShort) {
        this.myShort = myShort;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }

    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    public void setMyBoolean(boolean myBoolean) {
        this.myBoolean = myBoolean;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "myByte=" + myByte +
                ", myShort=" + myShort +
                ", myInt=" + myInt +
                ", myLong=" + myLong +
                ", myFloat=" + myFloat +
                ", myDouble=" + myDouble +
                ", myChar=" + myChar +
                ", myBoolean=" + myBoolean +
                ", myString='" + myString + '\'' +
                '}';
    }
}
