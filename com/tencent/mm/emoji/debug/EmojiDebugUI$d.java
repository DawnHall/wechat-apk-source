package com.tencent.mm.emoji.debug;

import a.l;
import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/debug/EmojiDebugUI$DebugAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI$DebugViewHolder;", "Lcom/tencent/mm/emoji/debug/EmojiDebugUI;", "(Lcom/tencent/mm/emoji/debug/EmojiDebugUI;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "plugin-emojisdk_release"})
public final class EmojiDebugUI$d extends RecyclerView.a<EmojiDebugUI.e>
{
  public final int getItemCount()
  {
    AppMethodBeat.i(63123);
    int i = EmojiDebugUI.b(this.exb).size();
    AppMethodBeat.o(63123);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.debug.EmojiDebugUI.d
 * JD-Core Version:    0.6.2
 */