package SignInSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.pinterest.R;

public class SignupLayout1Activity extends AppCompatActivity {

    private Button btn_Next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout1);

        btn_Next = (Button) findViewById(R.id.btn_next1);
        btn_Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupLayout1Activity.this, SignupLayout2Activity.class);
                startActivity(intent);
            }
        });
        ImageView   backMain =  findViewById(R.id.back_main);
        backMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignupLayout1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}