package com.example.myfirsttask;

public class ObjectClass
{
    int mImageResource;
    String title1,title2,title3;

    public ObjectClass(int mImageResource,String title1,String title2,String title3)
    {
        this.mImageResource=mImageResource;
        this.title1=title1;
        this.title2=title2;
        this.title3=title3;
    }

    public int getImageResource() { return mImageResource; }

    public String getTitle1() { return title1; }

    public String getTitle2() { return title2; }

    public String getTitle3() { return title3; }
}
