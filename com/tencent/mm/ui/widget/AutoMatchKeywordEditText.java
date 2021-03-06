package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class AutoMatchKeywordEditText extends MMEditText
{
  private a zLO;
  private int zLP;
  private int zLQ;

  public AutoMatchKeywordEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107834);
    init();
    AppMethodBeat.o(107834);
  }

  public AutoMatchKeywordEditText(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(107833);
    init();
    AppMethodBeat.o(107833);
  }

  private void init()
  {
    AppMethodBeat.i(107835);
    this.zLP = getSelectionStart();
    this.zLQ = getSelectionEnd();
    AppMethodBeat.o(107835);
  }

  public void extendSelection(int paramInt)
  {
    AppMethodBeat.i(107839);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "extendSelection");
    super.extendSelection(paramInt);
    this.zLP = getSelectionStart();
    this.zLQ = getSelectionEnd();
    AppMethodBeat.o(107839);
  }

  public a getOnSelectionChangeListener()
  {
    return this.zLO;
  }

  public boolean moveCursorToVisibleOffset()
  {
    AppMethodBeat.i(107840);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "moveCursorToVisibleOffset");
    boolean bool = super.moveCursorToVisibleOffset();
    AppMethodBeat.o(107840);
    return bool;
  }

  public boolean onDragEvent(DragEvent paramDragEvent)
  {
    AppMethodBeat.i(107842);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "onDragEvent");
    boolean bool = super.onDragEvent(paramDragEvent);
    AppMethodBeat.o(107842);
    return bool;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107836);
    super.onDraw(paramCanvas);
    int i = getSelectionStart();
    int j = getSelectionEnd();
    if ((this.zLP != i) || (this.zLQ != j))
    {
      this.zLP = i;
      this.zLQ = j;
      if (this.zLO != null)
        this.zLO.b(this, getSelectionStart(), getSelectionEnd());
    }
    AppMethodBeat.o(107836);
  }

  public boolean performAccessibilityAction(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(107841);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "performAccessibilityAction");
    boolean bool = super.performAccessibilityAction(paramInt, paramBundle);
    AppMethodBeat.o(107841);
    return bool;
  }

  public void setOnSelectionChangeListener(a parama)
  {
    this.zLO = parama;
  }

  public void setSelection(int paramInt)
  {
    AppMethodBeat.i(107837);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "setSelection");
    int i = getSelectionStart();
    int j = getSelectionEnd();
    super.setSelection(paramInt);
    this.zLP = getSelectionStart();
    this.zLQ = getSelectionEnd();
    if (((i != getSelectionStart()) || (j != getSelectionEnd())) && (this.zLO != null))
      this.zLO.b(this, getSelectionStart(), getSelectionEnd());
    AppMethodBeat.o(107837);
  }

  public void setSelection(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(107838);
    ab.d("MicroMsg.AutoMatchKeywordEditText", "setSelection.");
    int i = getSelectionStart();
    int j = getSelectionEnd();
    super.setSelection(paramInt1, paramInt2);
    this.zLP = getSelectionStart();
    this.zLQ = getSelectionEnd();
    if (((i != getSelectionStart()) || (j != getSelectionEnd())) && (this.zLO != null))
      this.zLO.b(this, getSelectionStart(), getSelectionEnd());
    AppMethodBeat.o(107838);
  }

  public static abstract interface a
  {
    public abstract void b(EditText paramEditText, int paramInt1, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.AutoMatchKeywordEditText
 * JD-Core Version:    0.6.2
 */