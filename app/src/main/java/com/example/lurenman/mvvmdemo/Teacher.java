package com.example.lurenman.mvvmdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * @author: baiyang.
 * Created on 2017/11/3.
 */

public class Teacher {
    private Context mContext;
    private String name;
    public Teacher(Context context) {
        mContext=context;
    }

    public Teacher(Context mContext, String name) {
        this.mContext = mContext;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void toast()
    {
        Toast.makeText(mContext, "haha", Toast.LENGTH_SHORT).show();
    }
}
