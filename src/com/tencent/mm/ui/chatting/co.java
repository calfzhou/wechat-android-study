package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.z;
import com.tencent.mm.y.ap;

final class co extends cm
{
  private hd joF;

  public co()
  {
    super(23);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcN);
      paramView.setTag(new o(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    int i = 1;
    this.joF = paramhd;
    o localo = (o)paramck;
    localo.jlT.setOnClickListener(paramhd.joh.jqc);
    localo.jlT.setTag(localo.eBA.getTag());
    String str = paramar.getContent();
    z localz = z.yW(paramar.getContent());
    boolean bool2 = localz.BH();
    ad localad1 = null;
    if (!bool2)
    {
      EmojiView.cA(paramar.kk());
      if (str == null)
        break label546;
    }
    label546: for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str, paramar.ku()); ; localb = null)
    {
      localad1 = null;
      if (localb != null)
        localad1 = g.axR().ly(localb.dQZ);
      if ((localz.vu() != null) && (!localz.vu().equals("-1")) && (localad1 == null));
      for (ad localad2 = g.axR().ly(localz.vu()); ; localad2 = localad1)
      {
        label234: int m;
        if (localad2 != null)
        {
          EmojiView localEmojiView = localo.eBA;
          long l = paramar.kk();
          if (localad2.field_type == ad.ija)
          {
            int j = i;
            localEmojiView.a(localad2, l, j, i);
            if ((localad2.field_state != ad.ijf) && (paramar.getStatus() == i))
              break label452;
            ProgressBar localProgressBar = localo.fIh;
            if (i == 0)
              break label458;
            m = 4;
            label249: localProgressBar.setVisibility(m);
            localo.jlT.setVisibility(8);
            if ((!localz.BH()) && (i != 0))
            {
              localz.BI();
              localz.fS(localad2.vu());
              paramar.setContent(localz.BG());
              paramar.setStatus(bg.qW().oV().cV(paramar.kk()).getStatus());
              bg.qW().oV().a(paramar.kk(), paramar);
            }
          }
        }
        while (true)
        {
          localo.eBA.setTag(new ms(paramar, paramhd.iWI, paramInt, paramhd.joh.dnT, 0, (byte)0));
          localo.eBA.setOnClickListener(paramhd.joh.jqc);
          localo.eBA.setOnLongClickListener(paramhd.joh.jqe);
          localo.jlT.setTag(localo.eBA.getTag());
          a(paramInt, localo, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
          return;
          int k = 0;
          break;
          label452: boolean bool1 = false;
          break label234;
          label458: m = 0;
          break label249;
          if (com.tencent.mm.am.a.to("emoji"))
          {
            Bitmap localBitmap = ap.yg().a(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), bool1);
            if (localBitmap != null)
            {
              localo.eBA.aAb();
              localo.eBA.setImageBitmap(localBitmap);
              localo.jlT.setVisibility(0);
            }
          }
          localo.fIh.setVisibility(8);
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if (bg.qW().isSDCardAvailable())
    {
      int i = ((ms)paramView.getTag()).position;
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(com.tencent.mm.n.bAb));
      if ((!paramar.aJv()) && (paramar.aJG()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(com.tencent.mm.n.bzE));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(com.tencent.mm.n.bzx));
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
 * Qualified Name:     com.tencent.mm.ui.chatting.co
 * JD-Core Version:    0.6.2
 */