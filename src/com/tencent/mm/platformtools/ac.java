package com.tencent.mm.platformtools;

import android.app.Activity;
import android.content.Context;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelfriend.aa;
import com.tencent.mm.modelfriend.ab;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bn;

public final class ac
{
  public static void a(Activity paramActivity, Runnable paramRunnable, boolean paramBoolean)
  {
    if ((aa.wb() != ab.dtS) && (aa.wb() != ab.dtT))
      z.e("!32@/B4Tb64lLpLaPRi0/n+G/WWMeMMpN2vo", "not successfully binded, skip addrbook confirm");
    while (true)
    {
      if (paramRunnable != null)
        paramRunnable.run();
      return;
      if (ch.b((Boolean)bg.qW().oQ().get(12322)))
      {
        z.d("!32@/B4Tb64lLpLaPRi0/n+G/WWMeMMpN2vo", "addrbook upload confirmed");
      }
      else if ((!paramBoolean) && (ch.b((Boolean)bg.qW().oQ().get(12323))))
      {
        z.d("!32@/B4Tb64lLpLaPRi0/n+G/WWMeMMpN2vo", "addrbook upload login confirmed showed");
      }
      else
      {
        bg.qW().oQ().set(12322, Boolean.valueOf(false));
        String str = ch.ja(ch.bJ(paramActivity));
        if ((str.length() <= 0) || (!str.equals(bg.qW().oQ().get(6))))
          break;
        z.i("!32@/B4Tb64lLpLaPRi0/n+G/WWMeMMpN2vo", "same none-nil phone number, leave it");
      }
    }
    com.tencent.mm.ui.base.e.a(paramActivity, n.bwc, n.buo, n.buB, n.btP, new ad(paramActivity, paramRunnable), new ae(paramRunnable, paramActivity));
    bg.qW().oQ().set(12323, Boolean.valueOf(true));
  }

  public static void ae(Context paramContext)
  {
    String str1 = paramContext.getString(n.bsC);
    String str2 = paramContext.getString(n.bsB);
    com.tencent.mm.ui.base.e.a(paramContext, str1, "", paramContext.getString(n.bAQ), paramContext.getString(n.bAP), new af(str2, paramContext), null);
  }

  public static void d(Context paramContext, String paramString1, String paramString2)
  {
    com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString1);
    if (locala != null)
      locala.a(paramContext, new ag(paramString2, paramContext), null);
  }

  public static void f(boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = x.pK();
    int j;
    if (paramBoolean1)
    {
      j = i & 0xFFFDFFFF;
      z.d("!32@/B4Tb64lLpLaPRi0/n+G/WWMeMMpN2vo", "Reg By mobile update = " + j);
      bg.qW().oQ().set(7, Integer.valueOf(j));
      if (paramBoolean1)
        break label97;
    }
    label97: for (int k = 1; ; k = 2)
    {
      bg.qW().oS().a(new bn(17, k));
      if (paramBoolean2)
        com.tencent.mm.plugin.a.a.dWp.hT();
      return;
      j = i | 0x20000;
      break;
    }
  }

  public static void jB(String paramString)
  {
    bf.dkH.y("login_user_name", paramString);
  }

  public static void s(Context paramContext, String paramString)
  {
    com.tencent.mm.d.a locala = com.tencent.mm.d.a.ct(paramString);
    String str1;
    String str2;
    ah localah;
    aj localaj;
    if (locala != null)
    {
      str1 = paramContext.getString(n.btQ);
      str2 = paramContext.getString(n.bsK);
      localah = new ah(locala, paramContext);
      localaj = new aj();
      if ((locala.cCB == 1) || (locala.cCB == 4))
      {
        if (!ch.jb(locala.url))
          break label86;
        com.tencent.mm.ui.base.e.o(paramContext, locala.desc, locala.cCD);
      }
    }
    return;
    label86: com.tencent.mm.ui.base.e.a(paramContext, locala.desc, locala.cCD, str1, str2, localah, localaj);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ac
 * JD-Core Version:    0.6.2
 */