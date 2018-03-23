package com.example.springjava8.java8.demo1.code;

import com.example.springjava8.java8.demo1.model.Artist;

import java.util.HashMap;

public class DemoForAction {

//    IActionInterface iActionInterface = new IActionInterface() {
//        @Override
//        public void actionPerformed(Artist artist) {
//
//        }
//    };

    // lambda test
    IActionInterface iActionInterfaceJ8 = artist -> System.out.println("输出。。。");
}
