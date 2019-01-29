package com.lxlProject.www.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lxlProject.www.R;
import com.lxlProject.www.bean.EvaluateBean;

/**
 * Created by dawnling on 2017/12/8.
 */

public class EvaluateAdapter extends BaseQuickAdapter<EvaluateBean, BaseViewHolder> {

    public EvaluateAdapter(){
        super(R.layout.item_evaluate);
    }

    @Override
    protected void convert(BaseViewHolder helper, EvaluateBean item) {
        helper.setText(R.id.tv, item.name);
    }
}
