package com.roi.snow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.roi.snow.util.NavigationUtil;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView mImageView;
    private PhotoViewAttacher mAttacher;
    private Button mButton1, mButton2, mButton3, mButton4, mButton5, mButton6,  mButton7, mButton8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        // Any implementation of ImageView can be used!
        mImageView = (ImageView) findViewById(R.id.iv_photo);

        // Attach a PhotoViewAttacher, which takes care of all of the zooming functionality.
        // (not needed unless you are going to change the drawable later)
        mAttacher = new PhotoViewAttacher(mImageView);
    }

    private void initView() {
        mButton1 = (Button)findViewById(R.id.movie01);
        mButton2 = (Button)findViewById(R.id.movie02);
        mButton3 = (Button)findViewById(R.id.movie03);
        mButton4 = (Button)findViewById(R.id.movie04);
        mButton5 = (Button)findViewById(R.id.movie05);
        mButton6 = (Button)findViewById(R.id.movie06);
        mButton7 = (Button)findViewById(R.id.movie07);
        mButton8 = (Button)findViewById(R.id.movie08);

        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
        mButton3.setOnClickListener(this);
        mButton4.setOnClickListener(this);
        mButton5.setOnClickListener(this);
        mButton6.setOnClickListener(this);
        mButton7.setOnClickListener(this);
        mButton8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.movie01:
                NavigationUtil.gotoMovie(this);

                break;

            case R.id.movie02:
            case R.id.movie03:
            case R.id.movie04:
            case R.id.movie05:
            case R.id.movie06:
            case R.id.movie07:
            case R.id.movie08:
                NavigationUtil.gotoMovie(this);
                break;
        }
    }
}
