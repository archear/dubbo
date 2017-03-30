package com.issic.dubbo.impl;

import cn.arch.iinterface.OnePlues;

/**
 * Created by archer on 2017/3/30.
 */
public class OnePluesImpl implements OnePlues {
    public Integer addOne(Integer integer) {
        return integer++;
    }
}
