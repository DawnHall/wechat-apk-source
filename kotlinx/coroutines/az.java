package kotlinx.coroutines;

import a.f.a.b;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lkotlinx/coroutines/InvokeOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "handler", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "invoke", "toString", "", "kotlinx-coroutines-core"})
final class az extends g
{
  private final b<Throwable, y> BQu;

  public az(b<? super Throwable, y> paramb)
  {
    AppMethodBeat.i(118481);
    this.BQu = paramb;
    AppMethodBeat.o(118481);
  }

  public final String toString()
  {
    AppMethodBeat.i(118480);
    String str = "InvokeOnCancel[" + af.ef(this.BQu) + '@' + af.ee(this) + ']';
    AppMethodBeat.o(118480);
    return str;
  }

  public final void v(Throwable paramThrowable)
  {
    AppMethodBeat.i(118478);
    this.BQu.am(paramThrowable);
    AppMethodBeat.o(118478);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     kotlinx.coroutines.az
 * JD-Core Version:    0.6.2
 */