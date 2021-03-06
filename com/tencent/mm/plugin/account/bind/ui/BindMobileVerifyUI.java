package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.au.b;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.modelsimple.BindWordingContent;
import com.tencent.mm.plugin.account.friend.a.x;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.Timer;

public class BindMobileVerifyUI extends MMWizardActivity
  implements f
{
  private String cFl;
  private int fromScene;
  private EditText grL;
  private Button grN;
  private BindWordingContent grY;
  private int grZ;
  private boolean gsa;
  private boolean gsb;
  private TextView gsq;
  private TextView gsr;
  private Integer gss;
  private Timer mTimer;
  private com.tencent.mm.ui.base.p tipDialog;

  public BindMobileVerifyUI()
  {
    AppMethodBeat.i(13535);
    this.tipDialog = null;
    this.gss = Integer.valueOf(15);
    AppMethodBeat.o(13535);
  }

  private void apd()
  {
    AppMethodBeat.i(13540);
    if (this.mTimer == null)
    {
      this.mTimer = new Timer();
      BindMobileVerifyUI.5 local5 = new BindMobileVerifyUI.5(this);
      if (this.mTimer != null)
        this.mTimer.schedule(local5, 1000L, 1000L);
    }
    AppMethodBeat.o(13540);
  }

  private void ape()
  {
    AppMethodBeat.i(13541);
    if (this.mTimer != null)
    {
      this.mTimer.cancel();
      this.mTimer = null;
    }
    AppMethodBeat.o(13541);
  }

  public final int getLayoutId()
  {
    return 2130968844;
  }

  public final void initView()
  {
    AppMethodBeat.i(13539);
    this.cFl = ((String)g.RP().Ry().get(4097, null));
    this.grL = ((EditText)findViewById(2131821771));
    this.gsq = ((TextView)findViewById(2131821770));
    this.gsr = ((TextView)findViewById(2131821774));
    Button localButton = (Button)findViewById(2131821772);
    if ((this.cFl == null) || (this.cFl.equals("")))
      this.cFl = ((String)g.RP().Ry().get(6, null));
    if ((this.cFl != null) && (this.cFl.length() > 0))
    {
      this.gsq.setVisibility(0);
      this.gsq.setText(this.cFl);
    }
    Object localObject = new BindMobileVerifyUI.1(this);
    this.grL.setFilters(new InputFilter[] { localObject });
    this.grN = ((Button)findViewById(2131821735));
    localButton.setVisibility(8);
    this.gsr.setText(getResources().getQuantityString(2131361811, this.gss.intValue(), new Object[] { this.gss }));
    apd();
    addTextOptionMenu(0, getString(2131296989), new BindMobileVerifyUI.2(this));
    setBackBtn(new BindMobileVerifyUI.3(this));
    localObject = this.grN;
    if (b.sM(this.cFl));
    for (int i = 0; ; i = 8)
    {
      ((Button)localObject).setVisibility(i);
      this.grN.setOnClickListener(new BindMobileVerifyUI.4(this));
      AppMethodBeat.o(13539);
      return;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13536);
    super.onCreate(paramBundle);
    g.Rg().a(132, this);
    setMMTitle(2131297566);
    this.grY = ((BindWordingContent)getIntent().getParcelableExtra("kstyle_bind_wording"));
    this.grZ = getIntent().getIntExtra("kstyle_bind_recommend_show", 0);
    this.gsa = getIntent().getBooleanExtra("Kfind_friend_by_mobile_flag", false);
    this.gsb = getIntent().getBooleanExtra("Krecom_friends_by_mobile_flag", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    initView();
    AppMethodBeat.o(13536);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13537);
    g.Rg().b(132, this);
    super.onDestroy();
    AppMethodBeat.o(13537);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(13542);
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      Ni(1);
      AppMethodBeat.o(13542);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(13542);
    }
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    boolean bool1 = true;
    AppMethodBeat.i(13543);
    ab.i("MicroMsg.BindMobileVerifyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (((x)paramm).Ah() != 2)
      AppMethodBeat.o(13543);
    while (true)
    {
      return;
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (((x)paramm).Ah() != 2);
      switch (this.fromScene)
      {
      default:
        if ((this.fromScene == 0) || (this.fromScene == 3))
          ((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).syncAddrBookAndUpload();
        paramString = new Intent(this, BindMobileStatusUI.class);
        paramString.putExtra("kstyle_bind_wording", this.grY);
        paramString.putExtra("kstyle_bind_recommend_show", this.grZ);
        paramString.putExtra("Kfind_friend_by_mobile_flag", this.gsa);
        paramString.putExtra("Krecom_friends_by_mobile_flag", this.gsb);
        paramString.putExtra("bind_scene", this.fromScene);
        J(this, paramString);
        AppMethodBeat.o(13543);
        break;
      case 1:
        if (!r.YH())
        {
          paramString = new tt();
          paramString.cPS.cPT = true;
          paramString.cPS.cPU = true;
          com.tencent.mm.sdk.b.a.xxA.m(paramString);
        }
        Ni(1);
        paramString = new Intent();
        paramString.addFlags(67108864);
        com.tencent.mm.plugin.account.a.a.gkE.e(this, paramString);
        AppMethodBeat.o(13543);
        break;
      case 6:
        boolean bool2;
        if (!this.gsa)
        {
          bool2 = true;
          label341: if (this.gsb)
            break label376;
        }
        while (true)
        {
          BindMobileStatusUI.c(this, bool2, bool1);
          exit(-1);
          AppMethodBeat.o(13543);
          break;
          bool2 = false;
          break label341;
          label376: bool1 = false;
        }
        int i;
        if (com.tencent.mm.plugin.account.a.a.gkF.a(this, paramInt1, paramInt2, paramString))
          i = 1;
        while (true)
        {
          if (i == 0)
            break label638;
          AppMethodBeat.o(13543);
          break;
          switch (paramInt2)
          {
          default:
            i = 0;
            break;
          case -34:
            Toast.makeText(this, 2131297538, 0).show();
            i = 1;
            break;
          case -43:
            Toast.makeText(this, 2131297535, 0).show();
            i = 1;
            break;
          case -214:
            paramString = com.tencent.mm.h.a.jY(paramString);
            if (paramString != null)
              paramString.a(this, null, null);
            i = 1;
            break;
          case -41:
            Toast.makeText(this, 2131297537, 0).show();
            i = 1;
            break;
          case -35:
            Toast.makeText(this, 2131297536, 0).show();
            i = 1;
            break;
          case -36:
            Toast.makeText(this, 2131297540, 0).show();
            i = 1;
            break;
          case -32:
            h.a(this, 2131297584, 2131297589, null);
            i = 1;
            break;
          case -33:
            h.a(this, 2131297583, 2131297589, null);
            i = 1;
          }
        }
        label638: Toast.makeText(this, getString(2131297582, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
        AppMethodBeat.o(13543);
      }
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(13538);
    ape();
    super.onStop();
    AppMethodBeat.o(13538);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI
 * JD-Core Version:    0.6.2
 */