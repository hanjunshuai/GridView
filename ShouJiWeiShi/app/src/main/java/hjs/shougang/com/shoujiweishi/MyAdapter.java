package hjs.shougang.com.shoujiweishi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/1/15 0015.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private String[] names;
    private int[] icons;

    public MyAdapter(Context context, String[] names,int[] icons) {
        this.context = context;
        this.names = names;
        this.icons = icons;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return names[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        }

        ImageView img = (ImageView) convertView.findViewById(R.id.iv_item_icon);
        TextView name = (TextView) convertView.findViewById(R.id.tv_item_name);
        img.setImageResource(icons[position]);
        name.setText(names[position]);

        return convertView;
    }
}
