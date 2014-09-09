package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.x;
import com.tencent.mm.o.ac;
import com.tencent.mm.pluginsdk.model.app.a;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.y.ag;

public final class ae
  implements com.tencent.mm.pluginsdk.n
{
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2)
  {
    int i = 1;
    if (paramContext == null)
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "send vedio context is null");
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString1;
      arrayOfObject[i] = paramString2;
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "send vedio args error, toUser[%s] fileName[%s]", arrayOfObject);
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, com.tencent.mm.n.bTi, i).show();
      return;
    }
    m localm = new m();
    paramContext.getResources().getString(com.tencent.mm.n.buo);
    cr localcr = e.a(paramContext, paramContext.getResources().getString(com.tencent.mm.n.bui), i, new af(this, localm));
    localm.context = paramContext;
    localm.rI = paramString2;
    localm.jYr = paramString3;
    localm.dXD = localcr;
    localm.cDi = paramString1;
    localm.jYu = false;
    if (62 == paramInt1)
      localm.hwJ = 11;
    if (paramInt1 > 0);
    while (true)
    {
      localm.jYf = i;
      localm.dGd = paramInt2;
      localm.jYs = false;
      localm.execute(new Object[0]);
      return;
      int j = 0;
    }
  }

  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2)
  {
    if (paramString1 == null)
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "sendAppMsg: args error, toUser is null");
      return;
    }
    com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(ch.xw(paramString2));
    if (localb1 == null)
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "send: parse app msg content return null");
      return;
    }
    a locala = new a();
    if (localb1.dQY != null)
    {
      long l = ch.getLong(localb1.dQY, -1L);
      if (l == -1L)
        break label245;
      bf.GP().b(l, locala);
      if (locala.iGx != l)
      {
        locala = bf.GP().uU(localb1.dQY);
        if ((locala != null) && (locala.field_mediaSvrId.equals(localb1.dQY)));
      }
    }
    for (locala = null; ; locala = null)
      label245: 
      do
      {
        String str1 = "";
        if ((locala != null) && (locala.field_fileFullPath != null) && (!locala.field_fileFullPath.equals("")))
        {
          str1 = bg.qW().po() + "da_" + ch.CM();
          p.f(locala.field_fileFullPath, str1, false);
        }
        String str2 = str1;
        com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.a(localb1);
        localb2.dRa = 3;
        s.a(localb2, localb1.appName, paramString1, str2, paramArrayOfByte);
        return;
        locala = bf.GP().uU(localb1.dQY);
      }
      while ((locala != null) && (locala.field_mediaSvrId.equals(localb1.dQY)));
  }

  public final void c(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "sendImg: args error, toUser[%s], fileName[%s]", new Object[] { paramString1, paramString2 });
      return;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, com.tencent.mm.n.bTi, 1).show();
      return;
    }
    ag localag = new ag(4, x.pG(), paramString1, paramString2, paramInt, null, 0, "", "", true, com.tencent.mm.h.Ti);
    bg.qX().d(localag);
    cx.rV().a(cx.dmq, null);
  }

  public final void j(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      z.w("!32@/B4Tb64lLpJKJxrzb0qmwEDSaaZEDBJE", "send msg args error, toUser[%s] content[%s]", new Object[] { paramString1, paramString2 });
      return;
    }
    com.tencent.mm.ab.h localh = new com.tencent.mm.ab.h(paramString1, paramString2, paramInt);
    bg.qX().d(localh);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.ae
 * JD-Core Version:    0.6.2
 */