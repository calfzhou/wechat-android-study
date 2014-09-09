package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.aw;

final class ea extends cl
{
  private hd joF;

  public ea()
  {
    super(8);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = paramLayoutInflater.inflate(k.bcB, null);
      mu localmu = new mu(this.fjl);
      localmu.eTC = ((TextView)paramView.findViewById(i.amj));
      localmu.joA = ((TextView)paramView.findViewById(i.amp));
      localmu.jlS = ((ImageView)paramView.findViewById(i.alO));
      localmu.jvc = ((TextView)paramView.findViewById(i.aml));
      localmu.jpB = ((TextView)paramView.findViewById(i.alp));
      localmu.joC = paramView.findViewById(i.all);
      paramView.setTag(localmu);
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mu localmu = (mu)paramck;
    au localau = bg.qW().oV().zB(paramar.getContent());
    localmu.jvc.setText(localau.getTitle());
    localmu.jpB.setText(localau.getContent());
    a(localmu, localau.zj());
    ImageView localImageView = localmu.jlS;
    if (localau.aKe());
    for (int i = 0; ; i = 8)
    {
      localImageView.setVisibility(i);
      localmu.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      localmu.joC.setOnClickListener(paramhd.joh.jqc);
      localmu.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
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

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ea
 * JD-Core Version:    0.6.2
 */