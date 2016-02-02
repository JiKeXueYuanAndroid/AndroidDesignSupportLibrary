package com.example.administrator.helloas;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/2/2.
 */
@SuppressLint("ValidFragment")
public class MyFragment extends Fragment {

    String title;

    public MyFragment(String title){
        this.title = title;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my, container, false);

        TextView tv = (TextView) v.findViewById(R.id.tv_fragment);
        tv.setText(title);

        return v;
    }
}
