package com.example.taller20;

import android.content.Context;
import android.widget.Toast;

public class peso {
public void imc(){
    String numero1texto=txtNumero1.getText().toString();
    String numero2texto=txtNumero2.getText().toString();
    String numero3texto=txtNumero3.getText().toString();
        if (numero1texto.equals("") || numero2texto.equals("") || numero3texto.equals("")){
        Toast.makeText(getApplicationContext(),"por favor llene los datos",Toast.LENGTH_LONG).show();
    }else {
        int numero1 = Integer.parseInt(numero1texto);
        float numero2 = Integer.parseInt(numero2texto);
        float numero3 = Integer.parseInt(numero3texto);
        numero3= numero3/100;
        float imc=numero2/(float)Math.pow(numero3,2);


        String imcTexto= String.format("%.1f",imc);

        if (imc < 18.5f)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted tiene desnutricion ", Toast.LENGTH_LONG).show();
        if (imc >= 18.5f && imc < 25)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted esta normal ", Toast.LENGTH_LONG).show();
        if (imc >= 18.5f && imc < 30)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted tiene sobre peso ", Toast.LENGTH_LONG).show();
        if (imc >= 18.5f && imc < 35)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted tiene obesidad grado 1 ", Toast.LENGTH_LONG).show();
        if (imc >= 18.5f && imc <40)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted tiene obesidad grado 2 ", Toast.LENGTH_LONG).show();
        if (imc  >= 40)
            Toast.makeText(getApplicationContext(), "su edad es de " + numero1 + "y su masa es de " + imcTexto+ "usted obesidad grado 3 ", Toast.LENGTH_LONG).show();

    }
}

    public Context getApplicationContext() {
        return applicationContext;
    }

    public void setApplicationContext(Context applicationContext) {
        this.applicationContext = applicationContext;
    }
}
