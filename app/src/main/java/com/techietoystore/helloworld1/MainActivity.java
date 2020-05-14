package com.techietoystore.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;

import java.util.Collections;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context = getApplicationContext();
        Resources resources = context.getResources();

        String[] card = {"Blue1", "Blue2", "BlueSnake", "Blue4", "Blue5", "Blue6", "Blue7", "BlueHawk"};

        TypedArray card_faces = resources.obtainTypedArray(R.array.card_faces);

        setListAdapter(new ImageAndTextAdapter (context, R.layout.secondary_layout, card, card_faces));
    }
}
