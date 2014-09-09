package com.tencent.mm.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.tencent.mm.ad.m;
import com.tencent.mm.ad.s;
import com.tencent.mm.c.a.ef;
import com.tencent.mm.c.a.lp;
import com.tencent.mm.compatible.g.h;
import com.tencent.mm.compatible.g.j;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.dy;
import com.tencent.mm.ui.setting.SettingsLanguageUI;
import com.tencent.mm.ui.tools.CropImageNewUI;

final class n
  implements c
{
  public final Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 != -1);
    do
    {
      String str2;
      do
      {
        do
        {
          return null;
          switch (paramInt1)
          {
          default:
            return null;
          case 2:
          case 3:
          case 4:
          }
        }
        while (paramIntent == null);
        Intent localIntent2 = new Intent();
        localIntent2.setClass(paramActivity, CropImageNewUI.class);
        localIntent2.putExtra("CropImageMode", 1);
        localIntent2.putExtra("CropImage_Filter", true);
        localIntent2.putExtra("CropImage_OutputPath", h.dOS + "temp.avatar");
        localIntent2.putExtra("CropImage_ImgPath", null);
        com.tencent.mm.ui.tools.l.b(paramActivity, paramIntent, localIntent2, h.dOS, 4);
        return null;
        str2 = bc.a(paramActivity.getApplicationContext(), paramIntent, h.dOS);
      }
      while (str2 == null);
      Intent localIntent1 = new Intent();
      localIntent1.setClass(paramActivity, CropImageNewUI.class);
      localIntent1.putExtra("CropImageMode", 1);
      localIntent1.putExtra("CropImage_OutputPath", h.dOS + "temp.avatar");
      localIntent1.putExtra("CropImage_ImgPath", str2);
      paramActivity.startActivityForResult(localIntent1, 4);
      return null;
    }
    while (paramIntent == null);
    String str1 = paramIntent.getStringExtra("CropImage_OutputPath");
    if (str1 == null)
    {
      z.e("!44@/B4Tb64lLpLNeaXFt7W5V6aJxk4T4bEba6km9Bj/gxs=", "crop picture failed");
      return null;
    }
    z.e("!44@/B4Tb64lLpLNeaXFt7W5V6aJxk4T4bEba6km9Bj/gxs=", "crop picture path %s ", new Object[] { str1 });
    return i.wU(str1);
  }

  public final com.tencent.mm.o.x a(com.tencent.mm.o.n paramn)
  {
    if (com.tencent.mm.ab.n.yy())
      return new com.tencent.mm.ab.a(paramn);
    return new com.tencent.mm.ab.k(1);
  }

  public final String a(Context paramContext, String paramString1, String paramString2)
  {
    return u.a(paramContext, paramString1, paramString2);
  }

  public final String a(String paramString1, String paramString2, boolean paramBoolean)
  {
    return u.a(paramString1, paramString2, paramBoolean);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    com.tencent.mm.pluginsdk.ac localac = g.axX();
    if (localac != null)
      localac.a(paramContext, paramString1, paramString2, paramString3, paramInt1, 11, paramInt2, paramString4);
  }

  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    com.tencent.mm.pluginsdk.ac localac = g.axX();
    if (localac != null)
      localac.a(paramString1, paramString2, 2, 4, paramString3, paramLong);
  }

  public final boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString)
  {
    return dy.a(paramContext, paramInt1, paramInt2, paramString, 4);
  }

  public final void aV(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpLNeaXFt7W5V6aJxk4T4bEba6km9Bj/gxs=", "trigger netscene sync, scene[%d]", arrayOfObject);
    bg.qX().d(new com.tencent.mm.ab.k(paramInt));
  }

  public final String as(String paramString)
  {
    if (com.tencent.mm.pluginsdk.model.app.l.F(paramString, false) != null)
      return com.tencent.mm.pluginsdk.model.app.l.F(paramString, false).field_packageName;
    return "";
  }

  public final boolean at(String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.l.at(paramString);
  }

  public final boolean au(String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.l.au(paramString);
  }

  public final com.tencent.mm.o.x c(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
      s.yO().ec(paramInt);
    com.tencent.mm.ad.k localk = new com.tencent.mm.ad.k(paramInt);
    bg.qX().d(localk);
    return localk;
  }

  public final String c(Context paramContext, String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.l.c(paramContext, paramString);
  }

  public final boolean d(Context paramContext, String paramString)
  {
    return com.tencent.mm.pluginsdk.model.app.l.d(paramContext, paramString);
  }

  public final boolean e(Activity paramActivity)
  {
    if (!j.nI())
    {
      en.cp(paramActivity);
      return false;
    }
    bc.n(paramActivity);
    return true;
  }

  public final void f(Activity paramActivity)
  {
    MMAppMgr.f(paramActivity);
  }

  public final String h(Context paramContext)
  {
    return SettingsLanguageUI.h(paramContext);
  }

  public final void hT()
  {
    bg.qX().d(new com.tencent.mm.ab.k(5));
  }

  public final com.tencent.mm.o.o hU()
  {
    return new com.tencent.mm.modelvoice.ac(ak.getContext());
  }

  public final void hV()
  {
    lp locallp = new lp();
    locallp.cOL.cON = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallp);
  }

  public final void hW()
  {
    if (com.tencent.mm.sdk.platformtools.ch.a((Integer)bg.qW().oQ().get(15)) != 0)
      bg.qX().d(new com.tencent.mm.ab.k(6));
    com.tencent.mm.model.ch.eq("ver" + com.tencent.mm.protocal.a.hrn);
    bf.azc().aT(bf.GO().ayH());
    ef localef = new ef();
    com.tencent.mm.sdk.c.a.aGB().g(localef);
  }

  public final void hX()
  {
    String str = com.tencent.mm.model.x.pG();
    if (!TextUtils.isEmpty(str))
    {
      ab localab = new ab(str);
      bg.qX().d(localab);
    }
  }

  public final void hY()
  {
    MMAppMgr.hY();
  }

  public final Intent hZ()
  {
    Intent localIntent = new Intent(ak.getContext(), LauncherUI.class);
    localIntent.putExtra("nofification_type", "talkroom_notification");
    localIntent.addFlags(67108864);
    return localIntent;
  }

  public final void i(Context paramContext)
  {
    MMAppMgr.i(paramContext);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.n
 * JD-Core Version:    0.6.2
 */