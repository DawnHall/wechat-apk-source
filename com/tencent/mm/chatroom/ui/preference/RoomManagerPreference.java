package com.tencent.mm.chatroom.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.LinkedList;
import java.util.List;

public class RoomManagerPreference extends Preference
{
  private List<ad> eom;

  public RoomManagerPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(104472);
    this.eom = new LinkedList();
    AppMethodBeat.o(104472);
  }

  public RoomManagerPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(104471);
    this.eom = new LinkedList();
    AppMethodBeat.o(104471);
  }

  public final void onBindView(View paramView)
  {
    AppMethodBeat.i(104473);
    super.onBindView(paramView);
    ((TextView)paramView.findViewById(2131820678)).setText(getTitle());
    ImageView localImageView1 = (ImageView)paramView.findViewById(2131827159);
    ImageView localImageView2 = (ImageView)paramView.findViewById(2131827160);
    paramView = (ImageView)paramView.findViewById(2131827161);
    localImageView1.setVisibility(4);
    localImageView2.setVisibility(4);
    paramView.setVisibility(4);
    int i = 0;
    if (i < this.eom.size())
    {
      if (i == 0)
      {
        a.b.a(localImageView1, ((ad)this.eom.get(0)).field_username, 0.15F, false);
        localImageView1.setVisibility(0);
      }
      while (true)
      {
        i++;
        break;
        if (1 == i)
        {
          a.b.a(localImageView2, ((ad)this.eom.get(1)).field_username, 0.15F, false);
          localImageView2.setVisibility(0);
        }
        else if (2 == i)
        {
          paramView.setVisibility(0);
          a.b.a(paramView, ((ad)this.eom.get(2)).field_username, 0.15F, false);
        }
      }
    }
    AppMethodBeat.o(104473);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.preference.RoomManagerPreference
 * JD-Core Version:    0.6.2
 */