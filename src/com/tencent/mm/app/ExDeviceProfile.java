package com.tencent.mm.app;

import android.app.Application;
import com.tencent.mm.booter.g;
import com.tencent.mm.compatible.g.o;
import com.tencent.mm.compatible.loader.l;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;

public class ExDeviceProfile extends l
{
  public static final String cFO = ak.getPackageName() + ":exdevice";

  public final void aQ()
  {
    z.d("!44@/B4Tb64lLpJbFyzz6csXsrieB2n0xge7ZqeNV2f+nnY=", "onConfigurationChanged:" + toString());
  }

  public final void onCreate()
  {
    z.i("!44@/B4Tb64lLpJbFyzz6csXsrieB2n0xge7ZqeNV2f+nnY=", "exdevice profile oncreate");
    o.a("stlport_shared", ExDeviceProfile.class.getClassLoader());
    h.aq(cFO);
    o.nQ();
    a.a(new b());
    new g(this.dOv.getBaseContext()).kY();
  }

  public String toString()
  {
    return cFO;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ExDeviceProfile
 * JD-Core Version:    0.6.2
 */