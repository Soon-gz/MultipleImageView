package com.example.administrator.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    MultiImageView multiImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        multiImageView = (MultiImageView) findViewById(R.id.multiImage);

        List<String>imgs = new ArrayList<>();
        imgs.add("http://upload.chinaz.com/2015/1103/1446540614989.jpg");
        imgs.add("http://userimage8.360doc.com/16/0519/19/156649_201605191906460585727460.jpg");
        imgs.add("http://img.sinmeng.com/2017/01/18/1_151219124049_2.jpg");
        imgs.add("http://joymepic.joyme.com/article/uploads/20163/111460364908999742.jpeg?imageView2/1");
        imgs.add("http://joymepic.joyme.com/article/uploads/20163/111460364909699286.jpeg?imageView2/1");
        imgs.add("http://img4.imgtn.bdimg.com/it/u=2963995585,3532148334&fm=214&gp=0.jpg");
        imgs.add("http://userimage7.360doc.com/16/0114/19/5247515_201601141943070361263319.jpg");
        imgs.add("http://userimage8.360doc.com/17/0118/19/156649_201701181902460952150615.jpg");

        multiImageView.setList(imgs);

    }
}
