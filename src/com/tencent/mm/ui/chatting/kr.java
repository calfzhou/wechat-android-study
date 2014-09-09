package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.MenuItem;
import android.widget.Toast;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.ak.v;
import com.tencent.mm.c.a.as;
import com.tencent.mm.c.a.at;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.tools.bc;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bk;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.cm;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.tools.ImageGalleryUI;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.ap;
import com.tencent.mm.y.l;
import java.util.LinkedList;
import java.util.List;

final class kr
  implements cm
{
  kr(hd paramhd)
  {
  }

  public final void d(MenuItem paramMenuItem, int paramInt)
  {
    int i = 1;
    com.tencent.mm.storage.ar localar = (com.tencent.mm.storage.ar)this.jtA.joh.getItem(paramMenuItem.getGroupId());
    if (localar == null)
      z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "context item select failed, null msg");
    label64: 
    do
    {
      do
      {
        do
        {
          return;
          fn localfn = this.jtA.joh;
          int j = localar.getType();
          if (localar.jK() == i)
          {
            int k = i;
            cj localcj = localfn.w(j, k);
            if (localcj != null)
              localcj.a(paramMenuItem, this.jtA, localar);
          }
          switch (paramMenuItem.getItemId())
          {
          case 105:
          case 101:
          case 111:
          case 113:
          case 115:
          case 118:
          case 119:
          case 120:
          case 121:
          case 125:
          default:
            return;
          case 100:
            if (localar.aJw())
              if (localar.kk() == hd.W(this.jtA).aUu())
                hd.W(this.jtA).fh(i);
            while (true)
            {
              bw.v(localar.kk());
              if (this.jtA.jnf.getUsername().equals("medianote"))
                break;
              bg.qW().oS().a(new bk(localar.kt(), localar.kl()));
              return;
              int m = 0;
              break label64;
              if (localar.aJu())
                hd.c(this.jtA, localar);
            }
          case 104:
          case 102:
          case 103:
          case 106:
          case 107:
          case 126:
          case 108:
          case 117:
          case 110:
          case 109:
          case 112:
          case 114:
          case 116:
          case 123:
          case 124:
          case 122:
          }
        }
        while (((!localar.aJF()) && (!localar.aJG())) || (!g.axR().p(localar)));
        this.jtA.fpD.aCg();
        return;
        String str4 = ((com.tencent.mm.storage.ar)this.jtA.joh.getItem(paramMenuItem.getGroupId())).getContent();
        StringBuilder localStringBuilder = new StringBuilder("groupId = ").append(paramMenuItem.getGroupId()).append(", content length: ");
        int i1;
        if (str4 == null)
          i1 = 0;
        while (true)
        {
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", i1);
          try
          {
            hd.X(this.jtA).setText(this.jtA.qo(paramMenuItem.getGroupId()));
            Toast.makeText(this.jtA.agh(), this.jtA.getString(com.tencent.mm.n.bsP), 0).show();
            return;
            i1 = str4.length();
          }
          catch (Exception localException)
          {
            while (true)
              z.e("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "clip.setText error ");
          }
        }
        if (localar.aJw())
        {
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.jtA.agh());
            return;
          }
          this.jtA.S(localar);
          return;
        }
        if (localar.aJA())
        {
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.jtA.agh());
            return;
          }
          this.jtA.T(localar);
          return;
        }
        if (localar.aJF())
        {
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.jtA.agh());
            return;
          }
          this.jtA.U(localar);
          return;
        }
        if (localar.aJD())
        {
          this.jtA.V(localar);
          return;
        }
        if (localar.aJC())
        {
          this.jtA.Y(localar);
          return;
        }
      }
      while (!localar.aJG());
      this.jtA.X(localar);
      return;
      String str3 = v.ik(com.tencent.mm.ak.m.AL().ib(localar.kp()));
      if (ch.jb(str3))
      {
        Toast.makeText(this.jtA.agh(), this.jtA.getString(com.tencent.mm.n.cnX), i).show();
        return;
      }
      Activity localActivity = this.jtA.agh();
      hd localhd2 = this.jtA;
      int n = com.tencent.mm.n.cnY;
      Object[] arrayOfObject4 = new Object[i];
      arrayOfObject4[0] = str3;
      Toast.makeText(localActivity, localhd2.getString(n, arrayOfObject4), i).show();
      bc.e(str3, this.jtA.agh());
      return;
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.jtA.agh());
        return;
      }
      q localq = v.ij(localar.kp());
      Intent localIntent5 = new Intent(this.jtA.agh(), MsgRetransmitUI.class);
      localIntent5.putExtra("Retr_length", localq.AU());
      localIntent5.putExtra("Retr_File_Name", localar.kp());
      localIntent5.putExtra("Retr_video_isexport", localq.AX());
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "dkvideo msg.getType():" + localar.getType());
      if (localar.aNW())
        localIntent5.putExtra("Retr_Msg_Type", 11);
      while (true)
      {
        this.jtA.startActivity(localIntent5);
        return;
        localIntent5.putExtra("Retr_Msg_Type", i);
      }
    }
    while (!localar.aJC());
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.add(localar);
    bf.a(this.jtA.agh(), localLinkedList, this.jtA.iWI, null);
    return;
    Intent localIntent4 = new Intent(this.jtA.agh(), MsgRetransmitUI.class);
    String str2 = this.jtA.qo(paramMenuItem.getGroupId());
    if (localar.aJx())
    {
      localIntent4.putExtra("Retr_Msg_content", str2);
      localIntent4.putExtra("Retr_Msg_Type", 6);
    }
    while (true)
    {
      this.jtA.startActivity(localIntent4);
      return;
      localIntent4.putExtra("Retr_Msg_content", str2);
      localIntent4.putExtra("Retr_Msg_Type", 4);
    }
    g.axR().a(this.jtA.agh(), localar);
    return;
    if (!bg.qW().isSDCardAvailable())
    {
      en.cp(this.jtA.agh());
      return;
    }
    if (localar.kk() > 0L);
    for (l locall3 = ap.yg().T(localar.kk()); ; locall3 = null)
    {
      if (((locall3 == null) || (locall3.xM() <= 0L)) && (localar.kl() > 0L))
        locall3 = ap.yg().S(localar.kl());
      if (locall3 == null)
        break;
      boolean bool;
      if ((locall3.getOffset() >= locall3.sp()) && (locall3.sp() != 0))
      {
        Intent localIntent3 = new Intent(this.jtA.agh(), MsgRetransmitUI.class);
        localIntent3.putExtra("Retr_File_Name", ap.yg().f(com.tencent.mm.y.m.c(locall3), "", ""));
        localIntent3.putExtra("Retr_Msg_Id", localar.kk());
        localIntent3.putExtra("Retr_Msg_Type", 0);
        if (localar.jK() == i)
          if (!locall3.xR());
        while (true)
        {
          localIntent3.putExtra("Retr_Compress_Type", i);
          this.jtA.startActivity(localIntent3);
          return;
          bool = false;
          continue;
          if (!locall3.xR())
            bool = false;
          else if (!com.tencent.mm.a.c.ac(com.tencent.mm.y.m.a(locall3).xN()))
            bool = false;
        }
      }
      Intent localIntent2 = new Intent(this.jtA.agh(), ImageGalleryUI.class);
      localIntent2.putExtra("img_gallery_msg_id", localar.kk());
      localIntent2.putExtra("img_gallery_msg_svr_id", localar.kl());
      localIntent2.putExtra("img_gallery_talker", localar.kt());
      localIntent2.putExtra("img_gallery_chatroom_name", localar.kt());
      localIntent2.putExtra("img_gallery_is_restransmit_after_download", bool);
      this.jtA.startActivity(localIntent2);
      return;
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.jtA.agh());
        return;
      }
      bp localbp = new bp(localar.getContent());
      Intent localIntent1 = new Intent(this.jtA.agh(), MsgRetransmitUI.class);
      localIntent1.putExtra("Retr_File_Name", localar.kp());
      localIntent1.putExtra("Retr_length", (int)localbp.getTime());
      z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "voice msg.getType():" + localar.getType());
      localIntent1.putExtra("Retr_Msg_Type", 7);
      this.jtA.startActivity(localIntent1);
      return;
      if (!bg.qW().isSDCardAvailable())
      {
        en.cp(this.jtA.agh());
        return;
      }
      if (localar.kk() > 0L);
      for (l locall1 = ap.yg().T(localar.kk()); ; locall1 = null)
      {
        if (((locall1 == null) || (locall1.xM() <= 0L)) && (localar.kl() > 0L));
        for (l locall2 = ap.yg().S(localar.kl()); locall2 != null; locall2 = locall1)
        {
          String str1 = ap.yg().f(locall2.xN(), "", "");
          if (!com.tencent.mm.a.c.ac(str1))
            break;
          com.tencent.mm.pluginsdk.e.c.a(this.jtA.agh(), this.jtA.getString(com.tencent.mm.n.btR), str1);
          return;
          if (localar.aJD())
            ng.m(this.jtA.at(localar.getContent(), localar.jK()), this.jtA.agh());
          while (true)
          {
            Object[] arrayOfObject3 = new Object[bool];
            arrayOfObject3[0] = Integer.valueOf(localar.getType());
            z.i("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "type is %d", arrayOfObject3);
            return;
            if (localar.aJw())
              ng.a(localar, this.jtA.agh());
            else if (localar.aJA())
              ng.b(localar, this.jtA.agh());
            else if (localar.aJE())
              ng.c(localar, this.jtA.agh());
            else if (localar.aJC())
              ng.n(localar.getContent(), this.jtA.agh());
            else if (localar.aJB())
              ng.o(localar.getContent(), this.jtA.agh());
            else if ((localar.aJF()) || (localar.aJG()))
              ng.d(localar, this.jtA.agh());
          }
          com.tencent.mm.c.a.ar localar1 = new com.tencent.mm.c.a.ar();
          if ((com.tencent.mm.pluginsdk.model.c.a(localar1, localar)) && (localar1.cHV.ret == 0))
          {
            a.aGB().g(localar1);
            com.tencent.mm.ui.base.e.aw(this.jtA.agh(), this.jtA.getString(com.tencent.mm.n.bHR));
            return;
          }
          com.tencent.mm.ui.base.e.b(this.jtA.agh(), localar1.cHU.type, com.tencent.mm.n.bHn);
          return;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(localar.getType());
          arrayOfObject2[bool] = Integer.valueOf(paramMenuItem.getGroupId());
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "[oneliang][longclick_menu_revoke] type:%d,item.getGroupId:%d", arrayOfObject2);
          hd.e(this.jtA, paramMenuItem.getGroupId());
          hd.d(this.jtA, localar);
          return;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Integer.valueOf(localar.getType());
          arrayOfObject1[bool] = Boolean.valueOf(localar.aJM());
          z.d("!32@/B4Tb64lLpKwUcOR+EdWcmybqEj/+Vl/", "longclick transalte type: %d isShowTranslated: %s", arrayOfObject1);
          if (!((Boolean)bg.qW().oQ().get(327712, Boolean.valueOf(false))).booleanValue())
          {
            bg.qW().oQ().set(327712, Boolean.valueOf(bool));
            ad localad = new ad(this.jtA.agh());
            localad.BL(this.jtA.getString(com.tencent.mm.n.bAr));
            localad.BK(this.jtA.getString(com.tencent.mm.n.bAs));
            localad.d(com.tencent.mm.n.bOP, new ks(this, localar, paramMenuItem));
            localad.aRB().show();
            return;
          }
          hd localhd1 = this.jtA;
          paramMenuItem.getGroupId();
          hd.e(localhd1, localar);
          return;
          this.jtA.R(localar);
          return;
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.kr
 * JD-Core Version:    0.6.2
 */