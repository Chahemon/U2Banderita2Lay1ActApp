package mx.edu.itl.c19130897.u2banderita2lay1actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSalirClick( View v ) {
        finish (); // Termina el activity actual
    }

    public void btnAcercaDeClick (View v) {
        Toast.makeText(this,"Héctor Manuel Chávez De la Vega (19130897)", Toast.LENGTH_LONG).show();
    }

}