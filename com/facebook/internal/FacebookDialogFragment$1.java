package com.facebook.internal;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.tencent.matrix.trace.core.AppMethodBeat;

class FacebookDialogFragment$1
  implements WebDialog.OnCompleteListener
{
  FacebookDialogFragment$1(FacebookDialogFragment paramFacebookDialogFragment)
  {
  }

  public void onComplete(Bundle paramBundle, FacebookException paramFacebookException)
  {
    AppMethodBeat.i(96629);
    FacebookDialogFragment.access$000(this.this$0, paramBundle, paramFacebookException);
    AppMethodBeat.o(96629);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.facebook.internal.FacebookDialogFragment.1
 * JD-Core Version:    0.6.2
 */