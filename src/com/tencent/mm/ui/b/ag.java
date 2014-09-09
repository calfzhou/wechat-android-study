package com.tencent.mm.ui.b;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.modelsimple.av;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.protocal.a;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

public final class ag extends com.tencent.mm.pluginsdk.ui.a.b
{
  private ProgressDialog dWT = null;
  private boolean dzc = false;
  private TextView eTE;
  private View efu = null;
  private ImageView eyY;
  private TextView eyZ;
  private TextView iRc;
  private TextView iWS;
  private TextView iWT;
  private ImageView iWU;
  private ImageView iWV;
  private ImageView iWW;
  private ProgressBar iWX;
  private String iWY;
  private boolean iWZ = false;
  private boolean iXa = false;
  private int padding;

  public ag(Context paramContext)
  {
    super(paramContext);
    Tb();
  }

  private void Tb()
  {
    if ((!this.iWZ) && (this.view != null))
    {
      this.efu = this.view.findViewById(i.aGH);
      this.eyZ = ((TextView)this.view.findViewById(i.aGC));
      this.eTE = ((TextView)this.view.findViewById(i.aGD));
      this.iRc = ((TextView)this.view.findViewById(i.aGE));
      this.iWS = ((TextView)this.view.findViewById(i.aGB));
      this.iWX = ((ProgressBar)this.view.findViewById(i.aGG));
      this.eyY = ((ImageView)this.view.findViewById(i.aGF));
      this.iWU = ((ImageView)this.view.findViewById(i.amX));
      this.iWV = ((ImageView)this.view.findViewById(i.auw));
      this.iWW = ((ImageView)this.view.findViewById(i.aQm));
      this.iWT = ((TextView)this.view.findViewById(i.bPp));
      this.iWU.setVisibility(8);
      this.iWZ = true;
      this.padding = ((Context)this.hCe.get()).getResources().getDimensionPixelSize(g.PA);
    }
  }

  public final void aAB()
  {
    this.efu.setBackgroundResource(0);
    this.eyY.setImageResource(0);
    this.iWV.setImageResource(0);
    this.iWW.setImageResource(0);
    this.iWU.setImageDrawable(null);
  }

  public final void aRs()
  {
    if (this.efu != null)
      this.efu.setVisibility(8);
  }

  public final boolean du()
  {
    int i = bg.qX().tw();
    String str = bg.qX().getNetworkServerIp();
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = ("0x" + Integer.toHexString(a.hrn));
    arrayOfObject1[1] = a.hrg;
    arrayOfObject1[2] = x.pG();
    arrayOfObject1[3] = str;
    arrayOfObject1[4] = y.aGW();
    this.iWY = String.format("http://w.mail.qq.com/cgi-bin/report_mm?failuretype=1&devicetype=2&clientversion=%s&os=%s&username=%s&iport=%s&t=weixin_bulletin&f=xhtml&lang=%s", arrayOfObject1);
    Tb();
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(i);
    z.i("!32@/B4Tb64lLpLZK4S58QkvjMJNCW0pm8rv", "update st:%d", arrayOfObject2);
    boolean bool1;
    label248: boolean bool2;
    label423: View localView;
    int i2;
    switch (i)
    {
    case 1:
    case 2:
    case 5:
    default:
      bool1 = false;
      if (bool1)
      {
        this.iRc.setVisibility(8);
        this.eyZ.setVisibility(0);
        this.efu.setBackgroundResource(h.abV);
        this.efu.setPadding(this.padding, 0, this.padding, 0);
        this.iRc.setPadding(0, 0, 0, 0);
        this.eyY.setImageResource(h.Xp);
        this.iWV.setVisibility(8);
        this.iWW.setVisibility(8);
        this.iWT.setVisibility(8);
        if (!bool1)
        {
          this.iWU.setVisibility(8);
          if (ao.dVt)
          {
            int i3 = bc.bV((Context)this.hCe.get());
            if ((!bc.ow(i3)) || (this.iXa))
              break label1126;
            this.eyZ.setText(((Context)this.hCe.get()).getString(n.bVL));
            this.eTE.setText(((Context)this.hCe.get()).getString(n.bVK));
            this.eTE.setVisibility(0);
            this.iWS.setVisibility(8);
            this.iWX.setVisibility(8);
            this.eyY.setVisibility(0);
            this.iWU.setVisibility(0);
            this.efu.setOnClickListener(new al(this, i3));
            this.iWU.setOnClickListener(new am(this, i3));
            bool2 = true;
            bool1 = bool2;
          }
        }
        this.iWW.setImageResource(h.Tp);
        this.iWU.setImageResource(h.Sy);
        localView = this.efu;
        i2 = 0;
        if (!bool1)
          break label1142;
      }
      break;
    case 0:
    case 4:
    case 3:
    case 6:
    }
    while (true)
    {
      localView.setVisibility(i2);
      return bool1;
      this.eyZ.setText(n.bUc);
      this.eTE.setVisibility(8);
      this.iWS.setVisibility(8);
      this.iWX.setVisibility(8);
      this.eyY.setVisibility(0);
      this.efu.setOnClickListener(new ah(this));
      bool1 = true;
      break;
      this.eyZ.setText(n.bUa);
      this.eTE.setVisibility(8);
      this.iWS.setVisibility(8);
      this.iWX.setVisibility(0);
      this.eyY.setVisibility(0);
      bool1 = true;
      break;
      this.eyZ.setText(n.bUf);
      this.eTE.setVisibility(8);
      this.iWS.setVisibility(8);
      this.iWX.setVisibility(8);
      this.eyY.setVisibility(0);
      this.efu.setOnClickListener(new ai(this));
      bool1 = true;
      break;
      this.eyZ.setText(n.bUd);
      this.eTE.setText(((Context)this.hCe.get()).getString(n.bUe));
      this.eTE.setVisibility(0);
      this.iWS.setVisibility(8);
      this.iWX.setVisibility(8);
      this.eyY.setVisibility(0);
      this.efu.setOnClickListener(new aj(this));
      bool1 = true;
      break;
      if ((bg.qW().oJ()) && (av.eo(bg.qW().oK())))
      {
        bg.qX().d(new av(bg.qW().oK()));
        break label248;
      }
      if ((!bg.qW().oJ()) || (ap.jb(av.dSu)))
        break label248;
      this.efu.setBackgroundResource(h.abW);
      int j = ((Context)this.hCe.get()).getResources().getDimensionPixelSize(g.PH);
      this.efu.setPadding(5 * (j / 3), 0, j, 0);
      int k = ((Context)this.hCe.get()).getResources().getDimensionPixelSize(g.Py);
      int m = ((Context)this.hCe.get()).getResources().getDimensionPixelSize(g.PO);
      this.iRc.setPadding(k, 0, m, 0);
      this.eyZ.setVisibility(8);
      this.eTE.setVisibility(8);
      this.iRc.setVisibility(0);
      this.iRc.setText(av.dSu);
      this.iWS.setVisibility(8);
      this.iWX.setVisibility(8);
      label977: int n;
      label1010: TextView localTextView;
      if (av.CK() == 1)
      {
        this.eyY.setImageResource(h.aca);
        this.eyY.setVisibility(0);
        this.iWV.setVisibility(8);
        ImageView localImageView = this.iWW;
        if (!x.CE())
          break label1114;
        n = 8;
        localImageView.setVisibility(n);
        localTextView = this.iWT;
        if (!x.CE())
          break label1120;
      }
      label1114: label1120: for (int i1 = 8; ; i1 = 0)
      {
        localTextView.setVisibility(i1);
        this.efu.setOnClickListener(new ak(this));
        bool1 = true;
        break;
        if (av.CK() == 2)
        {
          this.eyY.setImageResource(h.abZ);
          break label977;
        }
        if (av.CK() == 3)
        {
          this.eyY.setImageResource(h.abY);
          break label977;
        }
        this.eyY.setImageResource(h.abX);
        break label977;
        n = 0;
        break label1010;
      }
      label1126: this.iWU.setVisibility(8);
      bool2 = bool1;
      break label423;
      label1142: i2 = 8;
    }
  }

  public final int getLayoutId()
  {
    return k.bkj;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.b.ag
 * JD-Core Version:    0.6.2
 */