package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ai.b;
import com.tencent.mm.am.a;
import com.tencent.mm.h;
import com.tencent.mm.k;
import com.tencent.mm.model.bw;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;

final class cu extends cl
{
  private hd joF;

  public cu()
  {
    super(44);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof r)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcv);
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
    for (b localb = b.V(str1, paramar.ku()); ; localb = null)
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
        ms localms = new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0);
        localr.joC.setTag(localms);
        return;
        localr.jlZ.setText(n.bzo);
        localr.jlZ.setVisibility(0);
        localr.jma.setText(localb.dRM);
        localr.jma.setVisibility(0);
        String str2 = paramhd.getString(n.bzq);
        localr.jmb.setText(str2);
        localr.jmb.setVisibility(0);
        localr.jmg.setVisibility(8);
        localr.jmc.setVisibility(8);
        localr.jmd.setVisibility(8);
        localr.jme.setVisibility(8);
        localr.jmf.setVisibility(8);
        localr.jlY.setVisibility(8);
        continue;
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
    if (paramar != null)
      paramContextMenu.add(i, 100, 0, this.joF.getString(n.bzz));
    return false;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
      return false;
    case 100:
    }
    bw.v(paramar.kk());
    return true;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    String str = ch.xw(paramar.getContent());
    b localb = null;
    if (str != null)
      localb = b.V(str, paramar.ku());
    boolean bool = false;
    Intent localIntent;
    if (localb != null)
    {
      localIntent = new Intent();
      switch (localb.dRL)
      {
      case 2:
      default:
        z.d("!64@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20aQXi4km+3rnwu/B9R5rY9MUhzkuuLuPON", "Unrecognized type, probably version to low & check update!");
        ap.af(paramhd.agh());
      case 1:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      bool = true;
      return bool;
      localIntent.putExtra("sender_name", paramar.kt());
      localIntent.putExtra("invalid_time", localb.dRP);
      localIntent.putExtra("is_sender", false);
      localIntent.putExtra("appmsg_type", localb.dRL);
      localIntent.putExtra("transfer_id", localb.dRO);
      localIntent.putExtra("transaction_id", localb.dRN);
      localIntent.putExtra("effective_date", localb.dRQ);
      a.a(paramhd, "remittance", ".ui.RemittanceDetailUI", localIntent, 221);
      continue;
      localIntent.putExtra("appmsg_type", localb.dRL);
      localIntent.putExtra("transfer_id", localb.dRO);
      localIntent.putExtra("transaction_id", localb.dRN);
      localIntent.putExtra("effective_date", localb.dRQ);
      a.b(paramhd.agh(), "remittance", ".ui.RemittanceDetailUI", localIntent);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cu
 * JD-Core Version:    0.6.2
 */