package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.ai.b;
import com.tencent.mm.f;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.r;
import com.tencent.mm.pluginsdk.model.app.s;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class cs extends cl
{
  private hd joF;

  public cs()
  {
    super(48);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof q)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcu);
      paramView.setTag(new q(this.fjl).au(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    q localq = (q)paramck;
    this.joF = paramhd;
    com.tencent.mm.ai.a locala = bf.GN().cp(paramar.kk());
    String str1 = paramar.getContent();
    if (paramhd.jom)
    {
      int i = paramar.getContent().indexOf(':');
      if (i != -1)
        str1 = paramar.getContent().substring(i + 1);
    }
    String str2 = ch.xw(str1);
    b localb;
    if ((locala != null) && (str2 != null))
    {
      localb = b.V(str2, paramar.ku());
      if (localb != null)
      {
        localq.jlX.setText(localb.title);
        ms localms = new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0);
        localq.joC.setTag(localms);
        localq.joC.setOnClickListener(paramhd.joh.jqc);
        if (this.hMJ)
          localq.joC.setOnLongClickListener(paramhd.joh.jqe);
      }
      if ((g.aya() != null) && (g.aya().nR(paramhd.aUL())))
      {
        localq.jlX.setTextColor(paramhd.h().getResources().getColor(f.OD));
        localq.joC.setClickable(true);
        localq.joC.setEnabled(true);
      }
    }
    else
    {
      Object[] arrayOfObject = new Object[4];
      if (locala == null);
      for (boolean bool = true; ; bool = false)
      {
        arrayOfObject[0] = Boolean.valueOf(bool);
        arrayOfObject[1] = str2;
        arrayOfObject[2] = Long.valueOf(paramar.kk());
        arrayOfObject[3] = paramString;
        z.e("!64@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20a4XFFxevan1vCiCe2mukZASSq8hOuLt4H", "amessage:%b, %s, %s", arrayOfObject);
        localb = null;
        break;
      }
    }
    localq.jlX.setTextColor(-8750470);
    localq.joC.setClickable(false);
    localq.joC.setEnabled(false);
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    s.vc(this.joF.at(paramar.getContent(), paramar.jK()));
    b localb = b.iS(this.joF.at(paramar.getContent(), paramar.jK()));
    com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, false);
    if ((com.tencent.mm.am.a.to("favorite")) && ((localk == null) || (!localk.avN())))
      switch (localb.type)
      {
      case 7:
      case 8:
      case 9:
      case 11:
      case 12:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 10:
      case 13:
      case 20:
      }
    while (true)
    {
      if (!this.joF.aVS())
        paramContextMenu.add(i, 100, 0, this.joF.getString(n.bzz));
      return true;
      paramContextMenu.add(i, 116, 0, paramView.getContext().getString(n.bUO));
    }
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 100:
      b localb;
      com.tencent.mm.pluginsdk.model.app.k localk;
      do
      {
        do
        {
          return false;
          String str = ch.xw(paramar.getContent());
          localb = null;
          if (str != null)
            localb = b.iS(str);
        }
        while (localb == null);
        s.vb(localb.dQY);
        bw.v(paramar.kk());
        localk = l.F(localb.appId, false);
      }
      while ((localk == null) || (!localk.avN()));
      a(paramhd, localb, paramar, localk);
      return false;
    case 111:
    }
    Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", paramhd.at(paramar.getContent(), paramar.jK()));
    localIntent.putExtra("Retr_Msg_Type", 2);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    paramhd.aUL();
    paramhd.S("fromMessage", true);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cs
 * JD-Core Version:    0.6.2
 */