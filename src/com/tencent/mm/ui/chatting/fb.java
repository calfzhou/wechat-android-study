package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.AnimImageView;
import com.tencent.mm.ui.base.e;

final class fb extends cm
{
  private hd joF;

  public fb()
  {
    super(7);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcX);
      pg localpg = new pg(this.fjl);
      paramView.setTag(localpg.g(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    pg localpg = (pg)paramck;
    localpg.jwH.eM(false);
    cR(paramar.kk());
    pg.a(localpg, paramar, paramInt, paramhd, false);
    if (aUS())
    {
      if (localpg.jwN != null)
        localpg.jwN.setVisibility(8);
      if (localpg.jms != null)
        localpg.jms.setVisibility(8);
      if ((paramar.getStatus() == 1) || (paramar.getStatus() == 5))
      {
        localpg.jwO.setBackgroundResource(h.Ub);
        paramar.ijv = true;
      }
    }
    while (true)
    {
      a(paramInt, localpg, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      localpg.jwO.setBackgroundResource(h.Ua);
      if ((localpg.jms != null) && (cR(paramar.kk())))
      {
        if (paramar.ijv)
        {
          AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.5F, 1.0F);
          localAlphaAnimation.setDuration(300L);
          localpg.jwO.startAnimation(localAlphaAnimation);
          paramar.ijv = false;
        }
        localpg.jms.setVisibility(0);
        continue;
        if (localpg.jwN != null)
        {
          localpg.jwN.setVisibility(0);
          if (paramar.getStatus() >= 2)
            localpg.jwN.setVisibility(8);
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i;
    bp localbp;
    if (bg.qW().isSDCardAvailable())
    {
      i = ((ms)paramView.getTag()).position;
      localbp = new bp(paramar.getContent());
      if (((localbp.getTime() != 0L) || (paramar.jK() != 0)) && ((paramar.getStatus() != 1) || (paramar.jK() != 1)))
      {
        if (!this.joF.aVY())
          break label357;
        paramContextMenu.add(i, 120, 0, n.byn);
      }
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
      if (a.to("favorite"))
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
      if ((!paramar.aJv()) && (paramar.aJw()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
      if ((!y.dj(paramar.kt())) || (!ch.aHK()))
        break label375;
      paramContextMenu.add(i, 121, 0, n.bzJ);
    }
    label357: label375: for (int j = 1; ; j = 0)
    {
      if (((localbp.getTime() != 0L) || (paramar.jK() != 0)) && ((paramar.getStatus() != 1) || (paramar.jK() != 1)) && (!this.joF.aVS()))
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzB));
      if ((ch.aHK()) && (j == 0))
        paramContextMenu.add(i, 121, 0, n.bzJ);
      return true;
      paramContextMenu.add(i, 119, 0, n.bym);
      break;
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
      e.a(paramhd.agh(), paramhd.agh().getString(n.col), "", new fc(this, paramhd, paramar));
      return true;
    }
    paramhd.Z(paramar);
    return true;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fb
 * JD-Core Version:    0.6.2
 */