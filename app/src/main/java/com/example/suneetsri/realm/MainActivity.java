package com.example.suneetsri.realm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Realm realm = Realm.getDefaultInstance();
        Todo todo = new Todo();
        todo.setTaskId(1);
        todo.setTaskName("Todo App");
        todo.setTaskDescription("Checking the app");
        realm.beginTransaction();
        realm.commitTransaction();


    }
}
