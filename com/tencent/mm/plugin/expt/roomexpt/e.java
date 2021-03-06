package com.tencent.mm.plugin.expt.roomexpt;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.dy;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class e extends dy
{
  protected static c.a ccO;

  static
  {
    AppMethodBeat.i(73606);
    c.a locala = new c.a();
    locala.xDb = new Field[10];
    locala.columns = new String[11];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "chatroom";
    locala.xDd.put("chatroom", "TEXT");
    localStringBuilder.append(" chatroom TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "daySec";
    locala.xDd.put("daySec", "TEXT");
    localStringBuilder.append(" daySec TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "nickname";
    locala.xDd.put("nickname", "TEXT");
    localStringBuilder.append(" nickname TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "isMute";
    locala.xDd.put("isMute", "INTEGER");
    localStringBuilder.append(" isMute INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "unReadCount";
    locala.xDd.put("unReadCount", "INTEGER");
    localStringBuilder.append(" unReadCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "sendCount";
    locala.xDd.put("sendCount", "INTEGER");
    localStringBuilder.append(" sendCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "enterCount";
    locala.xDd.put("enterCount", "INTEGER");
    localStringBuilder.append(" enterCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[7] = "disRedDotCount";
    locala.xDd.put("disRedDotCount", "INTEGER");
    localStringBuilder.append(" disRedDotCount INTEGER");
    localStringBuilder.append(", ");
    locala.columns[8] = "stayTime";
    locala.xDd.put("stayTime", "LONG");
    localStringBuilder.append(" stayTime LONG");
    localStringBuilder.append(", ");
    locala.columns[9] = "score";
    locala.xDd.put("score", "FLOAT");
    localStringBuilder.append(" score FLOAT");
    locala.columns[10] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(73606);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String toString()
  {
    AppMethodBeat.i(73605);
    String str = String.format("name[%s %s] daySec[%s] isMute[%d] unRead[%d] send[%d] enter[%d] disRedRod[%d] stayTime[%d] score[%f] systemRowid[%d]", new Object[] { this.field_chatroom, this.field_nickname, this.field_daySec, Integer.valueOf(this.field_isMute), Integer.valueOf(this.field_unReadCount), Integer.valueOf(this.field_sendCount), Integer.valueOf(this.field_enterCount), Integer.valueOf(this.field_disRedDotCount), Long.valueOf(this.field_stayTime), Float.valueOf(this.field_score), Long.valueOf(this.xDa) });
    AppMethodBeat.o(73605);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.roomexpt.e
 * JD-Core Version:    0.6.2
 */