package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.text.Html.ImageGetter;
import android.text.Html.TagHandler;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.al;

public class HtmlTextView extends TextView
{
  Html.ImageGetter pib;
  Html.TagHandler pic;

  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(44016);
    this.pib = new HtmlTextView.2(this);
    this.pic = new HtmlTextView.3(this);
    AppMethodBeat.o(44016);
  }

  public HtmlTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(44015);
    this.pib = new HtmlTextView.2(this);
    this.pic = new HtmlTextView.3(this);
    AppMethodBeat.o(44015);
  }

  public void setText(String paramString)
  {
    AppMethodBeat.i(44017);
    g.RS().a(new HtmlTextView.1(this, paramString));
    AppMethodBeat.o(44017);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.HtmlTextView
 * JD-Core Version:    0.6.2
 */