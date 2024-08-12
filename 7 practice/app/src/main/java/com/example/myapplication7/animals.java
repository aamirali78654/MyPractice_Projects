package com.example.myapplication7;

public class animals

   {
       String img_text;
       int img_view;
       public animals(int img_view , String img_name)
       {
           this.img_text = img_name;
           this.img_view = img_view;

       }
       public int getimg()
       {
           return img_view;
       }
       public String getname()
       {
           return img_text;
       }
   }
