package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.c.a.eu;
import com.tencent.mm.c.a.if;
import com.tencent.mm.h;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.pluginsdk.model.app.bf;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.model.v;
import com.tencent.mm.pluginsdk.ui.chat.be;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.ShowImageUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ap;

final class dc extends cm
{
  private hd joF;
  private View joO;
  private int joP;

  public dc(int paramInt)
  {
    super(paramInt);
  }

  private static void a(t paramt, ar paramar)
  {
    if ((paramar.getStatus() == 2) && (cR(paramar.kk())))
      if (paramt.jms != null)
        paramt.jms.setVisibility(0);
    while (paramt.jms == null)
      return;
    paramt.jms.setVisibility(8);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof t)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcM);
      paramView.setTag(new t(this.fjl).f(paramView, false));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    t localt = (t)paramck;
    this.joF = paramhd;
    String str1 = ch.xw(paramar.getContent());
    if (str1 != null);
    for (com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.V(str1, paramar.ku()); ; localb = null)
    {
      ms localms = new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0);
      com.tencent.mm.pluginsdk.model.app.k localk;
      String str2;
      label227: label241: boolean bool;
      if (localb != null)
      {
        localk = l.F(localb.appId, true);
        localt.eyZ.setText(localb.title);
        localt.eTE.setText(localb.description);
        if ((localk != null) && (localk.field_appName != null) && (localk.field_appName.trim().length() > 0))
          break label587;
        str2 = localb.appName;
        if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str2)))
          break label614;
        localt.eTF.setText(l.a(paramhd.agh(), localk, str2));
        localt.eTF.setVisibility(0);
        if ((localk == null) || (!localk.avN()))
          break label597;
        TextView localTextView2 = localt.eTF;
        String str3 = localk.field_packageName;
        a(paramhd, localTextView2, paramar, localb, str3);
        a(paramhd, localt.eTF, localb.appId);
        bool = false;
        localt.eWm.setVisibility(0);
        if (!this.hMJ)
          break label721;
        Bitmap localBitmap13 = ap.yg().a(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), false);
        if ((localBitmap13 == null) || (localBitmap13.isRecycled()))
          break label715;
        localt.eWm.setImageBitmap(localBitmap13);
        label304: localt.jml.setOnClickListener(null);
        switch (localb.type)
        {
        case 1:
        case 2:
        case 8:
        case 9:
        case 11:
        case 12:
        case 14:
        case 17:
        case 18:
        default:
          localt.jmi.setVisibility(8);
          if (bool)
          {
            Bitmap localBitmap12 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
            if ((localBitmap12 == null) || (localBitmap12.isRecycled()))
              break label2794;
            localt.eWm.setImageBitmap(localBitmap12);
          }
          break;
        case 3:
        case 6:
        case 4:
        case 5:
        case 7:
        case 10:
        case 13:
        case 20:
        case 0:
        case 15:
        case 16:
        case 19:
        }
      }
      int i;
      while (true)
      {
        i = com.tencent.mm.pluginsdk.model.app.s.vc(str1);
        if ((i != -1) && (i < 100) && (localb.dQW > 0))
          break label2808;
        localt.eSF.setVisibility(8);
        localt.joC.setTag(localms);
        localt.joC.setOnClickListener(paramhd.joh.jqc);
        if (this.hMJ)
          localt.joC.setOnLongClickListener(paramhd.joh.jqe);
        a(paramInt, localt, paramar, paramhd.joh.dnT, paramhd.iWI, paramhd.joh.jqc);
        return;
        label587: str2 = localk.field_appName;
        break;
        label597: a(paramhd, localt.eTF, localb.appId);
        break label227;
        label614: if (!ch.jb(localb.cNN))
        {
          localt.eTF.setText(localb.cNN);
          localt.eTF.setCompoundDrawables(null, null, null, null);
          localt.eTF.setVisibility(0);
          be localbe = new be();
          localbe.username = localb.cNM;
          localbe.hEp = localb.cNN;
          a(paramhd, localt.eTF, localbe);
          break label241;
        }
        localt.eTF.setVisibility(8);
        break label241;
        label715: bool = true;
        break label304;
        label721: localt.eWm.setImageBitmap(BitmapFactory.decodeResource(paramhd.getResources(), h.Xr));
        bool = false;
        break label304;
        if ((localb.title != null) && (localb.title.length() > 0))
        {
          localt.eyZ.setVisibility(0);
          label773: localt.eTE.setVisibility(0);
          localt.jmi.setVisibility(8);
          localt.jmj.setVisibility(4);
          localt.eTE.setMaxLines(2);
          localt.jml.setVisibility(0);
          if (paramck.joE != paramar.kk())
            break label970;
          localt.jml.setImageResource(h.Xc);
        }
        Bitmap localBitmap11;
        while (true)
        {
          ft localft = new ft();
          localft.cDM = paramar.kk();
          localft.cPq = paramar.getContent();
          localft.dnQ = paramar.kp();
          localt.jml.setTag(localft);
          localt.jml.setOnClickListener(paramhd.joh.jqk);
          if (!bool)
            break;
          localBitmap11 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
          if ((localBitmap11 != null) && (!localBitmap11.isRecycled()))
            break label984;
          localt.eWm.setImageResource(h.QV);
          break;
          localt.eyZ.setVisibility(8);
          break label773;
          label970: localt.jml.setImageResource(h.Xd);
        }
        label984: localt.eWm.setImageBitmap(localBitmap11);
        continue;
        if ((localb.title != null) && (localb.title.length() > 0))
        {
          localt.eyZ.setVisibility(0);
          localt.eyZ.setMaxLines(2);
        }
        while (true)
        {
          localt.eTE.setVisibility(0);
          localt.jmi.setVisibility(8);
          localt.jmj.setVisibility(4);
          localt.eTE.setMaxLines(2);
          localt.eTE.setText(ch.Z(localb.dQW));
          localt.jml.setVisibility(8);
          if (!bool)
            break;
          if (ch.xH(localb.dQX))
            break label2794;
          localt.eWm.setImageResource(com.tencent.mm.pluginsdk.model.s.uT(localb.dQX));
          break;
          localt.eyZ.setVisibility(8);
        }
        label1174: Bitmap localBitmap10;
        if ((localb.title != null) && (localb.title.length() > 0))
        {
          localt.eyZ.setVisibility(0);
          localt.eTE.setVisibility(0);
          localt.jmi.setVisibility(8);
          localt.eTE.setMaxLines(2);
          localt.jmj.setVisibility(4);
          localt.jml.setVisibility(0);
          localt.jml.setImageResource(h.acG);
          if (bool)
          {
            localBitmap10 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
            if ((localBitmap10 == null) || (localBitmap10.isRecycled()))
              localt.eWm.setImageResource(h.QY);
          }
        }
        else
        {
          while (true)
          {
            localt.jml.setVisibility(8);
            break;
            localt.eyZ.setVisibility(8);
            break label1174;
            localt.eWm.setImageBitmap(localBitmap10);
          }
          localt.eyZ.setVisibility(8);
          label1368: Bitmap localBitmap8;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localt.jmi.setVisibility(0);
            localt.jmi.setText(localb.title);
            localt.eTE.setMaxLines(4);
            localt.jmj.setVisibility(4);
            localt.jml.setVisibility(8);
            if (bool)
            {
              localBitmap8 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
              if (localBitmap8 != null)
                break label1508;
              Bitmap localBitmap9 = com.tencent.mm.platformtools.s.a(new v(localb.thumburl, paramar.getType(), "@S", false));
              if (localBitmap9 == null)
                break label1494;
              localt.eWm.setImageBitmap(localBitmap9);
            }
          }
          while (aUS())
          {
            a(localt, paramar);
            break;
            localt.jmi.setVisibility(8);
            break label1368;
            label1494: localt.eWm.setImageResource(h.QW);
            continue;
            label1508: if (localBitmap8.isRecycled())
              localt.eWm.setImageResource(h.QW);
            else
              localt.eWm.setImageBitmap(localBitmap8);
          }
          localt.eyZ.setVisibility(8);
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localt.jmi.setVisibility(0);
            localt.jmi.setText(localb.title);
          }
          Bitmap localBitmap7;
          while (true)
          {
            localt.eTE.setMaxLines(3);
            localt.jmj.setVisibility(0);
            localt.jml.setVisibility(8);
            if (!bool)
              break;
            localBitmap7 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
            if ((localBitmap7 != null) && (!localBitmap7.isRecycled()))
              break label1685;
            localt.eWm.setImageResource(h.QW);
            break;
            localt.jmi.setVisibility(8);
          }
          label1685: localt.eWm.setImageBitmap(localBitmap7);
          continue;
          if ((localb.title != null) && (localb.title.length() > 0))
          {
            localt.eyZ.setVisibility(0);
            localt.eyZ.setText(localb.title);
            localt.jmi.setVisibility(8);
          }
          localt.eTE.setMaxLines(4);
          localt.jmj.setVisibility(4);
          localt.jml.setVisibility(8);
          if (bool)
          {
            Bitmap localBitmap6 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
            if ((localBitmap6 != null) && (!localBitmap6.isRecycled()))
            {
              localt.eWm.setImageBitmap(localBitmap6);
            }
            else
            {
              localt.eWm.setImageResource(h.QW);
              continue;
              localt.eyZ.setVisibility(0);
              localt.eyZ.setText(localb.title);
              localt.jmi.setVisibility(0);
              localt.jmi.setText(com.tencent.mm.n.bRG);
              localt.eTE.setMaxLines(4);
              localt.jmj.setVisibility(4);
              localt.jml.setVisibility(8);
              if (bool)
              {
                Bitmap localBitmap5 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
                if ((localBitmap5 != null) && (!localBitmap5.isRecycled()))
                {
                  localt.eWm.setImageBitmap(localBitmap5);
                }
                else
                {
                  localt.eWm.setImageResource(h.QW);
                  continue;
                  if ((localb.title != null) && (localb.title.length() > 0))
                  {
                    localt.eyZ.setVisibility(0);
                    localt.eyZ.setText(localb.title);
                    localt.jmi.setVisibility(8);
                  }
                  localt.eTE.setMaxLines(4);
                  localt.jmj.setVisibility(4);
                  localt.jml.setVisibility(8);
                  if (bool)
                  {
                    Bitmap localBitmap4 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
                    if ((localBitmap4 != null) && (!localBitmap4.isRecycled()))
                    {
                      localt.eWm.setImageBitmap(localBitmap4);
                    }
                    else
                    {
                      localt.eWm.setImageResource(h.QW);
                      continue;
                      if ((localb.title != null) && (localb.title.length() > 0))
                        localt.eyZ.setVisibility(0);
                      Bitmap localBitmap3;
                      while (true)
                      {
                        localt.eTE.setVisibility(0);
                        localt.jmi.setVisibility(8);
                        localt.jmj.setVisibility(8);
                        localt.jml.setVisibility(4);
                        localt.eTE.setMaxLines(2);
                        if (!bool)
                          break;
                        localBitmap3 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
                        if ((localBitmap3 != null) && (!localBitmap3.isRecycled()))
                          break label2262;
                        localt.eWm.setImageResource(h.QW);
                        break;
                        localt.eyZ.setVisibility(8);
                      }
                      label2262: localt.eWm.setImageBitmap(localBitmap3);
                      continue;
                      label2303: Bitmap localBitmap2;
                      if ((localb.title != null) && (localb.title.length() > 0))
                      {
                        localt.eyZ.setVisibility(0);
                        localt.eTE.setVisibility(0);
                        localt.jmi.setVisibility(8);
                        localt.jml.setVisibility(8);
                        localt.jmj.setVisibility(4);
                        localt.eTE.setMaxLines(2);
                        if (bool)
                        {
                          localBitmap2 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
                          if ((localBitmap2 != null) && (!localBitmap2.isRecycled()))
                            break label2474;
                          localt.eWm.setImageResource(h.QW);
                        }
                      }
                      while (true)
                      {
                        localms = new ms(paramar, false, paramInt, "", 8, false, paramhd.aVW(), localb.cNM, localb.cNN, localb.title, localb.dRx, localb.url);
                        localt.joC.setTag(localms);
                        break;
                        localt.eyZ.setVisibility(8);
                        break label2303;
                        label2474: localt.eWm.setImageBitmap(localBitmap2);
                      }
                      localt.eyZ.setVisibility(0);
                      localt.eyZ.setText(localb.description);
                      localt.eTE.setText(localb.dRS);
                      if ((localb.title != null) && (localb.title.length() > 0))
                      {
                        localt.jmi.setVisibility(0);
                        localt.jmi.setText(localb.title);
                      }
                      while (true)
                      {
                        localt.eTE.setMaxLines(4);
                        localt.jmj.setVisibility(4);
                        localt.jml.setVisibility(8);
                        if (!bool)
                          break;
                        Bitmap localBitmap1 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
                        if (localBitmap1 == null)
                          break label2648;
                        localt.eWm.setImageBitmap(localBitmap1);
                        break;
                        localt.jmi.setVisibility(8);
                      }
                      label2648: localt.eWm.setImageResource(h.QW);
                      continue;
                      localt.eyZ.setVisibility(8);
                      if ((localb.title != null) && (localb.title.length() > 0))
                      {
                        localt.jmi.setVisibility(0);
                        localt.jmi.setText(localb.title);
                      }
                      while (true)
                      {
                        localt.eTE.setMaxLines(3);
                        localt.jmj.setVisibility(4);
                        localt.jml.setVisibility(8);
                        if (bool)
                          localt.eWm.setVisibility(8);
                        t.a(localt, localb, bool);
                        if (!aUS())
                          break;
                        a(localt, paramar);
                        break;
                        localt.jmi.setVisibility(8);
                      }
                      label2794: localt.eWm.setImageResource(h.RY);
                    }
                  }
                }
              }
            }
          }
        }
      }
      label2808: localt.eSF.setVisibility(0);
      this.joO = localt.eSF;
      if (this.joO.getWidth() != 0)
        this.joP = this.joO.getWidth();
      TextView localTextView1 = localt.jmk;
      Activity localActivity = paramhd.agh();
      int j = i * this.joP / 100;
      int k = com.tencent.mm.platformtools.b.a(localActivity, 15.0F);
      if (j < k);
      while (true)
      {
        localTextView1.setWidth(k);
        break;
        k = j;
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    String str = paramar.getContent();
    if (str == null)
      return true;
    com.tencent.mm.ai.b localb = com.tencent.mm.ai.b.iS(this.joF.at(str, paramar.jK()));
    if (localb == null)
      return true;
    com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, false);
    if (l.j(localk))
      paramContextMenu.add(i, 111, 0, this.joF.getString(com.tencent.mm.n.cag));
    boolean bool;
    switch (localb.type)
    {
    case 7:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    default:
      bool = false;
    case 3:
    case 8:
    case 6:
    case 2:
    case 1:
    case 5:
    case 4:
    case 16:
    }
    while (true)
    {
      if ((bool) && (!this.joF.aVS()))
        paramContextMenu.add(i, 114, 0, paramView.getContext().getString(com.tencent.mm.n.bzv));
      if ((com.tencent.mm.am.a.to("favorite")) && ((localk == null) || (!localk.avN())))
        switch (localb.type)
        {
        case 7:
        case 8:
        case 9:
        case 11:
        case 12:
        case 14:
        case 15:
        case 16:
        case 17:
        case 18:
        default:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 10:
        case 13:
        case 19:
        case 20:
        }
      while (true)
      {
        if (!this.joF.aVS())
          paramContextMenu.add(i, 100, 0, this.joF.getString(com.tencent.mm.n.bzz));
        return true;
        bool = r.uU();
        break;
        bool = r.uO();
        break;
        bool = r.uS();
        break;
        bool = r.uG();
        break;
        bool = r.uF();
        break;
        bool = r.uQ();
        break;
        bool = r.uI();
        break;
        if ((localb.dRT != 5) && (localb.dRT != 6) && (localb.dRT != 2))
          break label509;
        paramContextMenu.clear();
        paramContextMenu.add(i, 100, 0, this.joF.getString(com.tencent.mm.n.bzz));
        return false;
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(com.tencent.mm.n.bUO));
      }
      label509: bool = false;
    }
  }

  public final boolean a(MenuItem paramMenuItem, hd paramhd, ar paramar)
  {
    switch (paramMenuItem.getItemId())
    {
    default:
    case 100:
    case 111:
    case 114:
    case 103:
    }
    com.tencent.mm.ai.b localb1;
    do
    {
      String str1;
      do
      {
        com.tencent.mm.ai.b localb2;
        do
        {
          String str2;
          do
          {
            com.tencent.mm.ai.b localb4;
            com.tencent.mm.pluginsdk.model.app.k localk;
            do
            {
              return false;
              String str4 = ch.xw(paramar.getContent());
              localb4 = null;
              if (str4 != null)
                localb4 = com.tencent.mm.ai.b.iS(str4);
              if (localb4 != null)
              {
                com.tencent.mm.pluginsdk.model.app.s.vb(localb4.dQY);
                if (19 == localb4.type)
                {
                  if localif = new if();
                  localif.cMG.type = 3;
                  localif.cMG.cDM = paramar.kk();
                  com.tencent.mm.sdk.c.a.aGB().g(localif);
                }
              }
              bw.v(paramar.kk());
              localk = l.F(localb4.appId, false);
            }
            while ((localk == null) || (!localk.avN()));
            a(paramhd, localb4, paramar, localk);
            return false;
            String str3 = paramhd.at(paramar.getContent(), paramar.jK());
            Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
            localIntent.putExtra("Retr_Msg_content", str3);
            com.tencent.mm.ai.b localb3 = com.tencent.mm.ai.b.iS(str3);
            if ((localb3 != null) && (19 == localb3.type))
              localIntent.putExtra("Retr_Msg_Type", 10);
            while (true)
            {
              localIntent.putExtra("Retr_Msg_Id", paramar.kk());
              paramhd.startActivity(localIntent);
              return false;
              localIntent.putExtra("Retr_Msg_Type", 2);
            }
            str2 = ch.xw(paramar.getContent());
          }
          while (str2 == null);
          localb2 = com.tencent.mm.ai.b.iS(str2);
        }
        while (localb2 == null);
        switch (localb2.type)
        {
        case 7:
        default:
          return false;
        case 1:
          ng.m(paramhd.at(paramar.getContent(), paramar.jK()), paramhd.agh());
          return false;
        case 3:
          ng.a(paramar, paramhd.at(paramar.getContent(), paramar.jK()), paramhd.agh());
          return false;
        case 8:
          ng.d(paramar, paramhd.agh());
          return false;
        case 6:
          ng.b(paramar, paramhd.at(paramar.getContent(), paramar.jK()), paramhd.agh());
          return false;
        case 2:
          ng.b(paramar, paramhd.agh());
          return false;
        case 5:
          ng.c(paramar, paramhd.at(paramar.getContent(), paramar.jK()), paramhd.agh());
          return false;
        case 4:
        }
        ng.c(paramar, paramhd.agh());
        return false;
        str1 = ch.xw(paramar.getContent());
      }
      while (str1 == null);
      localb1 = com.tencent.mm.ai.b.iS(str1);
    }
    while (localb1 == null);
    switch (localb1.type)
    {
    default:
      return false;
    case 16:
    }
    eu localeu = new eu();
    localeu.cKj.cKk = localb1.cKk;
    localeu.cKj.cKl = paramar.kk();
    localeu.cKj.cKm = paramar.kt();
    com.tencent.mm.sdk.c.a.aGB().g(localeu);
    return false;
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    boolean bool1;
    if ((((ms)paramView.getTag()).fjl == 5) && (paramar.jK() == 1))
    {
      if (paramar != null)
        e.a(this.joF.agh(), this.joF.getString(com.tencent.mm.n.bAa), "", this.joF.getString(com.tencent.mm.n.bub), this.joF.getString(com.tencent.mm.n.bsK), new dd(this, paramar), new de(this));
      bool1 = true;
    }
    com.tencent.mm.ai.b localb;
    label435: label612: boolean bool3;
    label801: label809: label946: label956: 
    do
    {
      boolean bool4;
      do
      {
        boolean bool5;
        do
        {
          boolean bool6;
          do
          {
            do
            {
              String str1;
              do
              {
                return bool1;
                str1 = paramar.getContent();
                bool1 = false;
              }
              while (str1 == null);
              localb = com.tencent.mm.ai.b.iS(str1);
              bool1 = false;
            }
            while (localb == null);
            com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, true);
            if ((localk != null) && (!ch.jb(localk.field_appId)) && (localk.avN()))
              a(paramhd, localb, x.pG(), localk);
            boolean bool2 = ay(paramhd.agh(), localb.appId);
            String str8;
            String str9;
            PackageInfo localPackageInfo2;
            String str10;
            int k;
            switch (localb.type)
            {
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
            case 18:
            default:
              return false;
            case 3:
            case 4:
              str8 = u.a(localb.url, "message", bool2);
              str9 = u.a(localb.dQV, "message", bool2);
              localPackageInfo2 = ai(paramhd.agh(), localb.appId);
              str10 = null;
              if (localPackageInfo2 == null)
              {
                k = 0;
                if (localPackageInfo2 != null)
                  break label612;
              }
            case 6:
              while (true)
              {
                a(paramhd, str8, str9, str10, k, true, paramar.kk());
                return true;
                if (!bg.qW().isSDCardAvailable())
                {
                  en.cp(paramhd.agh());
                  return true;
                }
                if (ch.xH(localb.dQX))
                {
                  long l = paramar.kk();
                  String str7 = localb.dQY;
                  com.tencent.mm.pluginsdk.model.app.a locala = bf.GP().uU(str7);
                  int j = 0;
                  if (locala != null)
                  {
                    boolean bool7 = locala.sl();
                    j = 0;
                    if (bool7)
                      break label435;
                  }
                  while (j != 0)
                  {
                    return true;
                    if (bg.qW().oV().cV(l).aJL())
                    {
                      Intent localIntent8 = new Intent(this.joF.agh(), ResourcesExceedUI.class);
                      localIntent8.putExtra("clean_view_type", 1);
                      this.joF.startActivity(localIntent8);
                      j = 1;
                    }
                    else
                    {
                      Intent localIntent9 = new Intent(this.joF.agh(), ShowImageUI.class);
                      localIntent9.putExtra("key_image_path", locala.field_fileFullPath);
                      localIntent9.putExtra("key_message_id", l);
                      localIntent9.putExtra("key_favorite", true);
                      this.joF.startActivity(localIntent9);
                      j = 1;
                    }
                  }
                }
                Intent localIntent7 = new Intent(paramhd.agh(), AppAttachDownloadUI.class);
                localIntent7.putExtra("app_msg_id", paramar.kk());
                paramhd.startActivity(localIntent7);
                return true;
                str10 = localPackageInfo2.versionName;
                break;
                k = localPackageInfo2.versionCode;
              }
            case 5:
              String str3;
              PackageInfo localPackageInfo1;
              Intent localIntent6;
              String str6;
              int i;
              if ((localb.url != null) && (!localb.url.equals("")))
              {
                String str2 = localb.url;
                if (!paramhd.jom)
                  break label921;
                str3 = "groupmessage";
                String str4 = u.a(str2, str3, bool2);
                String str5 = localb.dQV;
                localPackageInfo1 = ai(paramhd.agh(), localb.appId);
                localIntent6 = new Intent();
                localIntent6.putExtra("rawUrl", str4);
                localIntent6.putExtra("webpageTitle", localb.title);
                if ((localb.appId != null) && ("wx751a1acca5688ba3".equals(localb.appId)))
                {
                  Bundle localBundle = new Bundle();
                  localBundle.putString("jsapi_args_appid", "wx751a1acca5688ba3");
                  localIntent6.putExtra("jsapiargs", localBundle);
                }
                if (ch.jb(str5))
                  break label929;
                localIntent6.putExtra("shortUrl", str5);
                if (localPackageInfo1 != null)
                  break label946;
                str6 = null;
                localIntent6.putExtra("version_name", str6);
                i = 0;
                if (localPackageInfo1 != null)
                  break label956;
              }
              while (true)
              {
                localIntent6.putExtra("version_code", i);
                if (!ch.jb(localb.cNM))
                {
                  localIntent6.putExtra("srcUsername", localb.cNM);
                  localIntent6.putExtra("srcDisplayname", localb.cNN);
                }
                localIntent6.putExtra("msg_id", paramar.kk());
                localIntent6.putExtra("geta8key_username", paramhd.aUL());
                com.tencent.mm.am.a.b(paramhd.agh(), "webview", ".ui.tools.WebViewUI", localIntent6);
                return true;
                str3 = "singlemessage";
                break;
                localIntent6.putExtra("shortUrl", localb.url);
                break label801;
                str6 = localPackageInfo1.versionName;
                break label809;
                i = localPackageInfo1.versionCode;
              }
            case 7:
              if ((localk != null) && (localk.avN()) && (a(paramhd, localk)))
                return true;
              paramhd.Q(paramar);
              return true;
            case 10:
              bool6 = ch.jb(localb.dRq);
              bool1 = false;
            case 20:
            case 13:
            case 16:
            case 19:
            }
          }
          while (bool6);
          Intent localIntent5 = new Intent();
          localIntent5.setFlags(65536);
          localIntent5.putExtra("key_Product_xml", localb.dRq);
          localIntent5.putExtra("key_ProductUI_getProductInfoScene", 1);
          if (paramar.kp() == null)
            localIntent5.putExtra("key_ProductUI_chatting_msgId", paramar.kk());
          com.tencent.mm.am.a.b(paramhd.agh(), "scanner", ".ui.ProductUI", localIntent5);
          return true;
          bool5 = ch.jb(localb.dRt);
          bool1 = false;
        }
        while (bool5);
        Intent localIntent4 = new Intent();
        localIntent4.setFlags(65536);
        localIntent4.putExtra("key_TV_xml", localb.dRt);
        localIntent4.putExtra("key_TV_getProductInfoScene", 1);
        if (paramar.kp() == null)
          localIntent4.putExtra("key_TVInfoUI_chatting_msgId", paramar.kk());
        com.tencent.mm.am.a.b(paramhd.agh(), "shake", ".ui.TVInfoUI", localIntent4);
        return true;
        bool4 = ch.jb(localb.dRw);
        bool1 = false;
      }
      while (bool4);
      Intent localIntent3 = new Intent();
      localIntent3.setFlags(65536);
      localIntent3.putExtra("key_product_info", localb.dRw);
      localIntent3.putExtra("key_product_scene", 1);
      com.tencent.mm.am.a.b(paramhd.agh(), "product", ".ui.MallProductUI", localIntent3);
      return true;
      bool3 = ch.jb(localb.cKk);
      bool1 = false;
    }
    while (bool3);
    label921: label929: Intent localIntent2 = new Intent();
    localIntent2.setFlags(65536);
    localIntent2.putExtra("key_card_app_msg", localb.cKk);
    localIntent2.putExtra("key_from_scene", localb.dRT);
    com.tencent.mm.am.a.b(paramhd.agh(), "card", ".ui.CardDetailUI", localIntent2);
    return true;
    Intent localIntent1 = new Intent();
    localIntent1.putExtra("message_id", paramar.kk());
    localIntent1.putExtra("record_xml", localb.dRu);
    com.tencent.mm.am.a.b(paramhd.agh(), "record", ".ui.RecordMsgDetailUI", localIntent1);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.dc
 * JD-Core Version:    0.6.2
 */