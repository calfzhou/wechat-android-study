package com.tencent.mm.plugin.exdevice.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.model.dw;
import com.tencent.mm.model.dx;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.service.an;
import com.tencent.mm.plugin.exdevice.service.n;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;

public final class z
  implements bd
{
  private static HashMap cZG;
  private g duU = new ac(this);
  private x eJh = new x();
  private a eJj;
  private c eJk;
  private l eJl;
  private f eJm;
  private dx eJn = new ab(this);

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("HARDDEVICEINFO_TABLE".hashCode()), new aa());
  }

  public z()
  {
    if (this.eJm == null)
      this.eJm = new f();
  }

  private static z Po()
  {
    z localz = (z)bg.qF().eA("plugin.exdevice");
    if (localz == null)
    {
      com.tencent.mm.sdk.platformtools.z.w("!56@/B4Tb64lLpLHXwcx366fGvuLvMDXC1jlhAashLvKLaoJDRhj9TtSxQ==", "not found in MMCore, new one");
      localz = new z();
      bg.qF().a("plugin.exdevice", localz);
    }
    return localz;
  }

  public static c Pp()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (Po().eJk == null)
      Po().eJk = new c(bg.qW().oO());
    return Po().eJk;
  }

  public static a Pq()
  {
    if (bg.qW().oD() == 0)
      throw new com.tencent.mm.model.a();
    if (Po().eJj == null)
      Po().eJj = new a();
    return Po().eJj;
  }

  public static f Pr()
  {
    if (Po().eJm == null)
      Po().eJm = new f();
    return Po().eJm;
  }

  public static l Ps()
  {
    if (Po().eJl == null)
      Po().eJl = new l();
    return Po().eJl;
  }

  public final void O(boolean paramBoolean)
  {
    com.tencent.mm.plugin.exdevice.a.l locall = com.tencent.mm.plugin.exdevice.a.l.OR();
    bg.qX().a(538, locall);
    com.tencent.mm.sdk.c.a.aGB().a("GetA8KeyRedirect", this.eJh);
    bg.qR().a("wcdevicemsg", this.eJn, true);
    com.tencent.mm.sdk.c.a.aGB().a("ExDeviceOpInChattingUI", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("ExDeviceBindHardDevice", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("ExDeviceUnBindHardDevice", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("MMSwitchBackgroundPush", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("MMSwitchViewPush", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("StopAllChannel", this.duU);
    com.tencent.mm.sdk.c.a.aGB().a("SyncExdeviceData", this.duU);
    o localo = o.Pg();
    com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "addSceneEndListener");
    bg.qX().a(539, localo);
    bg.qX().a(537, localo);
  }

  public final void ci(int paramInt)
  {
  }

  public final void nv()
  {
    com.tencent.mm.sdk.c.a.aGB().b("ExDeviceOpInChattingUI", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("ExDeviceBindHardDevice", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("ExDeviceUnBindHardDevice", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("MMSwitchBackgroundPush", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("MMSwitchViewPush", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("StopAllChannel", this.duU);
    com.tencent.mm.sdk.c.a.aGB().b("SyncExdeviceData", this.duU);
    com.tencent.mm.sdk.platformtools.z.i("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "releaseAllSharePreferences");
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences("exdevice_pref", 0);
    if (localSharedPreferences == null)
      com.tencent.mm.sdk.platformtools.z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "null == sp");
    while (true)
    {
      an.PN().PE();
      com.tencent.mm.plugin.exdevice.a.l.OR().OS();
      com.tencent.mm.sdk.c.a.aGB().b("GetA8KeyRedirect", this.eJh);
      bg.qR().b("wcdevicemsg", this.eJn, true);
      if (Po().eJj != null);
      o localo = o.Pg();
      com.tencent.mm.sdk.platformtools.z.i("!64@/B4Tb64lLpLHXwcx366fGsZEje3hjt8Vc59nUp0bvDioFQBqx3kFQDm2JEEfROKR", "removeSceneEndListener");
      bg.qX().b(539, localo);
      bg.qX().b(537, localo);
      Po().eJm.Pd();
      return;
      if (!localSharedPreferences.edit().clear().commit())
        com.tencent.mm.sdk.platformtools.z.e("!76@/B4Tb64lLpLHXwcx366fGvkcKBG/O5VnelUAsa0DbmZ3NNSSZMrM7JMRJ520zCVyfeWeoU5Ftkk=", "sp.edit().clear().commit() Failed!!!");
    }
  }

  public final HashMap nw()
  {
    return cZG;
  }

  public final void r(String paramString1, String paramString2)
  {
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.z
 * JD-Core Version:    0.6.2
 */