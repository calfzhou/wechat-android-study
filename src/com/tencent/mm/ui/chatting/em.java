package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.modelvoice.bs;
import com.tencent.mm.n;
import com.tencent.mm.q.aa;
import com.tencent.mm.q.m;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.AnimImageView;

final class em extends cl
{
  private hd joF;

  public em()
  {
    super(6);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcE);
      pg localpg = new pg(this.fjl);
      paramView.setTag(localpg.g(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    pg localpg = (pg)paramck;
    localpg.jwH.eM(true);
    cR(paramar.kk());
    pg.a(localpg, paramar, paramInt, paramhd, true);
    Object localObject;
    int i;
    if (new bp(paramar.getContent()).getTime() == 0L)
    {
      localObject = localpg.jmh;
      i = 8;
    }
    String str;
    while (true)
    {
      ((ImageView)localObject).setVisibility(i);
      str = paramar.kx();
      if ((str != null) && (str.length() != 0))
        break;
      localpg.jlV.setVisibility(8);
      return;
      ImageView localImageView = localpg.jmh;
      if ((paramhd.joh.joi.aUu() == paramar.kk()) || (bs.k(paramar)))
      {
        localObject = localImageView;
        i = 8;
      }
      else
      {
        localObject = localImageView;
        i = 0;
      }
    }
    localpg.jlV.setVisibility(0);
    b(paramhd, localpg.jlV, ms.Cr(str));
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i;
    int j;
    label164: int m;
    if (bg.qW().isSDCardAvailable())
    {
      i = ((ms)paramView.getTag()).position;
      if (((new bp(paramar.getContent()).getTime() != 0L) || (paramar.jK() != 0)) && ((paramar.getStatus() != 1) || (paramar.jK() != 1)))
      {
        Boolean localBoolean = (Boolean)bg.qW().oQ().get(26);
        if (localBoolean == null)
          localBoolean = Boolean.valueOf(false);
        if (!localBoolean.booleanValue())
          break label343;
        paramContextMenu.add(i, 120, 0, n.byn);
        i locali = bg.qW().oT().ys(paramar.kt());
        if ((y.du(paramar.kt())) || (y.dP(paramar.kt())) || (locali == null) || (locali.aIg()))
          break label361;
        j = 1;
        if (a.to("favorite"))
          paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
        if (j != 0)
        {
          if (aa.uY().em(2) <= 0)
            break label367;
          m = 1;
          label212: if ((m != 0) && (!this.joF.aVS()))
            paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
        }
        if ((!y.dj(paramar.kt())) || (!ch.aHK()))
          break label373;
        paramContextMenu.add(i, 121, 0, n.bzJ);
      }
    }
    label343: label361: label367: label373: for (int k = 1; ; k = 0)
    {
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzB));
      if ((ch.aHK()) && (k == 0))
        paramContextMenu.add(i, 121, 0, n.bzJ);
      return true;
      paramContextMenu.add(i, 119, 0, n.bym);
      break;
      j = 0;
      break label164;
      m = 0;
      break label212;
    }
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 119:
      paramhd.fs(true);
      return true;
    case 120:
      paramhd.fs(false);
      return true;
    case 121:
    }
    if (hd.aWj())
    {
      com.tencent.mm.ui.base.e.a(paramhd.agh(), paramhd.agh().getString(n.col), "", new en(this, paramhd, paramar));
      return true;
    }
    paramhd.Z(paramar);
    return true;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }

  protected final boolean a(hd paramhd)
  {
    return paramhd.iWI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.em
 * JD-Core Version:    0.6.2
 */