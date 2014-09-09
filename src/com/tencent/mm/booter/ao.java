package com.tencent.mm.booter;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.l;
import com.tencent.mm.sdk.platformtools.y;

public final class ao
{
  private Context context;

  public ao(Context paramContext)
  {
    this.context = paramContext;
  }

  public final String lC()
  {
    int i = l.cFn;
    String str1 = v.nh();
    int j = a.hrn;
    String str2 = y.aGW();
    int k = this.context.getSharedPreferences(ak.aHi(), 0).getInt("last_reportdevice_channel", 0);
    int m = this.context.getSharedPreferences(ak.aHi(), 0).getInt("last_reportdevice_clientversion", 0);
    int n;
    if (k == 0)
    {
      n = 0;
      if (m != 0);
    }
    while (true)
    {
      return "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/reportdevice?channel=" + l.cFn + "&deviceid=" + str1 + "&clientversion=" + j + "&platform=" + "0" + "&lang=" + str2 + "&installtype=" + n;
      if ((k == i) && (m == j))
        return null;
      n = 1;
    }
  }

  public final void lD()
  {
    new Thread(new ap(this), "startup report").start();
  }

  public final void r(int paramInt1, int paramInt2)
  {
    SharedPreferences localSharedPreferences = this.context.getSharedPreferences(ak.aHi(), 0);
    localSharedPreferences.edit().putInt("last_reportdevice_channel", paramInt1).commit();
    localSharedPreferences.edit().putInt("last_reportdevice_clientversion", paramInt2).commit();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ao
 * JD-Core Version:    0.6.2
 */