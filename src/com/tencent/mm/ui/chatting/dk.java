package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.n.c;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class dk extends cl
{
  private hd joF;

  public dk()
  {
    super(12);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcx);
      paramView.setTag(new ao(this.fjl).e(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    ao localao = (ao)paramck;
    if (paramhd.iWI);
    for (String str = bw.en(paramar.getContent()); ; str = paramar.getContent())
    {
      as localas = bg.qW().oV().zD(str);
      if ((localas == null) || (localas.aJQ() == null) || (localas.aJQ().length() <= 0))
        z.e("!44@/B4Tb64lLpKwUcOR+EdWcoC/QFCp1tJPyVSAt0+rG10=", "getView : parse possible friend msg failed");
      c.k(localas.aJQ(), localas.aJR());
      localao.jmV.setText(n.byQ);
      localao.jmW.setText(ao.a(localas));
      TextView localTextView = localao.ekE;
      localTextView.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.iV(), (int)localao.ekE.getTextSize()));
      localao.jmX.setVisibility(8);
      h(localao.jmU, localas.aJQ());
      localao.jlS.setVisibility(8);
      localao.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, paramString, 0, (byte)0));
      localao.joC.setOnClickListener(paramhd.joh.jqc);
      localao.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    paramContextMenu.add(i, 118, 0, paramView.getContext().getString(n.cag));
    if (r.uM())
      paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 118:
    }
    Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
    localIntent.putExtra("Retr_Msg_content", paramhd.at(paramar.getContent(), paramar.jK()));
    localIntent.putExtra("Retr_Msg_Type", 8);
    localIntent.putExtra("Retr_Msg_Id", paramar.kk());
    paramhd.startActivity(localIntent);
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
 * Qualified Name:     com.tencent.mm.ui.chatting.dk
 * JD-Core Version:    0.6.2
 */