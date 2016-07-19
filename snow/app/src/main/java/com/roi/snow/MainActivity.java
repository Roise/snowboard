package com.roi.snow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView mImageView;
    PhotoViewAttacher mAttacher;
    Button mButton1, mButton2;

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
        mButton1.setOnClickListener(this);
        mButton2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.movie01:
                Intent intent = new Intent(getApplicationContext(), MovieActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                //AIzaSyBQsA6XCTkEEHcQnLgy-HgS6uB7TgrPLEE
                break;

            case R.id.movie02:
                Intent intent1 = new Intent(getApplicationContext(), MovieActivity.class);
                intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent1);
                break;
        }
    }
}
