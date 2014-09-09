package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.am.a;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bk;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class cz extends cm
{
  private hd joF;

  public cz()
  {
    super(23);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof t)) || (((t)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcR);
      paramView.setTag(new s(this.fjl).aw(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    s locals = (s)paramck;
    this.joF = paramhd;
    String str1 = ch.xw(paramar.getContent());
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      com.tencent.mm.pluginsdk.model.app.k localk;
      String str2;
      if ((localb != null) && (localb.type == 1))
      {
        locals.eTU.setText(localb.title);
        paramhd.joh.jpY.c(locals.eTU);
        localk = l.F(localb.appId, true);
        if ((localk != null) && (localk.field_appName != null) && (localk.field_appName.trim().length() > 0))
          break label354;
        str2 = localb.appName;
        if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str2)))
          break label364;
        TextView localTextView = locals.eTF;
        int i = n.bAk;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = l.a(paramhd.agh(), localk, str2);
        localTextView.setText(paramhd.getString(i, arrayOfObject));
        locals.eTF.setVisibility(0);
        a(paramhd, locals.eTF, localb.appId);
        a(paramhd, locals.eTF, localb.appId);
        label235: if ((paramar.getStatus() != 2) && (paramar.getStatus() != 5))
          break label377;
        locals.fIh.setVisibility(8);
      }
      while (true)
      {
        a(paramInt, locals, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
        locals.eTU.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
        locals.eTU.setOnClickListener(paramhd.joh.jqc);
        if (bg.qW().isSDCardAvailable())
          locals.eTU.setOnLongClickListener(paramhd.joh.jqe);
        return;
        label354: str2 = localk.field_appName;
        break;
        label364: locals.eTF.setVisibility(8);
        break label235;
        label377: locals.fIh.setVisibility(0);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    paramContextMenu.add(i, 111, 0, this.joF.getString(n.cag));
    if (a.to("favorite"))
      paramContextMenu.add(i, 116, 0, this.joF.getString(n.bUO));
    if ((!paramar.aJv()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
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
      bw.v(paramar.kk());
      bg.qW().oS().a(new bk(paramar.kt(), paramar.kl()));
      return false;
    case 102:
      ((ClipboardManager)paramhd.agh().getSystemService("clipboard")).setText(paramhd.at(com.tencent.mm.ai.b.iS(paramar.getContent()).title, paramar.jK()));
      return false;
    case 111:
    }
    Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", paramar.getContent());
    localIntent.putExtra("Retr_Msg_Type", 2);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    if ((((ms)paramView.getTag()).fjl == 5) && (paramar.jK() == 1))
    {
      if (paramar != null)
        e.a(this.joF.agh(), this.joF.getString(n.bAa), "", this.joF.getString(n.bub), this.joF.getString(n.bsK), new da(this, paramar), new db(this));
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cz
 * JD-Core Version:    0.6.2
 */