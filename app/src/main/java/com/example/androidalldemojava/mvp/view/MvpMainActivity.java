package com.example.androidalldemojava.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidalldemojava.R;
import com.example.androidalldemojava.mvp.interfaces.ILoginPresenter;
import com.example.androidalldemojava.mvp.interfaces.ILoginView;
import com.example.androidalldemojava.mvp.presenter.LoginPresenterCompl;

public class MvpMainActivity extends AppCompatActivity implements ILoginView, View.OnClickListener
{

    private EditText editUser;
    private EditText editPass;
    private Button btnLogin;
    private Button btnClear;
    private ILoginPresenter loginPresenter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp_main);

        //find view
        editUser = (EditText) this.findViewById(R.id.et_login_username);
        editPass = (EditText) this.findViewById(R.id.et_login_password);
        btnLogin = (Button) this.findViewById(R.id.btn_login_login);
        btnClear = (Button) this.findViewById(R.id.btn_login_clear);
        progressBar = (ProgressBar) this.findViewById(R.id.progress_login);
        //set listener
        btnLogin.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        //init
        loginPresenter = new LoginPresenterCompl(this);
        loginPresenter.setProgressBarVisiblity(View.INVISIBLE);
    }

    @Override
    public void onClearText() {

        editUser.setText("");
        editPass.setText("");
    }

    @Override
    public void onLoginResult(Boolean result, int code) {

        loginPresenter.setProgressBarVisiblity(View.INVISIBLE);
        btnLogin.setEnabled(true);
        btnClear.setEnabled(true);
        if (result)
        {
            Toast.makeText(this,"Login Success",Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"Login Fail, code = " + code,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onSetProgressBarVisibility(int visibility) {

        progressBar.setVisibility(visibility);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_login_clear:

                loginPresenter.clear();

                break;
            case R.id.btn_login_login:

                loginPresenter.setProgressBarVisiblity(View.VISIBLE);
                btnLogin.setEnabled(false);
                btnClear.setEnabled(false);
                loginPresenter.doLogin(editUser.getText().toString(), editPass.getText().toString());

                break;
        }

    }
}
