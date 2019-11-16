package com.example.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2;
    private TextView txtview, txtwinloss;

    private int btn1, btn2;

    int number;
    int number1;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.game);
        button2 = (Button) findViewById(R.id.game1);
        txtview = (TextView) findViewById(R.id.txtview);
        txtwinloss = (TextView) findViewById(R.id.txtwinloss);

        final Random myrandom = new Random();

        number = myrandom.nextInt(100);
        number1 = myrandom.nextInt(100);
        button2.setText(Integer.toString(number1));
        button1.setText(Integer.toString(number));

        if (number == number1) {
            number = myrandom.nextInt(100);
            number1 = myrandom.nextInt(100);
            button2.setText(Integer.toString(number1));
            button1.setText(Integer.toString(number));
        } else {
            button2.setText(Integer.toString(number1));
            button1.setText(Integer.toString(number));
        }

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = Integer.parseInt(button1.getText().toString());
                number1 = Integer.parseInt(button2.getText().toString());

                if (number > number1) {
                    score = score + 1;
                    txtview.setText(Integer.toString(score));
                    txtwinloss.setText(Integer.toString(score));
                    if (score == 3) {
                        txtview.setText("You Win!!");
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                    } else {
                        txtwinloss.setText("Your Score is" + score);
                    }

                    number = myrandom.nextInt(100);
                    number1 = myrandom.nextInt(100);
                    button1.setText(Integer.toString(number));
                    button2.setText(Integer.toString(number1));


                    if (number == number1) {
                        number = myrandom.nextInt(100);
                        number1 = myrandom.nextInt(100);
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    } else {
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    }

                } else {
                    score = score - 1;
                    txtview.setText(Integer.toString(score));
                    txtwinloss.setText(Integer.toString(score));
                    if (score == -3) {
                        txtview.setText("You Loss!!");
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                    } else {
                        txtwinloss.setText("Your Score is" + score);
                    }
                    number = myrandom.nextInt(100);
                    number1 = myrandom.nextInt(100);
                    button1.setText(Integer.toString(number));
                    button2.setText(Integer.toString(number1));
                    if (number == number1) {
                        number = myrandom.nextInt(100);
                        number1 = myrandom.nextInt(100);
                        button1.setText(Integer.toString(number));
                        button2.setText(Integer.toString(number1));
                    } else {
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    }
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                number = Integer.parseInt(button1.getText().toString());
                number1 = Integer.parseInt(button2.getText().toString());


                if (number1 > number) {
                    score = score + 1;
                    txtview.setText(Integer.toString(score));
                    txtwinloss.setText(Integer.toString(score));
                    if (score == 3) {
                        txtview.setText("You Win!!");
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                    } else {
                        txtwinloss.setText("Your Score is" + score);
                    }

                    number = myrandom.nextInt(100);
                    number1 = myrandom.nextInt(100);
                    button1.setText(Integer.toString(number));
                    button2.setText(Integer.toString(number1));


                    if (number == number1) {
                        number = myrandom.nextInt(100);
                        number1 = myrandom.nextInt(100);
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    } else {
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    }

                } else {
                    score = score - 1;
                    txtview.setText(Integer.toString(score));
                    txtwinloss.setText(Integer.toString(score));
                    if (score == -3) {
                        txtview.setText("You Loss!!");
                        button1.setEnabled(false);
                        button2.setEnabled(false);
                    } else {
                        txtwinloss.setText("Your Score is" + score);
                    }
                    number = myrandom.nextInt(100);
                    number1 = myrandom.nextInt(100);
                    button1.setText(Integer.toString(number));
                    button2.setText(Integer.toString(number1));
                    if (number == number1) {
                        number = myrandom.nextInt(100);
                        number1 = myrandom.nextInt(100);
                        button1.setText(Integer.toString(number));
                        button2.setText(Integer.toString(number1));
                    } else {
                        button2.setText(Integer.toString(number1));
                        button1.setText(Integer.toString(number));
                    }
                }
            }


        });
    }

}
