package com.tencent.mm.plugin.fingerprint.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fingerprint.faceid.auth.WalletFaceIdAuthUI;
import com.tencent.mm.ui.MMActivity;

final class r$1
  implements DialogInterface.OnClickListener
{
  r$1(r paramr, MMActivity paramMMActivity, Bundle paramBundle)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(41561);
    paramDialogInterface = new Intent(this.icV, WalletFaceIdAuthUI.class);
    paramDialogInterface.putExtra("pwd", this.msi.getString("key_pwd1"));
    paramDialogInterface.putExtra("key_scene", 1);
    this.icV.startActivity(paramDialogInterface);
    AppMethodBeat.o(41561);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fingerprint.b.r.1
 * JD-Core Version:    0.6.2
 */