package com.example.designapp;

public class MyWord {

    int mimg1;
    int mimg2;
    String mtitle;
    String mlocation;

    public MyWord(int img1,int img2,String title,String location){
        mimg1=img1;
        mimg2=img2;
        mtitle=title;
        mlocation=location;
        }
        public int getimg1(){return mimg1;}
        public int getimg2(){return mimg2;}
        public String getloc(){return mlocation;}
        public String getitle(){return mtitle;}
    }

