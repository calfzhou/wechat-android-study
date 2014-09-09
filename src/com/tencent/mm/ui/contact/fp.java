package com.tencent.mm.ui.contact;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.x;
import com.tencent.mm.n.y;
import com.tencent.mm.q.a;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;

public final class fp
{
  public static String CH(String paramString)
  {
    x localx = af.sJ().fg(paramString);
    i locali = bg.qW().oT().ys(paramString);
    int i = locali.ji();
    if (localx != null)
      i = localx.ji();
    a locala;
    Object[] arrayOfObject;
    if (locali.aIg())
    {
      locala = r.fE(locali.getUsername());
      arrayOfObject = new Object[15];
      arrayOfObject[0] = ch.xv(locali.getUsername());
      arrayOfObject[1] = ch.xv(locali.oc());
      arrayOfObject[2] = ch.xv(locali.iS());
      arrayOfObject[3] = ch.xv(locali.oc());
      arrayOfObject[4] = ch.xv(locali.iW());
      arrayOfObject[5] = Integer.valueOf(i);
      arrayOfObject[6] = ch.xv(locali.jp());
      arrayOfObject[7] = ch.xv(locali.jq());
      arrayOfObject[8] = ch.xv(locali.jo());
      arrayOfObject[9] = Integer.valueOf(locali.jw());
      arrayOfObject[10] = Integer.valueOf(locali.jj());
      arrayOfObject[11] = Integer.valueOf(locali.jd());
      arrayOfObject[12] = ch.xv(locali.ju());
      if (locala != null)
        break label245;
    }
    label245: for (String str = ""; ; str = ch.xv(locala.field_brandIconURL))
    {
      arrayOfObject[13] = str;
      arrayOfObject[14] = ch.xv(locali.jz());
      return String.format("<msg username=\"%s\" nickname=\"%s\" alias=\"%s\" fullpy=\"%s\" shortpy=\"%s\" imagestatus=\"%d\" scene=\"17\" province=\"%s\" city=\"%s\" sign=\"%s\" percard=\"%d\" sex=\"%d\" certflag=\"%d\" certinfo=\"%s\" certinfoext=\"\" brandIconUrl=\"%s\" brandHomeUrl=\"\" brandSubscriptConfigUrl=\"\" brandFlags=\"\" regionCode=\"%s\"/>", arrayOfObject);
      locala = null;
      break;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.fp
 * JD-Core Version:    0.6.2
 */