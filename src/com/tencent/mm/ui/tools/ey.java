package com.tencent.mm.ui.tools;

import android.net.Uri;
import com.tencent.mm.a.c;
import com.tencent.mm.ak.r;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.n;
import java.io.File;

public final class ey extends com.tencent.mm.ui.tools.a.l
{
  public ey(ar paramar, String paramString)
  {
    super(paramar, "MsgInfo" + paramString);
  }

  public final Uri baH()
  {
    ar localar = (ar)bbt();
    com.tencent.mm.y.l locall = ck.ah(localar);
    Object localObject;
    if (bt.ad(localar))
      localObject = com.tencent.mm.ak.m.AL().ic(localar.kp());
    while (true)
    {
      z.i("!44@/B4Tb64lLpLj7S4izLo0fLH3t1t25ZO9ZClTcPVvBWg=", "MsgInfoForMonetUri imgPath : %s", new Object[] { localObject });
      if ((localObject != null) && (((String)localObject).length() > 0))
        break;
      return Uri.parse("android.resource://com.tencent.mm/" + h.Xv);
      if (localar.jK() == 1)
      {
        String str3 = com.tencent.mm.y.m.c(locall);
        String str4 = ap.yg().f(str3, "", "");
        if (c.ac(str4))
        {
          localObject = str4;
        }
        else
        {
          String str5 = locall.xN();
          String str6 = ap.yg().f(str5, "", "");
          if (c.ac(str6))
            localObject = str6;
        }
      }
      else if (locall.xQ())
      {
        String str1 = locall.xN();
        String str2 = ap.yg().f(str1, "", "");
        if ((!ch.jb(str2)) && (c.ac(str2)))
          localObject = str2;
      }
      else
      {
        localObject = ap.yg().gS(localar.kp());
      }
    }
    return Uri.fromFile(new File((String)localObject));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ey
 * JD-Core Version:    0.6.2
 */