package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.h.c;
import com.tencent.mm.plugin.backup.h.d;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class f
  implements l
{
  private static String a(gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17461);
    s locals = c.Fm(parambi.field_imgPath);
    if (locals == null)
    {
      AppMethodBeat.o(17461);
      paramgu = null;
    }
    while (true)
    {
      return paramgu;
      if (parambi.getType() == 62);
      for (int i = 62; ; i = 43)
      {
        paramgu.jCt = i;
        if (!bo.isNullOrNil(parambi.field_content))
          break label72;
        AppMethodBeat.o(17461);
        paramgu = null;
        break;
      }
      label72: StringWriter localStringWriter;
      if (c.kH(parambi.field_talker))
      {
        paramgu = locals.alt();
        localStringWriter = new StringWriter();
      }
      try
      {
        parambi = XmlPullParserFactory.newInstance().newSerializer();
        parambi.setOutput(localStringWriter);
        parambi.startTag(null, "msg");
        parambi.startTag(null, "videomsg");
        Object localObject = br.z(locals.alw(), "msg");
        if (localObject != null)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "aeskey", (String)((Map)localObject).get(".msg.videomsg.$aeskey"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumbaeskey", (String)((Map)localObject).get(".msg.videomsg.$cdnthumbaeskey"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnvideourl", (String)((Map)localObject).get(".msg.videomsg.$cdnvideourl"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumburl", (String)((Map)localObject).get(".msg.videomsg.$cdnthumburl"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumblength", (String)((Map)localObject).get(".msg.videomsg.$cdnthumblength"));
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        parambi.attribute(null, "playlength", locals.fXd);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        parambi.attribute(null, "length", locals.frO);
        parambi.attribute(null, "type", String.valueOf(i));
        if (!bo.isNullOrNil(paramgu))
          parambi.attribute(null, "fromusername", paramgu);
        paramgu = new java/lang/StringBuilder;
        paramgu.<init>();
        parambi.attribute(null, "md5", locals.cMW);
        parambi.endTag(null, "videomsg");
        parambi.endTag(null, "msg");
        parambi.endDocument();
        localStringWriter.flush();
        localStringWriter.close();
        paramgu = localStringWriter.getBuffer().toString();
        ab.d("MicroMsg.BackupItemVideo", "parseContent xml:".concat(String.valueOf(paramgu)));
        AppMethodBeat.o(17461);
        continue;
        paramgu = paramgu.vEB.wVI;
      }
      catch (Exception paramgu)
      {
        ab.e("MicroMsg.BackupItemVideo", "packetVoice xml error: " + paramgu.toString());
        AppMethodBeat.o(17461);
        paramgu = null;
      }
    }
  }

  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17459);
    d.aUr().aUs().all();
    paramString = t.uh(parambi.field_imgPath);
    paramHashMap = c.Fm(parambi.field_imgPath);
    int i;
    if ((paramHashMap == null) || (paramHashMap.status == 199))
    {
      i = 1;
      paramHashMap = new com.tencent.mm.vfs.b(paramString);
      if ((i == 0) || (!paramHashMap.exists()))
        break label363;
    }
    label204: label360: label363: for (int j = (int)paramHashMap.length(); ; j = 0)
    {
      int k = 0;
      d.aUr().aUs().all();
      String str = t.ui(parambi.field_imgPath);
      paramHashMap = new com.tencent.mm.vfs.b(str);
      if (paramHashMap.exists())
        k = (int)paramHashMap.length();
      if (paramBoolean1)
      {
        m = k + j;
        AppMethodBeat.o(17459);
        return m;
        i = 0;
        break;
      }
      int m = 0;
      if (k != 0)
      {
        if (parambi.getType() == 62)
          m = i.a(new i.a(str, paramgu, paramLinkedList, 13, paramBoolean1, "_thumb", paramBoolean2)) + 0;
      }
      else
      {
        if ((i == 0) || (j == 0))
          break label360;
        if (parambi.getType() != 62)
          break label298;
        m = i.a(new i.a(paramString, paramgu, paramLinkedList, 12, paramBoolean1, paramBoolean2, null)) + m;
      }
      while (true)
      {
        parambi = a(paramgu, parambi);
        if (parambi == null)
        {
          AppMethodBeat.o(17459);
          break;
          m = i.a(new i.a(str, paramgu, paramLinkedList, 11, paramBoolean1, "_thumb", paramBoolean2)) + 0;
          break label204;
          m = i.a(new i.a(paramString, paramgu, paramLinkedList, 10, paramBoolean1, paramBoolean2, null)) + m;
          continue;
        }
        paramgu.vED = new bts().alV(parambi);
        m += parambi.length();
        AppMethodBeat.o(17459);
        break;
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17460);
    paramString = new s();
    paramString.cIS = paramgu.vEB.wVI;
    paramString.createTime = parambi.field_createTime;
    paramString.cKK = paramgu.ptF;
    Object localObject = paramgu.vED.wVI;
    ab.d("MicroMsg.BackupItemVideo", "parseVideoMsgXML content:".concat(String.valueOf(localObject)));
    localObject = br.z((String)localObject, "msg");
    if (localObject != null);
    while (true)
    {
      try
      {
        paramString.frO = g.bC((String)((Map)localObject).get(".msg.videomsg.$length"), 0);
        paramString.fXd = g.bC((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        paramString.fWW = ((String)((Map)localObject).get(".msg.videomsg.$fromusername"));
        int i = g.bC((String)((Map)localObject).get(".msg.videomsg.$type"), 0);
        ab.d("MicroMsg.BackupItemVideo", "video msg exportType :".concat(String.valueOf(i)));
        if (i == 44)
        {
          i = 1;
          paramString.fXh = i;
          if ((!g.d(paramgu, 10)) && (!g.d(paramgu, 12)))
            break label555;
          paramString.status = 199;
          localObject = t.ug(paramString.alt());
          parambi.jv((String)localObject);
          paramString.fileName = ((String)localObject);
          if (parambi.getType() != 62)
            parambi.setType(43);
          parambi.setContent(q.d(paramString.alt(), paramString.fXc, false));
          paramString.fXe = ((int)c.l(parambi));
          paramString.fXb = bo.anT();
          paramString.fXf = 0;
          ab.d("MicroMsg.BackupItemVideo", "Insert fileName[" + paramString.getFileName() + "] size:" + paramString.frO + " svrid:" + paramString.cKK + " timelen:" + paramString.fXd + " user:" + paramString.getUser() + " human:" + paramString.alt());
          d.aUr().aUs().all().b(paramString);
          d.aUr().aUs().all();
          paramString = t.ui((String)localObject);
          if (parambi.getType() != 62)
            break label564;
          g.b(paramgu, 13, paramString);
          paramString = g.a(paramgu, 12);
          if (paramString != null)
          {
            paramString = g.Fa(paramString) + paramString;
            d.aUr().aUs().all();
            e.y(paramString, t.uh((String)localObject));
          }
          AppMethodBeat.o(17460);
          return 0;
        }
        i = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.BackupItemVideo", "parsing voice msg xml failed");
        ab.printErrStackTrace("MicroMsg.BackupItemVideo", localException, "", new Object[0]);
        continue;
      }
      ab.e("MicroMsg.BackupItemVideo", "videomsg paseXml failed:%s", new Object[] { paramgu.vED.wVI });
      parambi.setContent(paramgu.vED.wVI);
      continue;
      label555: paramString.status = 111;
      continue;
      label564: g.b(paramgu, 11, paramString);
      paramString = g.a(paramgu, 10);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.f
 * JD-Core Version:    0.6.2
 */