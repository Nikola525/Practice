package com.example.practice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button invoke  = null;
    EditText editText = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         invoke = (Button)findViewById(R.id.invoke);
         editText = findViewById(R.id.edt_Text);
         /*
         invoke.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, ActivityInvokedByAIntent.class);
                //i.setData(Uri.parse("http://www.google.com"));
                startActivity(i);
            }
        });
         */

    }

    public void btn_click(View v){
        Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_SHORT).show();
        startActivity(new Intent(MainActivity.this, ActivityInvokedByAIntent.class));
    }

}


/*

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
public class MainActivity extends Activity
{
    private LinearLayout nameContainer;
    private LinearLayout addressContainer;
    private LinearLayout parentContainer;
    // Called when the activity is first created.
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        createNameContainer();
        createAddressContainer();
        createParentContainer();
        setContentView(parentContainer);
    }
    private void createNameContainer()
    {
        nameContainer = new LinearLayout(this);
        nameContainer.setLayoutParams(new
                LayoutParams(LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
        nameContainer.setOrientation(LinearLayout.HORIZONTAL);
        TextView nameLbl = new TextView(this);
        nameLbl.setText("Name: ");
        TextView nameValue = new TextView(this);
        nameValue.setText("John Doe");
        nameContainer.addView(nameLbl);
        nameContainer.addView(nameValue);
    }
    private void createAddressContainer()
    {
        addressContainer = new LinearLayout(this);
        addressContainer.setLayoutParams(new
                LayoutParams(LayoutParams.FILL_PARENT,
                LayoutParams.WRAP_CONTENT));
        addressContainer.setOrientation(LinearLayout.VERTICAL);
        TextView addrLbl = new TextView(this);
        addrLbl.setText("Address:");
        TextView addrValue = new TextView(this);
        addrValue.setText("911 Hollywood Blvd");
        addressContainer.addView(addrLbl);
        addressContainer.addView(addrValue);
    }
    private void createParentContainer()
    {
        parentContainer = new LinearLayout(this);
        parentContainer.setLayoutParams(new
                LayoutParams(LayoutParams.FILL_PARENT,
                LayoutParams.FILL_PARENT));
        parentContainer.setOrientation(LinearLayout.VERTICAL);
        parentContainer.addView(nameContainer);
        parentContainer.addView(addressContainer);
    }
}
*/