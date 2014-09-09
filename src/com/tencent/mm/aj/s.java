package com.tencent.mm.aj;

import com.tencent.mm.c.a.da;
import com.tencent.mm.c.a.db;
import com.tencent.mm.sdk.c.e;

final class s extends com.tencent.mm.sdk.c.g
{
  s(l paraml)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    da localda = (da)parame;
    int i = localda.cJn.cJp;
    String str = localda.cJn.username;
    long l = localda.cJn.cJq;
    f localf = new f();
    if (i == 1)
    {
      l.AE().b(l, localf);
      if ((localf.field_talker == null) || (localf.field_talker.equals("")))
        break label145;
      localda.cJo.cJr = localf.field_msgContent;
      localda.cJo.cEh = localf.field_talker;
      localda.cJo.cJs = localf.field_isSend;
    }
    for (localda.cJo.type = localf.field_type; ; localda.cJo.type = -1)
    {
      return false;
      if (i != 2)
        break;
      localf = l.AE().hK(str);
      break;
      label145: localda.cJo.cJr = "";
      localda.cJo.cEh = "";
      localda.cJo.cJs = -1;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aj.s
 * JD-Core Version:    0.6.2
 */