package com.tencent.mm.ui.chatting;

import com.tencent.mm.c.a.aa;
import com.tencent.mm.c.a.ab;
import com.tencent.mm.sdk.c.e;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class nv extends g
{
  nv(ShortVideoRecorderView paramShortVideoRecorderView)
  {
    super(0);
  }

  public final boolean a(e parame)
  {
    aa localaa = (aa)parame;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(localaa.cHD.type);
    z.d("!44@/B4Tb64lLpI1d+8HkdT3mBOeL6obqXv36QqksabbPcM=", "on chatting status callback, type %d", arrayOfObject);
    switch (localaa.cHD.type)
    {
    case 2:
    default:
      return false;
    case 0:
      ShortVideoRecorderView.a(this.jvS);
      return false;
    case 1:
      ShortVideoRecorderView.b(this.jvS);
      return false;
    case 3:
    }
    this.jvS.hide();
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.nv
 * JD-Core Version:    0.6.2
 */