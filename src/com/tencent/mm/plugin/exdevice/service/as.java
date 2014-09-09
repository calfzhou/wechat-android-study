package com.tencent.mm.plugin.exdevice.service;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class as extends cm
{
  public as(ar paramar, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default:
    case 2:
    case 0:
    case 1:
    case 5:
    case 3:
    case 4:
      do
      {
        aw localaw;
        do
        {
          long l;
          do
          {
            ax localax;
            do
            {
              return;
              av localav = (av)paramMessage.obj;
              ar.a(this.eKG, localav.Pz(), localav.PA(), localav.Py(), localav.tP());
              return;
              localax = (ax)paramMessage.obj;
            }
            while (ar.a(this.eKG, localax.Pz(), localax.PT()));
            z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "startTaskImp failed!!!");
            return;
            l = ((Long)paramMessage.obj).longValue();
          }
          while (ar.a(this.eKG, l));
          z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "stopTaskImp failed!!!");
          return;
          au localau = (au)paramMessage.obj;
          ar.a(this.eKG, localau.HW(), localau.Pw(), localau.Px(), localau.Py());
          return;
          localaw = (aw)paramMessage.obj;
        }
        while (ar.a(this.eKG, localaw.HW(), localaw.PR(), localaw.PS()));
        z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "startChannelImp failed!!!");
        return;
      }
      while (ar.b(this.eKG, ((Long)paramMessage.obj).longValue()));
      z.e("!56@/B4Tb64lLpLHXwcx366fGjmelM4Wxmgm80hBETVoSJ1j6h2EXZt5Gg==", "stopChannelImp failed!!!");
      return;
    case 6:
    }
    at localat = (at)paramMessage.obj;
    ar.a(this.eKG, localat.getErrorCode(), localat.HW(), localat.Pu(), localat.Pv(), localat.Pt());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.service.as
 * JD-Core Version:    0.6.2
 */