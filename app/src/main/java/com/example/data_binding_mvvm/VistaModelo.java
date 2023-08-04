package com.example.data_binding_mvvm;

import androidx.databinding.ObservableField;
import androidx.lifecycle.ViewModel;

public class VistaModelo extends ViewModel {
    private ObservableField<String> name = new ObservableField<>();
    private ObservableField<String> lastName = new ObservableField<>();
    private ObservableField<String> id = new ObservableField<>();

    public VistaModelo(){
        name.set("");
        lastName.set("");
        id.set("");
    }

    public ObservableField<String> getName() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public ObservableField<String> getId() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }
}
