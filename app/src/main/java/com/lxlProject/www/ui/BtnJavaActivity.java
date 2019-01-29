package com.lxlProject.www.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.google.android.flexbox.FlexboxLayout;
import com.lxlProject.www.R;
import com.lxlProject.www.bean.EvaluateBean;
import com.lxlProject.www.utils.VersionUtils;

import java.util.ArrayList;
import java.util.List;

public class BtnJavaActivity extends AppCompatActivity {

    private FlexboxLayout flexboxLayout;
    private List<EvaluateBean> mList = new ArrayList();
    private List<EvaluateBean> mListMore = new ArrayList();
    private FlexboxLayout flexboxLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_java);

        for (int i = 0; i < 6; i ++){
            mList.add(new EvaluateBean("标签选择测试字数和适应度" + i));
            mListMore.add(new EvaluateBean("标签选择测试字数和适应度" + i));
        }

        //服务评价 标签列表
        flexboxLayout = (FlexboxLayout) findViewById(R.id.flexboxLayout);
        flexboxLayout1 = (FlexboxLayout) findViewById(R.id.flexboxLayout1);
        for (int i = 0; i < mList.size(); i++) {
            addChildToFlexboxLayout(mList.get(i));
            addChildToFlexboxLayout1(mListMore.get(i));
        }
    }

    /**
     * 添加孩子到布局中 单选
     */
    private void addChildToFlexboxLayout(final EvaluateBean bean) {
        View view = LayoutInflater.from(this).inflate(R.layout.item_evaluate, null);
        TextView tv = view.findViewById(R.id.tv);
        tv.setText(bean.name);
        view.setTag(bean);
        if (bean.checked) {
            tv.setBackgroundResource(R.drawable.shape_evaluate_lable);
            tv.setTextColor(VersionUtils.getColor(R.color.colorOrange));
        } else {
            tv.setBackgroundResource(R.drawable.shape_evaluate_item);
            tv.setTextColor(VersionUtils.getColor(R.color.colorTextPrimaryMoreLight));
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bean.checked = true;
                for (EvaluateBean labelBean : mList) {
                    if (!labelBean.equals(bean)){
                        labelBean.checked = false;
                    }
                }
                checkLabeel();
            }
        });
        flexboxLayout.addView(view);
    }

    private void checkLabeel() {
        flexboxLayout.removeAllViews();
        for (EvaluateBean labelBean : mList) {
            addChildToFlexboxLayout(labelBean);
        }
    }

    /**
     * 添加孩子到布局中 多选
     */
    private void addChildToFlexboxLayout1(final EvaluateBean bean) {
        View view = LayoutInflater.from(this).inflate(R.layout.item_evaluate, null);
        TextView tv = view.findViewById(R.id.tv);
        tv.setText(bean.name);
        view.setTag(bean);
        if (bean.checked) {
            tv.setBackgroundResource(R.drawable.shape_evaluate_lable);
            tv.setTextColor(VersionUtils.getColor(R.color.colorOrange));
        } else {
            tv.setBackgroundResource(R.drawable.shape_evaluate_item);
            tv.setTextColor(VersionUtils.getColor(R.color.colorTextPrimaryMoreLight));
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bean.checked = !bean.checked;
                checkLabeel1();
            }
        });
        flexboxLayout1.addView(view);
    }

    private void checkLabeel1() {
        flexboxLayout1.removeAllViews();
        for (EvaluateBean labelBean : mListMore) {
            addChildToFlexboxLayout1(labelBean);
        }
    }
}
