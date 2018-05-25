package com.andriod.hzj.android_ui;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_simpleadapter = (Button)findViewById(R.id.simple_adapter_btn);
        btn_simpleadapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SimpleAdapter.class);
                startActivity(intent);
            }
        });

        Button btn_custom_dialog = (Button)findViewById(R.id.custom_dialog);
        btn_custom_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomDialog.class);
                startActivity(intent);
            }
        });

        Button btn_xml_menu = (Button)findViewById(R.id.xml_menu_btn);
        btn_xml_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, XmlDefineMenu.class);
                startActivity(intent);
            }
        });

        Button btn_action_context = (Button)findViewById(R.id.action_context_btn);
        btn_action_context.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ContextualActionBar.class);
                startActivity(intent);
            }
        });

        Button btn_process_bar = (Button)findViewById(R.id.progress_bar_btn);
        btn_process_bar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProgressBar.class);
                startActivity(intent);
            }
        });


    }
}
