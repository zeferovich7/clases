package co.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.edu.cesde.databinding.ActivityMainBinding;
import co.edu.cesde.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    private ActivitySignUpBinding signUpBinding;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signUpBinding = ActivitySignUpBinding.inflate(getLayoutInflater());
        View view = signUpBinding.getRoot();
        setContentView(view);
        dbHelper = new DBHelper(this);
    }

    public void registerUser(View view) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues userData = new ContentValues();
        String name = signUpBinding.etName.getText().toString();
        String identificacion = signUpBinding.etDocumento.getText().toString();
        String email = signUpBinding.etEmaill.getText().toString();
        String password = signUpBinding.etPass.getText().toString();
        userData.put("name", name);
        userData.put("identificacion", identificacion);
        userData.put("email", email);
        userData.put("password", password);
        long newUser = db.insert("users", null, userData);
        Toast.makeText(this, "" + newUser, Toast.LENGTH_SHORT).show();
    }
}