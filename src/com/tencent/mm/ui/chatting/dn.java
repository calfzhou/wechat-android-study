package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.f.a;
import com.tencent.mm.f.e;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.pluginsdk.e.m;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.o;
import java.util.Map;

final class dn extends cj
{
  private hd joF;

  public dn()
  {
    super(40);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, k.bco);
      mh localmh = new mh(this.fjl);
      localmh.juF = ((ChattingItemDyeingTemplateTopView)paramView.findViewById(com.tencent.mm.i.aTt));
      localmh.eWo = ((CheckBox)paramView.findViewById(com.tencent.mm.i.alk));
      localmh.gzU = paramView.findViewById(com.tencent.mm.i.alP);
      localmh.eTC = ((TextView)paramView.findViewById(com.tencent.mm.i.amj));
      localmh.fKm = ((LinearLayout)paramView.findViewById(com.tencent.mm.i.alr));
      localmh.juG.fPs = paramView.findViewById(com.tencent.mm.i.aTq);
      localmh.juG.fpj = ((TextView)localmh.juG.fPs.findViewById(com.tencent.mm.i.title));
      localmh.juG.fqc = ((TextView)localmh.juG.fPs.findViewById(com.tencent.mm.i.time));
      localmh.juG.juH = ((LinearLayout)localmh.juG.fPs.findViewById(com.tencent.mm.i.apP));
      localmh.juG.jmT = ((TextView)localmh.fKm.findViewById(com.tencent.mm.i.apH));
      localmh.jmn = ((ImageView)paramView.findViewById(com.tencent.mm.i.alE));
      paramView.setTag(localmh);
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    this.joF = paramhd;
    mh localmh = (mh)paramck;
    Map localMap = x.bB(paramar.getContent(), "msg");
    if ((localMap == null) || (localMap.size() == 0))
    {
      z.e("!56@/B4Tb64lLpKwUcOR+EdWcjyP8/QmpjlsrHIBTrXA0DHnlo26kanXYQ==", "filling fail, values is empty");
      localmh.fKm.setVisibility(8);
      localmh.juG.fPs.setVisibility(8);
      return;
    }
    localmh.fKm.setVisibility(0);
    localmh.juG.fPs.setVisibility(0);
    mg localmg = new mg();
    localmg.title = ((String)localMap.get(".msg.appmsg.mmreader.category.item.title"));
    localmg.url = ((String)localMap.get(".msg.appmsg.mmreader.category.item.url"));
    localmg.dRW = ((String)localMap.get(".msg.appmsg.mmreader.category.item.shorturl"));
    localmg.dRX = ((String)localMap.get(".msg.appmsg.mmreader.category.item.longurl"));
    localmg.time = ch.getLong((String)localMap.get(".msg.appmsg.mmreader.category.item.pub_time"), 0L);
    localmg.djy = ((String)localMap.get(".msg.appmsg.mmreader.category.item.cover"));
    localmg.dRY = ((String)localMap.get(".msg.appmsg.mmreader.category.item.tweetid"));
    localmg.djA = ((String)localMap.get(".msg.appmsg.mmreader.category.item.digest"));
    localmg.type = ch.getInt((String)localMap.get(".msg.appmsg.mmreader.category.item.itemshowtype"), 0);
    localmg.juE = ((String)localMap.get(".msg.appmsg.template_id"));
    if (ch.jb(localmg.url))
      localmh.juG.jmT.setVisibility(8);
    while (true)
    {
      localmh.juG.fpj.setText(localmg.title);
      localmh.juG.fqc.setText(m.n(paramhd.getString(n.bKc), localmg.time));
      do.a(localmh.juF, localMap);
      do.a(localmh.juG.juH, localMap);
      String str1 = ch.ja((String)localMap.get(".msg.fromusername"));
      boolean bool = ch.jb(str1);
      String str2 = null;
      if (!bool)
        str2 = bg.qW().oT().ys(str1).oc();
      localmh.juG.fPs.setTag(new ms(paramar, false, paramInt, localmg.url, 6, false, paramhd.aVW(), str1, str2, localmg.title));
      localmh.juG.fPs.setOnClickListener(paramhd.joh.jqc);
      localmh.juG.fPs.setOnLongClickListener(paramhd.joh.jqe);
      if (!e.os().ok())
        break;
      localmh.jmn.setVisibility(0);
      c(paramhd, localmh.jmn, new ou(localmg.juE, paramar));
      return;
      localmh.juG.jmT.setVisibility(0);
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    ms localms = (ms)paramView.getTag();
    if (localms == null)
      return false;
    int i = localms.position;
    if (!this.joF.aVS())
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(n.bzz));
    return true;
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    return false;
  }

  protected final boolean aUQ()
  {
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dn
 * JD-Core Version:    0.6.2
 */