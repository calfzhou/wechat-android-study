package com.tencent.mm.ui.voicetranstext;

import com.tencent.mm.modelvoice.MediaRecorder;
import com.tencent.mm.modelvoice.b;
import com.tencent.mm.modelvoice.ba;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.modelvoice.y;
import com.tencent.mm.protocal.a.aet;

public final class d
{
  public static aet G(int paramInt, String paramString)
  {
    aet localaet = new aet();
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
      localaet.ixz = 0;
      localaet.iwi = 0;
      localaet.iwk = 0;
      localaet.ixy = 0;
      return localaet;
    case 0:
      localaet.ixz = 8000;
      localaet.iwi = 16;
      localaet.iwk = 5;
      localaet.ixy = 5;
      return localaet;
    case 1:
      localaet.ixz = 16000;
      localaet.iwi = 16;
      localaet.iwk = 4;
      localaet.ixy = 4;
      return localaet;
    case 4:
    }
    localaet.ixz = 16000;
    b localb = bs.iw(paramString);
    if (localb != null)
    {
      int i = MediaRecorder.SilkGetEncSampleRate(((ba)localb).J(0, 1).buf);
      if (i >= 8000)
        localaet.ixz = i;
    }
    localaet.iwi = 16;
    localaet.iwk = 6;
    localaet.ixy = 6;
    return localaet;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicetranstext.d
 * JD-Core Version:    0.6.2
 */