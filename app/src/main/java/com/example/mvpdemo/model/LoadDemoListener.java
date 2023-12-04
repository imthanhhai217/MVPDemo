package com.example.mvpdemo.model;

import com.example.mvpdemo.model.entity.Demo;

import java.util.List;

/**
 * Created by LynkMieu on 7/6/2017.
 */

public interface LoadDemoListener {
    void onLoadDemoSuccess(List<Demo> listDemo);
    void onLoadDemoFailure(String message);
}
