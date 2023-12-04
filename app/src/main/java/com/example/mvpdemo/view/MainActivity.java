package com.example.mvpdemo.view;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvpdemo.R;
import com.example.mvpdemo.model.entity.Demo;
import com.example.mvpdemo.presenter.MainPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    //Presenter
    private MainPresenter mainPresenter;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPresenter();
        Button btnLoad = findViewById(R.id.btn_load_data);
        listView = findViewById(R.id.list_view);

        btnLoad.setOnClickListener(v -> mainPresenter.loadData());
    }

    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void displayMain(List<Demo> listDemo) {
        listView.setAdapter(new ArrayAdapter<Demo>(this, android.R.layout.simple_list_item_1, listDemo));
    }
}
