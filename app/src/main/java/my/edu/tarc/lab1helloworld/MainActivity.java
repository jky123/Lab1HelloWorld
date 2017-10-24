package my.edu.tarc.lab1helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Global or module level variable
    private EditText editTextName,editTextAge;
    private TextView textviewMessage;

    //onCreate = main () function
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Display the ui
        //R = resource class


        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextName=(EditText) findViewById(R.id.editTextn);
        editTextAge=(EditText) findViewById(R.id.editTexta);
        textviewMessage=(TextView) findViewById(R.id.textView2);
    }

    public void displayMessage(View view){
        String name;
        int age;


        name= editTextName.getText().toString();
        age= Integer.parseInt(editTextAge.getText().toString());
        age++;
        textviewMessage.setText("Hi "+name + "you will be " + age + "year old in 2018 when you born in " + (2017-age));
    }
}
