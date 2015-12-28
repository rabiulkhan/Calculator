package com.rabiulkhan.salarycalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    EditText salary;
    EditText bonus_per;
    TextView result;
    Button btn_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        salary =(EditText) findViewById(R.id.editText_basicSalary);
        bonus_per = (EditText)findViewById(R.id.editText_bonus);
        result = (TextView) findViewById(R.id.textView_result);
        btn_sub = (Button) findViewById(R.id.button_Calculate);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float b_sal = Float.parseFloat(salary.getText().toString());
                float bon = Float.parseFloat(bonus_per.getText().toString());
                float res = b_sal + b_sal*(bon/100);

                result.setText(String.valueOf(res));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
