package com.example.chapter3.homework;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.airbnb.lottie.LottieAnimationView;

import javax.sql.StatementEvent;

public class PlaceholderFragment extends Fragment {
    private String[] data = {"aa", "bb", "cc", "dd", "aa", "bb", "cc", "dd", "aa", "bb", "cc", "dd", "aa", "bb", "cc", "dd"};
    private static final String TAG = "PlaceholderFragment";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_placeholder, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG, "onActiveCreated");
        final LottieAnimationView animationView = (LottieAnimationView) getActivity().findViewById(R.id.animation_view);
        final ListView listView = (ListView) getActivity().findViewById(R.id.list_view);

        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // 这里会在 5s 后执行
                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入
            }
        }, 5000);
    }
}
