package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.q;

public class SettingRedesign extends MMPreference
{
  private f ehK;
  private boolean qlP;

  private void refresh()
  {
    AppMethodBeat.i(127077);
    if (this.qlP != ah.getContext().getSharedPreferences(ah.doA() + "_redesign", 4).getBoolean("dark_actionbar", false))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("Intro_Need_Clear_Top ", true);
      b.gkE.p(localIntent, this.mController.ylL);
    }
    AppMethodBeat.o(127077);
  }

  public final int JC()
  {
    return 2131165269;
  }

  public final boolean a(f paramf, Preference paramPreference)
  {
    AppMethodBeat.i(127076);
    if (paramPreference.mKey.equals("redesign_actionbar"))
    {
      if (!((CheckBoxPreference)paramPreference).isChecked())
        break label81;
      ah.getContext().getSharedPreferences(ah.doA() + "_redesign", 4).edit().putBoolean("dark_actionbar", false).commit();
    }
    while (true)
    {
      AppMethodBeat.o(127076);
      return false;
      label81: ah.getContext().getSharedPreferences(ah.doA() + "_redesign", 4).edit().putBoolean("dark_actionbar", true).commit();
    }
  }

  public final void initView()
  {
    boolean bool = false;
    AppMethodBeat.i(127075);
    setMMTitle("Redesign");
    this.ehK = this.yCw;
    this.qlP = ah.getContext().getSharedPreferences(ah.doA() + "_redesign", 4).getBoolean("dark_actionbar", false);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.ehK.aqO("redesign_actionbar");
    if (localCheckBoxPreference != null)
    {
      if (!this.qlP)
        bool = true;
      localCheckBoxPreference.uOT = bool;
    }
    setBackBtn(new SettingRedesign.1(this));
    AppMethodBeat.o(127075);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(127074);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(127074);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(127078);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      refresh();
      bool = true;
      AppMethodBeat.o(127078);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(127078);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingRedesign
 * JD-Core Version:    0.6.2
 */