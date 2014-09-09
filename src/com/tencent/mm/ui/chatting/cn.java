package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.z;

final class cn extends cl
{
  private hd joF;

  public cn()
  {
    super(22);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcs);
      paramView.setTag(new o(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    o localo = (o)paramck;
    z localz = z.yW(paramar.getContent());
    boolean bool1 = localz.BH();
    ad localad1 = null;
    String str1;
    if (!bool1)
    {
      EmojiView.cA(paramar.kk());
      str1 = paramar.getContent();
      if (str1 == null)
        break label444;
    }
    label444: for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      localad1 = null;
      if (localb != null)
      {
        String str2 = localb.dQZ;
        localad1 = null;
        if (str2 != null)
          localad1 = g.axR().ly(localb.dQZ);
      }
      if ((localz.vu() != null) && (!localz.vu().equals("-1")) && (localad1 == null));
      for (ad localad2 = g.axR().ly(localz.vu()); ; localad2 = localad1)
      {
        boolean bool2;
        if (localad2 != null)
        {
          EmojiView localEmojiView = localo.eBA;
          long l = paramar.kk();
          if (localad2.field_type == ad.ija)
          {
            bool2 = true;
            localEmojiView.a(localad2, l, bool2, true);
            localo.jlT.setVisibility(8);
            if (!localz.BH())
            {
              localz.BI();
              localz.fS(localad2.vu());
              paramar.setContent(localz.yV(com.tencent.mm.platformtools.ap.Y(paramar.getContent(), "")));
              bg.qW().oV().a(paramar.kk(), paramar);
            }
          }
        }
        while (true)
        {
          localo.eBA.setTag(new ms(paramar, paramhd.iWI, paramInt, paramString, 0, (byte)0));
          localo.eBA.setOnClickListener(paramhd.joh.jqc);
          localo.eBA.setOnLongClickListener(paramhd.joh.jqe);
          localo.jlT.setOnClickListener(paramhd.joh.jqc);
          localo.jlT.setTag(localo.eBA.getTag());
          return;
          bool2 = false;
          break;
          if (com.tencent.mm.am.a.to("emoji"))
          {
            Bitmap localBitmap = com.tencent.mm.y.ap.yg().a(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
            if (localBitmap == null)
              localBitmap = com.tencent.mm.sdk.platformtools.i.d(this.joF.getResources().getDrawable(h.RY));
            localo.eBA.aAb();
            localo.eBA.setImageBitmap(localBitmap);
            localo.jlT.setVisibility(0);
          }
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    z localz = z.yW(paramar.getContent());
    if ((localz.vu() != null) && (!localz.vu().equals("-1")))
    {
      ad localad = g.axR().ly(localz.vu());
      if ((localad != null) && (localad.field_catalog == ad.iiK))
        paramContextMenu.add(i, 104, 1, paramView.getContext().getString(com.tencent.mm.n.bzF));
    }
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(com.tencent.mm.n.bzx));
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

  protected final boolean a(hd paramhd)
  {
    return paramhd.iWI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cn
 * JD-Core Version:    0.6.2
 */