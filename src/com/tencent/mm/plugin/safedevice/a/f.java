package com.tencent.mm.plugin.safedevice.a;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import java.util.HashMap;

public class f
  implements bd
{
  private static HashMap eYz;
  private d fTN;
  private com.tencent.mm.sdk.c.g fTO = new h(this);

  static
  {
    HashMap localHashMap = new HashMap();
    eYz = localHashMap;
    localHashMap.put(Integer.valueOf("SAFE_DEVICE_INFO_TABLE".hashCode()), new g());
  }

  private static f afk()
  {
    f localf = (f)bg.qF().eA(f.class.getName());
    if (localf == null)
    {
      localf = new f();
      bg.qF().a(f.class.getName(), localf);
    }
    return localf;
  }

  public static d afl()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (afk().fTN == null)
      afk().fTN = new d(bg.qW().oO());
    return afk().fTN;
  }

  public final void O(boolean paramBoolean)
  {
    com.tencent.mm.sdk.c.a.aGB().a("UpdateLocalSafeDevice", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().a("UpdateLocalVerifySwitch", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().a("GetSafeDeviceName", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().a("GetSafeDeviceType", this.fTO);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    com.tencent.mm.sdk.c.a.aGB().b("UpdateLocalSafeDevice", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().b("UpdateLocalVerifySwitch", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().b("GetSafeDeviceName", this.fTO);
    com.tencent.mm.sdk.c.a.aGB().b("GetSafeDeviceType", this.fTO);
  }

  public final HashMap nw()
  {
    return eYz;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a.f
 * JD-Core Version:    0.6.2
 */