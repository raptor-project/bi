package com.raptor.raptorexpect.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

 import com.raptor.raptorexpect.Models.QuotesData;
import com.raptor.raptorexpect.R;

import java.util.ArrayList;
import java.util.Collections;

public class HomeActivity extends AppCompatActivity {

    ArrayList<Integer> images = new ArrayList<>();
    ArrayList<QuotesData> quotesDatalist = new ArrayList<>();
    ImageView imageView,imgstep;
    TextView txtquotes,txtauthor,stepinTextView,userNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }


    private void initView() {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView = findViewById(R.id.homeimage);
        txtquotes = findViewById(R.id.txtquotes);
        txtauthor = findViewById(R.id.txtauthor);
        stepinTextView=findViewById(R.id.stepinTextView);
        userNameTextView=findViewById(R.id.userNameTextView);
        imgstep= (ImageView)findViewById(R.id.imgstep);

        images.add(R.drawable.one);
        images.add(R.drawable.two);
        images.add(R.drawable.three);
        images.add(R.drawable.four);
        images.add(R.drawable.five);
        images.add(R.drawable.six);
        images.add(R.drawable.seven);
        images.add(R.drawable.eight);
        images.add(R.drawable.nine);
        images.add(R.drawable.ten);
        images.add(R.drawable.eleven);
        images.add(R.drawable.tweleve);
        images.add(R.drawable.thirteen);
        images.add(R.drawable.fourteen);
        images.add(R.drawable.fifteen);
        images.add(R.drawable.sixteen);
        images.add(R.drawable.seventeen);
        images.add(R.drawable.eightteen);
        images.add(R.drawable.nineteen);
        images.add(R.drawable.twenty);
        images.add(R.drawable.twentyone);
        images.add(R.drawable.twentyfour);
        images.add(R.drawable.twentyfive);
        images.add(R.drawable.twentysix);
        images.add(R.drawable.twentyseven);
        images.add(R.drawable.twentyeight);
        images.add(R.drawable.twentynine);
        Collections.shuffle(images);
        imageView.setImageResource(images.get(0));

        QuotesData quotesData;
        quotesData = new QuotesData("Talent without working hard is nothing.","Cristiano Ronaldo");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("There are no shortcuts to any place worth going.","Beverly Sills");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Failure is the opportunity to begin again more intelligently.","Henry Ford");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("If you dream it, you can do it.","Walt Disney.");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Never, never, never give up.","Winston Churchill.");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Don’t wait. The time will never be just right.","Napoleon Hill");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Hope is a waking dream.","Aristotle");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Action is the foundational key to all success.","Pablo Picasso");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Don’t regret the past, just learn from it.","Ben Ipock");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Believe you can and you’re halfway there.","Theodore Roosevelt");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("A jug fills drop by drop.","Buddha");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("The obstacle is the path.","Zen Proverb");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("The best revenge is massive success.","Frank Sinatra");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("The best way out is always through.","Robert Frost");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Hope is the heartbeat of the soul.","Michelle Horst");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Don't cry because it's over, smile because it happened.","Dr. Seuss");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Opportunities don't happen. You create them.","Chris Grosser");
        quotesDatalist.add(quotesData);
        quotesData=new QuotesData("Once you choose hope, anything's possible.","Christopher Reeve");
        quotesDatalist.add(quotesData);
        Collections.shuffle(quotesDatalist);
        txtquotes.setText(quotesDatalist.get(0).getQuotes());
        txtauthor.setText("- "+quotesDatalist.get(0).getAuthor());

        Typeface fontass = Typeface.createFromAsset(getAssets(), "robotolight.ttf");
        userNameTextView.setTypeface(fontass);

        Typeface font = Typeface.createFromAsset(getAssets(), "sanlight.ttf");
        txtquotes.setTypeface(font);

        Typeface fonta = Typeface.createFromAsset(getAssets(), "sanitalic.ttf");
        txtauthor.setTypeface(fonta);

        imgstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(HomeActivity.this,DashboardActivity.class);
                startActivity(in);
            }
        });
    }
}
