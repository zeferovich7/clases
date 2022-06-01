package co.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import co.edu.cesde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);
        dbHelper = new DBHelper(this);
    }

    public void signUp(View view) {
        Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
        startActivity(intent);
    }

    public void signIn(View view) {
        String email= mainBinding.etEmail.getText().toString();
        String password= mainBinding.etPassword.getText().toString();
        if (email.isEmpty() && password.isEmpty()){
            Toast.makeText(this, "Debe llenar todos los campos", Toast.LENGTH_SHORT).show();
        }else{
            SQLiteDatabase db= dbHelper.getWritableDatabase();
            String sql= String.format("SELECT * FROM users WHERE email='%s' AND password='%s'",email,password);
            Cursor cursor = db.rawQuery(sql, null);
            if (cursor.getCount()>0){
                Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Usuario no Existe", Toast.LENGTH_SHORT).show();
            }
        }
    }
}