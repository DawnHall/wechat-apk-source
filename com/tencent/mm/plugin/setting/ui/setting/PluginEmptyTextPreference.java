package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginEmptyTextPreference extends Preference
{
  private Context context;
  private TextView eku;
  private String text;

  public PluginEmptyTextPreference(Context paramContext)
  {
    this(paramContext, null, 0);
    AppMethodBeat.i(126975);
    this.text = paramContext.getString(2131303206);
    AppMethodBeat.o(126975);
  }

  public PluginEmptyTextPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126976);
    this.eku = null;
    this.context = paramContext;
    setLayoutResource(2130970363);
    AppMethodBeat.o(126976);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(126978);
    super.onBindView(paramView);
    this.eku = ((TextView)paramView.findViewById(2131821457));
    this.eku.setText(this.text);
    AppMethodBeat.o(126978);
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(126977);
    paramViewGroup = super.onCreateView(paramViewGroup);
    View.inflate(this.context, 2130970363, null);
    AppMethodBeat.o(126977);
    return paramViewGroup;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.PluginEmptyTextPreference
 * JD-Core Version:    0.6.2
 */