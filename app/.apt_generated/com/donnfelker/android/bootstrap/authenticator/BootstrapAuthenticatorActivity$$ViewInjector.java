// Generated code from Butter Knife. Do not modify!
package com.donnfelker.android.bootstrap.authenticator;

import android.view.View;
import butterknife.Views.Finder;

public class BootstrapAuthenticatorActivity$$ViewInjector {
  public static void inject(Finder finder, com.donnfelker.android.bootstrap.authenticator.BootstrapAuthenticatorActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131034188);
    target.emailText = (android.widget.AutoCompleteTextView) view;
    view = finder.findById(source, 2131034190);
    target.signinButton = (android.widget.Button) view;
    view = finder.findById(source, 2131034189);
    target.passwordText = (android.widget.EditText) view;
  }
}
