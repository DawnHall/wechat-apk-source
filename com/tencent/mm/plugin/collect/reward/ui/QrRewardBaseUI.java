package com.tencent.mm.plugin.collect.reward.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public abstract class QrRewardBaseUI extends WalletBaseUI
{
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    dyb();
    setBackBtn(new QrRewardBaseUI.1(this), 2131230737);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardBaseUI
 * JD-Core Version:    0.6.2
 */