package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {


    Button b1, b2 , b3, b4, b5, b6, b7, b8, b9;
    private String jugador = "x";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
    }

    public void Jugar (View view){

        Button b = (Button) view;

        if (b.getText().toString().equals("")){
            b.setText(jugador);
            VerificarJugador(jugador);
            CambiarJugador();
        }
    }

    public void CambiarJugador(){

        if(jugador.equals("x")){
            jugador = "o";
        } else {
            jugador = "x";
        }
    }

    public void VerificarJugador(String turno){

        String btn1 = b1.getText().toString();
        String btn2 = b2.getText().toString();
        String btn3 = b3.getText().toString();
        String btn4 = b4.getText().toString();
        String btn5 = b5.getText().toString();
        String btn6 = b6.getText().toString();
        String btn7 = b7.getText().toString();
        String btn8 = b8.getText().toString();
        String btn9 = b9.getText().toString();

        if (btn1.equals(turno) && btn2.equals(turno) && btn3.equals(turno)){
            ganador(turno);
        }

        if (btn4.equals(turno) && btn5.equals(turno) && btn6.equals(turno)){
            ganador(turno);
        }

        if (btn7.equals(turno) && btn8.equals(turno) && btn9.equals(turno)){
            ganador(turno);
        }

        if (btn1.equals(turno) && btn4.equals(turno) && btn7.equals(turno)){
            ganador(turno);
        }

        if (btn2.equals(turno) && btn5.equals(turno) && btn8.equals(turno)){
            ganador(turno);
        }

        if (btn3.equals(turno) && btn6.equals(turno) && btn9.equals(turno)){
            ganador(turno);
        }

        if (btn1.equals(turno) && btn5.equals(turno) && btn9.equals(turno)){
            ganador(turno);
        }

        if (btn3.equals(turno) && btn5.equals(turno) && btn7.equals(turno)){
            ganador(turno);
        }
    }

    private void ganador(String jugador) {

        Toast.makeText(this, "Gano el jugador " + jugador, Toast.LENGTH_SHORT).show();
        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);
    }

    public void Restart(View view){

        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }
}