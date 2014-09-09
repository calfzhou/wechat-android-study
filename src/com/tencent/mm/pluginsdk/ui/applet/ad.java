package com.tencent.mm.pluginsdk.ui.applet;

final class ad
  implements ao
{
  ad(ab paramab)
  {
  }

  public final void mz(int paramInt)
  {
    if ((ab.a(this.hBm) != null) && (this.hBm.hBe != null))
    {
      if (!this.hBm.hBe.mB(paramInt))
        break label48;
      ab.a(this.hBm).gi(paramInt);
    }
    label48: 
    do
    {
      do
      {
        return;
        if (!this.hBm.hBe.mC(paramInt))
          break;
      }
      while (!this.hBm.hBe.hBu);
      this.hBm.hBe.mA(0);
      return;
      if ((this.hBm.hBe.aAM()) && (this.hBm.hBe.mD(paramInt)))
      {
        ab.a(this.hBm).gg(paramInt);
        return;
      }
      if ((this.hBm.hBe.aAM()) && (!this.hBm.hBe.mD(paramInt)))
      {
        ab.a(this.hBm).La();
        return;
      }
    }
    while ((this.hBm.hBe.aAM()) || (!this.hBm.hBe.mD(paramInt)));
    ab.a(this.hBm).gh(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.ad
 * JD-Core Version:    0.6.2
 */