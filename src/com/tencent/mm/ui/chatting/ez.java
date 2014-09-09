package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ai.a;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.voicereminder.a.l;
import com.tencent.mm.plugin.voicereminder.a.o;
import com.tencent.mm.pluginsdk.model.app.ae;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.r;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;

final class ez extends cl
{
  private m dDA;
  private hd joF;

  public ez()
  {
    super(33);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof ot)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bdc);
      paramView.setTag(new ot(this.fjl).aD(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    ot localot = (ot)paramck;
    this.joF = paramhd;
    a locala = bf.GN().cp(paramar.kk());
    String str1 = ch.xw(paramar.getContent());
    if ((locala != null) && (str1 != null));
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      if (localb != null)
        localot.eTE.setText(localb.description);
      com.tencent.mm.sdk.platformtools.z.d("!56@/B4Tb64lLpKwUcOR+EdWcgrQWCeRaP+fpwTv6y+mNLsGtZa7kCGtUQ==", "content sys " + paramar.getContent());
      l locall = l.tg(str1);
      if ((locall != null) && (locall.gSM != null) && (locall.gSM.length() > 0) && (locall.gSN > 0) && (this.dDA == null) && (ch.jb(paramar.kp())))
      {
        String str2 = com.tencent.mm.plugin.voicereminder.a.z.ia(x.pG());
        String str3 = o.A(str2, false);
        paramar.bK(str2);
        bg.qW().oV().a(paramar.kk(), paramar);
        String str4 = s.a(str3, paramar.kk(), localb.sdkVer, localb.appId, locall.gSM, locall.gSN);
        if (str4 != null)
        {
          ac localac = bg.qX();
          fa localfa = new fa(this, paramar, str4, paramInt);
          this.dDA = localfa;
          localac.a(221, localfa);
          ae localae = new ae(str4);
          localae.ayN();
          bg.qX().d(localae);
        }
      }
      localot.eTE.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      localot.eTE.setOnClickListener(paramhd.joh.jqc);
      if (bg.qW().isSDCardAvailable())
        localot.eTE.setOnLongClickListener(paramhd.joh.jqe);
      return;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, this.joF.getString(n.bzz));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 100:
    }
    String str = ch.xw(paramar.getContent());
    com.tencent.mm.ai.b localb = null;
    if (str != null)
      localb = com.tencent.mm.ai.b.iS(str);
    if (localb != null)
      s.vb(localb.dQY);
    bw.v(paramar.kk());
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ez
 * JD-Core Version:    0.6.2
 */