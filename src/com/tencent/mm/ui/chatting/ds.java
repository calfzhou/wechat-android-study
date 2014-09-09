package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.i;
import com.tencent.mm.pluginsdk.ui.EmojiView;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.z;

final class ds extends cm
{
  private hd joF;

  public ds()
  {
    super(15);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcT);
      paramView.setTag(new mm(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mm localmm = (mm)paramck;
    ad localad1 = g.axR().ly(paramar.kp());
    z localz;
    long l6;
    boolean bool;
    Object localObject1;
    Object localObject2;
    if (localad1 != null)
    {
      localz = z.yW(paramar.getContent());
      if (!localz.BH())
        EmojiView.cA(paramar.kk());
      if ((!localad1.avN()) || (localz.BH()))
        break label304;
      EmojiView localEmojiView4 = localmm.eBA;
      l6 = paramar.kk();
      bool = true;
      localObject1 = localad1;
      localObject2 = localEmojiView4;
    }
    int i;
    label194: int j;
    label209: long l5;
    for (long l3 = l6; ; l3 = l5)
    {
      ((EmojiView)localObject2).a((ad)localObject1, l3, bool, true);
      if (!localz.BH())
      {
        localz.BI();
        paramar.setContent(localz.BG());
        paramar.setStatus(bg.qW().oV().cV(paramar.kk()).getStatus());
        bg.qW().oV().A(paramar);
      }
      if ((localad1.field_state != ad.ijf) && (paramar.getStatus() == 1))
        break label464;
      i = 1;
      ProgressBar localProgressBar = localmm.fIh;
      if (i == 0)
        break label470;
      j = 4;
      localProgressBar.setVisibility(j);
      localmm.eBA.setTag(new ms(paramar, paramhd.iWI, paramInt, paramhd.joh.dnT, 0, (byte)0));
      localmm.eBA.setOnClickListener(paramhd.joh.jqc);
      localmm.eBA.setOnLongClickListener(paramhd.joh.jqe);
      a(paramInt, localmm, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      label304: if (!localad1.avN())
        break label399;
      if (!localmm.eBA.isPlaying())
        break;
      EmojiView localEmojiView3 = localmm.eBA;
      l5 = paramar.kk();
      bool = true;
      localObject1 = localad1;
      localObject2 = localEmojiView3;
    }
    EmojiView localEmojiView2 = localmm.eBA;
    long l1 = paramar.kk();
    Object localObject3 = localEmojiView2;
    for (ad localad2 = localad1; ; localad2 = localad1)
    {
      long l4 = l1;
      localObject1 = localad2;
      localObject2 = localObject3;
      l3 = l4;
      bool = false;
      break;
      label399: a(paramar, localad1);
      EmojiView localEmojiView1 = localmm.eBA;
      l1 = paramar.kk();
      if ((localad1.field_type == ad.iiX) || (localad1.field_type == ad.ija))
      {
        bool = true;
        long l2 = l1;
        localObject1 = localad1;
        localObject2 = localEmojiView1;
        l3 = l2;
        break;
        label464: i = 0;
        break label194;
        label470: j = 0;
        break label209;
      }
      localObject3 = localEmojiView1;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if ((paramar.aJF()) && (bg.qW().isSDCardAvailable()))
    {
      int i = ((ms)paramView.getTag()).position;
      if (paramar.getStatus() == 5)
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
      if ((!paramar.aJv()) && (paramar.aJF()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
        paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzx));
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
 * Qualified Name:     com.tencent.mm.ui.chatting.ds
 * JD-Core Version:    0.6.2
 */