package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.ak.p;
import com.tencent.mm.ak.q;
import com.tencent.mm.ak.r;
import com.tencent.mm.c.a.fg;
import com.tencent.mm.c.a.fi;
import com.tencent.mm.c.a.mx;
import com.tencent.mm.c.a.mz;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.j;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.network.bm;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.e;
import com.tencent.mm.ui.base.en;
import com.tencent.mm.ui.contact.bb;
import com.tencent.mm.ui.contact.profile.ContactInfoUI;
import com.tencent.mm.ui.tools.ImageGalleryUI;
import com.tencent.mm.ui.video.VideoDownloadUI;
import com.tencent.mm.ui.video.VideoPlayerUI;
import com.tencent.mm.y.l;
import java.util.Map;
import junit.framework.Assert;

final class fu
  implements View.OnClickListener
{
  public static boolean jqP = false;
  private hd joF;
  private af joi;

  public fu(hd paramhd, String paramString, af paramaf)
  {
    this.joF = paramhd;
    this.joi = paramaf;
    fg localfg = new fg();
    localfg.cKA.cKC = 0;
    localfg.cKA.cKD = com.tencent.mm.sdk.platformtools.y.aGW();
    if (com.tencent.mm.model.y.dc(paramString));
    for (localfg.cKA.cKE = true; ; localfg.cKA.cKE = false)
    {
      com.tencent.mm.sdk.c.a.aGB().g(localfg);
      return;
    }
  }

  private void J(ar paramar)
  {
    hd localhd = this.joF;
    if ((paramar == null) || (localhd == null) || (localhd.agh() == null) || (localhd.agh().isFinishing()))
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "want to play video, but error args");
    while (true)
    {
      this.joF.dg(-1L);
      return;
      if ((!paramar.aJE()) && (!paramar.aNW()))
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramar.getType());
        z.w("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "error msg type, cancle play video, type %d", arrayOfObject);
      }
      else
      {
        q localq = com.tencent.mm.ak.v.ij(paramar.kp());
        boolean bool = p.hS(com.tencent.mm.ak.m.AL().ib(paramar.kp()));
        if (paramar.aJL())
        {
          Intent localIntent1 = new Intent(localhd.agh(), ResourcesExceedUI.class);
          localIntent1.putExtra("clean_view_type", 0);
          localhd.agh().startActivity(localIntent1);
        }
        else if ((com.tencent.mm.compatible.c.v.dNG.dMU != 1) || (!VideoPlayerUI.a(localq.getFileName(), localhd.agh(), bool)))
        {
          if (paramar.aNW())
          {
            localhd.O(paramar);
          }
          else if ((localq.AX() == 0) && (!bool))
          {
            Intent localIntent2 = new Intent(localhd.agh(), VideoPlayerUI.class);
            localIntent2.putExtra("VideoRecorder_MsgId", paramar.kk());
            localIntent2.putExtra("VideoRecorder_VideoSize", localq.sp());
            localIntent2.putExtra("VideoRecorder_VideoLength", localq.AU());
            localIntent2.putExtra("VideoPlayer_File_nam", paramar.kp());
            localhd.agh().startActivity(localIntent2);
          }
          else if (!VideoPlayerUI.a(localq.getFileName(), localhd.agh(), bool))
          {
            Toast.makeText(localhd.agh(), localhd.agh().getString(com.tencent.mm.n.coa), 0).show();
          }
        }
      }
    }
  }

  private void a(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(this.joF.agh(), ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", paramLong1);
    localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
    localIntent.putExtra("img_gallery_talker", paramString1);
    localIntent.putExtra("img_gallery_chatroom_name", paramString2);
    this.joF.startActivity(localIntent);
  }

  private void b(long paramLong1, long paramLong2, String paramString1, String paramString2)
  {
    Intent localIntent = new Intent(this.joF.agh(), ImageGalleryUI.class);
    localIntent.putExtra("img_gallery_msg_id", paramLong1);
    localIntent.putExtra("img_gallery_msg_svr_id", paramLong2);
    localIntent.putExtra("img_gallery_talker", paramString1);
    localIntent.putExtra("img_gallery_chatroom_name", paramString2);
    this.joF.startActivity(localIntent);
  }

  private void b(long paramLong, String paramString, boolean paramBoolean)
  {
    if ((!bm.ab(this.joF.agh())) && (!jqP))
    {
      jqP = true;
      e.a(this.joF.agh(), com.tencent.mm.n.cnT, com.tencent.mm.n.buo, new ga(this, paramLong, paramString, paramBoolean), null);
    }
    do
    {
      return;
      h(paramLong, paramString);
    }
    while (!paramBoolean);
    Intent localIntent = new Intent(this.joF.agh(), VideoDownloadUI.class);
    localIntent.putExtra("file_name", paramString);
    this.joF.startActivity(localIntent);
  }

  private void h(long paramLong, String paramString)
  {
    this.joF.dg(paramLong);
    com.tencent.mm.ak.v.ii(paramString);
  }

  public final void onClick(View paramView)
  {
    int i = 3;
    int j = 1;
    ms localms = (ms)paramView.getTag();
    ar localar2;
    Intent localIntent4;
    Bundle localBundle;
    int k;
    switch (localms.fjl)
    {
    case 2:
    case 3:
    case 4:
    case 5:
    default:
      localar2 = localms.cMM;
      if (localar2 != null)
        break;
    case 1:
    case 6:
      String str2;
      String str3;
      String str4;
      do
      {
        String str5;
        do
        {
          return;
          str5 = localms.cDi;
        }
        while ((str5 == null) || (str5.equals("")));
        Intent localIntent5 = new Intent();
        localIntent5.setClass(this.joF.agh(), ContactInfoUI.class);
        localIntent5.putExtra("Contact_User", str5);
        com.tencent.mm.storage.i locali2 = bg.qW().oT().ys(str5);
        if ((locali2 != null) && ((int)locali2.dhv > 0) && (com.tencent.mm.g.a.cv(locali2.getType())))
        {
          bb.c(localIntent5, str5);
          if (com.tencent.mm.model.y.dc(this.joF.jnf.getUsername()))
          {
            localIntent5.putExtra("Contact_RoomNickname", bg.qW().oZ().xT(this.joF.jnf.getUsername()).dh(str5));
            localIntent5.putExtra("Contact_Scene", 14);
          }
          if (localms.cMM != null)
            switch (localms.cMM.getType())
            {
            case 56:
            default:
            case 55:
            case 57:
            }
        }
        while (true)
        {
          this.joF.startActivityForResult(localIntent5, 213);
          return;
          if (!this.joF.jon)
            break;
          com.tencent.mm.model.at.qx().a(str5, new fv(this));
          break;
          localIntent5.putExtra("Contact_Scene", 34);
          localIntent5.putExtra("Contact_IsLBSFriend", j);
        }
        z.d("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "edw timestamp, onClick = " + System.currentTimeMillis());
        str2 = localms.cDi;
        str3 = localms.cNN;
        str4 = localms.juY;
      }
      while ((str2 == null) || (str2.equals("")));
      localIntent4 = new Intent();
      localIntent4.putExtra("rawUrl", str2);
      localIntent4.putExtra("shortUrl", str2);
      localIntent4.putExtra("webpageTitle", str4);
      if ((str3 != null) && (!"".equals(str3)))
        localIntent4.putExtra("title", str3);
      localBundle = new Bundle();
      ar localar1 = localms.cMM;
      if (localar1 != null)
      {
        com.tencent.mm.storage.i locali1 = bg.qW().oT().ys(localar1.kt());
        if ((locali1 != null) && (locali1.aIg()))
        {
          k = 4;
          label535: localIntent4.putExtra("msg_id", localar1.kk());
        }
      }
      break;
    case 7:
    case 8:
    }
    while (true)
    {
      localBundle.putInt("snsWebSource", k);
      localIntent4.putExtra("jsapiargs", localBundle);
      localIntent4.putExtra("geta8key_username", this.joF.aUL());
      if (!com.tencent.mm.platformtools.ap.jb(localms.cNM))
      {
        localIntent4.putExtra("srcUsername", localms.cNM);
        localIntent4.putExtra("srcDisplayname", localms.cNN);
        localIntent4.putExtra("mode", j);
      }
      localIntent4.putExtra("message_id", localms.fcD);
      localIntent4.putExtra("message_index", localms.hmV);
      com.tencent.mm.am.a.b(this.joF.agh(), "webview", ".ui.tools.WebViewUI", localIntent4);
      if ((com.tencent.mm.platformtools.ap.jb(this.joF.aUL())) || (bg.qW().oT().ys(this.joF.aUL()).jB() != j))
        break;
      bg.qW().oW().yH(this.joF.aUL());
      return;
      Intent localIntent3 = new Intent();
      localIntent3.putExtra("geta8key_username", this.joF.aUL());
      localIntent3.putExtra("rawUrl", localms.ddY);
      com.tencent.mm.am.a.b(this.joF.agh(), "webview", ".ui.tools.WebViewUI", localIntent3);
      return;
      if (localms.cMM == null)
        break;
      String str1 = localms.cDa;
      if (TextUtils.isEmpty(str1))
        str1 = g.axR().lx(localms.ddY);
      if (TextUtils.isEmpty(str1))
      {
        Intent localIntent1 = new Intent();
        localIntent1.putExtra("geta8key_username", this.joF.aUL());
        localIntent1.putExtra("rawUrl", localms.ddY);
        com.tencent.mm.am.a.b(this.joF.agh(), "webview", ".ui.tools.WebViewUI", localIntent1);
        return;
      }
      z.d("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "start emoji detail from brandcontact");
      Intent localIntent2 = new Intent();
      localIntent2.putExtra("extra_id", str1);
      localIntent2.putExtra("preceding_scence", 9);
      localIntent2.putExtra("entrance_scence", 2);
      com.tencent.mm.am.a.b(this.joF.agh(), "emoji", ".ui.EmojiStoreDetailUI", localIntent2);
      com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(2);
      arrayOfObject1[j] = str1;
      localn1.d(10993, arrayOfObject1);
      return;
      fn localfn = this.joF.joh;
      int m = localar2.getType();
      if (localar2.jK() == j);
      int i1;
      for (int n = j; ; i1 = 0)
      {
        cj localcj = localfn.w(m, n);
        if ((localcj != null) && (localcj.a(paramView, this.joF, localar2)))
          break;
        if ((localms.fjl != 5) || (localar2.jK() != j))
          break label1153;
        ar localar9 = localms.cMM;
        e.a(this.joF.agh(), this.joF.getString(com.tencent.mm.n.bAa), "", this.joF.getString(com.tencent.mm.n.bub), this.joF.getString(com.tencent.mm.n.bsK), new fw(this, localar9), new fx(this));
        return;
      }
      label1153: z.i("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "CreateTime:" + localar2.kn());
      if (localar2.aJw())
      {
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(this.joF.agh());
          return;
        }
        if ((localms == null) || (localms.cMM == null))
          break;
        bp localbp = new bp(localms.cMM.getContent());
        if ((com.tencent.mm.platformtools.ap.jb(localms.cMM.getContent())) || (localbp.getTime() == 0L))
        {
          Toast.makeText(this.joF.agh(), com.tencent.mm.n.byH, 0).show();
          return;
        }
        this.joi.a(localms.position, localms.cMM);
        return;
      }
      int i2;
      if (localar2.getType() == 35)
        i2 = j;
      while (true)
        if (i2 != 0)
        {
          au localau = bg.qW().oV().zB(localms.cMM.getContent());
          if (com.tencent.mm.platformtools.ap.ja(localau.aKf()).length() > 0)
          {
            com.tencent.mm.am.a.b(this.joF.agh(), "qqmail", ".ui.ReadMailUI", new Intent().putExtra("msgid", localms.cMM.kk()));
            return;
            int i3 = 0;
          }
          else
          {
            if (com.tencent.mm.platformtools.ap.ja(localau.aKd()).length() <= 0)
              break;
            Intent localIntent12 = new Intent("android.intent.action.VIEW", Uri.parse(localau.aKd()));
            com.tencent.mm.am.a.b(this.joF.agh(), "webview", ".ui.tools.WebViewUI", localIntent12);
            return;
          }
        }
      ar localar8;
      l locall3;
      if (localar2.aJA())
      {
        localar8 = localms.cMM;
        if (localar8.jK() == j)
        {
          locall3 = com.tencent.mm.y.ap.yg().T(localar8.kk());
          if (locall3.xM() != 0L)
            break label5940;
        }
      }
      label2470: label2477: label5940: for (l locall1 = com.tencent.mm.y.ap.yg().S(localar8.kl()); ; locall1 = locall3)
      {
        Map localMap = x.bB(localar8.getContent(), "msg");
        if (localMap != null)
          Long.valueOf(com.tencent.mm.platformtools.ap.Y((String)localMap.get(".msg.img.$hdlength"), "0")).longValue();
        if (!bg.qW().isSDCardAvailable())
        {
          en.cp(this.joF.agh());
          return;
        }
        if (localar8.jK() == j)
        {
          String str24 = com.tencent.mm.y.m.c(locall1);
          if (com.tencent.mm.a.c.ac(com.tencent.mm.y.ap.yg().f(str24, "", "")))
          {
            locall1.xR();
            long l7 = locall1.xL();
            long l8 = locall1.kl();
            String str27 = localms.cDi;
            locall1.xR();
            b(l7, l8, str27, localms.cLi);
            return;
          }
          String str25 = locall1.xN();
          if (com.tencent.mm.a.c.ac(com.tencent.mm.y.ap.yg().f(str25, "", "")))
          {
            long l5 = locall1.xL();
            long l6 = locall1.kl();
            String str26 = localms.cDi;
            locall1.xR();
            b(l5, l6, str26, localms.cLi);
            return;
          }
          a(localar8.kk(), localar8.kl(), localms.cDi, localms.cLi);
          return;
        }
        if (locall1.xQ())
        {
          String str22 = locall1.xN();
          if (locall1.xR())
          {
            l locall2 = com.tencent.mm.y.m.a(locall1);
            if ((locall2 != null) && (locall2.xM() > 0L) && (locall2.xQ()) && (com.tencent.mm.a.c.ac(com.tencent.mm.y.ap.yg().f(locall2.xN(), "", ""))))
              str22 = locall2.xN();
          }
          com.tencent.mm.y.ap.yg().f(str22, "", "");
          long l3 = locall1.xL();
          long l4 = locall1.kl();
          String str23 = localms.cDi;
          locall1.xR();
          b(l3, l4, str23, localms.cLi);
          return;
        }
        if (locall1.getStatus() == -1)
        {
          Object[] arrayOfObject4 = new Object[j];
          arrayOfObject4[0] = Long.valueOf(locall1.xM());
          z.i("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "retry downloadImg, %d", arrayOfObject4);
          locall1.setStatus(0);
          locall1.db(256);
          com.tencent.mm.y.ap.yg().a(locall1.xM(), locall1);
        }
        a(localar8.kk(), localar8.kl(), localms.cDi, localms.cLi);
        return;
        if (localar2.aJB())
        {
          String str19 = localms.cDi;
          String str20 = localar2.getContent();
          boolean bool2 = localms.iWI;
          String str21;
          label2037: as localas2;
          Intent localIntent11;
          if (localar2.jK() == 0)
          {
            int i12 = j;
            if ((!bool2) || (i12 == 0))
              break label2470;
            str21 = bw.en(str20);
            localas2 = bg.qW().oV().zD(str21);
            if (localas2 == null)
              break;
            localIntent11 = new Intent(this.joF.agh(), ContactInfoUI.class);
            localIntent11.putExtra("Contact_User", localas2.aJQ());
            localIntent11.putExtra("Contact_Alias", localas2.iS());
            localIntent11.putExtra("Contact_Nick", localas2.iV());
            localIntent11.putExtra("Contact_QuanPin", localas2.iX());
            localIntent11.putExtra("Contact_PyInitial", localas2.iW());
            localIntent11.putExtra("Contact_Uin", localas2.aJT());
            localIntent11.putExtra("Contact_Mobile_MD5", localas2.aJS());
            localIntent11.putExtra("Contact_full_Mobile_MD5", localas2.aJV());
            localIntent11.putExtra("Contact_QQNick", localas2.aJU());
            localIntent11.putExtra("User_From_Fmessage", false);
            localIntent11.putExtra("Contact_Scene", localas2.Ew());
            localIntent11.putExtra("Contact_FMessageCard", j);
            localIntent11.putExtra("Contact_RemarkName", localas2.wU());
            localIntent11.putExtra("Contact_VUser_Info_Flag", localas2.jd());
            localIntent11.putExtra("Contact_VUser_Info", localas2.ju());
            localIntent11.putExtra("Contact_BrandIconURL", localas2.aJW());
            localIntent11.putExtra("Contact_Province", localas2.jp());
            localIntent11.putExtra("Contact_City", localas2.jq());
            localIntent11.putExtra("Contact_Sex", localas2.jj());
            localIntent11.putExtra("Contact_Signature", localas2.jo());
            localIntent11.putExtra("Contact_ShowUserName", false);
            localIntent11.putExtra("Contact_KSnsIFlag", 0);
            if ((0x8 & localas2.jd()) > 0)
            {
              if ((!com.tencent.mm.platformtools.ap.jb(str19)) && (bg.qW().oT().ys(str19).aIg()))
                break label2477;
              localIntent11.putExtra("Contact_Scene", 17);
              com.tencent.mm.plugin.f.c.n.fTF.q(10298, localas2.aJQ() + ",17");
            }
          }
          while (true)
          {
            this.joF.startActivity(localIntent11);
            com.tencent.mm.an.a.nr(localas2.Ew());
            return;
            int i13 = 0;
            break;
            str21 = str20;
            break label2037;
            localIntent11.putExtra("Contact_Scene", 41);
            com.tencent.mm.plugin.f.c.n.fTF.q(10298, localas2.aJQ() + ",41");
          }
        }
        if (localar2.getType() == 37)
        {
          String str17 = localar2.getContent();
          z.w("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "dealClickVerifyMsgEvent : " + str17);
          if ((str17 == null) || (str17.length() <= 0))
            break;
          com.tencent.mm.storage.av localav = bg.qW().oV().zC(str17);
          if (localav == null)
            break;
          int i11 = localav.aJQ().length();
          boolean bool1 = false;
          if (i11 > 0)
            bool1 = j;
          Assert.assertTrue(bool1);
          com.tencent.mm.storage.i locali4 = bg.qW().oT().ys(localav.aJQ());
          Intent localIntent10 = new Intent(this.joF.agh(), ContactInfoUI.class);
          if ((locali4 != null) && ((int)locali4.dhv > 0) && (com.tencent.mm.g.a.cv(locali4.getType())))
          {
            localIntent10.putExtra("Contact_User", locali4.getUsername());
            bb.c(localIntent10, locali4.getUsername());
            str18 = localav.getContent();
            if (com.tencent.mm.platformtools.ap.ja(str18).length() <= 0)
              switch (localav.Ew())
              {
              case 19:
              case 20:
              case 21:
              default:
              case 18:
              case 22:
              case 23:
              case 24:
              case 25:
              case 26:
              case 27:
              case 28:
              case 29:
              }
          }
          for (String str18 = this.joF.getString(com.tencent.mm.n.bzc); ; str18 = this.joF.getString(com.tencent.mm.n.bzg))
          {
            localIntent10.putExtra("Contact_Content", str18);
            localIntent10.putExtra("Contact_verify_Scene", localav.Ew());
            localIntent10.putExtra("Contact_Uin", localav.aJT());
            localIntent10.putExtra("Contact_QQNick", localav.wR());
            localIntent10.putExtra("Contact_Mobile_MD5", localav.aJS());
            localIntent10.putExtra("User_From_Fmessage", j);
            localIntent10.putExtra("Contact_from_msgType", 37);
            localIntent10.putExtra("Contact_KSnsIFlag", localav.aKh());
            localIntent10.putExtra("Contact_KSnsBgUrl", localav.aKi());
            this.joF.startActivity(localIntent10);
            com.tencent.mm.an.a.nr(localav.Ew());
            return;
            localIntent10.putExtra("Verify_ticket", localav.aKg());
            localIntent10.putExtra("User_Verify", j);
            localIntent10.putExtra("Contact_User", localav.aJQ());
            localIntent10.putExtra("Contact_Alias", localav.iS());
            localIntent10.putExtra("Contact_Nick", localav.iV());
            localIntent10.putExtra("Contact_QuanPin", localav.iX());
            localIntent10.putExtra("Contact_PyInitial", localav.iW());
            localIntent10.putExtra("Contact_Sex", localav.jj());
            localIntent10.putExtra("Contact_Signature", localav.jo());
            localIntent10.putExtra("Contact_Scene", localav.Ew());
            localIntent10.putExtra("Contact_FMessageCard", j);
            localIntent10.putExtra("Contact_City", localav.jq());
            localIntent10.putExtra("Contact_Province", localav.jp());
            localIntent10.putExtra("Contact_Mobile_MD5", localav.aJS());
            localIntent10.putExtra("Contact_full_Mobile_MD5", localav.aJV());
            localIntent10.putExtra("Contact_KSnsIFlag", localav.aKh());
            localIntent10.putExtra("Contact_KSnsBgUrl", localav.aKi());
            break;
          }
        }
        if (localar2.getType() == 40)
        {
          String str16 = localar2.getContent();
          as localas1 = bg.qW().oV().zD(str16);
          if ((localas1 == null) || (localas1.aJQ().length() <= 0))
            break;
          com.tencent.mm.an.a.nr(localas1.Ew());
          com.tencent.mm.storage.i locali3 = bg.qW().oT().ys(localas1.aJQ());
          if ((locali3 != null) && ((int)locali3.dhv > 0) && (com.tencent.mm.g.a.cv(locali3.getType())))
          {
            bb.a(this.joF.agh(), locali3, localas1);
            return;
          }
          if ((localas1.aJT() <= 0L) && ((!com.tencent.mm.platformtools.ap.jb(localas1.aJS())) || (!com.tencent.mm.platformtools.ap.jb(localas1.aJV()))))
          {
            com.tencent.mm.modelfriend.i locali = az.wZ().gn(localas1.aJS());
            if ((locali == null) || (locali.vu() == null) || (locali.vu().length() <= 0))
            {
              locali = az.wZ().gn(localas1.aJV());
              if ((locali == null) || (locali.vu() == null) || (locali.vu().length() <= 0))
              {
                if ((locali3 != null) && ((int)locali3.dhv > 0))
                  bb.a(this.joF.agh(), locali3, localas1);
                while (true)
                {
                  z.e("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "error : this is not the mobile contact, MD5 = " + localas1.aJS() + " fullMD5:" + localas1.aJV());
                  return;
                  bb.a(this.joF.agh(), localas1);
                }
              }
            }
            if ((locali.getUsername() == null) || (locali.getUsername().length() <= 0))
            {
              locali.setUsername(localas1.aJQ());
              locali.db(128);
              if (az.wZ().a(locali.vu(), locali) == -1)
              {
                z.e("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "update mobile contact username failed");
                return;
              }
            }
            bb.a(this.joF.agh(), localas1);
            return;
          }
          bb.a(this.joF.agh(), localas1);
          return;
        }
        if ((localar2.aJE()) || (localar2.aNW()))
        {
          ar localar3 = localms.cMM;
          if ((!localar3.aNW()) && (localms.fjl == 2))
          {
            long l1 = localar3.kk();
            long l2 = localar3.kl();
            String str8 = localms.cDi;
            String str9 = localms.cLi;
            Intent localIntent6 = new Intent(this.joF.agh(), ImageGalleryUI.class);
            localIntent6.putExtra("img_gallery_msg_id", l1);
            localIntent6.putExtra("img_gallery_msg_svr_id", l2);
            localIntent6.putExtra("img_gallery_talker", str8);
            localIntent6.putExtra("img_gallery_chatroom_name", str9);
            this.joF.startActivity(localIntent6);
            return;
          }
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.joF.agh());
            return;
          }
          ar localar5;
          q localq3;
          if (localar3.jK() == 0)
          {
            localar5 = localms.cMM;
            localq3 = com.tencent.mm.ak.v.ij(localar5.kp());
            z.v("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "video status:" + localq3.getStatus() + " is sender:" + localar5.jK());
            switch (localms.fjl)
            {
            default:
            case 4:
            case 3:
            case 2:
            }
          }
          ar localar4;
          q localq1;
          while (localar3.jK() == j)
          {
            localar4 = localms.cMM;
            localq1 = com.tencent.mm.ak.m.AL().hY(localar4.kp());
            switch (localms.fjl)
            {
            default:
              return;
            case 2:
              J(localar4);
              return;
              if (!bg.qW().isSDCardAvailable())
              {
                en.cp(this.joF.agh());
              }
              else
              {
                String str7 = localar5.kp();
                q localq4 = com.tencent.mm.ak.v.ij(str7);
                if (localq4 == null)
                {
                  z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " getinfo failed: " + str7);
                  k.nJ();
                }
                else if (localq4.getStatus() != 112)
                {
                  z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " get status failed: " + str7 + " status:" + localq4.getStatus());
                  k.nJ();
                }
                else
                {
                  localq4.setStatus(113);
                  localq4.V(ch.CL());
                  localq4.db(1280);
                  if (!com.tencent.mm.ak.v.d(localq4))
                  {
                    z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " update failed: " + str7);
                    k.nJ();
                    continue;
                    if (!bg.qW().isSDCardAvailable())
                    {
                      en.cp(this.joF.agh());
                    }
                    else if (localq3.getStatus() == 198)
                    {
                      com.tencent.mm.ak.v.AQ(localq3.getFileName());
                    }
                    else if ((!bm.ab(this.joF.agh())) && (!hd.jqP))
                    {
                      hd.jqP = j;
                      e.a(this.joF.agh(), com.tencent.mm.n.cnT, com.tencent.mm.n.buo, new fy(this, localq3), new fz(this));
                    }
                    else
                    {
                      h(localq3.AV(), localq3.getFileName());
                      continue;
                      if ((localq3.getStatus() == 113) || (localq3.getStatus() == 198))
                      {
                        b(localar5.kk(), localar5.kp(), localar5.aJE());
                      }
                      else
                      {
                        if (localq3.getStatus() == 199)
                          J(localar5);
                        if (localq3.getStatus() == 111)
                          b(localar5.kk(), localar5.kp(), localar5.aJE());
                      }
                    }
                  }
                }
              }
              break;
            case 4:
            case 3:
            }
          }
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.joF.agh());
            return;
          }
          String str6 = localar4.kp();
          q localq2 = com.tencent.mm.ak.v.ij(str6);
          if (localq2 == null)
          {
            z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " getinfo failed: " + str6);
            k.nJ();
            return;
          }
          if ((localq2.getStatus() != 104) && (localq2.getStatus() != 103))
          {
            z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " get status failed: " + str6 + " status:" + localq2.getStatus());
            k.nJ();
            return;
          }
          localq2.setStatus(105);
          localq2.V(ch.CL());
          localq2.db(1280);
          if (com.tencent.mm.ak.v.d(localq2))
            break;
          z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR:" + k.nL() + " update failed: " + str6);
          k.nJ();
          return;
          if (!bg.qW().isSDCardAvailable())
          {
            en.cp(this.joF.agh());
            return;
          }
          if (localq1.getStatus() == 198)
          {
            com.tencent.mm.ak.v.Cu(localar4.kp());
            return;
          }
          com.tencent.mm.ak.v.ih(localar4.kp());
          return;
        }
        if (localar2.aJF())
        {
          if (!bg.qW().isSDCardAvailable())
            break;
          ad localad = g.axR().ly(localms.cMM.kp());
          if ((localad == null) || (localad.avN()))
            break;
          Intent localIntent9 = new Intent();
          localIntent9.putExtra("custom_smiley_preview_md5", localms.cMM.kp());
          localIntent9.putExtra("custom_to_talker_name", localms.cMM.kt());
          if ((localad.field_catalog != ab.iiJ) && (localad.field_catalog != ab.iiI) && (localad.field_catalog != ab.iiH))
            localIntent9.putExtra("custom_smiley_preview_productid", localad.field_groupId);
          com.tencent.mm.am.a.b(this.joF.agh(), "emoji", ".ui.CustomSmileyPreviewUI", localIntent9);
          return;
        }
        ar localar7;
        String str12;
        label4807: String str13;
        int i10;
        if (localar2.getType() == 48)
        {
          localar7 = localms.cMM;
          str12 = localar7.getContent();
          if (localar7.jK() == 0)
          {
            int i8 = j;
            str13 = "";
            if (i8 != 0)
              str13 = localar7.kt();
            if ((!com.tencent.mm.model.y.dc(localar7.kt())) || (i8 == 0))
              break label5933;
            i10 = bw.ek(str12);
            if (i10 == -1)
              break label5933;
            str13 = str12.substring(0, i10).trim();
          }
        }
        for (String str14 = str12.substring(i10 + 1).trim(); ; str14 = str12)
        {
          com.tencent.mm.storage.at localat = bg.qW().oV().zE(str14);
          if ((!com.tencent.mm.platformtools.ap.jb(str13)) && (com.tencent.mm.model.y.dc(str13)))
            str13 = "";
          fg localfg = new fg();
          localfg.cKA.cKC = j;
          localfg.cKA.cCp = localar7;
          com.tencent.mm.sdk.c.a.aGB().g(localfg);
          String str15 = localfg.cKB.cKF;
          if (((com.tencent.mm.platformtools.ap.jb(localfg.cKB.cKG)) && (com.tencent.mm.platformtools.ap.jb(str15))) || ("err_not_started".equals(str15)))
          {
            z.e("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "location not valid or subcore not started");
            return;
            int i9 = 0;
            break label4807;
          }
          Intent localIntent8 = new Intent();
          localIntent8.putExtra("kMsgId", localar7.kk());
          localIntent8.putExtra("map_view_type", j);
          localIntent8.putExtra("kwebmap_slat", localat.aKa());
          localIntent8.putExtra("kwebmap_lng", localat.aKb());
          localIntent8.putExtra("kwebmap_scale", localat.aEX());
          localIntent8.putExtra("kPoiName", localat.aJY());
          localIntent8.putExtra("kisUsername", com.tencent.mm.model.y.dh(str13));
          localIntent8.putExtra("Kwebmap_locaion", str15);
          localIntent8.putExtra("kimg_path", bg.qW().pa());
          localIntent8.putExtra("map_talker_name", localar7.kt());
          localIntent8.putExtra("view_type_key", 0);
          localIntent8.putExtra("kwebmap_from_to", j);
          localIntent8.putExtra("kPoi_url", localat.aKc());
          localIntent8.putExtra("soso_street_view_url", com.tencent.mm.platformtools.ap.Y(localar7.ku(), ""));
          com.tencent.mm.am.a.b(this.joF.agh(), "location", ".ui.RedirectUI", localIntent8);
          return;
          if (localar2.aJy())
          {
            String str10 = localar2.getContent();
            mx localmx1 = new mx();
            localmx1.cPr.cEg = j;
            localmx1.cPr.content = str10;
            com.tencent.mm.sdk.c.a.aGB().g(localmx1);
            com.tencent.mm.plugin.f.c.n localn2;
            Object[] arrayOfObject2;
            if (localmx1.cPs.type == 2)
            {
              int i4 = j;
              if ((i4 == 0) && (!localar2.getContent().equals(ar.iju)))
                break label5505;
              localms.cMM.setStatus(6);
              bg.qW().oV().a(localms.cMM.kk(), localms.cMM);
              this.joF.aWd();
              mx localmx2 = new mx();
              localmx2.cPr.cEg = 5;
              localmx2.cPr.cEh = localms.cMM.kt();
              localmx2.cPr.context = this.joF.agh();
              localmx2.cPr.cPu = 2;
              com.tencent.mm.sdk.c.a.aGB().g(localmx2);
              localn2 = com.tencent.mm.plugin.f.c.n.fTF;
              arrayOfObject2 = new Object[i];
              arrayOfObject2[0] = Integer.valueOf(i);
              arrayOfObject2[j] = Integer.valueOf(j);
              if ((localms.cMM.kz() != null) && (localms.cMM.kz().length() > 0))
                break label5500;
            }
            while (true)
            {
              arrayOfObject2[2] = Integer.valueOf(j);
              localn2.d(11033, arrayOfObject2);
              return;
              int i5 = 0;
              break;
              label5500: j = i;
            }
            String str11 = localar2.getContent();
            mx localmx3 = new mx();
            localmx3.cPr.cEg = j;
            localmx3.cPr.content = str11;
            com.tencent.mm.sdk.c.a.aGB().g(localmx3);
            if (localmx3.cPs.type == i);
            int i7;
            for (int i6 = j; (i6 != 0) || (localar2.getContent().equals(ar.ijt)); i7 = 0)
            {
              localms.cMM.setStatus(6);
              bg.qW().oV().a(localms.cMM.kk(), localms.cMM);
              this.joF.aWd();
              mx localmx4 = new mx();
              localmx4.cPr.cEg = 5;
              localmx4.cPr.cEh = localms.cMM.kt();
              localmx4.cPr.context = this.joF.agh();
              localmx4.cPr.cPu = 4;
              com.tencent.mm.sdk.c.a.aGB().g(localmx4);
              com.tencent.mm.plugin.f.c.n localn3 = com.tencent.mm.plugin.f.c.n.fTF;
              Object[] arrayOfObject3 = new Object[i];
              arrayOfObject3[0] = Integer.valueOf(i);
              arrayOfObject3[j] = Integer.valueOf(2);
              if ((localms.cMM.kz() == null) || (localms.cMM.kz().length() <= 0))
                i = j;
              arrayOfObject3[2] = Integer.valueOf(i);
              localn3.d(11033, arrayOfObject3);
              return;
            }
            break;
          }
          if (localar2.aJG())
          {
            if (!bg.qW().isSDCardAvailable())
              break;
            ar localar6 = localms.cMM;
            g.axR().b(this.joF.agh(), localar6);
            return;
          }
          if (localar2.aJx())
          {
            if (this.joF == null)
              break;
            com.tencent.mm.plugin.f.c.n.fTF.q(10221, "1");
            Intent localIntent7 = new Intent();
            localIntent7.addFlags(67108864);
            com.tencent.mm.am.a.b(this.joF.agh(), "shake", ".ui.ShakeReportUI", localIntent7);
            return;
          }
          if (localar2.aJI())
          {
            if (!bg.qW().isSDCardAvailable())
            {
              en.cp(this.joF.agh());
              return;
            }
            this.joi.b(localms.position, localms.cMM);
            return;
          }
          z.e("!56@/B4Tb64lLpKwUcOR+EdWcik3L5UqfFb8jMHkIb1EO8Tn8j+imdtF5g==", "uknown msg type");
          return;
        }
      }
      label5505: label5933: k = 0;
      break label535;
      k = 0;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.fu
 * JD-Core Version:    0.6.2
 */