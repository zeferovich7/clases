package co.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import co.edu.cesde.databinding.ActivityGetUsersBinding;
import co.edu.cesde.databinding.ActivitySignUpBinding;

public class GetUsersActivity extends AppCompatActivity {
    private DBHelper dbHelper;
    private ActivityGetUsersBinding userBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        userBinding = ActivityGetUsersBinding.inflate(getLayoutInflater());
        View view = userBinding.getRoot();
        setContentView(view);
        dbHelper = new DBHelper(this);
    }
    public void getUser(View view){
        String identification= userBinding.editTextName.getText().toString();
        SQLiteDatabase db= dbHelper.getWritableDatabase();
        String sql= String.format("SELECT * FROM users WHERE identification=%d",Integer.parseInt(identification));
        Cursor cursor = db.rawQuery(sql, null);
        cursor.moveToNext();
        int id=cursor.getInt(0);
        Toast.makeText(this, "id: "+id, Toast.LENGTH_SHORT).show();
    }
}