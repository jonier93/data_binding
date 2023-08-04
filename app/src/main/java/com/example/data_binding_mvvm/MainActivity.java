package com.example.data_binding_mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.data_binding_mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User objUser;
    private Button btnGuardar;
    private EditText txtName;
    private EditText txtLastName;
    private EditText txtId;
    private VistaModelo objViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding objBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        inicializar();
        objBinding.setData(objViewModel);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objUser.setName(txtName.getText().toString());
                objUser.setLastName(txtLastName.getText().toString());
                objUser.setId(txtId.getText().toString());

                objViewModel.setName(objUser.getName());
                objViewModel.setLastName(objUser.getLastName());
                objViewModel.setId(objUser.getLastName());
                objBinding.setData(objViewModel);
            }
        });
    }

    private void inicializar() {
        btnGuardar = findViewById(R.id.btnGurdar);
        objUser = new User();
        objViewModel = new ViewModelProvider(this).get(VistaModelo.class);
        txtName = findViewById(R.id.txtName);
        txtLastName = findViewById(R.id.txtLastName);
        txtId = findViewById(R.id.txtId);
    }

    private void recover_data() {

    }
}