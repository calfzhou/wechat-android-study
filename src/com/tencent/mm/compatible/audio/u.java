package com.tencent.mm.compatible.audio;

import java.util.TimerTask;

final class u extends TimerTask
{
  private int dKI = 2 * t.a(this.dKL);
  private int dKJ = t.a(this.dKL);
  byte[] dKK = new byte[this.dKI];

  u(t paramt)
  {
  }

  public final void run()
  {
    if (!this.dKL.tb())
    {
      int i = (int)(0.8D * this.dKL.mF());
      if (i < 8 * t.a(this.dKL))
        i = 8 * t.a(this.dKL);
      if (this.dKL.mG() <= i)
        break label129;
    }
    label129: for (int j = 8; ; j = 1)
    {
      for (int k = 0; k < j; k++)
      {
        int m = this.dKL.f(this.dKK, this.dKJ);
        if ((t.b(this.dKL) != null) && (m == 0))
          t.b(this.dKL).e(this.dKK, this.dKJ);
      }
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.audio.u
 * JD-Core Version:    0.6.2
 */