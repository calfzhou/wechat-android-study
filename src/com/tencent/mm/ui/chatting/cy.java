package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
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
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class cy extends cl
{
  private hd joF;

  public cy()
  {
    super(22);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof t)) || (((t)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcw);
      paramView.setTag(new s(this.fjl).aw(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    s locals = (s)paramck;
    String str1 = paramar.getContent();
    if (paramhd.jom)
    {
      int j = paramar.getContent().indexOf(':');
      if (j != -1)
        str1 = paramar.getContent().substring(j + 1);
    }
    String str2 = ch.xw(str1);
    if (str2 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str2, paramar.ku()); ; localb = null)
    {
      com.tencent.mm.pluginsdk.model.app.k localk;
      String str3;
      if ((localb != null) && (localb.type == 1))
      {
        localk = l.F(localb.appId, true);
        if ((localk != null) && (localk.field_appName != null) && (localk.field_appName.trim().length() > 0))
          break label388;
        str3 = localb.appName;
        if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str3)))
          break label398;
        TextView localTextView = locals.eTF;
        int i = n.bAk;
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = l.a(paramhd.agh(), localk, str3);
        localTextView.setText(paramhd.getString(i, arrayOfObject));
        locals.eTF.setVisibility(0);
        a(paramhd, locals.eTF, localb.appId);
        a(paramhd, locals.eTF, localb.appId);
        label250: if ((localb.ddY == null) || (localb.ddY.length() <= 0))
          break label411;
        b(paramhd, locals.jlV, ms.Cr(localb.ddY));
        locals.jlV.setVisibility(0);
      }
      while (true)
      {
        locals.eTU.setText(localb.title);
        paramhd.joh.jpY.c(locals.eTU);
        locals.eTU.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
        locals.eTU.setOnClickListener(paramhd.joh.jqc);
        if (bg.qW().isSDCardAvailable())
          locals.eTU.setOnLongClickListener(paramhd.joh.jqe);
        return;
        label388: str3 = localk.field_appName;
        break;
        label398: locals.eTF.setVisibility(8);
        break label250;
        label411: locals.jlV.setVisibility(8);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    paramContextMenu.add(i, 111, 0, this.joF.getString(n.cag));
    if (a.to("favorite"))
      paramContextMenu.add(i, 116, 0, this.joF.getString(n.bUO));
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
      ((ClipboardManager)paramhd.agh().getSystemService("clipboard")).setText(paramhd.at(com.tencent.mm.ai.b.iS(paramhd.at(paramar.getContent(), paramar.jK())).title, paramar.jK()));
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
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cy
 * JD-Core Version:    0.6.2
 */