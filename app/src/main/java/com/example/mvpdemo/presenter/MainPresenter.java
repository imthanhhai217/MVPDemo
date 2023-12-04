package com.example.mvpdemo.presenter;
import com.example.mvpdemo.model.LoadDemoListener;
import com.example.mvpdemo.model.UserInterator;
import com.example.mvpdemo.model.entity.Demo;
import com.example.mvpdemo.view.MainView;

import java.util.List;

/**
 * - Presenter: Là lớp xử lý logic từ dữ liệu nhận được.
 * - Nhận dữ liệu từ lớp Model
 * - Đẩy dữ liệu lên lớp V.
 */

public class MainPresenter implements LoadDemoListener {
    private UserInterator mainInterator;
    private MainView mainView;
    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
        mainInterator = new UserInterator(this);
    }

    public void loadData() {
        mainInterator.createListData();
    }

    @Override
    public void onLoadDemoSuccess(List<Demo> listDemo) {
        mainView.displayMain(listDemo);
    }

    @Override
    public void onLoadDemoFailure(String message) {
        //Làm gì đó nếu xảy ra lỗi.
    }
}
