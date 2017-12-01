package com.deeplearning.app.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.deeplearning_app.R;
import com.deeplearning.app.fragment.Tab1PagerFragment;
import com.deeplearning.app.fragment.Tab2PagerFragment;
import com.deeplearning.app.fragment.Tab3PagerFragment;
import com.deeplearning.app.fragment.Tab4PagerFragment;
import com.deeplearning.app.widget.MainNavigateTabBar;


public class MainActivity2 extends AppCompatActivity {

    private static final String TAG_Page_GrapRedEnvelope = "抢红包";
    private static final String TAG_Page_GrapTrainTicket = "抢车票";
    private static final String TAG_Page_PersonSetting = "深度学习";
    private static final String TAG_Page_SeckillLowPrice = "秒低价";
    private static final String TAG_PAGE_AutoPlayGame = "玩游戏";
    private MainNavigateTabBar mNavigateTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigateTabBar = (MainNavigateTabBar) findViewById(R.id.mainTabBar);

        mNavigateTabBar.onRestoreInstanceState(savedInstanceState);

        mNavigateTabBar.addTab(Tab1PagerFragment.class, new MainNavigateTabBar.TabParam(R.drawable.comui_tab_home, R.drawable.comui_tab_home_selected, TAG_Page_GrapRedEnvelope));
        mNavigateTabBar.addTab(Tab2PagerFragment.class, new MainNavigateTabBar.TabParam(R.drawable.comui_tab_city, R.drawable.comui_tab_city_selected, TAG_Page_GrapTrainTicket));
        mNavigateTabBar.addTab(null, new MainNavigateTabBar.TabParam(0, 0, TAG_Page_PersonSetting));
        mNavigateTabBar.addTab(Tab3PagerFragment.class, new MainNavigateTabBar.TabParam(R.drawable.comui_tab_message, R.drawable.comui_tab_message_selected, TAG_Page_SeckillLowPrice));
        mNavigateTabBar.addTab(Tab4PagerFragment.class, new MainNavigateTabBar.TabParam(R.drawable.comui_tab_person, R.drawable.comui_tab_person_selected, TAG_PAGE_AutoPlayGame));
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mNavigateTabBar.onSaveInstanceState(outState);
    }


    public void onClickPublish(View v) {
        Toast.makeText(this, "训练学习", Toast.LENGTH_LONG).show();
    }
}
