package android.example.pointscounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_A = 0;
    int score_B = 0;

    public void points3A(View view){
        score_A += 3;
        displayA(score_A);
    }
    public void point2A(View view){
        score_A += 2;
        displayA(score_A);
    }
    public void point1A(View view){
        score_A += 1;
        displayA(score_A);
    }
    public void point3B(View view){
        score_B += 3;
        displayB(score_B);
    }
    public void point2B(View view){
        score_B += 2;
        displayB(score_B);
    }
    public void point1B(View view){
        score_B += 1;
        displayB(score_B);
    }
    public void Reset(View view){
        score_A = 0;
        score_B = 0;
        displayA(score_A);
        displayB(score_B);
    }
    public void foulA(View view){
        score_A -= 1;
        if(score_A < 0)
        {
            score_A = 0;
        }
        displayA(score_A);
    }
    public void foulB(View view){
        score_B -= 1;
        if(score_B < 0)
        {
            score_B = 0;
        }
        displayB(score_B);
    }

    private void displayA(int score_A){
        TextView ATextView = (TextView) findViewById(R.id.A_text_view);
        ATextView.setText("" + score_A);
    }
    private void displayB(int score_B){
        TextView BTextView = (TextView) findViewById(R.id.B_text_view);
        BTextView.setText("" + score_B);
    }
}