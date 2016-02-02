package com.example.administrator.helloas;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MainActivity extends FragmentActivity {
    @InjectView(R.id.tabs)
    TabLayout tabs;
    @InjectView(R.id.vp)
    ViewPager vp;


    /* @InjectView(R.id.fab)
     FloatingActionButton fab;
     @InjectView(R.id.textInput)
     TextInputLayout til;*/
   /* @InjectView(R.id.tabs)
    TabLayout tabs;
    @InjectView(R.id.vp)
    ViewPager vp;*/

    /*@OnClick(R.id.fab)
    public void click() {
        final Snackbar snackbar = Snackbar.make(fab, "你惦记了按钮", Snackbar.LENGTH_LONG);
        snackbar.show();
        snackbar.setAction("知道了", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        ButterKnife.inject(this);


       /* til.setHint("请输入用户名");

        EditText et = til.getEditText();

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 10) {
                    til.setError("不得超过10位");
                    til.setErrorEnabled(true);
                } else {
                    til.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/

      /*  tabs.addTab(tabs.newTab().setText("故事"));
        tabs.addTab(tabs.newTab().setText("活动"));
        tabs.addTab(tabs.newTab().setText("校园"));
        tabs.addTab(tabs.newTab().setText("故事"));
        tabs.addTab(tabs.newTab().setText("活动"));
        tabs.addTab(tabs.newTab().setText("校园"));
        tabs.addTab(tabs.newTab().setText("故事"));
        tabs.addTab(tabs.newTab().setText("活动"));
        tabs.addTab(tabs.newTab().setText("校园"));*/

        List<String> list_string = new ArrayList<String>();
        List<Fragment> list_fragment = new ArrayList<Fragment>();

        for (int i = 0; i < 4; i++) {
            String str = "Tab" + (i + 1);
            tabs.addTab(tabs.newTab().setText(str));
            list_string.add(str);
            Fragment fragment = new MyFragment(str);
            list_fragment.add(fragment);
        }

        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),
                list_string, list_fragment);

        vp.setAdapter(adapter);

        tabs.setupWithViewPager(vp);
        tabs.setTabsFromPagerAdapter(adapter);


    }
}
