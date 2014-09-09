package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.ai.d;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.g;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.platformtools.s;
import com.tencent.mm.pluginsdk.e.m;
import com.tencent.mm.pluginsdk.model.v;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.CustomFitTextView;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class dj extends cl
{
  private int fPp = 0;
  private int fPq = 0;
  private hd joF;
  private boolean joS = false;
  private int joT = 0;

  public dj()
  {
    super(26);
  }

  private static String a(com.tencent.mm.storage.ar paramar, Context paramContext, int paramInt)
  {
    if (paramContext == null)
    {
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcnV0HAtjP+spb90wXEMFBs0=", "getReaderAppMsgContent: context is null");
      return null;
    }
    if (paramar == null)
    {
      z.w("!44@/B4Tb64lLpKwUcOR+EdWcnV0HAtjP+spb90wXEMFBs0=", "getReaderAppMsgContent: msg is null");
      return null;
    }
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(paramContext);
      return null;
    }
    try
    {
      com.tencent.mm.ai.c localc = com.tencent.mm.ai.b.jd(paramar.getContent());
      LinkedList localLinkedList = localc.dRV;
      if ((localLinkedList != null) && (localLinkedList.size() > 0) && (paramInt < localLinkedList.size()))
      {
        d locald = (d)localLinkedList.get(paramInt);
        com.tencent.mm.ai.b localb = new com.tencent.mm.ai.b();
        localb.title = locald.title;
        localb.description = locald.djA;
        localb.diE = "view";
        localb.type = 5;
        localb.url = locald.url;
        localb.cNM = localc.cNM;
        localb.cNN = localc.cNN;
        localb.ddY = localc.ddY;
        localb.thumburl = locald.djy;
        String str = com.tencent.mm.ai.b.b(localb);
        return str;
      }
    }
    catch (Exception localException)
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localException.getLocalizedMessage();
      z.e("!44@/B4Tb64lLpKwUcOR+EdWcnV0HAtjP+spb90wXEMFBs0=", "retransmit app msg error : %s", arrayOfObject);
    }
    return null;
  }

  private void cs(Context paramContext)
  {
    this.fPp = paramContext.getResources().getDimensionPixelSize(g.PO);
    this.fPq = paramContext.getResources().getDimensionPixelSize(g.PA);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bcl);
      am localam = new am(this.fjl);
      localam.eTC = ((TextView)paramView.findViewById(i.amj));
      localam.fKm = ((LinearLayout)paramView.findViewById(i.alr));
      localam.jmR.fPs = paramView.findViewById(i.aTq);
      localam.jmR.fpj = ((TextView)localam.jmR.fPs.findViewById(i.title));
      localam.jmR.fqc = ((TextView)localam.jmR.fPs.findViewById(i.time));
      localam.jmR.fPu = ((ImageView)localam.jmR.fPs.findViewById(i.aoZ));
      localam.jmR.jmS = localam.jmR.fPs.findViewById(i.apb);
      localam.jmR.fPB = ((ViewGroup)localam.jmR.fPs.findViewById(i.aTf));
      localam.jmR.fPB.setBackgroundColor(2130706432);
      localam.jmR.fPD = ((CustomFitTextView)localam.jmR.fPs.findViewById(i.aTk));
      localam.jmR.fPP = ((TextView)localam.jmR.fPs.findViewById(i.apO));
      localam.jmR.jmT = ((TextView)localam.fKm.findViewById(i.apH));
      localam.jmR.fPw = ((ProgressBar)paramView.findViewById(i.ayY));
      localam.jmR.fPx = paramView.findViewById(i.aqe);
      localam.eWo = ((CheckBox)paramView.findViewById(i.alk));
      localam.gzU = paramView.findViewById(i.alP);
      localam.jlV = ((TextView)paramView.findViewById(i.akP));
      localam.jmm = ((ChattingItemFooter)paramView.findViewById(i.auq));
      paramView.setTag(localam);
    }
    cs(paramLayoutInflater.getContext());
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, com.tencent.mm.storage.ar paramar, String paramString)
  {
    this.joF = paramhd;
    cs(paramhd.agh());
    am localam = (am)paramck;
    Iterator localIterator = localam.fPF.iterator();
    while (localIterator.hasNext())
    {
      al localal2 = (al)localIterator.next();
      localam.fKm.removeView(localal2.fPs);
    }
    localam.fPF.clear();
    com.tencent.mm.ai.c localc = com.tencent.mm.ai.b.jd(paramar.getContent());
    String str1 = localc.ddY;
    if ((str1 == null) || (str1.length() == 0))
      localam.jlV.setVisibility(8);
    LinkedList localLinkedList;
    int i;
    while (true)
    {
      localLinkedList = localc.dRV;
      i = localLinkedList.size();
      if (i != 0)
        break;
      localam.fKm.setVisibility(8);
      localam.jmR.fPs.setVisibility(8);
      return;
      localam.jlV.setVisibility(0);
      b(paramhd, localam.jlV, ms.Cr(str1));
    }
    localam.fKm.setVisibility(0);
    localam.jmR.fPs.setVisibility(0);
    boolean bool = localam.jmm.a(localc.dRn, paramar.kt(), true);
    LayoutInflater localLayoutInflater = paramhd.h().getLayoutInflater();
    for (int j = 2 + localam.fPF.size(); j < i; j++)
      localam.ax(localLayoutInflater.inflate(k.bcm, null));
    if (i > 1)
    {
      if (bool)
        localam.ax(localLayoutInflater.inflate(k.bcm, null));
      while (true)
      {
        localam.jmR.fPs.setBackgroundResource(h.Zu);
        localam.jmR.fPs.setPadding(this.fPp, this.fPp, this.fPp, this.fPp);
        this.joS = true;
        for (int k = 0; k < localam.fPF.size(); k++)
          ((al)localam.fPF.get(k)).fPs.setVisibility(8);
        localam.ax(localLayoutInflater.inflate(k.bcn, null));
      }
    }
    if (bool)
    {
      localam.jmR.fPs.setBackgroundResource(h.Zu);
      localam.jmR.fPs.setPadding(this.fPp, this.fPp, this.fPp, this.fPp);
    }
    while (true)
    {
      this.joS = false;
      break;
      localam.jmR.fPs.setBackgroundResource(h.Zw);
      localam.jmR.fPs.setPadding(this.fPq, this.fPq, this.fPq, 0);
    }
    int m = 0;
    label518: d locald;
    int n;
    label564: int i1;
    label591: int i2;
    label618: int i3;
    label645: int i4;
    label671: String str3;
    if (m < i)
    {
      locald = (d)localLinkedList.get(m);
      if (m != 0)
        break label1182;
      TextView localTextView1 = localam.jmR.fPP;
      if (i <= 1)
        break label1007;
      n = 8;
      localTextView1.setVisibility(n);
      TextView localTextView2 = localam.jmR.jmT;
      if (i <= 1)
        break label1013;
      i1 = 8;
      localTextView2.setVisibility(i1);
      TextView localTextView3 = localam.jmR.fpj;
      if (i <= 1)
        break label1036;
      i2 = 8;
      localTextView3.setVisibility(i2);
      TextView localTextView4 = localam.jmR.fqc;
      if (i <= 1)
        break label1042;
      i3 = 8;
      localTextView4.setVisibility(i3);
      ViewGroup localViewGroup = localam.jmR.fPB;
      if (i <= 1)
        break label1048;
      i4 = 0;
      localViewGroup.setVisibility(i4);
      localam.jmR.fPw.setVisibility(8);
      localam.jmR.fPx.setVisibility(8);
      if (ap.jb(locald.djy))
        break label1055;
      localam.jmR.jmS.setVisibility(0);
      localam.jmR.fPu.setVisibility(0);
      Bitmap localBitmap2 = s.a(new v(locald.djy, paramar.getType(), "@T", false));
      localam.jmR.fPu.setImageBitmap(localBitmap2);
      label778: localam.jmR.fPP.setText(locald.djA);
      localam.jmR.fpj.setText(locald.title);
      localam.jmR.fqc.setText(m.n(paramhd.getString(n.bKc), locald.time));
      localam.jmR.fPD.d(locald.title, false, -1);
      str3 = paramhd.Co(locald.url);
      if (TextUtils.isEmpty(str3))
        break label1136;
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcnV0HAtjP+spb90wXEMFBs0=", "productId:%s", new Object[] { str3 });
    }
    label1007: label1136: for (ms localms2 = new ms(paramar, false, paramInt, locald.url, 8, this.joS, paramhd.aVW(), localc.cNM, localc.cNN, locald.title, str3, null); ; localms2 = new ms(paramar, false, paramInt, locald.url, 6, this.joS, paramhd.aVW(), localc.cNM, localc.cNN, locald.title))
    {
      localms2.fcD = paramar.kl();
      localms2.hmV = 0;
      localam.jmR.fPs.setTag(localms2);
      localam.jmR.fPs.setOnClickListener(paramhd.joh.jqc);
      localam.jmR.fPs.setOnLongClickListener(paramhd.joh.jqe);
      m++;
      break label518;
      break;
      n = 0;
      break label564;
      label1013: if (ap.jb(locald.url))
      {
        i1 = 4;
        break label591;
      }
      i1 = 0;
      break label591;
      i2 = 0;
      break label618;
      i3 = 0;
      break label645;
      i4 = 8;
      break label671;
      localam.jmR.jmS.setVisibility(8);
      localam.jmR.fPu.setVisibility(8);
      localam.jmR.fqc.setVisibility(8);
      localam.jmR.fPB.setVisibility(8);
      localam.jmR.fpj.setVisibility(0);
      localam.jmR.fpj.setTextSize(20.0F);
      break label778;
    }
    label1036: label1042: label1048: label1055: al localal1 = (al)localam.fPF.get(m - 1);
    label1182: localal1.fpj.setText(locald.title);
    localal1.fPw.setVisibility(8);
    localal1.fPx.setVisibility(8);
    label1290: String str2;
    if (!ap.jb(locald.djy))
    {
      Bitmap localBitmap1 = s.a(new v(locald.djy, paramar.getType(), "@S", false));
      localal1.fPu.setImageBitmap(localBitmap1);
      localal1.fPu.setVisibility(0);
      if ((!ap.jb(locald.djA)) && (locald.type == 3))
      {
        localal1.jmQ.setText(locald.djA);
        localal1.jmQ.setVisibility(0);
      }
      localal1.fPs.setVisibility(0);
      str2 = paramhd.Co(locald.url);
      if (TextUtils.isEmpty(str2))
        break label1496;
      z.d("!44@/B4Tb64lLpKwUcOR+EdWcnV0HAtjP+spb90wXEMFBs0=", "productId:%s", new Object[] { str2 });
    }
    label1496: for (ms localms1 = new ms(paramar, false, paramInt, locald.url, 8, this.joS, paramhd.aVW(), localc.cNM, localc.cNN, locald.title, str2, null); ; localms1 = new ms(paramar, false, paramInt, locald.url, 6, this.joS, paramhd.aVW(), localc.cNM, localc.cNN))
    {
      localms1.fcD = paramar.kl();
      localms1.hmV = m;
      localal1.fPs.setTag(localms1);
      localal1.fPs.setOnClickListener(paramhd.joh.jqc);
      localal1.fPs.setOnLongClickListener(paramhd.joh.jqe);
      break;
      localal1.fPt.setVisibility(8);
      break label1290;
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, com.tencent.mm.storage.ar paramar)
  {
    ms localms = (ms)paramView.getTag();
    if (localms == null)
      return false;
    this.joT = localms.hmV;
    int i = localms.position;
    if ((!localms.juX) && (r.uQ()) && (!this.joF.aVS()))
      paramContextMenu.add(i, 114, 0, paramView.getContext().getString(n.bzv));
    if (!this.joF.aVS())
      paramContextMenu.add(i, 111, 0, paramView.getContext().getString(n.cag));
    if (com.tencent.mm.am.a.to("favorite"))
      paramContextMenu.add(i, 125, 0, paramView.getContext().getString(n.bUO));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, com.tencent.mm.storage.ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 111:
    case 114:
      String str1;
      do
      {
        String str2;
        do
        {
          return false;
          str2 = a(paramar, paramhd.agh(), this.joT);
        }
        while (ap.jb(str2));
        Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
        localIntent.putExtra("Retr_Msg_content", str2);
        localIntent.putExtra("Retr_Msg_Type", 2);
        localIntent.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.joT);
        localIntent.putExtra("Retr_Msg_Id", paramar.kk());
        paramhd.startActivity(localIntent);
        return false;
        str1 = a(paramar, paramhd.agh(), 0);
      }
      while (ap.jb(str1));
      ng.c(paramar, str1, paramhd.agh());
      return false;
    case 125:
    }
    com.tencent.mm.c.a.ar localar = new com.tencent.mm.c.a.ar();
    localar.cHU.cHZ = this.joT;
    if ((com.tencent.mm.pluginsdk.model.c.a(localar, paramar)) && (localar.cHV.ret == 0))
    {
      com.tencent.mm.sdk.c.a.aGB().g(localar);
      e.aw(paramhd.agh(), paramhd.getString(n.bHR));
      return false;
    }
    e.b(paramhd.agh(), localar.cHU.type, n.bHn);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, com.tencent.mm.storage.ar paramar)
  {
    return false;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dj
 * JD-Core Version:    0.6.2
 */