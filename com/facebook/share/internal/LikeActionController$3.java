package com.facebook.share.internal;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class LikeActionController$3
  implements CallbackManagerImpl.Callback
{
  public final boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    AppMethodBeat.i(96985);
    boolean bool = LikeActionController.handleOnActivityResult(CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode(), paramInt, paramIntent);
    AppMethodBeat.o(96985);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.facebook.share.internal.LikeActionController.3
 * JD-Core Version:    0.6.2
 */