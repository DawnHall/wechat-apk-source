package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.v;
import com.tencent.mm.modelsimple.z;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.pluginsdk.e.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.protobuf.ciq;
import com.tencent.mm.protocal.protobuf.df;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;

public class WXBizEntryActivity extends AutoLoginActivity
{
  private int jDy;

  private static void a(Bundle paramBundle, BaseResp paramBaseResp, f paramf)
  {
    AppMethodBeat.i(18150);
    paramBaseResp.toBundle(paramBundle);
    paramBaseResp = new MMessageActV2.Args();
    paramBaseResp.targetPkgName = paramf.field_packageName;
    paramBaseResp.bundle = paramBundle;
    com.tencent.mm.pluginsdk.model.app.p.at(paramBundle);
    com.tencent.mm.pluginsdk.model.app.p.au(paramBundle);
    MMessageActV2.send(ah.getContext(), paramBaseResp);
    AppMethodBeat.o(18150);
  }

  private static void dc(String paramString1, String paramString2)
  {
    AppMethodBeat.i(18151);
    paramString1 = g.bT(paramString1, true);
    if (paramString1 == null)
      AppMethodBeat.o(18151);
    while (true)
    {
      return;
      Object localObject = new WXAppExtendObject();
      ((WXAppExtendObject)localObject).extInfo = paramString2;
      localObject = new WXMediaMessage((WXMediaMessage.IMediaObject)localObject);
      ((WXMediaMessage)localObject).sdkVer = 620954368;
      ((WXMediaMessage)localObject).messageExt = paramString2;
      g.a(ah.getContext(), paramString1.field_appId, (WXMediaMessage)localObject, 2, null, null);
      AppMethodBeat.o(18151);
    }
  }

  public final boolean O(Intent paramIntent)
  {
    return true;
  }

  public final void a(AutoLoginActivity.a parama, final Intent paramIntent)
  {
    String str = null;
    Uri localUri = null;
    LinkedList localLinkedList = null;
    paramIntent = null;
    AppMethodBeat.i(18149);
    ab.i("MicroMsg.WXBizEntryActivity", "postLogin, loginResult = ".concat(String.valueOf(parama)));
    if (getIntent() != null)
      this.jDy = getIntent().getIntExtra("key_command_id", 0);
    switch (8.jDI[parama.ordinal()])
    {
    default:
      ab.e("MicroMsg.WXBizEntryActivity", "postLogin, unknown login result = ".concat(String.valueOf(parama)));
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      finish();
      AppMethodBeat.o(18149);
      while (true)
      {
        return;
        ab.i("MicroMsg.WXBizEntryActivity", "req type = %d", new Object[] { Integer.valueOf(this.jDy) });
        switch (this.jDy)
        {
        case 10:
        case 18:
        case 20:
        case 21:
        case 22:
        case 23:
        default:
          finish();
          AppMethodBeat.o(18149);
          break;
        case 9:
          d.c(this, "card", ".ui.CardAddEntranceUI", getIntent());
          finish();
          AppMethodBeat.o(18149);
          break;
        case 16:
          d.c(this, "card", ".ui.CardListSelectedUI", getIntent());
          finish();
          AppMethodBeat.o(18149);
          break;
        case 7:
        case 8:
          parama = getIntent();
          parama.setClassName(this, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
          startActivity(parama);
          finish();
          AppMethodBeat.o(18149);
          break;
        case 11:
          parama = getIntent();
          parama.putExtra("device_type", 1);
          d.c(this, "exdevice", ".ui.ExdeviceRankInfoUI", parama);
          finish();
          AppMethodBeat.o(18149);
          break;
        case 13:
          parama = getIntent();
          parama.putExtra("key_static_from_scene", 100001);
          d.c(this, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", parama);
          finish();
          AppMethodBeat.o(18149);
          break;
        case 14:
        case 15:
          new a(this, getIntent().getStringExtra("key_app_id"), getIntent().getStringExtra("open_id"), new WXBizEntryActivity.1(this)).aVi();
          AppMethodBeat.o(18149);
          break;
        case 17:
          int i;
          try
          {
            localUri = getIntent().getData();
            parama = new WXBizEntryActivity.2(this);
            paramIntent = getIntent().getStringExtra("key_package_name");
            str = getIntent().getStringExtra("key_package_signature");
            i = getIntent().getIntExtra("translate_link_scene", 1);
            ab.d("MicroMsg.WXBizLogic", "dealWithHandleScanResult: callPackage=%s, packageSignature=%s", new Object[] { paramIntent, str });
            if ((!bo.isNullOrNil(paramIntent)) && (!bo.isNullOrNil(str)))
              break label591;
            ab.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult:packageName or signature null");
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            ab.e("MicroMsg.WXBizEntryActivity", "get url from intent failed : %s", new Object[] { parama.getMessage() });
            AppMethodBeat.o(18149);
          }
          continue;
          localLinkedList = new LinkedList();
          df localdf = new df();
          ab.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult package name = %s", new Object[] { paramIntent });
          localdf.kKO = paramIntent;
          localdf.signature = str;
          localLinkedList.add(localdf);
          paramIntent = new z(localUri.toString(), i, localLinkedList);
          parama = new e.1(this, parama);
          aw.Rg().a(1200, parama);
          aw.Rg().a(paramIntent, 0);
          AppMethodBeat.o(18149);
          break;
        case 12:
          try
          {
            parama = getIntent().getData();
            if ((parama == null) || (!e.ain(parama.toString())))
              break label236;
            v.Zp().nV("key_data_center_session_id");
            e.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.3(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            while (true)
            {
              ab.e("MicroMsg.WXBizEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
              parama = paramIntent;
            }
          }
        case 25:
          try
          {
            parama = getIntent().getData();
            if ((parama == null) || (!e.aio(parama.toString())))
              break label236;
            v.Zp().nV("key_data_center_session_id");
            e.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.4(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            while (true)
            {
              ab.e("MicroMsg.WXBizEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
              parama = str;
            }
          }
        case 19:
          try
          {
            parama = getIntent().getData();
            if (parama == null)
              break label236;
            paramIntent = parama.getQueryParameter("invokeData");
            e.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new e.a()
            {
              public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm, boolean paramAnonymousBoolean)
              {
                AppMethodBeat.i(18142);
                ab.i("MicroMsg.WXBizEntryActivity", "launchWXMiniprogram, DeepLinkHelper.DeepLinkCallback, %d, %d, %s, %b", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
                if ((paramAnonymousm != null) && (paramAnonymousInt1 != 0) && (paramAnonymousInt2 != 0) && ((paramAnonymousm instanceof z)))
                {
                  paramAnonymousString = ((z)paramAnonymousm).ajE();
                  if ((paramAnonymousString != null) && (!WXBizEntryActivity.this.isFinishing()))
                  {
                    h.a(WXBizEntryActivity.this, bo.nullAsNil(paramAnonymousString.xhy), WXBizEntryActivity.this.getString(2131297061), WXBizEntryActivity.this.getString(2131296994), false, new WXBizEntryActivity.5.1(this, paramAnonymousString));
                    AppMethodBeat.o(18142);
                  }
                }
                while (true)
                {
                  return;
                  WXBizEntryActivity.this.finish();
                  AppMethodBeat.o(18142);
                  continue;
                  WXBizEntryActivity.this.finish();
                  AppMethodBeat.o(18142);
                }
              }
            }
            , getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            while (true)
            {
              ab.e("MicroMsg.WXBizEntryActivity", "get data from intent for launch wxminiprogram failed : %s", new Object[] { parama.getMessage() });
              parama = localUri;
            }
          }
        case 26:
          try
          {
            parama = getIntent().getData();
            if (parama == null)
              break label236;
            e.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.6(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            while (true)
            {
              ab.e("MicroMsg.WXBizEntryActivity", "get data from intent for launch fake native miniprogram failed : %s", new Object[] { parama.getMessage() });
              parama = localLinkedList;
            }
          }
        case 24:
          try
          {
            label236: parama = getIntent().getData();
            label591: if (parama == null)
              break label236;
            e.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.7(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
            AppMethodBeat.o(18149);
          }
          catch (Exception parama)
          {
            while (true)
            {
              ab.e("MicroMsg.WXBizEntryActivity", "get data from intent for offline pay failed : %s", new Object[] { parama.getMessage() });
              parama = null;
            }
          }
        }
      }
      ab.e("MicroMsg.WXBizEntryActivity", "postLogin fail, loginResult = ".concat(String.valueOf(parama)));
    }
  }

  public final int getLayoutId()
  {
    return 2130968856;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18148);
    super.onCreate(paramBundle);
    setTitleVisibility(0);
    AppMethodBeat.o(18148);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXBizEntryActivity
 * JD-Core Version:    0.6.2
 */