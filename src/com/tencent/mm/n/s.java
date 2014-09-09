package com.tencent.mm.n;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.bp;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import junit.framework.Assert;

public final class s
  implements m
{
  x dnd = null;
  u dno = null;
  aa dnp = null;
  boolean dnq = false;
  private bp dnr = null;

  public s()
  {
    bg.qX().a(158, this);
  }

  public final int a(String paramString, u paramu)
  {
    Assert.assertTrue("GetHDHeadImg must set callback", true);
    if (ch.jb(paramString))
    {
      paramu.A(3, -101);
      return -101;
    }
    this.dno = paramu;
    if (i.yc(paramString));
    for (String str = i.ye(paramString); ; str = paramString)
    {
      this.dnd = af.sJ().fg(str);
      z.d("!44@/B4Tb64lLpInTscHU+IPGhJ+o4yZb+hjE0RNiSZcohg=", "GetHDHeadImg: %s", new Object[] { str });
      if ((this.dnd == null) || (!this.dnd.getUsername().equals(str)))
      {
        this.dnd = new x();
        this.dnd.setUsername(str);
      }
      if (ch.jb(this.dnd.st()))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = Integer.valueOf(this.dnd.ji());
        z.w("!44@/B4Tb64lLpInTscHU+IPGhJ+o4yZb+hjE0RNiSZcohg=", "dkhurl [%s] has NO URL flag:%d !", arrayOfObject);
        this.dnp = new aa(str);
        if (!bg.qX().d(this.dnp))
        {
          paramu.A(3, -102);
          return -102;
        }
        return 0;
      }
      x localx = this.dnd;
      if ((this.dnr == null) || (this.dnr.aNy()))
        this.dnr = new bp(1, "get-hd-headimg", 1);
      if (this.dnr.c(new t(this, localx)) == 0)
        return 0;
      paramu.A(3, -103);
      return -103;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    this.dno.A(paramInt1, paramInt2);
  }

  public final void sk()
  {
    bg.qX().b(158, this);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.s
 * JD-Core Version:    0.6.2
 */