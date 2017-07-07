package com.example.jinva02.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button addBtn;
    private Button subtractBtn;
    private Button multiplyBtn;
    private Button divideBtn;
    private TextView txtresult;
    double op1;
    double op2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        operand1 = (EditText) findViewById(R.id.first_num);
        operand2 = (EditText) findViewById(R.id.second_num);
        addBtn = (Button) findViewById(R.id.addBtn);
        subtractBtn = (Button) findViewById(R.id.subtractBtn);
        multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        divideBtn = (Button) findViewById(R.id.divideBtn);
        txtresult = (TextView) findViewById(R.id.result);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperands();
                double result = op1+op2;
                txtresult.setText(Double.toString(result));
            }

        });
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperands();
                double result = op1-op2;
                txtresult.setText(Double.toString(result));
            }

        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperands();
                double result = op1*op2;
                txtresult.setText(Double.toString(result));
            }

        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperands();
                double result = op1/op2;
                txtresult.setText(Double.toString(result));
            }

        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void setOperands() {
        if(!(operand1.getText().toString().equals("") || operand2.getText().toString().equals(""))) {
            op1 = Double.parseDouble(operand1.getText().toString());
            op2 = Double.parseDouble(operand2.getText().toString());
        } else {
            Toast.makeText(this, "Must enter numbers into both fields", Toast.LENGTH_SHORT).show();
        }
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
