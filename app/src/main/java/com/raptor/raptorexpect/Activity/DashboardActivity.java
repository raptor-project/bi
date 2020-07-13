package com.raptor.raptorexpect.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

 import com.raptor.raptorexpect.Fragments.CourseFragments;
import com.raptor.raptorexpect.Fragments.Fundometer;
import com.raptor.raptorexpect.Fragments.Predictorfragment;
import com.raptor.raptorexpect.R;

public class DashboardActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    FragmentPagerAdapter mypagerAdapter;
    ViewPager viewPager;
    TextView txtgoodnnon,txtusrname,txtselected;
    ImageView imgfundometer,imgcourse,imgexam,imgmock,imgpredictor;
    RelativeLayout relact;
    Animation animswipeup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initView();
    }

    private void initView() {
         txtgoodnnon = findViewById(R.id.txtgoodnoon);
        txtusrname = findViewById(R.id.txtusername);
        txtselected = findViewById(R.id.txtselected);
        imgfundometer = findViewById(R.id.imgfundometer);
        imgcourse = findViewById(R.id.imgcourse);
        imgexam = findViewById(R.id.imgexam);
        imgmock = findViewById(R.id.imgmock);
        imgpredictor = findViewById(R.id.imgpredictor);
        viewPager = (ViewPager)findViewById(R.id.viewpager);
          mypagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(mypagerAdapter);
        Typeface font = Typeface.createFromAsset(getAssets(), "robotoregular.ttf");
        txtgoodnnon.setTypeface(font);
        Typeface font1 = Typeface.createFromAsset(getAssets(), "robotobold.ttf");
        txtusrname.setTypeface(font1);
        txtselected.setTypeface(font);
        viewPager.addOnPageChangeListener(this);
        imgfundometer.setImageResource(R.drawable.ic_fundometerblur);
        animswipeup = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.anim);
        imgfundometer.setAnimation(animswipeup);

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

     @Override
    public void onPageSelected(int position) {
        Log.e("ViewPager",position+"");
        switch (position){
            case 0:
                imgfundometer.setImageResource(R.drawable.ic_fundometerblur);
                imgcourse.setImageResource(R.drawable.ic_courses_active);
                imgexam.setImageResource(R.drawable.ic_exam_active);
                imgmock.setImageResource(R.drawable.ic_mock_active);
                imgpredictor.setImageResource(R.drawable.ic_predictor_active);
                txtselected.setText("Fundometer");
                 imgfundometer.setClickable(true);
                animswipeup = AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anim);
                imgfundometer.setAnimation(animswipeup);
                 break;
            case 1:
                imgcourse.setImageResource(R.drawable.ic_coursesblur);
                 txtselected.setText("Courses");
                imgfundometer.setImageResource(R.drawable.ic_fundometer_active);
                imgexam.setImageResource(R.drawable.ic_exam_active);
                imgmock.setImageResource(R.drawable.ic_mock_active);
                imgpredictor.setImageResource(R.drawable.ic_predictor_active);


                break;
            case 2:
                imgexam.setImageResource(R.drawable.ic_examblur);
                 txtselected.setText("Exam papers");
                imgfundometer.setImageResource(R.drawable.ic_fundometer_active);
                imgcourse.setImageResource(R.drawable.ic_courses_active);
                 imgmock.setImageResource(R.drawable.ic_mock_active);
                imgpredictor.setImageResource(R.drawable.ic_predictor_active);


                break;
            case 3:
                imgmock.setImageResource(R.drawable.ic_mock_activeblur);
                txtselected.setText("Mock test");
                imgfundometer.setImageResource(R.drawable.ic_fundometer_active);
                imgcourse.setImageResource(R.drawable.ic_courses_active);
                imgexam.setImageResource(R.drawable.ic_exam_active);
                 imgpredictor.setImageResource(R.drawable.ic_predictor_active);


                break;
            case 4:
                imgpredictor.setImageResource(R.drawable.ic_predictorblur);
                 txtselected.setText("Predictor");
                imgfundometer.setImageResource(R.drawable.ic_fundometer_active);
                imgcourse.setImageResource(R.drawable.ic_courses_active);
                imgexam.setImageResource(R.drawable.ic_exam_active);
                imgmock.setImageResource(R.drawable.ic_mock_active);

                break;


        }


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 5;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return CourseFragments.newInstance(0, "Page # 1");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return Fundometer.newInstance(1, "Page # 2");
                case 2: // Fragment # 1 - This will show SecondFragment
                    return Fundometer.newInstance(2, "Page # 3");
                case 3: // Fragment # 1 - This will show SecondFragment
                    return Fundometer.newInstance(3, "Page # 3");
                case 4: // Fragment # 1 - This will show SecondFragment
                    return Predictorfragment.newInstance(4, "Page # 3");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

    }

}
