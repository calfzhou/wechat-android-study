package com.tencent.mm.plugin.exdevice.c;

public final class c extends com.tencent.mm.ao.a
{
  public String eJy;

  public static boolean a(b.a.a.a.a parama, c paramc, int paramInt)
  {
    switch (paramInt)
    {
    default:
      return false;
    case 1:
    }
    paramc.eJy = parama.ben();
    return true;
  }

  public final void a(b.a.a.c.a parama)
  {
    if (this.eJy != null)
      parama.I(1, this.eJy);
  }

  public final int hD()
  {
    String str = this.eJy;
    int i = 0;
    if (str != null)
      i = 0 + b.a.a.b.b.a.J(1, this.eJy);
    return i;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.c.c
 * JD-Core Version:    0.6.2
 */