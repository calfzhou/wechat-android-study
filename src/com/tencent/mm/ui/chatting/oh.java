package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.aa;
import com.tencent.mm.c.a.ab;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class oh extends g
{
  int eOZ = 0;
  int jvY = 0;
  int jvZ = 0;

  oh(ShortVideoView paramShortVideoView)
  {
    super(0);
  }

  private void a(aa paramaa)
  {
    this.jvY = paramaa.cHD.cHH;
    this.jvZ = paramaa.cHD.cHF;
    this.eOZ = paramaa.cHD.cHG;
  }

  private boolean aWA()
  {
    int i = ShortVideoView.a(this.jwa) + this.jvY;
    return (i >= this.jvZ) && (i <= this.eOZ);
  }

  public final boolean a(e parame)
  {
    aa localaa = (aa)parame;
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.jwa.hashCode());
    arrayOfObject[1] = Integer.valueOf(localaa.cHD.type);
    arrayOfObject[2] = Integer.valueOf(ShortVideoView.a(this.jwa));
    z.d("!32@/B4Tb64lLpI1d+8HkdT3mC3T0G5ZK8MW", "#0x%x on chatting status callback, type %d, pos %d", arrayOfObject);
    switch (localaa.cHD.type)
    {
    case 2:
    case 4:
    default:
    case 3:
    case 1:
    case 0:
      do
      {
        return false;
        this.jwa.clear();
        return false;
        ShortVideoView.b(this.jwa);
        return false;
        a(localaa);
      }
      while (!aWA());
      ShortVideoView.c(this.jwa);
      return false;
    case 5:
    }
    a(localaa);
    if (aWA())
    {
      ShortVideoView.d(this.jwa);
      return false;
    }
    ShortVideoView.e(this.jwa);
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.oh
 * JD-Core Version:    0.6.2
 */