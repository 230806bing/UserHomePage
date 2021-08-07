package com.example.userhomepage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.zhy.view.flowlayout.FlowLayout;
import com.zhy.view.flowlayout.TagAdapter;
import com.zhy.view.flowlayout.TagFlowLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private AppBarLayout detail_card;
    private View detail_close_bar;
    List<Item> items = new ArrayList<>();
    ArrayList tag_list;
    TagFlowLayout tag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToolClass.hide(this);

        detail_card = findViewById(R.id.detail_top_bar);
        detail_close_bar = findViewById(R.id.detail_close_bar);
        detail_card.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                int offset = Math.abs(i);
                int total = appBarLayout.getTotalScrollRange();

                if(offset <= total/2){
                    detail_close_bar.setVisibility(View.GONE);
                }else {
                    detail_close_bar.setVisibility(View.VISIBLE);
                }
            }
        });
        initController();
        initTag();
        initListener();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        ItemAdapter itemAdapter =new ItemAdapter(items);
        recyclerView.setAdapter(itemAdapter);

        initData();
    }

    private void initListener() {
        tag.setAdapter(new TagAdapter<String>(tag_list) {
            @Override
            public View getView(FlowLayout parent, int position, String  s) {
                TextView tv = (TextView) LayoutInflater.from(MainActivity.this).inflate(R.layout.tv_style,parent,false);
                tv.setText(s);
                return tv;
            }

        });
    }

    private void initTag() {
        tag_list.add("球鞋");
        tag_list.add("衣服");
        tag_list.add("国风");
        tag_list.add("穿搭");
        tag_list.add("休闲");
        tag_list.add("赛博朋克");
    }

    private void initController() {
        tag_list = new ArrayList<>();
        tag = findViewById(R.id.tag);

    }

    private void initData() {
        for (int i = 0;i<4;i++){
            Item item1 = new Item(R.drawable.img1,"一级标题一级标题一级标题一级标题",R.drawable.img,"114","374");
            items.add(item1);
            Item item2 = new Item(R.drawable.a,"一级标题一级标题一级标题一级标题",R.drawable.img,"1314","3734");
            items.add(item2);
        }
    }
}