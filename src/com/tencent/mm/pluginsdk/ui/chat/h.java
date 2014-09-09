package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.c.a.lo;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.List;

final class h
  implements e
{
  h(AppPanel paramAppPanel)
  {
  }

  public final void a(int paramInt, k paramk)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    boolean bool;
    if (paramk != null)
    {
      bool = true;
      arrayOfObject1[1] = Boolean.valueOf(bool);
      z.d("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "pos=%d, has appInfo = %b", arrayOfObject1);
      if ((paramk != null) && (com.tencent.mm.pluginsdk.model.app.l.l(paramk)))
        x.t(paramk.field_appId, "1");
      switch (paramInt)
      {
      default:
      case 2147483647:
      case -2147483648:
      case 1:
      case 3:
      case 2:
      case 4:
      case 0:
      case 7:
      case 6:
      case 9:
      case 8:
      case 5:
      }
    }
    do
    {
      do
      {
        do
        {
          return;
          bool = false;
          break;
          if (AppPanel.j(this.hCI) == null)
          {
            z.e("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "infoList == null");
            return;
          }
          com.tencent.mm.plugin.f.c.n.fTF.q(10305, String.valueOf(AppPanel.j(this.hCI).size()));
          com.tencent.mm.plugin.f.c.n localn12 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject13 = new Object[1];
          arrayOfObject13[0] = Integer.valueOf(10);
          localn12.d(10923, arrayOfObject13);
          bg.qW().oQ().set(69121, "");
          AppPanel.k(this.hCI).Zj();
          return;
          if (!this.hCI.hCy.aBC())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          if (paramk == null)
          {
            z.e("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "APP_MSG_POS bug appInfo is null");
            return;
          }
          if (paramk.ayE())
          {
            if (AppPanel.l(this.hCI) == null)
              AppPanel.a(this.hCI, AppPanel.i(this.hCI).getSharedPreferences(ak.aHi(), 0));
            if (AppPanel.l(this.hCI).getBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramk.field_appId, true))
              AppPanel.l(this.hCI).edit().putBoolean("SP_KEY_SERVICE_APP_PREFIX_" + paramk.field_appId, false).commit();
            com.tencent.mm.plugin.f.c.n localn11 = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject12 = new Object[3];
            arrayOfObject12[0] = Integer.valueOf(13);
            arrayOfObject12[1] = paramk.field_appId;
            arrayOfObject12[2] = Integer.valueOf(0);
            localn11.d(10923, arrayOfObject12);
          }
          while (true)
          {
            AppPanel.k(this.hCI).e(paramk);
            return;
            com.tencent.mm.plugin.f.c.n localn10 = com.tencent.mm.plugin.f.c.n.fTF;
            Object[] arrayOfObject11 = new Object[2];
            arrayOfObject11[0] = Integer.valueOf(11);
            arrayOfObject11[1] = paramk.field_appId;
            localn10.d(10923, arrayOfObject11);
          }
          if (!this.hCI.hCy.aBq())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          com.tencent.mm.plugin.f.c.n localn9 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject10 = new Object[1];
          arrayOfObject10[0] = Integer.valueOf(2);
          localn9.d(10923, arrayOfObject10);
          AppPanel.m(this.hCI);
          return;
          if (!this.hCI.hCy.aBu())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          com.tencent.mm.plugin.f.c.n localn8 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject9 = new Object[1];
          arrayOfObject9[0] = Integer.valueOf(4);
          localn8.d(10923, arrayOfObject9);
          AppPanel.k(this.hCI).Zi();
          return;
          if (!this.hCI.hCy.aBA())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          if (((Boolean)bg.qW().oQ().get(290817, Boolean.valueOf(true))).booleanValue())
          {
            bg.qW().oQ().set(290817, Boolean.valueOf(false));
            this.hCI.refresh();
          }
          com.tencent.mm.plugin.f.c.n localn7 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject8 = new Object[1];
          arrayOfObject8[0] = Integer.valueOf(3);
          localn7.d(10923, arrayOfObject8);
          AppPanel.k(this.hCI).Zh();
          return;
          Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
          return;
          if (!this.hCI.hCy.aBs())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          com.tencent.mm.plugin.f.c.n localn6 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject7 = new Object[1];
          arrayOfObject7[0] = Integer.valueOf(1);
          localn6.d(10923, arrayOfObject7);
          AppPanel.a(this.hCI, false);
          return;
          if (!this.hCI.hCy.aBy())
          {
            Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
            return;
          }
          com.tencent.mm.plugin.f.c.n localn5 = com.tencent.mm.plugin.f.c.n.fTF;
          Object[] arrayOfObject6 = new Object[1];
          arrayOfObject6[0] = Integer.valueOf(8);
          localn5.d(10923, arrayOfObject6);
          bg.qW().oQ().set(54, Boolean.valueOf(false));
        }
        while (AppPanel.k(this.hCI) == null);
        lm locallm = new lm();
        locallm.cOG.cOI = true;
        a.aGB().g(locallm);
        String str = locallm.cOH.cOK;
        if (!ch.jb(str))
        {
          z.v("!32@/B4Tb64lLpIswCbzJzq2kbhBmMfFikWd", "Talkroom is on: " + str);
          com.tencent.mm.ui.base.e.a(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.clI), "", AppPanel.i(this.hCI).getString(com.tencent.mm.n.btQ), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bsK), new i(this), new j(this));
          return;
        }
        AppPanel.k(this.hCI).Zd();
        return;
        if (!this.hCI.hCy.aBF())
        {
          Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
          return;
        }
        com.tencent.mm.plugin.f.c.n localn4 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(9);
        localn4.d(10923, arrayOfObject5);
        bg.qW().oQ().set(62, Boolean.valueOf(false));
        AppPanel.k(this.hCI).Ze();
        return;
      }
      while (AppPanel.k(this.hCI) == null);
      com.tencent.mm.plugin.f.c.n localn3 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Integer.valueOf(6);
      localn3.d(10923, arrayOfObject4);
      bg.qW().oQ().set(67, Boolean.valueOf(false));
      AppPanel.k(this.hCI).Zg();
      return;
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(9);
      localn2.d(10923, arrayOfObject3);
      bg.qW().oQ().set(73, Boolean.valueOf(false));
      AppPanel.n(this.hCI).aBn();
      return;
      if (!this.hCI.hCy.aBw())
      {
        Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
        return;
      }
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(5);
      localn1.d(10923, arrayOfObject2);
    }
    while (AppPanel.k(this.hCI) == null);
    AppPanel.k(this.hCI).Zk();
  }

  public final int mK(int paramInt)
  {
    int i = 0;
    if (paramInt < AppPanel.f(this.hCI))
    {
      int j = AppPanel.g(this.hCI).length;
      int k = 0;
      while (i < j)
      {
        if (AppPanel.g(this.hCI)[i] != 0)
        {
          if (k == paramInt)
            return i;
          k++;
        }
        i++;
      }
    }
    if ((paramInt >= AppPanel.f(this.hCI)) && (paramInt < AppPanel.h(this.hCI)))
      return -2147483648;
    return 2147483647;
  }

  public final void mL(int paramInt)
  {
    if (paramInt == 0)
    {
      if (!this.hCI.hCy.aBs())
        Toast.makeText(AppPanel.i(this.hCI), AppPanel.i(this.hCI).getString(com.tencent.mm.n.bzK), 0).show();
    }
    else
      return;
    AppPanel.a(this.hCI, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.h
 * JD-Core Version:    0.6.2
 */