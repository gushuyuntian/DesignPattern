package com.pattern.Prototype.demo1;
public class Prototype implements Cloneable {  

    public Object clone() throws CloneNotSupportedException {  
        Prototype proto = (Prototype) super.clone();  
        return proto;  
    }  
}  