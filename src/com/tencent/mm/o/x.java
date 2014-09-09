package com.tencent.mm.o;

import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import junit.framework.Assert;

public abstract class x
{
  protected long doA = ch.CN();
  private int doB = -1;
  private int doC = -99;
  private an doD;
  private m doE;
  private boolean doF;
  private r doz;
  public cm jwL;
  private int priority = 0;

  public final void V(boolean paramBoolean)
  {
    this.doF = paramBoolean;
  }

  protected int a(aj paramaj)
  {
    return aa.doL;
  }

  protected int a(r paramr, aj paramaj, ab paramab)
  {
    c(paramr);
    if (this.doC == -99)
    {
      this.doC = sB();
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpK+IBX8XDgnvtEZFXv5uU6B", "initilized security limit count to " + this.doC);
    }
    if (sB() > 1)
      switch (y.doH[(-1 + a(paramaj))])
      {
      default:
        Assert.assertTrue("invalid security verification status", false);
      case 3:
      case 1:
      case 2:
      }
    while (to())
    {
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpK+IBX8XDgnvtEZFXv5uU6B", "dispatch failed, scene limited for security, current limit=" + sB());
      a(z.doJ);
      this.doB = -1;
      return this.doB;
      Assert.assertTrue("scene security verification not passed, type=" + paramaj.getType() + ", uri=" + paramaj.getUri() + ", CHECK NOW", false);
      continue;
      com.tencent.mm.sdk.platformtools.z.e("!32@/B4Tb64lLpK+IBX8XDgnvtEZFXv5uU6B", "scene security verification not passed, type=" + paramaj.getType() + ", uri=" + paramaj.getUri());
      this.doC = (-1 + this.doC);
      a(z.doI);
      this.doB = -1;
      return this.doB;
    }
    this.doC = (-1 + this.doC);
    ar localar = new ar(paramaj);
    if (this.doD != null)
      this.doD.cancel();
    if (this.jwL == null);
    for (this.doD = new an(paramaj, paramab, this, this.doE); ; this.doD = new an(paramaj, paramab, this, this.doE, this.jwL))
    {
      this.doB = paramr.a(localar, this.doD);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(this.doB);
      com.tencent.mm.sdk.platformtools.z.i("!32@/B4Tb64lLpK+IBX8XDgnvtEZFXv5uU6B", "dispatcher send, %d", arrayOfObject);
      if (this.doB >= 0)
        break;
      paramab.a(-1, 3, -1, "send to network failed", paramaj, null);
      return 99999999;
    }
    this.doD.tG();
    return this.doB;
  }

  public abstract int a(r paramr, m paramm);

  public final void a(m paramm)
  {
    this.doE = paramm;
  }

  protected void a(z paramz)
  {
  }

  protected boolean a(x paramx)
  {
    return false;
  }

  protected boolean b(x paramx)
  {
    return false;
  }

  protected final void c(r paramr)
  {
    this.doA = ch.CN();
    this.doz = paramr;
  }

  protected void cancel()
  {
    if (this.doD != null)
      this.doD.cancel();
    if ((this.doB != -1) && (this.doz != null))
    {
      int i = this.doB;
      this.doB = -1;
      this.doz.cancel(i);
    }
  }

  public String getInfo()
  {
    return "";
  }

  public final int getPriority()
  {
    return this.priority;
  }

  public abstract int getType();

  public final void reset()
  {
    this.doA = ch.CN();
    this.doB = -1;
    this.doC = -99;
  }

  protected int sB()
  {
    return 1;
  }

  protected boolean to()
  {
    return this.doC <= 0;
  }

  protected final r tp()
  {
    return this.doz;
  }

  public boolean tq()
  {
    return sB() == 1;
  }

  public final boolean tr()
  {
    return this.doF;
  }

  protected final void ts()
  {
    this.doB = -1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.x
 * JD-Core Version:    0.6.2
 */