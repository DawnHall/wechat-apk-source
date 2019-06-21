package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.support.v4.f.b;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

@VisibleForTesting
public final class ClientSettings
{
  public static final String KEY_CLIENT_SESSION_ID = "com.google.android.gms.common.internal.ClientSettings.sessionId";
  private final Set<Scope> zzcv;
  private final int zzcx;
  private final View zzcy;
  private final String zzcz;
  private final String zzda;
  private final Set<Scope> zzrz;
  private final Account zzs;
  private final Map<Api<?>, OptionalApiSettings> zzsa;
  private final SignInOptions zzsb;
  private Integer zzsc;

  public ClientSettings(Account paramAccount, Set<Scope> paramSet, Map<Api<?>, OptionalApiSettings> paramMap, int paramInt, View paramView, String paramString1, String paramString2, SignInOptions paramSignInOptions)
  {
    AppMethodBeat.i(61321);
    this.zzs = paramAccount;
    if (paramSet == null);
    for (paramAccount = Collections.EMPTY_SET; ; paramAccount = Collections.unmodifiableSet(paramSet))
    {
      this.zzcv = paramAccount;
      paramAccount = paramMap;
      if (paramMap == null)
        paramAccount = Collections.EMPTY_MAP;
      this.zzsa = paramAccount;
      this.zzcy = paramView;
      this.zzcx = paramInt;
      this.zzcz = paramString1;
      this.zzda = paramString2;
      this.zzsb = paramSignInOptions;
      paramAccount = new HashSet(this.zzcv);
      paramSet = this.zzsa.values().iterator();
      while (paramSet.hasNext())
        paramAccount.addAll(((OptionalApiSettings)paramSet.next()).mScopes);
    }
    this.zzrz = Collections.unmodifiableSet(paramAccount);
    AppMethodBeat.o(61321);
  }

  public static ClientSettings createDefault(Context paramContext)
  {
    AppMethodBeat.i(61320);
    paramContext = new GoogleApiClient.Builder(paramContext).buildClientSettings();
    AppMethodBeat.o(61320);
    return paramContext;
  }

  @Nullable
  public final Account getAccount()
  {
    return this.zzs;
  }

  @Deprecated
  @Nullable
  public final String getAccountName()
  {
    if (this.zzs != null);
    for (String str = this.zzs.name; ; str = null)
      return str;
  }

  public final Account getAccountOrDefault()
  {
    AppMethodBeat.i(61322);
    Account localAccount;
    if (this.zzs != null)
    {
      localAccount = this.zzs;
      AppMethodBeat.o(61322);
    }
    while (true)
    {
      return localAccount;
      localAccount = new Account("<<default account>>", "com.google");
      AppMethodBeat.o(61322);
    }
  }

  public final Set<Scope> getAllRequestedScopes()
  {
    return this.zzrz;
  }

  public final Set<Scope> getApplicableScopes(Api<?> paramApi)
  {
    AppMethodBeat.i(61323);
    OptionalApiSettings localOptionalApiSettings = (OptionalApiSettings)this.zzsa.get(paramApi);
    if ((localOptionalApiSettings == null) || (localOptionalApiSettings.mScopes.isEmpty()))
    {
      paramApi = this.zzcv;
      AppMethodBeat.o(61323);
    }
    while (true)
    {
      return paramApi;
      paramApi = new HashSet(this.zzcv);
      paramApi.addAll(localOptionalApiSettings.mScopes);
      AppMethodBeat.o(61323);
    }
  }

  @Nullable
  public final Integer getClientSessionId()
  {
    return this.zzsc;
  }

  public final int getGravityForPopups()
  {
    return this.zzcx;
  }

  public final Map<Api<?>, OptionalApiSettings> getOptionalApiSettings()
  {
    return this.zzsa;
  }

  @Nullable
  public final String getRealClientClassName()
  {
    return this.zzda;
  }

  @Nullable
  public final String getRealClientPackageName()
  {
    return this.zzcz;
  }

  public final Set<Scope> getRequiredScopes()
  {
    return this.zzcv;
  }

  @Nullable
  public final SignInOptions getSignInOptions()
  {
    return this.zzsb;
  }

  @Nullable
  public final View getViewForPopups()
  {
    return this.zzcy;
  }

  public final void setClientSessionId(Integer paramInteger)
  {
    this.zzsc = paramInteger;
  }

  public static final class Builder
  {
    private int zzcx = 0;
    private View zzcy;
    private String zzcz;
    private String zzda;
    private Account zzs;
    private Map<Api<?>, ClientSettings.OptionalApiSettings> zzsa;
    private SignInOptions zzsb = SignInOptions.DEFAULT;
    private b<Scope> zzsd;

    public final Builder addAllRequiredScopes(Collection<Scope> paramCollection)
    {
      AppMethodBeat.i(61317);
      if (this.zzsd == null)
        this.zzsd = new b();
      this.zzsd.addAll(paramCollection);
      AppMethodBeat.o(61317);
      return this;
    }

    public final Builder addRequiredScope(Scope paramScope)
    {
      AppMethodBeat.i(61316);
      if (this.zzsd == null)
        this.zzsd = new b();
      this.zzsd.add(paramScope);
      AppMethodBeat.o(61316);
      return this;
    }

    public final ClientSettings build()
    {
      AppMethodBeat.i(61318);
      ClientSettings localClientSettings = new ClientSettings(this.zzs, this.zzsd, this.zzsa, this.zzcx, this.zzcy, this.zzcz, this.zzda, this.zzsb);
      AppMethodBeat.o(61318);
      return localClientSettings;
    }

    public final Builder setAccount(Account paramAccount)
    {
      this.zzs = paramAccount;
      return this;
    }

    public final Builder setGravityForPopups(int paramInt)
    {
      this.zzcx = paramInt;
      return this;
    }

    public final Builder setOptionalApiSettingsMap(Map<Api<?>, ClientSettings.OptionalApiSettings> paramMap)
    {
      this.zzsa = paramMap;
      return this;
    }

    public final Builder setRealClientClassName(String paramString)
    {
      this.zzda = paramString;
      return this;
    }

    public final Builder setRealClientPackageName(String paramString)
    {
      this.zzcz = paramString;
      return this;
    }

    public final Builder setSignInOptions(SignInOptions paramSignInOptions)
    {
      this.zzsb = paramSignInOptions;
      return this;
    }

    public final Builder setViewForPopups(View paramView)
    {
      this.zzcy = paramView;
      return this;
    }
  }

  public static final class OptionalApiSettings
  {
    public final Set<Scope> mScopes;

    public OptionalApiSettings(Set<Scope> paramSet)
    {
      AppMethodBeat.i(61319);
      Preconditions.checkNotNull(paramSet);
      this.mScopes = Collections.unmodifiableSet(paramSet);
      AppMethodBeat.o(61319);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ClientSettings
 * JD-Core Version:    0.6.2
 */