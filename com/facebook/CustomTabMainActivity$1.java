package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

class CustomTabMainActivity$1 extends BroadcastReceiver
{
  CustomTabMainActivity$1(CustomTabMainActivity paramCustomTabMainActivity)
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    AppMethodBeat.i(96581);
    paramContext = new Intent(this.this$0, CustomTabMainActivity.class);
    paramContext.setAction(CustomTabMainActivity.REFRESH_ACTION);
    paramContext.putExtra(CustomTabMainActivity.EXTRA_URL, paramIntent.getStringExtra(CustomTabMainActivity.EXTRA_URL));
    paramContext.addFlags(603979776);
    this.this$0.startActivity(paramContext);
    AppMethodBeat.o(96581);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.CustomTabMainActivity.1
 * JD-Core Version:    0.6.2
 */