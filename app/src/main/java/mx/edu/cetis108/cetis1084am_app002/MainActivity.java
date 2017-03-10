package mx.edu.cetis108.cetis1084am_app002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void btnSumar_click (View v)
    {
        EditText txtNumero1_suma = (EditText)findViewById(R.id.txtNumero1);
        EditText txtNumero2_suma = (EditText)findViewById(R.id.txtNumero2);
        TextView lblResultado_suma = (TextView) findViewById(R.id.lblResultado);

        float txt_Numero1_suma  = Float.parseFloat(txtNumero1_suma.getText().toString());
        float txt_Numero2_suma  = Float.parseFloat(txtNumero2_suma.getText().toString());
        float resultado_suma = txt_Numero1_suma+txt_Numero2_suma;
        lblResultado_suma.setText("El resultado es: "+ resultado_suma);
    }
    public void btnRestar_click (View v)
    {
        EditText txtNumero1_resta = (EditText)findViewById(R.id.txtNumero1);
        EditText txtNumero2_resta = (EditText)findViewById(R.id.txtNumero2);
        TextView lblResultado_resta = (TextView) findViewById(R.id.lblResultado);

        float txt_Numero1_resta  = Float.parseFloat(txtNumero1_resta.getText().toString());
        float txt_Numero2_resta  = Float.parseFloat(txtNumero2_resta.getText().toString());
        float resultado_resta = txt_Numero1_resta-txt_Numero2_resta;
        lblResultado_resta.setText("El resultado es: "+ resultado_resta);

    }
    public void btnMultiplicar_click (View v)
    {
        EditText txtNumero1_multiplicar = (EditText)findViewById(R.id.txtNumero1);
        EditText txtNumero2_multiplicar = (EditText)findViewById(R.id.txtNumero2);
        TextView lblResultado_multiplicar = (TextView) findViewById(R.id.lblResultado);

        float txt_Numero1_multiplicar  = Float.parseFloat(txtNumero1_multiplicar.getText().toString());
        float txt_Numero2_multiplicar  = Float.parseFloat(txtNumero2_multiplicar.getText().toString());
        float resultado_suma = txt_Numero1_multiplicar*txt_Numero2_multiplicar;
        lblResultado_multiplicar.setText("El resultado es: "+ resultado_suma);
    }
    public void  btnDividir_click (View v)
    {
        EditText txtNumero1_dividir = (EditText)findViewById(R.id.txtNumero1);
        EditText txtNumero2_dividir = (EditText)findViewById(R.id.txtNumero2);
        TextView lblResultado_dividir = (TextView) findViewById(R.id.lblResultado);

        float txt_Numero1_dividir  = Float.parseFloat(txtNumero1_dividir.getText().toString());
        float txt_Numero2_dividir  = Float.parseFloat(txtNumero2_dividir.getText().toString());
        float resultado_dividir = txt_Numero1_dividir/txt_Numero2_dividir;
        lblResultado_dividir.setText("El resultado es: "+ resultado_dividir);
    }
}
