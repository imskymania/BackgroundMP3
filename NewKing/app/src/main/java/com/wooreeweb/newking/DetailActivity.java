package com.wooreeweb.newking;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-01-18.
 */
public class DetailActivity extends Activity implements View.OnClickListener {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6;
    ListView listview;
    ArrayAdapter<String> adapter;
    TextView txtYear, txtContent, tvChoose;
    ImageView btnHome;
    String[] arList;
    String[] arYear;
    String[] arContent;
    Integer parBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        listview = (ListView)findViewById(R.id.listview);
        tvChoose = (TextView)findViewById(R.id.tv1);
        txtYear = (TextView)findViewById(R.id.txtYear);
        txtContent = (TextView)findViewById(R.id.txtContent);

        btn_1 = (Button)findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);
        btn_2 = (Button)findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);
        btn_3 = (Button)findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);
        btn_4 = (Button)findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);
        btn_5 = (Button)findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);
        btn_6 = (Button)findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);
        initData(getIntent().getStringExtra("btn"));


        btnHome = (ImageView)findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                txtYear.setText(arYear[arg2]);
                txtContent.setText(arContent[arg2]);
                txtContent.setMovementMethod(new ScrollingMovementMethod());
            }
        });
    }

    @Override
    public void onClick(View v) {
        if (v==btn_1) {
            initData("1");
        } else if (v==btn_2) {
            initData("2");
        } else if (v==btn_3) {
            initData("3");
        } else if (v==btn_4) {
            initData("4");
        } else if (v==btn_5) {
            initData("5");
        } else if (v==btn_6) {
            initData("6");
        }
    }


    public void initData (String btn) {
        parBtn = Integer.parseInt(btn);
        listChange(parBtn);
        return;
    }

    public void listChange (int i) {
        switch (i) {
            case 1:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_1", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_1", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_1", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_1.getText() + " B.C. 37 ~ A.D. 668");
                btn_1.setBackgroundColor(Color.parseColor("#000000"));
                btn_1.setTextColor(Color.parseColor("#ffffff"));
                btn_2.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_2.setTextColor(Color.parseColor("#000000"));
                btn_3.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_3.setTextColor(Color.parseColor("#000000"));
                btn_4.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_4.setTextColor(Color.parseColor("#000000"));
                btn_5.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_5.setTextColor(Color.parseColor("#000000"));
                btn_6.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_6.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
            case 2:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_2", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_2", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_2", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_2.getText() + " B.C. 18 ~ A.D. 660, 삼국사기 기준");
                btn_2.setBackgroundColor(Color.parseColor("#000000"));
                btn_2.setTextColor(Color.parseColor("#ffffff"));
                btn_1.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_1.setTextColor(Color.parseColor("#000000"));
                btn_3.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_3.setTextColor(Color.parseColor("#000000"));
                btn_4.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_4.setTextColor(Color.parseColor("#000000"));
                btn_5.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_5.setTextColor(Color.parseColor("#000000"));
                btn_6.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_6.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
            case 3:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_3", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_3", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_3", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_3.getText() + " B.C. 57 ~ A.D. 935, 삼국사기 기준");
                btn_3.setBackgroundColor(Color.parseColor("#000000"));
                btn_3.setTextColor(Color.parseColor("#ffffff"));
                btn_1.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_1.setTextColor(Color.parseColor("#000000"));
                btn_2.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_2.setTextColor(Color.parseColor("#000000"));
                btn_4.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_4.setTextColor(Color.parseColor("#000000"));
                btn_5.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_5.setTextColor(Color.parseColor("#000000"));
                btn_6.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_6.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
            case 4:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_4", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_4", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_4", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_4.getText() + " 698 ~ 926");
                btn_4.setBackgroundColor(Color.parseColor("#000000"));
                btn_4.setTextColor(Color.parseColor("#ffffff"));
                btn_1.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_1.setTextColor(Color.parseColor("#000000"));
                btn_2.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_2.setTextColor(Color.parseColor("#000000"));
                btn_3.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_3.setTextColor(Color.parseColor("#000000"));
                btn_5.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_5.setTextColor(Color.parseColor("#000000"));
                btn_6.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_6.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
            case 5:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_5", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_5", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_5", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_5.getText() + " 918 ~ 1392");
                btn_5.setBackgroundColor(Color.parseColor("#000000"));
                btn_5.setTextColor(Color.parseColor("#ffffff"));
                btn_1.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_1.setTextColor(Color.parseColor("#000000"));
                btn_2.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_2.setTextColor(Color.parseColor("#000000"));
                btn_3.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_3.setTextColor(Color.parseColor("#000000"));
                btn_4.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_4.setTextColor(Color.parseColor("#000000"));
                btn_6.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_6.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
            case 6:
                arList = getResources().getStringArray(getResources().getIdentifier("Name_6", "array", getPackageName()));
                arYear = getResources().getStringArray(getResources().getIdentifier("Year_6", "array", getPackageName()));
                arContent = getResources().getStringArray(getResources().getIdentifier("Content_6", "array", getPackageName()));
                adapter = new ArrayAdapter<String>(this, R.layout.layout_listview, arList);
                listview.setAdapter(adapter);
                listview.setSelection(0);
                tvChoose.setText(btn_6.getText() + " 1392 ~ 1910, 519년");
                btn_6.setBackgroundColor(Color.parseColor("#000000"));
                btn_6.setTextColor(Color.parseColor("#ffffff"));
                btn_1.setBackgroundColor(Color.parseColor("#ffffff"));
                btn_1.setTextColor(Color.parseColor("#000000"));
                btn_2.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_2.setTextColor(Color.parseColor("#000000"));
                btn_3.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_3.setTextColor(Color.parseColor("#000000"));
                btn_4.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_4.setTextColor(Color.parseColor("#000000"));
                btn_5.setBackgroundColor( Color.parseColor("#ffffff"));
                btn_5.setTextColor(Color.parseColor("#000000"));
                adapter.notifyDataSetChanged();
                break;
        }
    }

}

