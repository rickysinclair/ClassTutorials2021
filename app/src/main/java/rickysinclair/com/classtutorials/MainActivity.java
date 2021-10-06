package rickysinclair.com.classtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG); //creates a pop up message
        toast.show(); //displays message
    }

    public void onClick(View view) {

        EditText editPassword = findViewById(R.id.editTextPassword);
        TextView textPassword = findViewById(R.id.textViewPassword);
        String content = editPassword.getText().toString(); //gets you the contents of edit text

        if (content.equals("Password")) {
            startActivity(new Intent(MainActivity.this,MainActivity2.class)); //navigate to another activity
        } else {
            toastMsg("Wrong PW Bruv!!!");
        }
    }
}