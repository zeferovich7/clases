package co.edu.cesde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.cesde.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(R.layout.activity_main);
    }
    public void showMessage(View view){
        Toast.makeText(this,"Hola mundo",Toast.LENGTH_SHORT);
        mainBinding.tvPassword.setText("Contraseña");
    }
}