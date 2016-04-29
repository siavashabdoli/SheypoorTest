package xyz.siavash.sheypoor.mvp.presenter;

import com.hannesdorfmann.mosby.mvp.MvpPresenter;

import xyz.siavash.sheypoor.mvp.LoginViewInterface;

/**
 * Created by siavash on 4/28/16.
 */
public interface LoginPresenterInterface extends MvpPresenter<LoginViewInterface> {
    public void login(String username,String password);
}
