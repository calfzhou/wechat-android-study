package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.mm.a.c;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.model.app.a;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.p;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.y.ap;

final class nr
  implements cm
{
  nr(ar paramar, String paramString, int paramInt, Context paramContext)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    String str1 = paramMenuItem.getTitle();
    ar localar = this.dxM;
    com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(ch.xw(this.eqx));
    if (localb1 == null)
    {
      z.w("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "send: parse app msg content return null");
      switch (this.eaJ)
      {
      default:
      case 256:
      case 128:
      case 512:
      }
    }
    while (true)
    {
      while (true)
      {
        e.aw(this.dLL, this.dLL.getString(com.tencent.mm.n.bue));
        return;
        String str2 = localar.kp();
        Object localObject = null;
        String str5;
        if (str2 != null)
        {
          boolean bool = localar.kp().equals("");
          localObject = null;
          if (!bool)
            str5 = ap.yg().gS(localar.kp());
        }
        try
        {
          byte[] arrayOfByte = c.a(str5, 0, c.ab(str5));
          localObject = arrayOfByte;
          locala = new a();
          if (localb1.dQY != null)
          {
            long l = ch.getLong(localb1.dQY, -1L);
            if (l == -1L)
              break label423;
            bf.GP().b(l, locala);
            if (locala.iGx != l)
            {
              locala = bf.GP().uU(localb1.dQY);
              if ((locala == null) || (!locala.field_mediaSvrId.equals(localb1.dQY)))
                locala = null;
            }
          }
          String str3 = "";
          if ((locala != null) && (locala.field_fileFullPath != null) && (!locala.field_fileFullPath.equals("")))
          {
            str3 = bg.qW().po() + "da_" + ch.CM();
            p.f(locala.field_fileFullPath, str3, false);
          }
          String str4 = str3;
          com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.a(localb1);
          localb2.dRa = 3;
          s.a(localb2, localb1.appName, str1, str4, localObject);
        }
        catch (Exception localException)
        {
          while (true)
          {
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = str1;
            arrayOfObject4[1] = localException.getLocalizedMessage();
            z.e("!56@/B4Tb64lLpIXFj7yHqNALrvvAHq7Yqk22bT9FeAfy2TsmeBjP5KDgw==", "send appmsg to %s, error:%s", arrayOfObject4);
            localObject = null;
            continue;
            label423: a locala = bf.GP().uU(localb1.dQY);
            if ((locala == null) || (!locala.field_mediaSvrId.equals(localb1.dQY)))
              locala = null;
          }
        }
      }
      com.tencent.mm.plugin.f.c.n localn3 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject3 = new Object[3];
      arrayOfObject3[0] = Integer.valueOf(49);
      arrayOfObject3[1] = Integer.valueOf(256);
      arrayOfObject3[2] = str1;
      localn3.d(10424, arrayOfObject3);
      continue;
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Integer.valueOf(49);
      arrayOfObject2[1] = Integer.valueOf(128);
      arrayOfObject2[2] = str1;
      localn2.d(10424, arrayOfObject2);
      continue;
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[3];
      arrayOfObject1[0] = Integer.valueOf(49);
      arrayOfObject1[1] = Integer.valueOf(512);
      arrayOfObject1[2] = str1;
      localn1.d(10424, arrayOfObject1);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nr
 * JD-Core Version:    0.6.2
 */