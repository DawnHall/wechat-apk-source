package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.preference.Preference;

public final class e extends Preference
{
  public View.OnClickListener mOnClickListener;
  private View mView;
  public String pez;

  public e(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(43904);
    this.mView = null;
    this.mOnClickListener = null;
    setLayoutResource(2130970045);
    AppMethodBeat.o(43904);
  }

  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43905);
    if (this.mView == null)
      this.mView = onCreateView(paramViewGroup);
    onBindView(this.mView);
    paramView = this.mView;
    AppMethodBeat.o(43905);
    return paramView;
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(43906);
    super.onBindView(paramView);
    paramView = (TextView)paramView.findViewById(2131825806);
    paramView.setText(this.pez);
    paramView.setOnClickListener(this.mOnClickListener);
    AppMethodBeat.o(43906);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.order.ui.a.e
 * JD-Core Version:    0.6.2
 */