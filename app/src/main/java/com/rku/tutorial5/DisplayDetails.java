package com.rku.tutorial5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayDetails extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_details);

        TextView edtFirstName=findViewById(R.id.txtFirstName);
        TextView edtLastName=findViewById(R.id.txtLastName);
        TextView edtemail=findViewById(R.id.txtemail);
        TextView edtPassword=findViewById(R.id.txtPassword);
        TextView edtGender=findViewById(R.id.txtGender);
        TextView edtCity=findViewById(R.id.txtCity);
        TextView edtBranch=findViewById(R.id.txtBranch);
        TextView edtStatus=findViewById(R.id.txtStatus);

        Intent intent =getIntent();

        edtFirstName.setText("First Name : "+intent.getStringExtra(Registration.Extra_FirstName));
        edtLastName.setText("Last Name : "+intent.getStringExtra(Registration.Extra_LastName));
        edtemail.setText("Username : "+intent.getStringExtra(Registration.Extra_email));
        edtPassword.setText("Password : "+intent.getStringExtra(Registration.Extra_password));
        edtGender.setText("Gender : "+intent.getStringExtra(Registration.Extra_Gender));
        edtCity.setText("City : "+intent.getStringExtra(Registration.Extra_City));
        edtBranch.setText("Branch : "+intent.getStringExtra(Registration.Extra_Branch));
        edtStatus.setText("Status : "+intent.getStringExtra(Registration.Extra_Status));

    }
}