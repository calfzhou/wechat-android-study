package com.tencent.mm.plugin.exdevice.b;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.c.a.ea;
import com.tencent.mm.c.a.eb;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.n.af;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.oy;
import com.tencent.mm.protocal.a.oz;
import com.tencent.mm.protocal.a.qs;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.protocal.a.xf;
import com.tencent.mm.q.aa;
import com.tencent.mm.sdk.c.g;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;

public final class x extends g
  implements com.tencent.mm.o.m
{
  private ProgressDialog dWT;
  private ea eJe;

  public x()
  {
    super(0);
  }

  private void Pn()
  {
    if ((this.eJe != null) && (this.eJe.idI != null))
    {
      this.eJe.cJR.ret = 1;
      this.eJe.idI.run();
    }
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    if ((this.dWT != null) && (this.dWT.isShowing()))
      this.dWT.dismiss();
    if (paramx == null)
      Pn();
    xf localxf;
    String str5;
    label639: 
    do
    {
      do
      {
        return;
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = Integer.valueOf(paramx.getType());
          z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "scene.getType() = %s", arrayOfObject1);
          Pn();
          return;
        }
        Object[] arrayOfObject2 = new Object[1];
        arrayOfObject2[0] = Integer.valueOf(paramx.getType());
        z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "scene.getType() = %s", arrayOfObject2);
      }
      while (paramx.getType() != 540);
      bg.qX().b(540, this);
      localxf = ((u)paramx).Pl();
      if (localxf == null)
      {
        z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "resp == null");
        Pn();
        return;
      }
      oy localoy = localxf.hQL;
      if (localoy != null)
      {
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = localoy.ieE;
        arrayOfObject5[1] = localoy.ieD;
        z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "deviceId = %s, deviceType = %s", arrayOfObject5);
      }
      oz localoz = localxf.hQM;
      if (localoz != null)
      {
        Object[] arrayOfObject4 = new Object[6];
        arrayOfObject4[0] = localoz.ieG;
        arrayOfObject4[1] = localoz.ieF;
        arrayOfObject4[2] = Integer.valueOf(localoz.ieK);
        arrayOfObject4[3] = localoz.ieI;
        arrayOfObject4[4] = Integer.valueOf(localoz.ieJ);
        arrayOfObject4[5] = localoz.ieH;
        z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "AuthKey = %s, BrandName = %s, CloseStrategy = %s, ConnProto = %s, ConnStrategy = %s, Mac = %s", arrayOfObject4);
      }
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = localxf.hQK;
      z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "resp.BindTicket = %s", arrayOfObject3);
      sk localsk = localxf.irw;
      if (localsk == null)
      {
        z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "mContact == null");
        Pn();
        return;
      }
      if ((this.eJe != null) && (this.eJe.idI != null))
      {
        this.eJe.cJR.ret = 2;
        this.eJe.idI.run();
      }
      if (localsk == null)
        z.f("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "unable to parse mod contact");
      while (true)
      {
        str5 = ai.a(localsk.hVf);
        if ((this.eJe != null) && (this.eJe.cJQ != null) && (this.eJe.cJQ.context != null))
          break;
        z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "a8KeyRedirectEvent null");
        return;
        String str1 = ai.a(localsk.hVf);
        String str2 = ch.ja(localsk.imf);
        if ((ch.jb(str1)) && (ch.jb(str2)))
        {
          z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
        }
        else
        {
          z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "processModContact : %s", new Object[] { str1 });
          i locali1 = bg.qW().oT().ys(str1);
          if ((locali1 != null) && (str1.equals(locali1.jk())))
          {
            z.w("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "cat's replace user with stranger");
          }
          else
          {
            i locali2 = new i(str1);
            locali2.aR(localsk.dti);
            locali2.setType(localsk.hUC & localsk.hUD);
            long l;
            if (!ch.jb(str2))
            {
              locali2.bb(str2);
              if (locali1 != null)
                break label1193;
              l = 0L;
              locali2.dhv = l;
              locali2.aU(ai.a(localsk.ifj));
              locali2.aV(ai.a(localsk.hUY));
              locali2.aW(ai.a(localsk.hUZ));
              locali2.bj(localsk.dtf);
              locali2.bn(localsk.hUI);
              locali2.aX(ai.a(localsk.ilZ));
              locali2.bp(localsk.hUM);
              locali2.bo(localsk.dth);
              locali2.bn(RegionCodeDecoder.v(localsk.dtm, localsk.Ks, localsk.Kt));
              locali2.bh(localsk.dtg);
              locali2.bg(localsk.ifO);
              locali2.bo(localsk.ifP);
              locali2.setSource(localsk.hPv);
              locali2.bf(localsk.ifS);
              locali2.aY(localsk.ifR);
              if (com.tencent.mm.model.y.dV(localsk.ifQ))
                locali2.bl(localsk.ifQ);
              locali2.br((int)ch.CL());
              locali2.aT(ai.a(localsk.ilQ));
              locali2.aZ(ai.a(localsk.ilS));
              locali2.ba(ai.a(localsk.ilR));
              locali2.bp(localsk.hPB);
              locali2.bq(localsk.imp);
              if ((locali1 != null) && (!ch.ja(locali1.jD()).equals(ch.ja(localsk.imp))))
                com.tencent.mm.ag.c.yU().hm(str1);
              bg.qW().oT().yy(str1);
              if (!ch.jb(locali2.getUsername()))
                break label1205;
              z.e("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "dkinit dealModContactExtInfo failed invalid contact");
              locali2.bl(localsk.imo);
              if ((localsk.imk != null) && (localsk.imk.hOZ != null))
              {
                locali2.br(localsk.imk.hOZ.hQO);
                locali2.bs(localsk.imk.hOZ.hQP);
                locali2.bt(localsk.imk.hOZ.hQQ);
              }
              if (com.tencent.mm.model.y.dP(str1))
                locali2.tD();
              if (locali2.aIg())
                locali2.uH();
              if (ch.jb(str2))
                break label1528;
              bg.qW().oT().b(str2, locali2);
            }
            while (true)
            {
              if ((locali1 == null) || ((0x800 & locali1.getType()) == (0x800 & locali2.getType())))
                break label1541;
              if ((0x800 & locali2.getType()) == 0)
                break label1543;
              bg.qW().oW().yI(locali2.getUsername());
              break;
              if ((locali1 == null) || ((int)locali1.dhv <= 0))
                break label639;
              locali2.bb(locali1.jk());
              break label639;
              l = (int)locali1.dhv;
              break label647;
              String str3 = locali2.getUsername();
              com.tencent.mm.n.x localx = com.tencent.mm.n.c.a(str3, localsk);
              af.sJ().a(localx);
              aan localaan = localsk.ifU;
              if ((!locali2.getUsername().endsWith("@chatroom")) && (localaan != null))
              {
                z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "SnsFlag modcontact " + localaan.dto + " " + localsk.hVf);
                z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "SnsBg modcontact " + localaan.dtp);
                z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "SnsBgId modcontact " + localaan.dtq);
                z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "SnsBgId modcontact " + localaan.itD);
                if (am.ayh() != null)
                  am.ayh().a(locali2.getUsername(), localaan);
              }
              String str4 = com.tencent.mm.model.x.pG();
              if ((str4 == null) || (str4.equals(str3)))
                break label985;
              com.tencent.mm.q.a locala = aa.uY().fz(str3);
              locala.field_username = str3;
              locala.field_brandList = localsk.dtn;
              ev localev = localsk.ifV;
              if (localev != null)
              {
                locala.field_brandFlag = localev.dtr;
                locala.field_brandInfo = localev.dtt;
                locala.field_brandIconURL = localev.dtu;
                locala.field_extInfo = localev.dts;
              }
              if (!aa.uY().b(locala))
                aa.uY().a(locala);
              locali2.bs(locala.field_type);
              break label985;
              bg.qW().oT().E(locali2);
            }
            continue;
            bg.qW().oW().yJ(locali2.getUsername());
          }
        }
      }
    }
    while (bg.qW().oT().ys(str5) == null);
    label647: label985: label1528: Intent localIntent = new Intent();
    label1193: label1205: localIntent.putExtra("Contact_User", str5);
    label1541: label1543: localIntent.putExtra("KIsHardDevice", true);
    localIntent.putExtra("KHardDeviceBindTicket", localxf.hQK);
    com.tencent.mm.plugin.exdevice.d.OI().c(localIntent, this.eJe.cJQ.context);
  }

  public final boolean a(com.tencent.mm.sdk.c.e parame)
  {
    if (!(parame instanceof ea))
      z.f("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "mismatched event");
    String str;
    do
    {
      do
      {
        return false;
        this.eJe = ((ea)parame);
        str = this.eJe.cJQ.cJT;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(this.eJe.cJQ.cJS);
        arrayOfObject[1] = str;
        z.i("!76@/B4Tb64lLpLHXwcx366fGsQTUA1uuGmwf2LS9O26D53rmJsRGXzdJ83Ab4X9I+5dfbhyQdXrR+M=", "action = %s, key = %s", arrayOfObject);
      }
      while (ch.jb(str));
      switch (this.eJe.cJQ.cJS)
      {
      default:
        return false;
      case 15:
      }
    }
    while ((this.eJe.cJQ.context == null) || (!(this.eJe.cJQ.context instanceof Activity)));
    bg.qX().a(540, this);
    u localu = new u(str);
    bg.qX().d(localu);
    Context localContext = this.eJe.cJQ.context;
    this.eJe.cJQ.context.getString(n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(localContext, this.eJe.cJQ.context.getString(n.ccw), new y(this, localu));
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.b.x
 * JD-Core Version:    0.6.2
 */