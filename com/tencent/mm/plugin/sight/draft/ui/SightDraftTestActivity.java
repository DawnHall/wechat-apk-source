package com.tencent.mm.plugin.sight.draft.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SightDraftTestActivity extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25021);
    super.onCreate(paramBundle);
    paramBundle = new SightDraftContainerView(this);
    setContentView(paramBundle);
    paramBundle.clx();
    AppMethodBeat.o(25021);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.draft.ui.SightDraftTestActivity
 * JD-Core Version:    0.6.2
 */