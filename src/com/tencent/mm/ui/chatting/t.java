package com.tencent.mm.ui.chatting;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.c.a.if;
import com.tencent.mm.c.a.ih;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.protocal.a.hq;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import java.util.Iterator;
import java.util.LinkedList;

final class t extends ck
{
  protected View eSF;
  protected TextView eTE;
  protected TextView eTF;
  protected ImageView eWm;
  protected TextView eyZ;
  protected TextView jlV;
  protected TextView jmi;
  protected ImageView jmj;
  protected TextView jmk;
  protected ImageView jml;
  protected ChattingItemFooter jmm;
  protected ImageView jmn;
  protected LinearLayout jmo;
  protected ViewGroup jmp;
  protected TextView jmq;
  protected LinearLayout jmr;
  ImageView jms;

  public t(int paramInt)
  {
    super(paramInt);
  }

  static void a(t paramt, com.tencent.mm.ai.b paramb, boolean paramBoolean)
  {
    if localif = new if();
    localif.cMG.type = 0;
    localif.cMG.cMI = paramb.dRu;
    com.tencent.mm.sdk.c.a.aGB().g(localif);
    com.tencent.mm.protocal.b.a.a locala = localif.cMH.cMN;
    Iterator localIterator;
    if (locala != null)
    {
      paramt.jmi.setText(ch.Y(locala.title, paramb.title));
      paramt.eTE.setText(ch.Y(locala.desc, paramb.description));
      localIterator = locala.dRV.iterator();
    }
    int j;
    for (int i = 0; ; i = j)
    {
      hq localhq;
      if (localIterator.hasNext())
      {
        localhq = (hq)localIterator.next();
        switch (localhq.getDataType())
        {
        case 9:
        case 12:
        case 13:
        default:
          j = i;
        case 3:
        case 1:
        case 2:
        case 5:
        case 4:
        case 6:
        case 7:
        case 8:
        case 10:
        case 11:
        case 14:
        }
      }
      while (j != 0)
      {
        return;
        if (paramBoolean)
        {
          paramt.eWm.setVisibility(0);
          paramt.eWm.setImageResource(h.VV);
        }
        j = 1;
        continue;
        j = i;
        continue;
        if (paramBoolean)
        {
          paramt.eWm.setVisibility(0);
          paramt.eWm.setImageResource(h.Rz);
        }
        j = 1;
        continue;
        if (paramBoolean)
        {
          paramt.eWm.setVisibility(0);
          paramt.eWm.setImageResource(h.RK);
        }
        j = 1;
        continue;
        if (paramBoolean)
        {
          paramt.eWm.setVisibility(0);
          paramt.eWm.setImageResource(h.RI);
        }
        paramt.jml.setVisibility(0);
        paramt.jml.setImageResource(h.acG);
        while (true)
        {
          j = 1;
          break;
          paramt.eWm.setVisibility(0);
          paramt.eWm.setImageResource(h.Rv);
          continue;
          if (paramBoolean)
          {
            paramt.eWm.setVisibility(0);
            paramt.eWm.setImageResource(h.Rw);
          }
          paramt.jml.setVisibility(0);
          paramt.jml.setImageResource(h.Xd);
          continue;
          if (paramBoolean)
          {
            paramt.eWm.setVisibility(0);
            paramt.eWm.setImageResource(com.tencent.mm.pluginsdk.b.Z(localhq.aHU(), h.RG));
          }
          j = 1;
          break;
          if (paramBoolean)
          {
            paramt.eWm.setVisibility(0);
            paramt.eWm.setImageResource(h.RG);
          }
        }
      }
    }
  }

  public final t f(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eWm = ((ImageView)paramView.findViewById(i.akY));
    this.eyZ = ((TextView)paramView.findViewById(i.ala));
    this.jmi = ((TextView)paramView.findViewById(i.alb));
    this.eTE = ((TextView)paramView.findViewById(i.akR));
    this.eTF = ((TextView)paramView.findViewById(i.akW));
    this.jmj = ((ImageView)paramView.findViewById(i.akX));
    this.jmk = ((TextView)paramView.findViewById(i.akT));
    this.eSF = paramView.findViewById(i.akU);
    this.jml = ((ImageView)paramView.findViewById(i.akS));
    this.jlV = ((TextView)paramView.findViewById(i.akP));
    this.jmn = ((ImageView)paramView.findViewById(i.akV));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.jmm = ((ChattingItemFooter)paramView.findViewById(i.auq));
    this.jmo = ((LinearLayout)paramView.findViewById(i.agd));
    this.jmp = ((ViewGroup)paramView.findViewById(i.aAO));
    this.jmq = ((TextView)paramView.findViewById(i.aAM));
    this.jmr = ((LinearLayout)paramView.findViewById(i.alc));
    if (!paramBoolean)
      this.jms = ((ImageView)this.gAm.findViewById(i.amh));
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.t
 * JD-Core Version:    0.6.2
 */