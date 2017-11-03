package com.example.lurenman.mvvmdemo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.example.lurenman.mvvmdemo.databinding.ActivityMvvmBinding;

/**
 * @author: baiyang.
 * Created on 2017/11/3.
 */

public class MvvmActivity extends Activity {
    ActivityMvvmBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        Student student = new Student("lurenman", "xiaomanman");
        binding.setStudent(student);
        binding.setSex("男");
        binding.setTeacher(new Teacher(this,"teacher"));
        binding.setController(new Controller());
    }
    public class Controller {
        public void ceshi(View view)
        {
            Toast.makeText(getApplicationContext(), "aaaaaaaaaaa", Toast.LENGTH_SHORT).show();
        }

    }



}
