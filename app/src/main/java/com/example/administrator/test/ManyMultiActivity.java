package com.example.administrator.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.administrator.test.recyclerview.BaseRecyclerAdapter;
import com.example.administrator.test.recyclerview.BaseRecyclerViewHolder;

import java.util.ArrayList;
import java.util.List;

public class ManyMultiActivity extends AppCompatActivity {

    private BaseRecyclerAdapter<ImageUrls> adapter;
    private List<ImageUrls> manyGrils = new ArrayList<>();
    private RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_many_multi);
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);

        for (int i = 0; i < 10; i++) {
            ImageUrls imageUrls = new ImageUrls();
            List<String>imgs = new ArrayList<>();
            imgs.add("http://upload.chinaz.com/2015/1103/1446540614989.jpg");
            imgs.add("http://userimage8.360doc.com/16/0519/19/156649_201605191906460585727460.jpg");
            imgs.add("http://img.sinmeng.com/2017/01/18/1_151219124049_2.jpg");
            imgs.add("http://joymepic.joyme.com/article/uploads/20163/111460364908999742.jpeg?imageView2/1");
            imgs.add("http://joymepic.joyme.com/article/uploads/20163/111460364909699286.jpeg?imageView2/1");
            imgs.add("http://img4.imgtn.bdimg.com/it/u=2963995585,3532148334&fm=214&gp=0.jpg");
            imgs.add("http://userimage7.360doc.com/16/0114/19/5247515_201601141943070361263319.jpg");
            imgs.add("http://userimage8.360doc.com/17/0118/19/156649_201701181902460952150615.jpg");
            imageUrls.setImageUrls(imgs);
            manyGrils.add(imageUrls);
        }

        adapter = new BaseRecyclerAdapter<ImageUrls>(this,manyGrils) {
            @Override
            public int getItemLayoutId(int viewType) {
                return R.layout.item_imageview;
            }

            @Override
            public void bindData(BaseRecyclerViewHolder holder, int position, ImageUrls item) {
                MultiImageView imageView = (MultiImageView) holder.getView(R.id.item_multiimage);
                imageView.setList(item.getImageUrls());
                imageView.setOnItemClickListener(new MultiImageView.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Toast.makeText(ManyMultiActivity.this, "选中了"+position+"号小姐~", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        };

        recyclerview.setHasFixedSize(true);
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
        recyclerview.setItemAnimator(new DefaultItemAnimator());

    }


}
