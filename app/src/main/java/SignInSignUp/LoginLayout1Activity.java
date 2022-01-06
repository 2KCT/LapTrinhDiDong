package SignInSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pinterest.LayoutTrangchuActivity;
import com.example.pinterest.R;

public class LoginLayout1Activity extends AppCompatActivity {
    TextView chinhsach,quenmatkhau;
    ImageView ic_X,ic_eye;
    EditText edt_email,edt_pass;
    Button btn_Login,btn_Fb,btn_Gg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout1);
        anhXa();
        closeLogin();
        eyeLogin();
        Login();
        quenmatkhau();
    }
    void anhXa(){
        chinhsach = (TextView) findViewById(R.id.tv_chinhsach);
        chinhsach.setText(R.string.chinhsach);

        ic_X = (ImageView) findViewById(R.id.ic_X_Login);
        ic_eye = (ImageView) findViewById(R.id.ic_eye_Login);
        edt_email = (EditText) findViewById(R.id.edt_Email_login);
        edt_pass = (EditText) findViewById(R.id.edt_Pass_Login);
        btn_Login = (Button) findViewById(R.id.btn_login);
        btn_Fb = (Button) findViewById(R.id.btn_Facebook);
        btn_Gg = (Button) findViewById(R.id.btn_Google);
        quenmatkhau=(TextView) findViewById((R.id.tv_forgetPass));
    }
    void closeLogin(){
        ic_X.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginLayout1Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    void eyeLogin(){
        ic_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_pass.getTransformationMethod() != null) {
                    edt_pass.setTransformationMethod(null);
                }
                else
                    edt_pass.setTransformationMethod(new PasswordTransformationMethod());
            }
        });
    }
    void Login(){

        btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(edt_email.getText().toString()=="" || edt_pass.getText().toString()=="")
                    {
                        Toast.makeText(LoginLayout1Activity.this,"Vui lòng nhập email và mật khẩu",Toast.LENGTH_SHORT ).show();
                    }
                    else
                    {
                        Intent intent = new Intent(LoginLayout1Activity.this, LayoutTrangchuActivity.class);
                        startActivity(intent);
                    }
                }
        });
        btn_Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(LoginLayout1Activity.this,LayoutTrangchuActivity.class);
                    startActivity(intent);
            }
        });
        btn_Gg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(LoginLayout1Activity.this,LayoutTrangchuActivity.class);
                    startActivity(intent);
            }
        });

    }
    void quenmatkhau(){
        quenmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginLayout1Activity.this,LayoutQuenmatkhauActivity.class);
                startActivity(intent);
            }
        });
    }
}