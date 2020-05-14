package com.techietoystore.helloworld1;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.VisibleForTesting;

import java.util.Collections;

public class ImageAndTextAdapter extends ArrayAdapter<String> {

    private LayoutInflater mInflater;

    private  String[] mStrings;
    private TypedArray mIcons;

    private int mViewResourceId;

    public ImageAndTextAdapter (Context ctx, int ViewResourceId, String[] strings, TypedArray icons) {
        super(ctx, ViewResourceId, strings);

     mInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

     mStrings = strings;
     mIcons = icons;

     mViewResourceId = ViewResourceId;
    }

    @Override
    public int getCount () { return mStrings.length; }

    @Override
    public String getItem(int position) {return mStrings[position]; }

    @Override
    public long getItemId(int position) {return 0; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = mInflater.inflate(mViewResourceId, null);

        ImageView iv = (ImageView) convertView.findViewById(R.id.imageView);

        iv.setImageDrawable(mIcons.getDrawable(position));

        TextView tv = (TextView)convertView.findViewById(R.id.textView);
        tv.setText(mStrings[position]);

        return convertView;
    }

}
