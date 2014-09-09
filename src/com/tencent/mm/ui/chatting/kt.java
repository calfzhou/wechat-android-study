package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import com.tencent.mm.a.c;
import com.tencent.mm.ar.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.i;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

final class kt
  implements View.OnCreateContextMenuListener
{
  kt(hd paramhd)
  {
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    ms localms = (ms)paramView.getTag();
    if (localms == null);
    int i;
    ar localar;
    String str3;
    do
    {
      return;
      i = localms.position;
      localar = (ar)this.jtA.joh.getItem(i);
      if (!i.yc(this.jtA.aUL()))
        break;
      hd localhd2 = this.jtA;
      int k = com.tencent.mm.n.bxH;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = ch.ja(this.jtA.jnf.jq());
      str3 = a.Bb(localhd2.getString(k, arrayOfObject).trim());
      paramContextMenu.setHeaderTitle(com.tencent.mm.ar.b.c(this.jtA.agh(), str3, -1));
    }
    while (localar == null);
    fn localfn = this.jtA.joh;
    int j = localar.getType();
    if (localar.jK() == 1);
    for (boolean bool1 = true; ; bool1 = false)
    {
      cj localcj = localfn.w(j, bool1);
      if (localcj == null)
        break label365;
      boolean bool2 = localcj.a(paramContextMenu, paramView, localar);
      if ((i.ya(this.jtA.aUL())) || (i.xY(this.jtA.aUL())))
      {
        z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "on create context menu, match qcontact or tcontact, remove favorite menu item");
        paramContextMenu.removeItem(116);
      }
      if (!bool2)
        break label365;
      if ((!this.jtA.aVS()) && (!this.jtA.jnf.aIg()))
        break;
      paramContextMenu.add(i, 122, 0, this.jtA.getString(com.tencent.mm.n.bzC));
      return;
      String str1 = this.jtA.jnf.od();
      String str2;
      if (localar.jK() == 1)
        str2 = (String)bg.qW().oQ().get(4, "");
      while (true)
      {
        str3 = a.Bb(str2);
        break;
        str2 = this.jtA.jnf.od();
        if (y.dc(str1))
          str2 = y.dh(bw.em(localar.getContent()));
      }
    }
    label365: if ((localar.aJA()) && (bg.qW().isSDCardAvailable()))
    {
      paramContextMenu.add(i, 100, 0, this.jtA.getString(com.tencent.mm.n.bzy));
      if (localar.kk() <= 0L)
        break label714;
    }
    label539: label574: label714: for (l locall = ap.yg().T(localar.kk()); ; locall = null)
    {
      if (((locall == null) || (locall.xM() <= 0L)) && (localar.kl() > 0L))
        locall = ap.yg().S(localar.kl());
      if ((localar.jK() == 1) || ((locall != null) && (localar.jK() == 0) && (locall.getOffset() >= locall.sp()) && (locall.sp() != 0)))
        paramContextMenu.add(i, 110, 0, this.jtA.getString(com.tencent.mm.n.cag));
      String str6;
      String str4;
      hd localhd1;
      if (locall == null)
      {
        str6 = "";
        if ((locall != null) && (c.ac(str6)))
          paramContextMenu.add(i, 112, 0, this.jtA.getString(com.tencent.mm.n.byG));
        if (localar.getStatus() != 5)
          break label695;
        paramContextMenu.add(i, 103, 0, this.jtA.getString(com.tencent.mm.n.bzD));
        str4 = m.c(ap.yg().h(localar));
        localhd1 = this.jtA;
        if (localar.aJA())
          break label697;
      }
      for (String str5 = null; ; str5 = ap.yg().f(str4, "", ""))
      {
        hd.a(localhd1, str5);
        return;
        str6 = ap.yg().f(locall.xN(), "", "");
        break label539;
        if (!localar.aJy())
          break label574;
        paramContextMenu.add(i, 100, 0, this.jtA.getString(com.tencent.mm.n.bzz));
        break label574;
        break;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kt
 * JD-Core Version:    0.6.2
 */