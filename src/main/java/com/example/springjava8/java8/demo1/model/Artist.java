package com.example.springjava8.java8.demo1.model;

import org.springframework.stereotype.Component;


/**
 * 对象式
 */
@Component
public class Artist {
    private String name;
    private String[] members;
    private String origin;
    private Album[] albums;

    // 专辑中的一支曲目
    public static class Track{
        private  String name;
    }

    // 专辑,由若干曲目组成
    public static class Album{
        private String name;
        private Track[] tracks;
        private String[] musicians;
    }
}
