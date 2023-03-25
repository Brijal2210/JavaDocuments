package com.stringPackage;

import java.util.Locale;

public class TopicOfString {
    public static void main(String[] args) {
        // StringBuffer -- if i want to reverse something, use StringBuffer class and create an object
        String newName= "jatin";    //nitaj -- reverse


        StringBuffer stringBuffer = new StringBuffer(newName);
        System.out.println(stringBuffer.reverse());

        String name = "Brijal + Jatinkumar + Chothani"; //total length = 30
        String address = "   Waford WD194AB";
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toLowerCase(Locale.ROOT));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.intern() == newName.intern());
        System.out.println(address.trim());
        System.out.println(address.replace("WD194AB","WD19 4AB"));
        System.out.println(name.concat(address));
        System.out.println(name.contains("Brijalben"));

    }

}
