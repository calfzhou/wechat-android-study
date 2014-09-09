package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.c.a.er;
import com.tencent.mm.c.a.fg;
import com.tencent.mm.c.a.fi;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.y.ap;

final class mt extends ck
{
  ImageView jms;
  TextView jpB;
  LinearLayout jvb;
  TextView jvc;
  ProgressBar jvd;
  ImageView jve;
  ProgressBar jvf;
  ImageView jvg;

  public mt(int paramInt)
  {
    super(paramInt);
  }

  public static void a(mt parammt, ar paramar, boolean paramBoolean, int paramInt, hd paramhd)
  {
    if (parammt == null)
      return;
    parammt.jvb.setVisibility(8);
    er localer;
    label131: String str1;
    String str2;
    if (paramBoolean)
    {
      parammt.jve.setImageBitmap(ap.yg().a(h.Wi, h.Tg, com.tencent.mm.aq.a.o(paramhd.agh(), g.PZ), com.tencent.mm.aq.a.o(paramhd.agh(), g.PY), paramBoolean));
      localer = new er();
      localer.cKd.cCp = paramar;
      localer.cKd.w = com.tencent.mm.aq.a.o(paramhd.agh(), g.PZ);
      localer.cKd.LN = com.tencent.mm.aq.a.o(paramhd.agh(), g.PY);
      if (!paramBoolean)
        break label482;
      localer.cKd.cKi = h.Tg;
      localer.cKd.cKf = parammt.jve;
      localer.cKd.cKh = parammt.jvd;
      localer.cKd.cKg = parammt.jvg;
      com.tencent.mm.sdk.c.a.aGB().g(localer);
      r.s(parammt.jvc, h.Tt);
      r.s(parammt.jpB, h.Ts);
      parammt.jvc.setMaxLines(1);
      parammt.jpB.setMaxLines(1);
      parammt.jpB.setText("");
      if (!com.tencent.mm.am.a.to("location"))
        break label659;
      z.d("!44@/B4Tb64lLpIu6Y+BscdrxMmjRr+eAHhjm8+ihV5oE4w=", "plugin found!");
      fg localfg = new fg();
      localfg.cKA.cKC = 1;
      localfg.cKA.cCp = paramar;
      com.tencent.mm.sdk.c.a.aGB().g(localfg);
      str1 = localfg.cKB.cKF;
      str2 = localfg.cKB.cKG;
      if (((str1 != null) || (a(str2, paramhd))) && ((str1 == null) || (!str1.equals(""))) && ((str1 == null) || (!str1.equals("err_not_started"))))
        break label496;
      z.d("!44@/B4Tb64lLpIu6Y+BscdrxMmjRr+eAHhjm8+ihV5oE4w=", "info error or subcore not started!");
      parammt.jvf.setVisibility(0);
      parammt.jvb.setVisibility(0);
      parammt.jvc.setText("");
      parammt.jpB.setText("");
    }
    while (true)
    {
      parammt.joC.setTag(new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0));
      parammt.joC.setOnClickListener(paramhd.joh.jqc);
      parammt.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
      parammt.jve.setImageBitmap(ap.yg().a(h.Wi, h.Ti, com.tencent.mm.aq.a.o(paramhd.agh(), g.PZ), com.tencent.mm.aq.a.o(paramhd.agh(), g.PY), paramBoolean));
      break;
      label482: localer.cKd.cKi = h.Ti;
      break label131;
      label496: parammt.jvf.setVisibility(8);
      parammt.jvb.setVisibility(0);
      z.d("!44@/B4Tb64lLpIu6Y+BscdrxMmjRr+eAHhjm8+ihV5oE4w=", "location info : " + str1);
      if (a(str2, paramhd))
      {
        parammt.jvc.setVisibility(0);
        parammt.jvc.setText(str2);
        if ((str1 == null) || (str1.equals("")))
        {
          parammt.jpB.setVisibility(8);
          r.s(parammt.jvc, h.Ts);
        }
        else
        {
          parammt.jpB.setVisibility(0);
          parammt.jpB.setText(str1);
        }
      }
      else
      {
        parammt.jvc.setMaxLines(2);
        parammt.jvc.setText(str1);
        parammt.jpB.setVisibility(8);
        r.s(parammt.jvc, h.Ts);
        continue;
        label659: parammt.jvd.setVisibility(0);
        parammt.jvb.setVisibility(8);
      }
    }
  }

  private static boolean a(String paramString, hd paramhd)
  {
    return (paramString != null) && (!paramString.equals("")) && (!paramString.equals(paramhd.getString(com.tencent.mm.n.bPV)));
  }

  public final ck e(View paramView, boolean paramBoolean)
  {
    super.ay(paramView);
    this.eTC = ((TextView)paramView.findViewById(i.amj));
    this.jpB = ((TextView)paramView.findViewById(i.alL));
    this.jvc = ((TextView)paramView.findViewById(i.alN));
    this.jvb = ((LinearLayout)paramView.findViewById(i.alM));
    this.jvd = ((ProgressBar)paramView.findViewById(i.alI));
    this.joC = paramView.findViewById(i.all);
    this.joA = ((TextView)paramView.findViewById(i.amp));
    this.eWo = ((CheckBox)paramView.findViewById(i.alk));
    this.gzU = paramView.findViewById(i.alP);
    this.jve = ((ImageView)paramView.findViewById(i.alK));
    this.jvf = ((ProgressBar)paramView.findViewById(i.alJ));
    this.jvg = ((ImageView)paramView.findViewById(i.alt));
    if (paramBoolean);
    for (int i = 16; ; i = 17)
    {
      this.type = i;
      if (!paramBoolean)
      {
        this.jmh = ((ImageView)paramView.findViewById(i.amf));
        this.jms = ((ImageView)paramView.findViewById(i.amh));
      }
      return this;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.mt
 * JD-Core Version:    0.6.2
 */