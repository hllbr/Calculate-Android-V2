package com.hllbr.simpecalculaterandroidv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1 ;
    EditText number2 ;
    TextView resultt ;

    /*
    Bu projede projenin güvenliğini sağlamaya çalışıyorum kullanıcının bir hesap makinesinde String ifadeler ile çalışması kurduğum yapıyı kırıyor bu kırılmayı önlemem gerek

    InputType üzerinde text işaretini kaldır number işaretle klavye değiştirilmiş olur string ifade girişi yapamaz kullanıcı bu basit yöntemi

    Boşluk işlem yapmaya kalkarsa ne yapabilirim.Hata Mesajı yayınlayabilirim bunun için basit bir sorgu yazmam gerekebilir.

    Özellikle uygulama kodlarında güvenlik çok kritik bir önem taşımaktadır


     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.numberText1);

        number2 = findViewById(R.id.numberText2);

        resultt = findViewById(R.id.resultText);


    }
    public void topla(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            resultt.setText("Please Enter Number");

        }else {

            int birinciSayı = Integer.parseInt(number1.getText().toString());

            int ikinciSayı = Integer.parseInt(number2.getText().toString());

            int result = birinciSayı + ikinciSayı ;

            resultt.setText("Toplam Sonucu : "+result);
        }

    }

    public void cıkar(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            resultt.setText("Please Enter Number");
        }else{
            int birnumara = Integer.parseInt(number1.getText().toString());

            int ikinumara = Integer.parseInt(number2.getText().toString());

            int result = birnumara - ikinumara ;

            resultt.setText("Cıkarma Sonucu : " +result);
        }


    }
    public void carp(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            resultt.setText("Please Enter Number");
         }else {
            int bir = Integer.parseInt(number1.getText().toString());

            int iki = Integer.parseInt(number2.getText().toString());

            int result = bir * iki ;

            resultt.setText("Carpma Sonucu : " + result);
        }

    }


    public void bol(View view){

        if(number1.getText().toString().matches("") || number2.getText().toString().matches("")){

            resultt.setText("Please Enter Number");
        }else{

            int birinci = Integer.parseInt(number1.getText().toString());

            int ikinci = Integer.parseInt(number2.getText().toString());

            if(ikinci == 0){

                resultt.setText("Division by zero occurred error");

            }else{
                
                double result = (double) (birinci / ikinci);

                resultt.setText("Bölüm Sonucu : "+result);
            }


        }
    }
}