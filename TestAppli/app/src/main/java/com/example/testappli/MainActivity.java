package com.example.testappli;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt_ok = (Button) findViewById(R.id.button_ok);
        bt_ok.setOnClickListener(new OkButtonClickListrner());

    }

    class OkButtonClickListrner implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText et_1 = findViewById(R.id.editText);
            TextView tv_1 = findViewById(R.id.textView);
            String text = et_1.getText().toString();
            tv_1.setText(text);
        }
    }

}
