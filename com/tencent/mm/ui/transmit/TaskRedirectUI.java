package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.a;

@a(7)
public class TaskRedirectUI extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(35279);
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, LauncherUI.class);
    paramBundle.addFlags(268435456);
    paramBundle.addFlags(67108864);
    startActivity(paramBundle);
    finish();
    AppMethodBeat.o(35279);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.TaskRedirectUI
 * JD-Core Version:    0.6.2
 */