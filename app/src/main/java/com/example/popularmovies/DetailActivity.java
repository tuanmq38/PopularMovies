package com.example.popularmovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {
    ImageView poster;
    TextView title, rating, description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        poster = findViewById(R.id.imageViewPoster);
        title = findViewById(R.id.textViewTitle);
        rating = findViewById(R.id.textViewRating);
        description = findViewById(R.id.textViewDescripsion);

        Bundle bundle = getIntent().getExtras();

        String mTitle = bundle.getString("title");
        String mDesc = bundle.getString("overview");
        String mPoster = bundle.getString("poster");
        Double mRating = bundle.getDouble("rating");

        Picasso.get().load(mPoster).into(poster);
        rating.setText(Double.toString(mRating));
        title.setText(mTitle);
        description.setText(mDesc);
    }
}