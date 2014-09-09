package com.tencent.mm.booter;

import com.tencent.mm.ab.k;
import com.tencent.mm.g.a;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.o;
import java.util.List;

public final class ai
{
  public static void run()
  {
    boolean bool = ap.a((Boolean)bg.qW().oQ().get(67841), true);
    if ((aa.wb() == ab.dtS) || (aa.wb() == ab.dtT));
    while (bool)
    {
      z.d("!44@/B4Tb64lLpIuznxMDiXSbBa88WdSZ7LyM4ZtpZIq79Q=", "collect addr userName");
      List localList = az.wZ().vO();
      if (localList != null)
      {
        z.d("!44@/B4Tb64lLpIuznxMDiXSbBa88WdSZ7LyM4ZtpZIq79Q=", "list " + localList.size());
        int i = 0;
        int j = 0;
        while (true)
          if (i < localList.size())
          {
            String str1 = ((com.tencent.mm.modelfriend.i)localList.get(i)).getUsername();
            String str2 = ((com.tencent.mm.modelfriend.i)localList.get(i)).vw().trim();
            if ((str1 != null) && (!str1.equals("")) && (str2 != null) && (!str2.equals("")))
            {
              com.tencent.mm.storage.i locali = bg.qW().oT().ys(str1);
              if ((a.cv(locali.getType())) && ((locali.ja() == null) || (locali.ja().equals(""))))
              {
                z.d("!44@/B4Tb64lLpIuznxMDiXSbBa88WdSZ7LyM4ZtpZIq79Q=", "userName " + str1 + "conRemark" + str2);
                y.b(locali, str2);
                j = 1;
              }
            }
            i++;
            continue;
            bool = false;
            break;
          }
        bg.qW().oQ().set(67841, Boolean.valueOf(false));
        if (j != 0)
          bg.qX().d(new k(5));
      }
    }
    z.d("!44@/B4Tb64lLpIuznxMDiXSbBa88WdSZ7LyM4ZtpZIq79Q=", "update ct remark done");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.ai
 * JD-Core Version:    0.6.2
 */