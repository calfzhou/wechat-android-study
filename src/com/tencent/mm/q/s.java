package com.tencent.mm.q;

import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelgeo.h;
import com.tencent.mm.o.ac;
import com.tencent.mm.sdk.f.as;
import com.tencent.mm.storage.o;

public final class s
{
  private String cDi = null;
  private int dqO = 0;
  private h dqP;
  private int dqQ = 2;
  private int dqR = 10;
  private as dqS = new t(this);
  private com.tencent.mm.modelgeo.c dqT = new u(this);

  protected s()
  {
    if (this.dqR < this.dqQ)
      this.dqR = this.dqQ;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(this.dqR);
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "reportLocation interval %d", arrayOfObject);
  }

  private static void a(String paramString, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, int paramInt3)
  {
    if (paramInt2 == 3);
    Object[] arrayOfObject;
    for (String str = "<event></event>"; ; str = String.format("<event><location><errcode>%d</errcode><data><latitude>%f</latitude><longitude>%f</longitude><precision>%d</precision></data></location></event>", arrayOfObject))
    {
      com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "doScene, info: %s", new Object[] { str });
      bg.qX().d(new z(paramString, paramInt1, str));
      return;
      arrayOfObject = new Object[4];
      arrayOfObject[0] = Integer.valueOf(paramInt2);
      arrayOfObject[1] = Float.valueOf(paramFloat1);
      arrayOfObject[2] = Float.valueOf(paramFloat2);
      arrayOfObject[3] = Integer.valueOf(paramInt3);
    }
  }

  public static void fG(String paramString)
  {
    a(paramString, 10, 0, 0.0F, 0.0F, 0);
  }

  public static void fH(String paramString)
  {
    a(paramString, 12, 0, 0.0F, 0.0F, 0);
  }

  public final void fI(String paramString)
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "Start report");
    this.cDi = paramString;
    a locala = r.fE(paramString);
    if (locala == null);
    e locale;
    do
    {
      do
      {
        return;
        if (this.dqO != 0)
          uV();
        this.dqO = 0;
        if (locala.ub())
        {
          com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "need update contact %s", new Object[] { paramString });
          bg.qW().oT().a(this.dqS);
          this.dqO = 1;
          at.qx().ec(paramString);
          com.tencent.mm.n.c.eM(paramString);
          return;
        }
        locale = locala.tY();
      }
      while (locale == null);
      if ((locale.ud()) && (locala.ua()))
      {
        this.dqP = h.xl();
        if (locala.tY().uy());
        for (int i = 3; ; i = 2)
        {
          this.dqO = i;
          if ((!h.xm()) && (!h.xn()))
            break;
          this.dqP.b(this.dqT);
          return;
        }
        a(paramString, 11, 2, 0.0F, 0.0F, 0);
        return;
      }
    }
    while ((!locale.ud()) || (locala.ua()));
    a(paramString, 11, 1, 0.0F, 0.0F, 0);
  }

  public final void uV()
  {
    com.tencent.mm.sdk.platformtools.z.d("!32@/B4Tb64lLpL9SB0DqhCSWgFPYrICdb5Q", "Stop report");
    this.dqO = 0;
    if (this.dqP != null)
      this.dqP.c(this.dqT);
    if (bg.oE())
      bg.qW().oT().b(this.dqS);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.s
 * JD-Core Version:    0.6.2
 */