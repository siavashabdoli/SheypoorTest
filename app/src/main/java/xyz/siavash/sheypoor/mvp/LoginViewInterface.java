package xyz.siavash.sheypoor.mvp;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by siavash on 4/28/16.
 */
public interface LoginViewInterface extends MvpView {

    public void LoginSuccessful();
    public void showLoading();
    public void setError(int errorResourceId);
}
