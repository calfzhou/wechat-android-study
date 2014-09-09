package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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

final class dr extends cl
{
  private hd joF;

  public dr()
  {
    super(14);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcy);
      paramView.setTag(new mm(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    ad localad1 = g.axR().ly(paramar.kp());
    mm localmm = (mm)paramck;
    z localz;
    boolean bool;
    ad localad2;
    Object localObject;
    long l3;
    if (localad1 != null)
    {
      localz = z.yW(paramar.getContent());
      if (!localz.BH())
        EmojiView.cA(paramar.kk());
      if ((!localad1.avN()) || (localz.BH()))
        break label210;
      EmojiView localEmojiView2 = localmm.eBA;
      long l5 = paramar.kk();
      bool = true;
      localad2 = localad1;
      localObject = localEmojiView2;
      l3 = l5;
    }
    while (true)
    {
      ((EmojiView)localObject).a(localad2, l3, bool, false);
      if (!localz.BH())
      {
        localz.BI();
        paramar.setContent(localz.BG());
        bg.qW().oV().a(paramar.kk(), paramar);
      }
      localmm.eBA.setTag(new ms(paramar, paramhd.iWI, paramInt, paramString, 0, (byte)0));
      localmm.eBA.setOnClickListener(paramhd.joh.jqc);
      localmm.eBA.setOnLongClickListener(paramhd.joh.jqe);
      return;
      label210: EmojiView localEmojiView1;
      long l1;
      if (localad1.avN())
      {
        localEmojiView1 = localmm.eBA;
        l1 = paramar.kk();
      }
      do
      {
        long l4 = l1;
        localad2 = localad1;
        localObject = localEmojiView1;
        l3 = l4;
        bool = false;
        break;
        a(paramar, localad1);
        localEmojiView1 = localmm.eBA;
        l1 = paramar.kk();
      }
      while ((localad1.field_type != ad.iiX) && (localad1.field_type != ad.ija));
      bool = true;
      long l2 = l1;
      localad2 = localad1;
      localObject = localEmojiView1;
      l3 = l2;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    if ((paramar.aJF()) && (bg.qW().isSDCardAvailable()))
    {
      int i = ((ms)paramView.getTag()).position;
      ad localad = g.axR().ly(paramar.kp());
      if ((localad != null) && (localad.field_catalog == ad.iiK) && (TextUtils.isEmpty(localad.field_groupId)))
        paramContextMenu.add(i, 104, 0, paramView.getContext().getString(n.bzF));
      if ((localad != null) && (paramar.getStatus() == 5))
        paramContextMenu.add(i, 103, 0, paramView.getContext().getString(n.bAb));
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

  protected final boolean a(hd paramhd)
  {
    return paramhd.iWI;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dr
 * JD-Core Version:    0.6.2
 */