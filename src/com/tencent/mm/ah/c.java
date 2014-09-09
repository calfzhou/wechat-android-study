package com.tencent.mm.ah;

import com.tencent.mm.a.d;
import com.tencent.mm.ad.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

public final class c
  implements m
{
  public static int dDl = 0;
  private static c dDm;
  private static final d dju = new d(5);
  private boolean dAf = false;
  private int dAg = 3;

  public static String getPrefix()
  {
    switch (dDl)
    {
    default:
      return "single_";
    case 0:
      return "single_";
    case 1:
      return "chatroom_";
    case 2:
    }
    return "app_";
  }

  public static int hx(String paramString)
  {
    int i = 5;
    if ((paramString == null) || (paramString.length() == 0))
      return i;
    if ((!paramString.startsWith("single")) || (paramString.startsWith("chatroom")))
      i = 7;
    if (paramString.startsWith("app"))
      i = 8;
    z.d("!12@nLQl5Xo8bwA=", "type " + i);
    return i;
  }

  private void release()
  {
    this.dAf = false;
    bg.qX().b(159, this);
  }

  public static c zI()
  {
    if (dDm == null)
      dDm = new c();
    return dDm;
  }

  public static void zJ()
  {
    Integer localInteger = Integer.valueOf(ch.a((Integer)bg.qW().oQ().get(16646145)));
    if (localInteger.intValue() < 0)
      localInteger = Integer.valueOf(0);
    bg.qW().oQ().set(16646145, Integer.valueOf(1 + localInteger.intValue()));
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((!(paramx instanceof ab)) || (((ab)paramx).tu() != 9))
      z.d("!12@nLQl5Xo8bwA=", "another scene");
    while (paramx.getType() != 159)
      return;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      bg.qW().oQ().set(81944, Long.valueOf(ch.CL()));
    while (true)
    {
      release();
      return;
      int i = -1 + this.dAg;
      this.dAg = i;
      if (i < 0)
      {
        bg.qW().oQ().set(81944, Long.valueOf((3600000L + (ch.CM() - 86400000L)) / 1000L));
        this.dAg = 3;
      }
    }
  }

  public final void update()
  {
    bg.qW().oQ().set(16646145, Integer.valueOf(0));
    if ((!this.dAf) && (bg.qW().isSDCardAvailable()))
    {
      release();
      this.dAf = true;
      bg.qX().a(159, this);
      k localk = new k(9);
      bg.qX().d(localk);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.c
 * JD-Core Version:    0.6.2
 */