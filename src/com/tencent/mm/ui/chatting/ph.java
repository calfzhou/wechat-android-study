package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.c.a.mz;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.n;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;

final class ph extends ck
{
  TextView jpB;
  View jwQ = null;

  public ph(int paramInt)
  {
    super(paramInt);
  }

  public static void a(ph paramph, ar paramar, boolean paramBoolean, int paramInt, hd paramhd)
  {
    if (paramph == null);
    label31: label115: label249: label251: int k;
    label221: 
    do
    {
      return;
      int m;
      int i;
      if (paramph.jmh != null)
      {
        ImageView localImageView = paramph.jmh;
        if (paramar.getStatus() == 6)
        {
          m = 8;
          localImageView.setVisibility(m);
        }
      }
      else
      {
        paramph.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
        paramph.joC.setOnClickListener(paramhd.joh.jqc);
        paramph.joC.setOnLongClickListener(paramhd.joh.jqe);
        String str1 = paramar.kz();
        if (ch.jb(str1))
          break label221;
        paramph.jpB.setText(str1);
        if (paramph.jwQ == null)
          break label249;
        if (!paramar.getContent().equals(ar.ijt))
        {
          String str2 = paramar.getContent();
          mx localmx1 = new mx();
          localmx1.cPr.cEg = 1;
          localmx1.cPr.content = str2;
          a.aGB().g(localmx1);
          if (localmx1.cPs.type != 3)
            break label251;
          i = 1;
        }
      }
      while (true)
        if (i != 0)
        {
          if (paramBoolean)
          {
            paramph.jwQ.setBackgroundResource(h.adq);
            return;
            m = 0;
            break label31;
            if (paramBoolean)
            {
              paramph.jpB.setText(n.cEr);
              break label115;
            }
            paramph.jpB.setText(n.cEs);
            break label115;
            break;
            i = 0;
            continue;
          }
          paramph.jwQ.setBackgroundResource(h.adr);
          return;
        }
      if (paramar.getContent().equals(ar.iju))
        break;
      String str3 = paramar.getContent();
      mx localmx2 = new mx();
      localmx2.cPr.cEg = 1;
      localmx2.cPr.content = str3;
      a.aGB().g(localmx2);
      int j = localmx2.cPs.type;
      k = 0;
      if (j == 2)
        k = 1;
    }
    while (k == 0);
    if (paramBoolean)
    {
      paramph.jwQ.setBackgroundResource(h.ado);
      return;
    }
    paramph.jwQ.setBackgroundResource(h.adp);
  }

  public final ck aB(View paramView)
  {
    super.ay(paramView);
    if ((this.type == 24) || (this.type == 43) || (this.type == 27) || (this.type == 28))
    {
      this.eTC = ((TextView)paramView.findViewById(i.amj));
      this.jpB = ((TextView)paramView.findViewById(i.amC));
      this.joC = paramView.findViewById(i.all);
      this.jwQ = paramView.findViewById(i.amB);
    }
    if (this.type == 24)
      this.jmh = ((ImageView)paramView.findViewById(i.amf));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ph
 * JD-Core Version:    0.6.2
 */