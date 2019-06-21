package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.signin.internal.ISignInCallbacks;

public abstract interface SignInClient extends Api.Client
{
  public abstract void clearAccountFromSessionStore();

  public abstract void connect();

  public abstract void saveDefaultAccount(IAccountAccessor paramIAccountAccessor, boolean paramBoolean);

  public abstract void signIn(ISignInCallbacks paramISignInCallbacks);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.signin.SignInClient
 * JD-Core Version:    0.6.2
 */