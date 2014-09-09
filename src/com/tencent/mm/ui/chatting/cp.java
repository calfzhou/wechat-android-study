package com.tencent.mm.ui.chatting;

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
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ai.b;
import com.tencent.mm.c.a.if;
import com.tencent.mm.h;
import com.tencent.mm.model.bw;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.u;
import com.tencent.mm.pluginsdk.ui.chat.be;
import com.tencent.mm.q.r;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ap;

final class cp extends cl
{
  private hd joF;
  private boolean joG;

  public cp(int paramInt)
  {
    super(paramInt);
  }

  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    if ((paramView == null) || (paramView.getTag() == null) || (!(paramView.getTag() instanceof t)) || (((ck)paramView.getTag()).type != this.fjl))
    {
      paramView = new dm(paramLayoutInflater, com.tencent.mm.k.bcr);
      paramView.setTag(new t(this.fjl).f(paramView, true));
    }
    return paramView;
  }

  public final void a(ck paramck, int paramInt, hd paramhd, ar paramar, String paramString)
  {
    t localt = (t)paramck;
    this.joF = paramhd;
    String str1 = paramar.getContent();
    if (this.joG)
    {
      int i = paramar.getContent().indexOf(':');
      if (i != -1)
        str1 = paramar.getContent().substring(i + 1);
    }
    String str2 = ch.xw(str1);
    b localb;
    ms localms;
    label164: com.tencent.mm.pluginsdk.model.app.k localk;
    String str3;
    label230: boolean bool;
    if (str2 != null)
    {
      localb = b.V(str2, paramar.ku());
      localms = new ms(paramar, paramhd.iWI, paramInt, null, 0, (byte)0);
      if (localb != null)
      {
        localt.eyZ.setText(localb.title);
        localt.eTE.setText(localb.description);
        if (!localt.jmm.a(localb.dRn, paramar.kt(), false))
          break label761;
        localt.joC.setBackgroundResource(h.TA);
        localk = l.F(localb.appId, true);
        if ((localk != null) && (localk.avN()))
          a(paramhd, localb, paramar);
        if ((localk != null) && (localk.field_appName != null) && (localk.field_appName.trim().length() > 0))
          break label775;
        str3 = localb.appName;
        if ((localb.appId == null) || (localb.appId.length() <= 0) || (!l.at(str3)))
          break label802;
        localt.eTF.setText(l.a(paramhd.agh(), localk, str3));
        localt.eTF.setVisibility(0);
        if ((localk == null) || (!localk.avN()))
          break label785;
        TextView localTextView = localt.eTF;
        String str4 = localk.field_packageName;
        a(paramhd, localTextView, paramar, localb, str4);
        label324: a(paramhd, localt.eTF, localb.appId);
        label338: bool = false;
        localt.eWm.setVisibility(0);
        if (!this.hMJ)
          break label909;
        Bitmap localBitmap12 = ap.yg().a(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), false);
        if ((localBitmap12 == null) || (localBitmap12.isRecycled()))
          break label903;
        localt.eWm.setImageBitmap(localBitmap12);
        label401: if ((localb.ddY != null) && (localb.ddY.length() != 0))
          break label933;
        localt.jlV.setVisibility(8);
        label430: localt.jml.setOnClickListener(null);
        localt.jmo.setVisibility(0);
        localt.jmj.setVisibility(0);
        localt.jmr.setVisibility(0);
        localt.jmp.setVisibility(8);
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
            Bitmap localBitmap11 = ap.yg().b(paramar.kp(), com.tencent.mm.aq.a.getDensity(paramhd.agh()), true);
            if ((localBitmap11 == null) || (localBitmap11.isRecycled()))
              break label2939;
            localt.eWm.setImageBitmap(localBitmap11);
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
    }
    while (true)
    {
      if (l.i(localk))
      {
        localt.jmn.setVisibility(0);
        c(paramhd, localt.jmn, ms.a(localb, paramar));
      }
      localt.joC.setTag(localms);
      localt.joC.setOnClickListener(paramhd.joh.jqc);
      if (this.hMJ)
        localt.joC.setOnLongClickListener(paramhd.joh.jqe);
      return;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Long.valueOf(paramar.kk());
      arrayOfObject[1] = paramString;
      z.e("!44@/B4Tb64lLpKwUcOR+EdWcmbiHpejF20a9Czvz9tPyQU=", "amessage, msgid:%s, user:%s", arrayOfObject);
      localb = null;
      break;
      label761: localt.joC.setBackgroundResource(h.Tw);
      break label164;
      label775: str3 = localk.field_appName;
      break label230;
      label785: a(paramhd, localt.eTF, localb.appId);
      break label324;
      label802: if (!ch.jb(localb.cNN))
      {
        localt.eTF.setText(localb.cNN);
        localt.eTF.setCompoundDrawables(null, null, null, null);
        localt.eTF.setVisibility(0);
        be localbe = new be();
        localbe.username = localb.cNM;
        localbe.hEp = localb.cNN;
        a(paramhd, localt.eTF, localbe);
        break label338;
      }
      localt.eTF.setVisibility(8);
      break label338;
      label903: bool = true;
      break label401;
      label909: localt.eWm.setImageBitmap(BitmapFactory.decodeResource(paramhd.getResources(), h.Xr));
      bool = false;
      break label401;
      label933: localt.jlV.setVisibility(0);
      b(paramhd, localt.jlV, ms.Cr(localb.ddY));
      break label430;
      label990: Bitmap localBitmap10;
      if ((localb.title != null) && (localb.title.length() > 0))
      {
        localt.eyZ.setVisibility(0);
        localt.eTE.setVisibility(0);
        localt.jmi.setVisibility(8);
        localt.jmj.setVisibility(4);
        localt.jml.setVisibility(0);
        if (paramck.joE != paramar.kk())
          break label1187;
        localt.jml.setImageResource(h.Xc);
        label1051: localt.eTE.setMaxLines(2);
        if (bool)
        {
          localBitmap10 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
          if ((localBitmap10 != null) && (!localBitmap10.isRecycled()))
            break label1201;
          localt.eWm.setImageResource(h.QV);
        }
      }
      while (true)
      {
        ft localft = new ft();
        localft.cDM = paramar.kk();
        localft.cPq = paramar.getContent();
        localft.dnQ = paramar.kp();
        localt.jml.setTag(localft);
        localt.jml.setOnClickListener(paramhd.joh.jqk);
        break;
        localt.eyZ.setVisibility(8);
        break label990;
        label1187: localt.jml.setImageResource(h.Xd);
        break label1051;
        label1201: localt.eWm.setImageBitmap(localBitmap10);
      }
      if ((localb.title != null) && (localb.title.length() > 0))
      {
        localt.eyZ.setVisibility(0);
        localt.eyZ.setMaxLines(2);
      }
      while (true)
      {
        localt.eTE.setVisibility(0);
        localt.jmi.setVisibility(8);
        localt.jml.setVisibility(8);
        localt.jmj.setVisibility(4);
        localt.eTE.setMaxLines(2);
        localt.eTE.setText(ch.Z(localb.dQW));
        if (!bool)
          break;
        if (ch.xH(ch.ja(localb.dQX).toLowerCase()))
          break label2939;
        localt.eWm.setImageResource(com.tencent.mm.pluginsdk.model.s.uT(localb.dQX));
        break;
        localt.eyZ.setVisibility(8);
      }
      label1397: Bitmap localBitmap9;
      if ((localb.title != null) && (localb.title.length() > 0))
      {
        localt.eyZ.setVisibility(0);
        localt.eTE.setVisibility(0);
        localt.jmi.setVisibility(8);
        localt.jml.setVisibility(0);
        localt.jml.setImageResource(h.acG);
        localt.jmj.setVisibility(4);
        localt.eTE.setMaxLines(2);
        if (bool)
        {
          localBitmap9 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
          if ((localBitmap9 == null) || (localBitmap9.isRecycled()))
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
          break label1397;
          localt.eWm.setImageBitmap(localBitmap9);
        }
        localt.eyZ.setVisibility(8);
        if ((localb.title != null) && (localb.title.length() > 0))
        {
          localt.jmi.setVisibility(0);
          localt.jmi.setText(localb.title);
        }
        Bitmap localBitmap8;
        while (true)
        {
          localt.eTE.setMaxLines(4);
          localt.jml.setVisibility(8);
          localt.jmj.setVisibility(4);
          if (!bool)
            break;
          localBitmap8 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
          if ((localBitmap8 != null) && (!localBitmap8.isRecycled()))
            break label1682;
          localt.eWm.setImageResource(h.QW);
          break;
          localt.jmi.setVisibility(8);
        }
        label1682: localt.eWm.setImageBitmap(localBitmap8);
        continue;
        localt.eyZ.setVisibility(8);
        if ((localb.title != null) && (localb.title.trim().length() > 0))
        {
          localt.jmi.setVisibility(0);
          localt.jmi.setText(localb.title);
        }
        Bitmap localBitmap7;
        while (true)
        {
          localt.eTE.setMaxLines(3);
          localt.jml.setVisibility(8);
          localt.jmj.setVisibility(0);
          if (!bool)
            break;
          localBitmap7 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
          if ((localBitmap7 != null) && (!localBitmap7.isRecycled()))
            break label1840;
          localt.eWm.setImageResource(h.QW);
          break;
          localt.jmi.setVisibility(8);
        }
        label1840: localt.eWm.setImageBitmap(localBitmap7);
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
                      localt.jml.setVisibility(8);
                      localt.jmj.setVisibility(4);
                      localt.eTE.setMaxLines(2);
                      if (!bool)
                        break;
                      localBitmap3 = l.b(localb.appId, 1, com.tencent.mm.aq.a.getDensity(paramhd.agh()));
                      if ((localBitmap3 != null) && (!localBitmap3.isRecycled()))
                        break label2417;
                      localt.eWm.setImageResource(h.QW);
                      break;
                      localt.eyZ.setVisibility(8);
                    }
                    label2417: localt.eWm.setImageBitmap(localBitmap3);
                    continue;
                    label2458: Bitmap localBitmap2;
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
                          break label2629;
                        localt.eWm.setImageResource(h.QW);
                      }
                    }
                    while (true)
                    {
                      localms = new ms(paramar, false, paramInt, "", 8, false, paramhd.aVW(), localb.cNM, localb.cNN, localb.title, localb.dRx, localb.url);
                      localt.joC.setTag(localms);
                      break;
                      localt.eyZ.setVisibility(8);
                      break label2458;
                      label2629: localt.eWm.setImageBitmap(localBitmap2);
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
                        break label2803;
                      localt.eWm.setImageBitmap(localBitmap1);
                      break;
                      localt.jmi.setVisibility(8);
                    }
                    label2803: localt.eWm.setImageResource(h.QW);
                    continue;
                    localt.eyZ.setVisibility(8);
                    if ((localb.title != null) && (localb.title.trim().length() > 0))
                    {
                      localt.jmi.setVisibility(0);
                      localt.jmi.setText(localb.title);
                    }
                    while (true)
                    {
                      localt.eTE.setMaxLines(3);
                      localt.jml.setVisibility(8);
                      localt.jmj.setVisibility(4);
                      if (bool)
                        localt.eWm.setVisibility(8);
                      t.a(localt, localb, bool);
                      break;
                      localt.jmi.setVisibility(8);
                    }
                    label2939: localt.eWm.setImageResource(h.RY);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean a(ContextMenu paramContextMenu, View paramView, ar paramar)
  {
    int i = ((ms)paramView.getTag()).position;
    int j = com.tencent.mm.pluginsdk.model.app.s.vc(this.joF.at(paramar.getContent(), paramar.jK()));
    b localb = b.iS(this.joF.at(paramar.getContent(), paramar.jK()));
    com.tencent.mm.pluginsdk.model.app.k localk = l.F(localb.appId, false);
    if (l.j(localk))
      paramContextMenu.add(i, 111, 0, this.joF.getString(com.tencent.mm.n.cag));
    boolean bool;
    if ((localb.dQW <= 0) || ((localb.dQW > 0) && (j >= 100)))
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
          break label533;
        paramContextMenu.clear();
        paramContextMenu.add(i, 100, 0, this.joF.getString(com.tencent.mm.n.bzz));
        return false;
        paramContextMenu.add(i, 116, 0, paramView.getContext().getString(com.tencent.mm.n.bUO));
      }
      label533: bool = false;
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
    }
    b localb1;
    do
    {
      String str1;
      do
      {
        b localb3;
        com.tencent.mm.pluginsdk.model.app.k localk;
        do
        {
          return false;
          String str3 = ch.xw(paramar.getContent());
          localb3 = null;
          if (str3 != null)
            localb3 = b.iS(str3);
          if (localb3 != null)
          {
            com.tencent.mm.pluginsdk.model.app.s.vb(localb3.dQY);
            if (19 == localb3.type)
            {
              if localif = new if();
              localif.cMG.type = 3;
              localif.cMG.cDM = paramar.kk();
              com.tencent.mm.sdk.c.a.aGB().g(localif);
            }
          }
          bw.v(paramar.kk());
          localk = l.F(localb3.appId, false);
        }
        while ((localk == null) || (!localk.avN()));
        a(paramhd, localb3, paramar, localk);
        return false;
        String str2 = paramhd.at(paramar.getContent(), paramar.jK());
        Intent localIntent = new Intent(paramhd.agh(), MsgRetransmitUI.class);
        localIntent.putExtra("Retr_Msg_content", str2);
        b localb2 = b.iS(str2);
        if ((localb2 != null) && (19 == localb2.type))
          localIntent.putExtra("Retr_Msg_Type", 10);
        while (true)
        {
          localIntent.putExtra("Retr_Msg_Id", paramar.kk());
          paramhd.startActivity(localIntent);
          return false;
          localIntent.putExtra("Retr_Msg_Type", 2);
        }
        str1 = ch.xw(paramar.getContent());
      }
      while (str1 == null);
      localb1 = b.iS(str1);
    }
    while (localb1 == null);
    switch (localb1.type)
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
  }

  public final boolean a(View paramView, hd paramhd, ar paramar)
  {
    int i = 1;
    String str1 = paramar.getContent();
    if (str1 == null)
      i = 0;
    b localb;
    com.tencent.mm.pluginsdk.model.app.k localk;
    boolean bool;
    do
    {
      return i;
      localb = b.iS(paramhd.at(str1, paramar.jK()));
      if (localb == null)
        return false;
      localk = l.F(localb.appId, false);
      if ((localk != null) && (localk.avN()))
        a(paramhd, localb, b(paramhd, paramar), localk);
      bool = ay(paramhd.agh(), localb.appId);
      switch (localb.type)
      {
      case 5:
      case 8:
      case 9:
      case 11:
      case 12:
      case 14:
      case 15:
      case 17:
      case 18:
      default:
      case 3:
      case 4:
      case 6:
      case 7:
      case 10:
      case 20:
      case 13:
      case 19:
      case 16:
      }
    }
    while ((localb.url == null) || (localb.url.equals("")));
    String str5 = localb.url;
    String str6;
    label225: PackageInfo localPackageInfo2;
    Intent localIntent8;
    label363: String str9;
    label371: int k;
    if (paramhd.jom)
    {
      str6 = "groupmessage";
      String str7 = u.a(str5, str6, bool);
      String str8 = localb.url;
      localPackageInfo2 = ai(paramhd.agh(), localb.appId);
      localIntent8 = new Intent();
      localIntent8.putExtra("rawUrl", str7);
      localIntent8.putExtra("webpageTitle", localb.title);
      if ((localb.appId != null) && ("wx751a1acca5688ba3".equals(localb.appId)))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("jsapi_args_appid", "wx751a1acca5688ba3");
        localIntent8.putExtra("jsapiargs", localBundle);
      }
      if (ch.jb(str8))
        break label1148;
      localIntent8.putExtra("shortUrl", str8);
      if (localPackageInfo2 != null)
        break label1165;
      str9 = null;
      localIntent8.putExtra("version_name", str9);
      k = 0;
      if (localPackageInfo2 != null)
        break label1175;
    }
    while (true)
    {
      localIntent8.putExtra("version_code", k);
      if (!ch.jb(localb.cNM))
      {
        localIntent8.putExtra("srcUsername", localb.cNM);
        localIntent8.putExtra("srcDisplayname", localb.cNN);
      }
      localIntent8.putExtra("msg_id", paramar.kk());
      localIntent8.putExtra("geta8key_username", paramhd.aUL());
      com.tencent.mm.am.a.b(paramhd.agh(), "webview", ".ui.tools.WebViewUI", localIntent8);
      return i;
      String str2 = u.a(localb.url, "message", bool);
      String str3 = u.a(localb.dQV, "message", bool);
      PackageInfo localPackageInfo1 = ai(paramhd.agh(), localb.appId);
      String str4 = null;
      int j;
      if (localPackageInfo1 == null)
      {
        j = 0;
        if (localPackageInfo1 != null)
          break label575;
      }
      while (true)
      {
        a(paramhd, str2, str3, str4, j, i, paramar.kk());
        return i;
        str4 = localPackageInfo1.versionName;
        break;
        label575: j = localPackageInfo1.versionCode;
      }
      if (!this.hMJ)
      {
        en.cp(paramhd.agh());
        return i;
      }
      Intent localIntent7 = new Intent(paramhd.agh(), AppAttachDownloadUI.class);
      localIntent7.putExtra("app_msg_id", paramar.kk());
      paramhd.startActivity(localIntent7);
      return i;
      if ((localk != null) && (localk.avN()) && (a(paramhd, localk)))
        break;
      if ((localb.dQY == null) || (localb.dQY.length() == 0))
      {
        paramhd.Q(paramar);
        return i;
      }
      if (!this.hMJ)
      {
        en.cp(paramhd.agh());
        return i;
      }
      Intent localIntent6 = new Intent(paramhd.agh(), AppAttachDownloadUI.class);
      localIntent6.putExtra("app_msg_id", paramar.kk());
      paramhd.startActivityForResult(localIntent6, 210);
      return i;
      if (ch.jb(localb.dRq))
        return false;
      Intent localIntent5 = new Intent();
      localIntent5.setFlags(65536);
      localIntent5.putExtra("key_Product_xml", localb.dRq);
      localIntent5.putExtra("key_ProductUI_getProductInfoScene", i);
      if (paramar.kp() == null)
        localIntent5.putExtra("key_ProductUI_chatting_msgId", paramar.kk());
      com.tencent.mm.am.a.b(paramhd.agh(), "scanner", ".ui.ProductUI", localIntent5);
      return i;
      if (ch.jb(localb.dRt))
        return false;
      Intent localIntent4 = new Intent();
      localIntent4.setFlags(65536);
      localIntent4.putExtra("key_TV_xml", localb.dRt);
      localIntent4.putExtra("key_TV_getProductInfoScene", i);
      if (paramar.kp() == null)
        localIntent4.putExtra("key_TVInfoUI_chatting_msgId", paramar.kk());
      com.tencent.mm.am.a.b(paramhd.agh(), "shake", ".ui.TVInfoUI", localIntent4);
      return i;
      if (ch.jb(localb.dRw))
        return false;
      Intent localIntent3 = new Intent();
      localIntent3.setFlags(65536);
      localIntent3.putExtra("key_product_info", localb.dRw);
      localIntent3.putExtra("key_product_scene", i);
      com.tencent.mm.am.a.b(paramhd.agh(), "product", ".ui.MallProductUI", localIntent3);
      return i;
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("message_id", paramar.kk());
      localIntent2.putExtra("record_xml", localb.dRu);
      com.tencent.mm.am.a.b(paramhd.agh(), "record", ".ui.RecordMsgDetailUI", localIntent2);
      return i;
      if (ch.jb(localb.cKk))
        return false;
      Intent localIntent1 = new Intent();
      localIntent1.setFlags(65536);
      localIntent1.putExtra("key_card_app_msg", localb.cKk);
      localIntent1.putExtra("key_from_scene", localb.dRT);
      com.tencent.mm.am.a.b(paramhd.agh(), "card", ".ui.CardDetailUI", localIntent1);
      return i;
      str6 = "singlemessage";
      break label225;
      label1148: localIntent8.putExtra("shortUrl", localb.url);
      break label363;
      label1165: str9 = localPackageInfo2.versionName;
      break label371;
      label1175: k = localPackageInfo2.versionCode;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.cp
 * JD-Core Version:    0.6.2
 */