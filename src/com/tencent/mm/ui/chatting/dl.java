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
import com.tencent.mm.model.y;
import com.tencent.mm.n;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;

final class dl extends cm
{
  private hd joF;

  public dl()
  {
    super(13);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcS);
      paramView.setTag(new ao(this.fjl).e(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    ao localao = (ao)paramck;
    as localas = bg.qW().oV().zD(paramar.getContent());
    if ((localas == null) || (localas.aJQ() == null) || (localas.aJQ().length() <= 0))
      z.e("!44@/B4Tb64lLpKwUcOR+EdWcoC/QFCp1tJP096fZet3i00=", "getView : parse possible friend msg failed");
    int i = bw.ek(paramar.getContent());
    if (i != -1)
    {
      String str = paramar.getContent().substring(0, i).trim();
      if ((str != null) && (str.length() > 0))
        localao.jmW.setText(y.dh(str));
      localao.jmW.setText(ao.a(localas));
      localao.jmV.setText(n.byQ);
      TextView localTextView = localao.ekE;
      localTextView.setText(com.tencent.mm.ar.b.e(paramhd.agh(), localas.iV(), (int)localao.ekE.getTextSize()));
      localao.jmX.setVisibility(8);
      h(localao.jmU, localas.aJQ());
      localao.jlS.setVisibility(8);
      localao.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      localao.joC.setOnClickListener(paramhd.joh.jqc);
      localao.joC.setOnLongClickListener(paramhd.joh.jqe);
      if (aUS())
      {
        if ((paramar.getStatus() != 2) || (!cR(paramar.kk())))
          break label346;
        if (localao.jms != null)
          localao.jms.setVisibility(0);
      }
    }
    while (true)
    {
      a(paramInt, localao, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
      return;
      paramar.kt();
      break;
      label346: if (localao.jms != null)
        localao.jms.setVisibility(8);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    paramContextMenu.add(i, 118, 0, paramView.getContext().getString(n.cag));
    if (r.uM())
      paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
    if ((!paramar.aJv()) && ((paramar.getStatus() == 2) || (paramar.kD() == 1)) && (paramar.aJB()) && (aUR()) && (cR(paramar.kk())) && (Cd(paramar.kt())))
      paramContextMenu.add(i, 123, 0, paramView.getContext().getString(n.bzE));
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
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dl
 * JD-Core Version:    0.6.2
 */