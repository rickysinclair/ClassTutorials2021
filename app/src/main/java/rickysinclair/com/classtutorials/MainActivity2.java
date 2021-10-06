package rickysinclair.com.classtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void onClick(View view) {
        EditText num1TxtBox = findViewById(R.id.editTextNum1);
        EditText num2TxtBox = findViewById(R.id.editTextNum2);
        EditText operatorBox = findViewById(R.id.editTextOper);

        TextView answer = findViewById(R.id.textViewAnswer);

        String num1String = num1TxtBox.getText().toString();
        int intNum1 = Integer.parseInt(num1String);

        String operator = operatorBox.getText().toString();

        String num2String = num2TxtBox.getText().toString();
        int intNum2=Integer.parseInt(num2String);

        int answerNumber = 0;

        if (operator.equals("+") || operator.equals("plus")){
            answerNumber = intNum1 + intNum2;
        }
        answer.setText(Integer.toString(answerNumber));
    }
}