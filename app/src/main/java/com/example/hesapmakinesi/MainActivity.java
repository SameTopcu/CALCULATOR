package com.example.hesapmakinesi;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView solution,result;
Button button_parantez2,button_C,button_parantez1,button_bol;
Button button_7,button_8,button_9,button_carp;
Button button_4,button_5,button_6,button_cıkar;
Button button_1,button_2,button_3,button_topla;
Button button_AC,button_0,button_nokta,button_sonuc;
Float deger1,deger2;
boolean toplama,cıkarma,carpma,bolme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solution=findViewById(R.id.solutıon);
        result=findViewById(R.id.result);
        button_parantez2=findViewById(R.id.button_parantez2);
        button_C=findViewById(R.id.button_C);
        button_parantez1=findViewById(R.id.button_parantez1);
        button_bol=findViewById(R.id.button_bol);
        button_7=findViewById(R.id.button_7);
        button_8=findViewById(R.id.button_8);
        button_9=findViewById(R.id.button_9);
        button_carp=findViewById(R.id.button_carp);
        button_4=findViewById(R.id.button_4);
        button_5=findViewById(R.id.button_5);
        button_6=findViewById(R.id.button_6);
        button_cıkar=findViewById(R.id.button_cıkar);
        button_1=findViewById(R.id.button_1);
        button_2=findViewById(R.id.button_2);
        button_3=findViewById(R.id.button_3);
        button_topla=findViewById(R.id.button_topla);
        button_AC=findViewById(R.id.button_AC);
        button_0=findViewById(R.id.button_0);
        button_nokta=findViewById(R.id.button_nokta);
        button_sonuc=findViewById(R.id.button_sonuc);
        button_AC=findViewById(R.id.button_AC);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
                solution.setText(result.getText());
            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
                solution.setText(result.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
                solution.setText(result.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
                solution.setText(result.getText());
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
                solution.setText(result.getText());
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
                solution.setText(result.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
                solution.setText(result.getText());
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
                solution.setText(result.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
                solution.setText(result.getText());
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
                solution.setText(result.getText());
            }
        });
        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }
                else {
                    result.setText(result.getText() + ".");
                    solution.setText(result.getText());
                }
            }
        });

        button_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }else{
                    String val=result.getText().toString();
                    val=val.substring(0,val.length()-1);
                    result.setText(val);
                }

            }
        });
        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                solution.setText("");
            }
        });
        button_topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }else{
                    deger1=Float.parseFloat(result.getText()+"");
                    toplama=true;
                    result.setText(null);
                }
            }
        });
        button_cıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }
                else{
                deger1 = Float.parseFloat(result.getText() + "");
                cıkarma = true;
                result.setText(null);
                }
            }
        });
        button_carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }
                else{deger1 = Float.parseFloat(result.getText() + "");
                carpma = true;
                result.setText(null);
                }
             }
        });
        button_bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result.length()==0){
                    result.setText("");
                }
                else{deger1 = Float.parseFloat(result.getText() + "");
                bolme = true;
                result.setText(null);
                 }
            }
        });
        //button_parantez1.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  result.setText(result.getText()+"(");
            //}
        //});
        //button_parantez2.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  result.setText(result.getText()+")");
            //}
        //});

        button_sonuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Y= Integer.parseInt((result.getText().toString()));
                if (result.length() == 0 || Y==0 ) {
                    result.getText();
                } else {
                    deger2 = Float.parseFloat(result.getText() + "");
                    if (toplama == true) {
                        result.setText(deger1 + deger2 + "");
                        solution.setText(deger1 + "+" + deger2);
                        toplama = false;
                    }
                    if (cıkarma == true) {
                        result.setText(deger1 - deger2 + "");
                        solution.setText(deger1 + "-" + deger2);
                        cıkarma = false;
                    }
                    if (carpma == true) {
                        result.setText(deger1 * deger2 + "");
                        solution.setText(deger1 + "*" + deger2);
                        carpma = false;
                    }
                    if (bolme == true) {
                        result.setText(deger1 / deger2 + "");
                        solution.setText(deger1 + "/" + deger2);
                        bolme = false;
                    }
                }
            }
        });

    }
}