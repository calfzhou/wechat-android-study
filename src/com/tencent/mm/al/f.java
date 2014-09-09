package com.tencent.mm.al;

import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.h;

public final class f
  implements m
{
  private static final String dJf = h.dgF + "tmp_voiceaddr.spx";
  private static final String dJg = h.dgF + "tmp_voiceaddr.amr";
  private static int ddM = 100;
  private int dIZ = 1;
  private i dJe = null;
  private int dJh = 0;
  private int dJi = 0;
  private int dJj = 0;
  private int dJk;
  private Thread dJl;
  private a dJm;
  private boolean dJn;
  private int dcz = 5;

  public f(i parami, int paramInt)
  {
    this.dJk = i;
    this.dJm = null;
    this.dJn = false;
    this.dJe = parami;
    this.dIZ = paramInt;
    if (this.dIZ == 1);
    while (true)
    {
      this.dJk = i;
      return;
      i = 1500000;
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if (this.dIZ == 0)
      bg.qX().b(349, this);
    String[] arrayOfString;
    long l;
    while (true)
    {
      arrayOfString = ((a)paramx).BS();
      l = ((a)paramx).BT();
      if (this.dJj != 2)
        break;
      return;
      bg.qX().b(206, this);
    }
    StringBuilder localStringBuilder = new StringBuilder("onSceneEnd errType:").append(paramInt1).append(" errCode:").append(paramInt2).append(" list:");
    if (arrayOfString == null);
    for (int i = -1; ; i = arrayOfString.length)
    {
      z.e("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", i);
      if (this.dJe == null)
        break;
      if ((paramInt2 == 0) && (paramInt1 == 0))
        break label162;
      this.dJj = 4;
      i locali = this.dJe;
      ((a)paramx).AJ();
      locali.BU();
      return;
    }
    label162: this.dJe.a(arrayOfString, l);
  }

  public final void cancel()
  {
    this.dJj = 2;
    this.dJe = null;
  }

  public final int getMaxAmplitude()
  {
    z.d("!32@/B4Tb64lLpJjyqE6YDnAp3o91K/Zm7/t", "cAmplitude " + this.dJi);
    int i = this.dJi;
    this.dJi = 0;
    if (i > ddM)
      ddM = i;
    z.d("getMaxAmplitude", " map: " + i + " max:" + ddM + " per:" + i * 100 / ddM);
    return i * 100 / ddM;
  }

  public final void start()
  {
    if ((this.dIZ == 0) && (bc.bE(ak.getContext())));
    for (boolean bool = true; ; bool = false)
    {
      this.dJn = bool;
      this.dJl = new Thread(new g(this));
      this.dJl.start();
      return;
    }
  }

  public final void stop()
  {
    this.dJj = 3;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.al.f
 * JD-Core Version:    0.6.2
 */