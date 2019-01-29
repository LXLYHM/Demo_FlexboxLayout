package com.lxlProject.www.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.lxlProject.www.R;
import com.lxlProject.www.adapter.EvaluateAdapter;
import com.lxlProject.www.bean.EvaluateBean;

import java.util.ArrayList;
import java.util.List;

public class BtnRecycleviewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private List<EvaluateBean> mList = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_recycleview);

        for (int i = 0; i < 10; i ++){
            mList.add(new EvaluateBean("标签选择测试字数和适应度" + i));
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        EvaluateAdapter mAdapter = new EvaluateAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setNewData(mList);
    }
}