package com.tencent.mm.app;

import com.tencent.mm.c.a.fj;
import com.tencent.mm.c.a.fk;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.n.c;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.z;

final class ac extends g
{
  ac(WorkerProfile paramWorkerProfile)
  {
    super(0);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (bg.oE())
      if (((fj)parame).cKH.cKI != 3)
        break label38;
    label38: for (int i = 1; i != 0; i = 0)
    {
      bf.dkH.y("login_user_name", "");
      return false;
    }
    String str = c.eL(x.pG());
    if ((str != null) && (!str.equals(bf.dkH.z("last_avatar_path", null))))
    {
      z.d("!32@/B4Tb64lLpKJUHFjVVLDtjoRkfkHVaSq", "[PREF] last_avatar_path has changed, commit.");
      bf.dkH.y("last_avatar_path", str);
    }
    bf.dkH.a((String)bg.qW().oQ().get(6), ((Integer)bg.qW().oQ().get(9)).intValue(), (String)bg.qW().oQ().get(5));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.ac
 * JD-Core Version:    0.6.2
 */