package com.tencent.mm.ui.contact.profile;

import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.pluginsdk.ui.applet.h;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

final class w
  implements h
{
  w(i parami)
  {
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, String paramString1, String paramString2)
  {
    com.tencent.mm.storage.i locali1;
    if (paramBoolean1)
    {
      e.aw(i.c(this.jDl), i.c(this.jDl).getString(n.bBd));
      i.k(this.jDl).R("contact_info_time_expired", true);
      locali1 = i.d(this.jDl);
      if ((locali1 != null) && (!ch.jb(paramString1)))
        break label149;
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "respUsername == " + paramString1 + ", contact = " + locali1);
    }
    while (true)
    {
      i.l(this.jDl);
      i.m(this.jDl);
      com.tencent.mm.q.a locala1 = aa.uY().fz(i.d(this.jDl).getUsername());
      locala1.field_status = 1;
      aa.uY().b(locala1);
      return;
      label149: boolean bool = y.df(locali1.getUsername());
      com.tencent.mm.q.a locala2 = null;
      if (bool)
      {
        String str = ch.ja(locali1.getUsername());
        locala2 = r.fE(str);
        if (locala2 != null)
          locala2.field_username = paramString1;
        aa.uY().fA(str);
        locali1.bb(str);
      }
      locali1.setUsername(paramString1);
      if ((int)locali1.dhv == 0)
        bg.qW().oT().G(locali1);
      if ((int)locali1.dhv <= 0)
      {
        z.e("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "addContact : insert contact failed");
      }
      else
      {
        y.k(locali1);
        com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(locali1.getUsername());
        if (locala2 != null)
        {
          aa.uY().a(locala2);
        }
        else
        {
          com.tencent.mm.q.a locala3 = r.fE(locali2.getUsername());
          if ((locala3 == null) || (locala3.ub()))
          {
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "shouldUpdate");
            at.qx().ec(locali2.getUsername());
            c.eM(locali2.getUsername());
          }
          else if (locali2.aIj())
          {
            Object[] arrayOfObject = new Object[1];
            arrayOfObject[0] = Integer.valueOf(locali2.jA());
            z.d("!44@/B4Tb64lLpLSOpQlr7qYXR1bO8ZedfoOBvodPzKbanM=", "update contact, last check time=%d", arrayOfObject);
            at.qx().ec(locali2.getUsername());
            c.eM(locali2.getUsername());
          }
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.profile.w
 * JD-Core Version:    0.6.2
 */