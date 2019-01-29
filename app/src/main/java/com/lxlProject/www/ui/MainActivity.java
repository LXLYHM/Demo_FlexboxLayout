package com.lxlProject.www.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lxlProject.www.R;

/**
 * 首页
 * Created by dawnling on 2017/12/08.
 * http://my.csdn.net/?ref=toolbar
 * http://www.jianshu.com/u/8fd63a0d4c4c
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Recycleview实现
     */
    public void  btnRecycleview(View v) {
        startActivity(new Intent(this, BtnRecycleviewActivity.class));
    }

    /**
     * 跳转Java语言界面
     */
    public void  btnJava(View v) {
        startActivity(new Intent(this, BtnJavaActivity.class));
    }

    /**
     * 跳转Kotlin语言界面
     */
    public void  btnKotlin(View v) {
    }
}

//class MainActivity : AppCompatActivity() {
//
//        override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        }
//
//        /**
//         * Recycleview实现
//         * @param v
//         */
//        fun btnRecycleview(v: View) {
//        startActivity(Intent(this, BtnRecycleviewActivity::class.java))
//        }
//
//        /**
//         * 跳转Java语言界面
//         * @param v
//         */
//        fun btnJava(v: View) {
//        startActivity(Intent(this, BtnJavaActivity::class.java))
//        }
//
//        /**
//         * 跳转Kotlin语言界面
//         * @param v
//         */
//        fun btnKotlin(v: View) {
//        BtnKotlinActivity.launch(this)
//        }
//        }
