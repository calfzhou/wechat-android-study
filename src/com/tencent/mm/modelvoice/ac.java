package com.tencent.mm.modelvoice;

import android.content.Context;
import com.tencent.mm.compatible.audio.e;
import com.tencent.mm.compatible.g.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.o;
import com.tencent.mm.o.p;
import com.tencent.mm.o.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import junit.framework.Assert;

public final class ac
  implements o
{
  private boolean cDS = false;
  private Context context = null;
  private d dHp = null;
  private boolean dHq = false;
  private int dHr = 0;
  private q dHs = null;
  private p dHt;
  private a ddJ;

  public ac(Context paramContext)
  {
    this(paramContext, 0);
  }

  public ac(Context paramContext, int paramInt)
  {
    this.context = paramContext;
    this.ddJ = new a(paramContext);
    this.dHr = paramInt;
    new az();
  }

  public final void U(boolean paramBoolean)
  {
    if (bg.qY().ms())
      paramBoolean = false;
    if (this.cDS == paramBoolean);
    do
    {
      return;
      this.cDS = paramBoolean;
    }
    while ((this.dHp == null) || (!this.dHp.isPlaying()));
    this.dHp.U(paramBoolean);
  }

  public final void a(p paramp)
  {
    this.dHt = paramp;
  }

  public final void a(q paramq)
  {
    this.dHs = paramq;
  }

  public final boolean a(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = Boolean.valueOf(paramBoolean1);
    z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "start file name:[%s] speakerOn:[%b]", arrayOfObject);
    bg.qY().mq();
    boolean bool;
    int j;
    int i;
    if (paramString.length() > 0)
    {
      bool = true;
      Assert.assertTrue(bool);
      if (paramInt != -1)
        break label438;
      j = this.dHr;
      if (!ch.jb(paramString))
        break label238;
      i = -1;
    }
    while (true)
    {
      label72: label101: String str;
      if (i == 0)
        if (this.context != null)
        {
          this.dHp = new bv((byte)0);
          if (bg.qY().ms())
            paramBoolean1 = false;
          this.cDS = paramBoolean1;
          af localaf = new af(this);
          if (this.dHp != null)
            this.dHp.a(localaf);
          ad localad = new ad(this);
          if (this.dHp != null)
            this.dHp.a(localad);
          if (!paramBoolean2)
            break label401;
          str = paramString;
        }
      while (true)
      {
        if (this.dHp.j(str, paramBoolean1))
          break label428;
        z.d("!32@/B4Tb64lLpJjyqE6YDnAp2GSi9zkoYuv", "Start Record PlayError fileName[" + paramString + "], [" + paramBoolean1 + "]");
        return false;
        bool = false;
        break;
        label238: z.d("!32@/B4Tb64lLpLz7JvmHlUIfrN9/jVx6uz4", "fileName " + paramString);
        if (bq.a(paramString, j, paramBoolean2))
        {
          i = 0;
          break label72;
        }
        if (bq.b(paramString, j, paramBoolean2))
        {
          i = 2;
          break label72;
        }
        i = 1;
        break label72;
        this.dHp = new bv();
        break label101;
        if (i == 1)
        {
          if (this.context != null)
          {
            this.dHp = new bf(this.context);
            break label101;
          }
          this.dHp = new bf();
          break label101;
        }
        if (i != 2)
          break label101;
        if (this.context != null)
        {
          this.dHp = new bb(this.context);
          break label101;
        }
        this.dHp = new bb();
        break label101;
        label401: if (this.dHr == 0)
          str = bs.gP(paramString);
        else
          str = null;
      }
      label428: this.ddJ.requestFocus();
      return true;
      label438: i = paramInt;
    }
  }

  public final boolean isPlaying()
  {
    if (this.dHp == null);
    while (this.dHp.getStatus() != 1)
      return false;
    return true;
  }

  public final boolean k(String paramString, boolean paramBoolean)
  {
    return a(paramString, paramBoolean, false, -1);
  }

  public final boolean pause()
  {
    if (this.dHp == null)
      return false;
    boolean bool1 = this.dHp.isPlaying();
    boolean bool2 = false;
    if (bool1)
      bool2 = this.dHp.pause();
    bg.qY().mr();
    bg.qY().mn();
    this.ddJ.nH();
    return bool2;
  }

  public final void stop()
  {
    if (this.dHp == null)
      return;
    if (this.dHp.isPlaying())
      this.dHp.md();
    bg.qY().mr();
    bg.qY().mn();
    this.ddJ.nH();
  }

  public final boolean ta()
  {
    return this.dHq;
  }

  public final boolean tb()
  {
    if (this.dHp == null);
    while (this.dHp.getStatus() != 2)
      return false;
    return true;
  }

  public final boolean tc()
  {
    if (this.dHp == null)
      return false;
    bg.qY().mq();
    if (bg.qY().ms())
      this.cDS = false;
    boolean bool = this.dHp.tc();
    this.ddJ.requestFocus();
    return bool;
  }

  public final double td()
  {
    if (this.dHp == null)
      return 0.0D;
    return this.dHp.td();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.ac
 * JD-Core Version:    0.6.2
 */