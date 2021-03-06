package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.preference.Preference;

public class LanguagePreference extends Preference
{
  public LanguagePreference.a gBB;

  public LanguagePreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public LanguagePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(124905);
    setLayoutResource(2130970127);
    AppMethodBeat.o(124905);
  }

  public final void a(LanguagePreference.a parama)
  {
    AppMethodBeat.i(124906);
    if ((parama == null) || (bo.isNullOrNil(parama.gBE)))
    {
      ab.e("MicroMsg.LanguagePreference", "setInfo info error");
      AppMethodBeat.o(124906);
    }
    while (true)
    {
      return;
      this.gBB = parama;
      setKey(parama.gBE);
      AppMethodBeat.o(124906);
    }
  }

  public final void onBindView(View paramView)
  {
    int i = 1;
    AppMethodBeat.i(124908);
    super.onBindView(paramView);
    TextView localTextView = (TextView)paramView.findViewById(2131821776);
    paramView = (CheckBox)paramView.findViewById(2131824618);
    int j;
    if (localTextView != null)
    {
      j = 1;
      if (paramView == null)
        break label90;
    }
    while (true)
    {
      if ((i & j) != 0)
      {
        localTextView.setText(this.gBB.gBC);
        paramView.setChecked(this.gBB.gBF);
      }
      NW(8);
      AppMethodBeat.o(124908);
      return;
      j = 0;
      break;
      label90: i = 0;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(124907);
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(2131821019);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(2130970155, localViewGroup);
    AppMethodBeat.o(124907);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.LanguagePreference
 * JD-Core Version:    0.6.2
 */