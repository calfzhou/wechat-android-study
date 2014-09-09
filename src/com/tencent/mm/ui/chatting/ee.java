package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import com.tencent.mm.ak.m;
import com.tencent.mm.ak.q;
import com.tencent.mm.am.a;
import com.tencent.mm.f.c;
import com.tencent.mm.f.e;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;

final class ee extends cj
{
  private hd joF;

  public ee()
  {
    super(55);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.cBn);
      paramView.setTag(new nt(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    nt localnt = (nt)paramck;
    nt.a(localnt, paramar, true, paramInt, paramhd);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (bg.qW().isSDCardAvailable())
    {
      int i = ((ms)paramView.getTag()).position;
      if (a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
      q localq = m.AL().hY(paramar.kp());
      if ((localq != null) && ((localq.getStatus() == 199) || (localq.getStatus() == 199)))
      {
        paramContextMenu.add(i, 106, 0, paramView.getContext().getString(n.bzG));
        if (ch.xy(e.or().getValue("SightForwardEnable")) == 1)
          paramContextMenu.add(i, 107, 0, paramView.getContext().getString(n.cag));
        if ((com.tencent.mm.q.r.uI()) && (!this.joF.aVS()))
          paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
      }
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzA));
    }
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ee
 * JD-Core Version:    0.6.2
 */