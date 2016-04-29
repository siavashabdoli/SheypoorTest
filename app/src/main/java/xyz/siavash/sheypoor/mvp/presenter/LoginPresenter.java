package xyz.siavash.sheypoor.mvp.presenter;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import xyz.siavash.sheypoor.R;
import xyz.siavash.sheypoor.mvp.LoginViewInterface;

/**
 * Created by siavash on 4/28/16.
 */
public class LoginPresenter extends MvpBasePresenter<LoginViewInterface> implements LoginPresenterInterface {

    @Override
    public void attachView(LoginViewInterface view) {
        super.attachView(view);
    }

    @Override
    public void detachView(boolean retainInstance) {
        super.detachView(retainInstance);
    }


    @Override
    public void login(String username, String password) {
        getView().showLoading();
        try {
            if(username.equals("")||password.equals("")){
                getView().setError(R.string.fill_mail_pass);
                return;
            }
            if(!isEmailValid(username)){
                getView().setError(R.string.email_format_invalid);
                return;
            }
            if(username.equals("siavash@gmail.com") && password.equals("1234"))
                getView().LoginSuccessful();
            else
                getView().setError(R.string.mail_pass_wrong);
        }
        catch (Exception e){
            e.printStackTrace();
            getView().setError(R.string.unknown_text);
        }

    }

    public static boolean isEmailValid(String email) {
        boolean isValid = false;

        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}
