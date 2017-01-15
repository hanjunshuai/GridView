package hjs.shougang.com.shoujiweishi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private GridView gv;
    private MyAdapter adapter;
    String[] names = {"手机防盗", "通讯卫士", "软件管理", "流量管理", "进程管理", "手机杀毒",
            "缓存清理", "高级工具", "设置中心"};

    int[] icons = {R.drawable.widget01, R.drawable.widget02,
            R.drawable.widget03, R.drawable.widget04, R.drawable.widget05,
            R.drawable.widget06, R.drawable.widget07, R.drawable.widget08,
            R.drawable.widget09};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        gv = (GridView) findViewById(R.id.gv_main);
        adapter = new MyAdapter(this, names, icons);
        gv.setAdapter(adapter);

        gv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String name = names[position];
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}
