package com.tencent.mm.chatroom.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.aa;

final class RoomUpgradeUI$3
  implements View.OnClickListener
{
  RoomUpgradeUI$3(RoomUpgradeUI paramRoomUpgradeUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(104237);
    if (RoomUpgradeUI.e(this.elb).getVisibility() == 0)
    {
      paramView = new Intent();
      RoomUpgradeUI.a(this.elb, this.elb.getString(2131298060, new Object[] { aa.dor() }));
      paramView.putExtra("rawUrl", RoomUpgradeUI.f(this.elb));
      paramView.putExtra("geta8key_username", r.Yz());
      paramView.putExtra("showShare", false);
      d.b(this.elb, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView, 500);
    }
    AppMethodBeat.o(104237);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.chatroom.ui.RoomUpgradeUI.3
 * JD-Core Version:    0.6.2
 */