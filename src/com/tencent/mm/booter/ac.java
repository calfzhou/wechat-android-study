package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.mm.jni.platformcomm.WakerLock;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.f;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

final class ac
  implements m
{
  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    int i = 1;
    z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "NotifyReceiver sceneEnd");
    switch (paramx.getType())
    {
    default:
      if (NotifyReceiver.ly() != null)
        NotifyReceiver.ly().unLock();
      NotifyReceiver.a(null);
      return;
    case 38:
    }
    if ((paramInt1 == 4) && (!bg.qX().tv()))
      switch (paramInt2)
      {
      default:
        if ((paramInt1 == 0) && (paramInt2 == 0))
          bg.ig().hY();
        break;
      case -205:
      case -72:
      case -9:
      case -6:
      case -4:
      case -3:
      case -140:
      case -100:
      case -999999:
      case -17:
      case -16:
      }
    while (bg.oE())
    {
      Looper.myQueue().addIdleHandler(new ae(this));
      break;
      bg.ig().cc(ak.getContext().getString(n.bRa));
      bg.re();
      continue;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramString;
      z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "alpha need whitelist : [%s]", arrayOfObject);
      if (!ch.jb(paramString))
        bg.ig().cc(paramString);
      while (true)
      {
        bg.re();
        break;
        bg.ig().cc(ak.getContext().getString(n.bRa));
      }
      bg.ig().cc(ak.getContext().getString(n.bQZ));
      f.H(ak.getContext());
      bg.re();
      continue;
      new cm().post(new ad(this));
      continue;
      SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("system_config_prefs", 0);
      long l = localSharedPreferences.getLong("recomended_update_ignore", -1L);
      if ((l != -1L) && (ap.ab(l) < 86400L))
      {
        z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "skip update notification, last check=" + l);
      }
      else
      {
        ar localar = bg.ig();
        if (paramInt2 == -17)
          i = 2;
        localar.bQ(i);
        localSharedPreferences.edit().putLong("recomended_update_ignore", ap.CL()).commit();
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ac
 * JD-Core Version:    0.6.2
 */