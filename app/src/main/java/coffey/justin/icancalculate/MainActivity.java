package coffey.justin.icancalculate;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.EditText;
import android.view.View;
import android.media.MediaPlayer;


public class MainActivity extends AppCompatActivity {

    String one = "one";
    String two = "two";
    String three = "three";
    String four = "four";

    ImageButton button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonC, buttonEqual, buttonOnefourth, buttonOnehalf, buttonThreefourths;

    EditText readOut;

    float viewValueplus;
    float viewValuefloat;

    float values[] = new float[20];

    boolean Addition, Subtract, Multiplication, Division, numPressed, oppPressed, fracPressed, equalsPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer mp = null;

        buttonOnefourth = findViewById(R.id.oneFourth);
        buttonOnehalf = findViewById(R.id.onehalf);
        buttonThreefourths = findViewById(R.id.threeFourths);
        button0 = findViewById(R.id.zero);
        button1 = findViewById(R.id.one);
        button2 = findViewById(R.id.two);
        button3 = findViewById(R.id.three);
        button4 = findViewById(R.id.four);
        button5 = findViewById(R.id.five);
        button6 = findViewById(R.id.six);
        button7 = findViewById(R.id.seven);
        button8 = findViewById(R.id.eight);
        button9 = findViewById(R.id.nine);

        buttonAdd = findViewById(R.id.plus);
        buttonSub = findViewById(R.id.minus);
        buttonMul = findViewById(R.id.multiply);
        buttonDivision = findViewById(R.id.divide);
        buttonC = findViewById(R.id.clear);
        buttonEqual = findViewById(R.id.equals);


        readOut = findViewById(R.id.textView);

        readOut.setText(null);



        buttonOnefourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.one_fourth);
                mp.start();

                if (equalsPressed) {
                    readOut.setText(readOut.getText());
                } else if (!fracPressed) {
                    readOut.setText(readOut.getText() + ".25");
                    numPressed = true;
                    fracPressed = true;
                    equalsPressed = false;
                } else {
                    readOut.setText(readOut.getText());
                }

            }
        });

        buttonOnehalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.one_half);
                mp.start();
                if (equalsPressed) {
                    readOut.setText(readOut.getText());
                } else if (!fracPressed) {
                    readOut.setText(readOut.getText() + ".5");
                    numPressed = true;
                    fracPressed = true;
                    equalsPressed = false;
                } else {
                    readOut.setText(readOut.getText());
                }
            }
        });

        buttonThreefourths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.three_fourths);
                mp.start();
                if (equalsPressed) {
                    readOut.setText(readOut.getText());
                } else if (!fracPressed) {
                    readOut.setText(readOut.getText() + ".75");
                    numPressed = true;
                    fracPressed = true;
                    equalsPressed = false;
                } else {
                    readOut.setText(readOut.getText());
                }
            }
        });


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.one);
                mp.start();
                readOut.setText(readOut.getText() + "1");
                numPressed = true;
                equalsPressed = false;

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.two);
                mp.start();
                readOut.setText(readOut.getText() + "2");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.three);
                mp.start();
                readOut.setText(readOut.getText() + "3");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.four);
                mp.start();
                readOut.setText(readOut.getText() + "4");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.five);
                mp.start();
                readOut.setText(readOut.getText() + "5");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.six);
                mp.start();
                readOut.setText(readOut.getText() + "6");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.seven);
                mp.start();
                readOut.setText(readOut.getText() + "7");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.eight);
                mp.start();
                readOut.setText(readOut.getText() + "8");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.nine);
                mp.start();
                readOut.setText(readOut.getText() + "9");
                numPressed = true;
                equalsPressed = false;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.zero);
                mp.start();
                readOut.setText(readOut.getText() + "0");
                numPressed = true;
                equalsPressed = false;
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.add);
                mp.start();

                if (!numPressed) {
                    readOut.setText("");
                } else if (!oppPressed) {
                    values[0] = Float.parseFloat(readOut.getText() + "");
                    Addition = true;
                    oppPressed = true;
                    numPressed = false;
                    fracPressed = false;
                    equalsPressed = false;
                    readOut.setText("");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.subtract);
                mp.start();

                if (!numPressed) {
                    readOut.setText("");
                } else if (!oppPressed) {
                    values[0] = Float.parseFloat(readOut.getText() + "");
                    Subtract = true;
                    oppPressed = true;
                    numPressed = false;
                    equalsPressed = false;
                    fracPressed = false;
                    readOut.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.multiply);
                mp.start();

                if (!numPressed) {
                    readOut.setText("");
                } else if (!oppPressed) {
                    values[0] = Float.parseFloat(readOut.getText() + "");
                    Multiplication = true;
                    oppPressed = true;
                    equalsPressed = false;
                    numPressed = false;
                    fracPressed = false;
                    readOut.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.division);
                mp.start();

                if (!numPressed) {
                    readOut.setText("");
                } else if (!oppPressed) {
                    values[0] = Float.parseFloat(readOut.getText() + "");
                    Division = true;
                    oppPressed = true;
                    numPressed = false;
                    equalsPressed = false;
                    fracPressed = false;
                    readOut.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.equals);
                mp.start();


                if (!numPressed) {
                    readOut.setText("");

                } else {

                    values[1] = Float.parseFloat(readOut.getText() + "");

                    if (Addition == true) {
                        readOut.setText(values[0] + values[1] + "");
                        Addition = false;
                        oppPressed = false;
                        fracPressed = false;
                        equalsPressed = true;
                    }

                    if (Subtract == true) {
                        readOut.setText(values[0] - values[1] + "");
                        Subtract = false;
                        oppPressed = false;
                        fracPressed = false;
                        equalsPressed = true;
                    }

                    if (Multiplication == true) {
                        readOut.setText(values[0] * values[1] + "");
                        Multiplication = false;
                        oppPressed = false;
                        fracPressed = false;
                        equalsPressed = true;
                    }

                    if (Division == true) {
                        readOut.setText(values[0] / values[1] + "");
                        Division = false;
                        oppPressed = false;
                        fracPressed = false;
                        equalsPressed = true;
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.clear);
                mp.start();

                readOut.setText("");
                numPressed = false;
                oppPressed = false;
                fracPressed = false;
                equalsPressed = false;
            }
        });


    }
}


