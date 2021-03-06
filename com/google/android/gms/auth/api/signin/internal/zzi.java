package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zzi
{
  private static Logger zzer;

  static
  {
    AppMethodBeat.i(50443);
    zzer = new Logger("GoogleSignInCommon", new String[0]);
    AppMethodBeat.o(50443);
  }

  public static GoogleSignInResult getSignInResultFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(50442);
    if ((paramIntent == null) || ((!paramIntent.hasExtra("googleSignInStatus")) && (!paramIntent.hasExtra("googleSignInAccount"))))
    {
      paramIntent = null;
      AppMethodBeat.o(50442);
    }
    while (true)
    {
      return paramIntent;
      GoogleSignInAccount localGoogleSignInAccount = (GoogleSignInAccount)paramIntent.getParcelableExtra("googleSignInAccount");
      paramIntent = (Status)paramIntent.getParcelableExtra("googleSignInStatus");
      if (localGoogleSignInAccount != null)
        paramIntent = Status.RESULT_SUCCESS;
      paramIntent = new GoogleSignInResult(localGoogleSignInAccount, paramIntent);
      AppMethodBeat.o(50442);
    }
  }

  public static Intent zzd(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50435);
    zzer.d("getSignInIntent()", new Object[0]);
    paramGoogleSignInOptions = new SignInConfiguration(paramContext.getPackageName(), paramGoogleSignInOptions);
    Intent localIntent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.setClass(paramContext, SignInHubActivity.class);
    paramContext = new Bundle();
    paramContext.putParcelable("config", paramGoogleSignInOptions);
    localIntent.putExtra("config", paramContext);
    AppMethodBeat.o(50435);
    return localIntent;
  }

  public static OptionalPendingResult<GoogleSignInResult> zzd(GoogleApiClient paramGoogleApiClient, Context paramContext, GoogleSignInOptions paramGoogleSignInOptions, boolean paramBoolean)
  {
    AppMethodBeat.i(50438);
    zzer.d("silentSignIn()", new Object[0]);
    zzer.d("getEligibleSavedSignInResult()", new Object[0]);
    Preconditions.checkNotNull(paramGoogleSignInOptions);
    GoogleSignInOptions localGoogleSignInOptions = zzq.zze(paramContext).zzp();
    Object localObject;
    Account localAccount;
    boolean bool;
    if (localGoogleSignInOptions != null)
    {
      localObject = localGoogleSignInOptions.getAccount();
      localAccount = paramGoogleSignInOptions.getAccount();
      if (localObject == null)
        if (localAccount == null)
        {
          bool = true;
          if ((!bool) || (paramGoogleSignInOptions.isServerAuthCodeRequested()) || ((paramGoogleSignInOptions.isIdTokenRequested()) && ((!localGoogleSignInOptions.isIdTokenRequested()) || (!paramGoogleSignInOptions.getServerClientId().equals(localGoogleSignInOptions.getServerClientId())))) || (!new HashSet(localGoogleSignInOptions.getScopes()).containsAll(new HashSet(paramGoogleSignInOptions.getScopes()))))
            break label232;
          localObject = zzq.zze(paramContext).zzo();
          if ((localObject == null) || (((GoogleSignInAccount)localObject).isExpired()))
            break label232;
          localObject = new GoogleSignInResult((GoogleSignInAccount)localObject, Status.RESULT_SUCCESS);
          label183: if (localObject == null)
            break label238;
          zzer.d("Eligible saved sign in result found", new Object[0]);
          paramGoogleApiClient = PendingResults.immediatePendingResult((Result)localObject, paramGoogleApiClient);
          AppMethodBeat.o(50438);
        }
    }
    while (true)
    {
      return paramGoogleApiClient;
      bool = false;
      break;
      bool = ((Account)localObject).equals(localAccount);
      break;
      label232: localObject = null;
      break label183;
      label238: if (paramBoolean)
      {
        paramGoogleApiClient = PendingResults.immediatePendingResult(new GoogleSignInResult(null, new Status(4)), paramGoogleApiClient);
        AppMethodBeat.o(50438);
      }
      else
      {
        zzer.d("trySilentSignIn()", new Object[0]);
        paramGoogleApiClient = new OptionalPendingResultImpl(paramGoogleApiClient.enqueue(new zzj(paramGoogleApiClient, paramContext, paramGoogleSignInOptions)));
        AppMethodBeat.o(50438);
      }
    }
  }

  public static PendingResult<Status> zzd(GoogleApiClient paramGoogleApiClient, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(50439);
    zzer.d("Signing out", new Object[0]);
    zzd(paramContext);
    if (paramBoolean)
    {
      paramGoogleApiClient = PendingResults.immediatePendingResult(Status.RESULT_SUCCESS, paramGoogleApiClient);
      AppMethodBeat.o(50439);
    }
    while (true)
    {
      return paramGoogleApiClient;
      paramGoogleApiClient = paramGoogleApiClient.execute(new zzl(paramGoogleApiClient));
      AppMethodBeat.o(50439);
    }
  }

  private static void zzd(Context paramContext)
  {
    AppMethodBeat.i(50441);
    zzq.zze(paramContext).clear();
    paramContext = GoogleApiClient.getAllClients().iterator();
    while (paramContext.hasNext())
      ((GoogleApiClient)paramContext.next()).maybeSignOut();
    GoogleApiManager.reportSignOut();
    AppMethodBeat.o(50441);
  }

  public static Intent zze(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50436);
    zzer.d("getFallbackSignInIntent()", new Object[0]);
    paramContext = zzd(paramContext, paramGoogleSignInOptions);
    paramContext.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
    AppMethodBeat.o(50436);
    return paramContext;
  }

  public static PendingResult<Status> zze(GoogleApiClient paramGoogleApiClient, Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(50440);
    zzer.d("Revoking access", new Object[0]);
    String str = Storage.getInstance(paramContext).getSavedRefreshToken();
    zzd(paramContext);
    if (paramBoolean)
    {
      paramGoogleApiClient = zze.zzg(str);
      AppMethodBeat.o(50440);
    }
    while (true)
    {
      return paramGoogleApiClient;
      paramGoogleApiClient = paramGoogleApiClient.execute(new zzn(paramGoogleApiClient));
      AppMethodBeat.o(50440);
    }
  }

  public static Intent zzf(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50437);
    zzer.d("getNoImplementationSignInIntent()", new Object[0]);
    paramContext = zzd(paramContext, paramGoogleSignInOptions);
    paramContext.setAction("com.google.android.gms.auth.NO_IMPL");
    AppMethodBeat.o(50437);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zzi
 * JD-Core Version:    0.6.2
 */