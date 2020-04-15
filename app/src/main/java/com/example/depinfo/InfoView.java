package com.example.depinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

@SuppressLint("Registered")
public class InfoView extends AppCompatActivity {

    int item_number;
    ArrayList<Item> items;

    TextView departmentName;
    TextView departmentHodName;
    TextView departmentContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        items = generateItems();

        item_number = getIntent().getIntExtra("POSITION",-1);

        departmentName = findViewById(R.id.textView_department_content);
        departmentHodName = findViewById(R.id.textView_department_Hod_content);
        departmentContact = findViewById(R.id.textView_department_contact_content);

        Item CurrentItem = items.get(item_number);

        departmentName.setText(CurrentItem.getItemName());
        departmentHodName.setText(CurrentItem.getItemDescription());
        departmentContact.setText(CurrentItem.getItemPhoneNumber());


    }

    private ArrayList<Item> generateItems(){
        String[] DepartmentNames = getResources().getStringArray(R.array.department_name);
        String[] DepartmentHodNames = getResources().getStringArray(R.array.department_Hod_list);
        String[] DepartmentPh = getResources().getStringArray(R.array.department_contact_number);
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < DepartmentNames.length; i++) {
            list.add(new Item(DepartmentNames[i],DepartmentHodNames[i],DepartmentPh[i]));
        }
        return list;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent data = new Intent();
        setResult(RESULT_OK, data);
        finish();
    }
}