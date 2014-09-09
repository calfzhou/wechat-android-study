package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.base.e;

final class cv extends cm
{
  private hd joF;

  public cv()
  {
    super(45);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof r)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcQ);
      paramView.setTag(new r(this.fjl).av(paramView));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    r localr = (r)paramck;
    String str1 = ch.xw(paramar.getContent());
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      if (localb != null)
        switch (localb.dRL)
        {
        case 2:
        default:
          localr.jmg.setText(localb.description);
          localr.jmg.setVisibility(0);
          localr.jlZ.setVisibility(8);
          localr.jma.setVisibility(8);
          localr.jmb.setVisibility(8);
          localr.jmc.setVisibility(8);
          localr.jmd.setVisibility(8);
          localr.jme.setVisibility(8);
          localr.jmf.setVisibility(8);
          localr.jlY.setVisibility(8);
        case 1:
        case 3:
        case 4:
        }
      while (true)
      {
        localr.joC.setOnClickListener(paramhd.joh.jqc);
        localr.joC.setOnLongClickListener(paramhd.joh.jqe);
        ms localms = new ms(paramar, this.joF.iWI, paramInt, null, 0, (byte)0);
        localr.joC.setTag(localms);
        return;
        i locali = bg.qW().oT().yr(paramar.kt());
        if (locali != null);
        for (String str2 = locali.od(); ; str2 = paramar.kt())
        {
          int i = n.bzn;
          Object[] arrayOfObject = new Object[1];
          arrayOfObject[0] = ap.ja(str2);
          String str3 = paramhd.getString(i, arrayOfObject);
          TextView localTextView = localr.jmc;
          localTextView.setText(com.tencent.mm.ar.b.e(paramhd.agh(), str3, (int)localr.jmc.getTextSize()));
          localr.jmc.setVisibility(0);
          localr.jmd.setText(localb.dRM);
          localr.jmd.setVisibility(0);
          localr.jmg.setVisibility(8);
          localr.jlZ.setVisibility(8);
          localr.jma.setVisibility(8);
          localr.jmb.setVisibility(8);
          localr.jme.setVisibility(8);
          localr.jmf.setVisibility(8);
          localr.jlY.setVisibility(8);
          break;
        }
        localr.jme.setText(n.bzk);
        localr.jme.setVisibility(0);
        localr.jmf.setText(localb.dRM);
        localr.jmf.setVisibility(0);
        localr.jlY.setImageResource(h.Tc);
        localr.jlY.setVisibility(0);
        localr.jmg.setVisibility(8);
        localr.jlZ.setVisibility(8);
        localr.jma.setVisibility(8);
        localr.jmb.setVisibility(8);
        localr.jmc.setVisibility(8);
        localr.jmd.setVisibility(8);
        continue;
        localr.jme.setText(n.bzp);
        localr.jme.setVisibility(0);
        localr.jmf.setText(localb.dRM);
        localr.jmf.setVisibility(0);
        localr.jlY.setImageResource(h.Td);
        localr.jlY.setVisibility(0);
        localr.jmg.setVisibility(8);
        localr.jlZ.setVisibility(8);
        localr.jma.setVisibility(8);
        localr.jmb.setVisibility(8);
        localr.jmc.setVisibility(8);
        localr.jmd.setVisibility(8);
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    String str = ch.xw(paramar.getContent());
    com.tencent.mm.ai.b localb = null;
    if (str != null)
      localb = com.tencent.mm.ai.b.V(str, paramar.ku());
    if (localb != null)
    {
      paramContextMenu.add(i, 100, 0, this.joF.getString(n.bzz));
      if (localb.dRL == 1)
        paramContextMenu.add(i, 103, 0, this.joF.getString(n.bZR));
    }
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    case 101:
    case 102:
    default:
      return false;
    case 100:
      bw.v(paramar.kk());
      return true;
    case 103:
    }
    String str1 = ch.xw(paramar.getContent());
    com.tencent.mm.ai.b localb = null;
    if (str1 != null)
      localb = com.tencent.mm.ai.b.V(str1, paramar.ku());
    if (localb != null)
    {
      String str2 = localb.dRN;
      String str3 = paramar.kt();
      int i = localb.dRP;
      e.a(paramhd.agh(), paramhd.getString(n.bZq), paramhd.getString(n.btZ), paramhd.getString(n.bZR), paramhd.getString(n.bsK), new cw(this, str2, str3, i, paramhd), new cx(this));
    }
    return true;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    String str = ch.xw(paramar.getContent());
    com.tencent.mm.ai.b localb = null;
    if (str != null)
      localb = com.tencent.mm.ai.b.V(str, paramar.ku());
    if (localb != null)
    {
      Intent localIntent = new Intent();
      switch (localb.dRL)
      {
      case 2:
      default:
        z.d("!56@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aQXi4km+3rnw8Sq8cm/nToA==", "Unrecognized type, probably version to low & check update!");
        ap.af(paramhd.agh());
        return true;
      case 1:
        localIntent.putExtra("sender_name", paramar.kt());
        localIntent.putExtra("invalid_time", localb.dRP);
        localIntent.putExtra("is_sender", true);
        localIntent.putExtra("appmsg_type", localb.dRL);
        localIntent.putExtra("transfer_id", localb.dRO);
        localIntent.putExtra("transaction_id", localb.dRN);
        localIntent.putExtra("effective_date", localb.dRQ);
        com.tencent.mm.am.a.a(paramhd, "remittance", ".ui.RemittanceDetailUI", localIntent, 221);
        return true;
      case 3:
      case 4:
      }
      localIntent.putExtra("appmsg_type", localb.dRL);
      localIntent.putExtra("transfer_id", localb.dRO);
      localIntent.putExtra("transaction_id", localb.dRN);
      localIntent.putExtra("effective_date", localb.dRQ);
      com.tencent.mm.am.a.b(paramhd.agh(), "remittance", ".ui.RemittanceDetailUI", localIntent);
      return true;
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cv
 * JD-Core Version:    0.6.2
 */