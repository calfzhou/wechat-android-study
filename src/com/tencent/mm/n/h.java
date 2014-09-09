package com.tencent.mm.n;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.az;
import java.util.LinkedList;
import java.util.Stack;

final class h
  implements az
{
  private long dmY = 0L;

  h(e parame)
  {
  }

  public final boolean kJ()
  {
    long l = System.currentTimeMillis();
    if ((e.b(this.dmW)) && (l - this.dmY > 60000L))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Long.valueOf(l - this.dmY);
      com.tencent.mm.sdk.platformtools.z.w("!32@/B4Tb64lLpJO3ngf+FD8EZfQGyZYk2Ww", "do scene TIMEOUT: %d", arrayOfObject);
      e.a(this.dmW, false);
    }
    if (e.b(this.dmW))
    {
      e.c(this.dmW).cP(1000L);
      return false;
    }
    this.dmY = l;
    e.a(this.dmW, true);
    LinkedList localLinkedList = new LinkedList();
    for (int i = 0; (i < 5) && (e.d(this.dmW).size() > 0); i++)
      localLinkedList.add(new vt().wF(((x)e.d(this.dmW).pop()).getUsername()));
    bg.qX().d(new z(localLinkedList));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.n.h
 * JD-Core Version:    0.6.2
 */