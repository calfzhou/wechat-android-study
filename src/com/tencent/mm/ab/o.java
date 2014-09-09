package com.tencent.mm.ab;

import com.tencent.mm.c.a.bh;
import com.tencent.mm.c.a.ga;
import com.tencent.mm.c.a.gb;
import com.tencent.mm.c.a.hh;
import com.tencent.mm.c.a.jd;
import com.tencent.mm.c.a.le;
import com.tencent.mm.c.a.lk;
import com.tencent.mm.c.a.lm;
import com.tencent.mm.c.a.lo;
import com.tencent.mm.c.a.lv;
import com.tencent.mm.model.at;
import com.tencent.mm.model.av;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.cs;
import com.tencent.mm.model.v;
import com.tencent.mm.modelfriend.ag;
import com.tencent.mm.modelfriend.ah;
import com.tencent.mm.o.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.pluginsdk.aj;
import com.tencent.mm.pluginsdk.al;
import com.tencent.mm.pluginsdk.am;
import com.tencent.mm.pluginsdk.g;
import com.tencent.mm.pluginsdk.h;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.a.aan;
import com.tencent.mm.protocal.a.abk;
import com.tencent.mm.protocal.a.aed;
import com.tencent.mm.protocal.a.dj;
import com.tencent.mm.protocal.a.dk;
import com.tencent.mm.protocal.a.ee;
import com.tencent.mm.protocal.a.ev;
import com.tencent.mm.protocal.a.ex;
import com.tencent.mm.protocal.a.fa;
import com.tencent.mm.protocal.a.fd;
import com.tencent.mm.protocal.a.fh;
import com.tencent.mm.protocal.a.fp;
import com.tencent.mm.protocal.a.fq;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.protocal.a.pj;
import com.tencent.mm.protocal.a.qs;
import com.tencent.mm.protocal.a.sd;
import com.tencent.mm.protocal.a.sf;
import com.tencent.mm.protocal.a.sk;
import com.tencent.mm.protocal.a.sl;
import com.tencent.mm.protocal.a.ss;
import com.tencent.mm.protocal.a.st;
import com.tencent.mm.protocal.a.sx;
import com.tencent.mm.protocal.a.sy;
import com.tencent.mm.protocal.a.tf;
import com.tencent.mm.protocal.a.va;
import com.tencent.mm.q.aa;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.ck;
import com.tencent.mm.storage.cl;
import com.tencent.mm.storage.cn;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public final class o
{
  private static List dzI = new ArrayList();
  private boolean dzJ = false;
  private boolean dzK = false;
  private List dzL = new LinkedList();

  public static void a(com.tencent.mm.model.az paramaz)
  {
    synchronized (dzI)
    {
      if (!dzI.contains(paramaz))
        dzI.add(paramaz);
      return;
    }
  }

  private static void a(fh paramfh)
  {
    LinkedList localLinkedList = paramfh.hVk;
    for (int i = 0; i < localLinkedList.size(); i++)
      bw.c(ai.a(paramfh.hVf), ((Integer)localLinkedList.get(i)).intValue());
  }

  public static void a(sk paramsk)
  {
    a(paramsk, null);
  }

  private static void a(sk paramsk, String paramString, com.tencent.mm.storage.i parami)
  {
    String str = com.tencent.mm.model.x.pG();
    if ((str != null) && (!str.equals(paramString)))
    {
      com.tencent.mm.q.a locala = aa.uY().fz(paramString);
      locala.field_username = paramString;
      locala.field_brandList = paramsk.dtn;
      ev localev = paramsk.ifV;
      if (localev != null)
      {
        locala.field_brandFlag = localev.dtr;
        locala.field_brandInfo = localev.dtt;
        locala.field_brandIconURL = localev.dtu;
        locala.field_extInfo = localev.dts;
      }
      if ((locala.tY() != null) && (locala.tY().uz() == 3) && (locala.tY().uD() != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(locala.tY().uD().dqu)))
      {
        locala.field_enterpriseFather = locala.tY().uD().dqu;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramString;
        arrayOfObject[1] = locala.field_enterpriseFather;
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "saveBizInfo, %s set enterpriseFather %s", arrayOfObject);
      }
      if (!aa.uY().b(locala))
        aa.uY().a(locala);
      parami.bs(locala.field_type);
    }
  }

  private static void a(sk paramsk, byte[] paramArrayOfByte)
  {
    if (paramsk == null)
    {
      z.f("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "unable to parse mod contact");
      label11: return;
    }
    String str1 = ai.a(paramsk.hVf);
    String str2 = com.tencent.mm.sdk.platformtools.ch.ja(paramsk.imf);
    if ((com.tencent.mm.sdk.platformtools.ch.jb(str1)) && (com.tencent.mm.sdk.platformtools.ch.jb(str2)))
    {
      z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModContact user is null user:%s enuser:%s", new Object[] { str1, str2 });
      return;
    }
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = str1;
    arrayOfObject1[1] = Integer.valueOf(paramsk.hUC & paramsk.hUD);
    z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModContact : %s, type : %s", arrayOfObject1);
    com.tencent.mm.storage.i locali1 = com.tencent.mm.model.bg.qW().oT().ys(str1);
    if ((locali1 != null) && (str1.equals(locali1.jk())))
    {
      z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "cat's replace user with stranger");
      return;
    }
    com.tencent.mm.storage.i locali2 = new com.tencent.mm.storage.i(str1);
    locali2.aR(paramsk.dti);
    locali2.setType(paramsk.hUC & paramsk.hUD);
    label182: long l;
    label190: cn localcn1;
    if (!com.tencent.mm.sdk.platformtools.ch.jb(str2))
    {
      locali2.bb(str2);
      if (locali1 != null)
        break label1919;
      l = 0L;
      locali2.dhv = l;
      locali2.aU(ai.a(paramsk.ifj));
      locali2.aV(ai.a(paramsk.hUY));
      locali2.aW(ai.a(paramsk.hUZ));
      locali2.bj(paramsk.dtf);
      locali2.bn(paramsk.hUI);
      locali2.aX(ai.a(paramsk.ilZ));
      locali2.bp(paramsk.hUM);
      locali2.bo(paramsk.dth);
      locali2.bn(RegionCodeDecoder.v(paramsk.dtm, paramsk.Ks, paramsk.Kt));
      locali2.bh(paramsk.dtg);
      locali2.bg(paramsk.ifO);
      locali2.bo(paramsk.ifP);
      locali2.setSource(paramsk.hPv);
      locali2.bf(paramsk.ifS);
      locali2.aY(paramsk.ifR);
      if (com.tencent.mm.model.y.dV(paramsk.ifQ))
        locali2.bl(paramsk.ifQ);
      locali2.br((int)com.tencent.mm.sdk.platformtools.ch.CL());
      locali2.aT(ai.a(paramsk.ilQ));
      locali2.aZ(ai.a(paramsk.ilS));
      locali2.ba(ai.a(paramsk.ilR));
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = str1;
      arrayOfObject2[1] = paramsk.hVh;
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "cpan[processModContact] user:%s LabelIDList:%s", arrayOfObject2);
      locali2.bc(paramsk.hVh);
      locali2.bp(paramsk.hPB);
      locali2.bq(paramsk.imp);
      if ((locali1 != null) && (!com.tencent.mm.sdk.platformtools.ch.ja(locali1.jD()).equals(com.tencent.mm.sdk.platformtools.ch.ja(paramsk.imp))))
        com.tencent.mm.ag.c.yU().hm(str1);
      if (com.tencent.mm.sdk.platformtools.ch.B(paramArrayOfByte))
        break label1931;
      com.tencent.mm.model.bg.qW().oT().h(str1, paramArrayOfByte);
      if (com.tencent.mm.storage.i.nY(locali2.jd()))
        a(paramsk, str1, locali2);
      label559: locali2.bl(paramsk.imo);
      if ((paramsk.imk != null) && (paramsk.imk.hOZ != null))
      {
        locali2.br(paramsk.imk.hOZ.hQO);
        locali2.bs(paramsk.imk.hOZ.hQP);
        locali2.bt(paramsk.imk.hOZ.hQQ);
      }
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "cpan[dealWithContactLabel] user:%s ecnryptUser:%s", new Object[] { str1, str2 });
      localcn1 = com.tencent.mm.model.bg.qW().oU().Ab(locali2.jk());
      if (localcn1 == null)
        break label2484;
    }
    label945: label2354: label2484: for (String str3 = localcn1.field_contactLabels; ; str3 = null)
    {
      if (com.tencent.mm.sdk.platformtools.ch.jb(str3))
      {
        localcn1 = com.tencent.mm.model.bg.qW().oU().Ab(locali2.getUsername());
        if (localcn1 != null)
          str3 = localcn1.field_contactLabels;
      }
      if (!com.tencent.mm.sdk.platformtools.ch.jb(str3))
      {
        g.ayc().au(locali2.getUsername(), str3);
        localcn1.field_contactLabels = "";
        com.tencent.mm.model.bg.qW().oU().c(localcn1);
      }
      cn localcn2 = com.tencent.mm.model.bg.qW().oU().Ab(locali2.getUsername());
      label872: int j;
      boolean bool3;
      int i;
      label1333: label1521: com.tencent.mm.storage.r localr;
      if (!com.tencent.mm.sdk.platformtools.ch.jb(locali2.ja()))
      {
        if ((localcn2 != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(locali2.jC())) && (!locali2.jC().equals(localcn2.field_conDescription)))
          a(locali2, localcn2);
        bool1 = false;
        if (com.tencent.mm.model.y.dP(str1))
          locali2.tD();
        if (locali2.aIg())
          locali2.uH();
        if (com.tencent.mm.sdk.platformtools.ch.jb(str2))
          break label2327;
        com.tencent.mm.model.bg.qW().oT().b(str2, locali2);
        if (bool1)
        {
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "needModContact");
          com.tencent.mm.model.y.o(locali2);
        }
        if (com.tencent.mm.model.y.dc(str1))
        {
          if ((paramsk.ibt != null) && (!a(str1, paramsk.ibt.hTv)))
            b(str1, paramsk.ibt.hTv);
          Object[] arrayOfObject7 = new Object[1];
          if (paramsk.ibt != null)
            break label2342;
          j = 0;
          arrayOfObject7[0] = Integer.valueOf(j);
          z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModContact chatroom count:%d", arrayOfObject7);
          if ((paramsk.ibt != null) && (paramsk.ibt.hOA != 0))
          {
            z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "mod roomdata " + paramsk.imd);
            com.tencent.mm.e.a.a.a locala = new com.tencent.mm.e.a.a.a();
            locala.type = paramsk.imn;
            locala.yz = paramsk.imm;
            locala.dJx = paramsk.hTI;
            locala.dJy = paramsk.iml;
            if (paramsk.ibt.hTw == 0)
              locala.cLj = paramsk.iml;
            Object[] arrayOfObject8 = new Object[7];
            arrayOfObject8[0] = paramsk.imc;
            arrayOfObject8[1] = Integer.valueOf(paramsk.imn);
            arrayOfObject8[2] = Integer.valueOf(paramsk.imm);
            arrayOfObject8[3] = paramsk.hTI;
            arrayOfObject8[4] = Integer.valueOf(paramsk.iml);
            arrayOfObject8[5] = Integer.valueOf(paramsk.ibt.hTw);
            if (paramsk.ibt.hTw != 0)
              break label2354;
            bool3 = true;
            arrayOfObject8[6] = Boolean.valueOf(bool3);
            z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "chatOwner:%s, type:%d,  maxCount: %d, upgrader: %s,  Version:%d,  infoMask:%d, isInit:%b", arrayOfObject8);
            ga localga = new ga();
            localga.cLh.cLi = str1;
            localga.cLh.cLj = locala.cLj;
            Object[] arrayOfObject9 = new Object[2];
            arrayOfObject9[0] = localga.cLh.cLi;
            arrayOfObject9[1] = Integer.valueOf(localga.cLh.cLj);
            z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "summert syncAddChatroomMember user: %s oldVer: %d", arrayOfObject9);
            v.a(str1, paramsk.imc, paramsk.ibt, com.tencent.mm.model.x.pG(), locala, localga);
            if (locala.cLj < locala.dJy)
            {
              com.tencent.mm.c.a.y localy = new com.tencent.mm.c.a.y();
              localy.cHC.username = str1;
              com.tencent.mm.sdk.c.a.aGB().g(localy);
            }
          }
        }
        if (!com.tencent.mm.g.a.cv(locali2.getType()))
        {
          if ((0x2 & locali2.getType()) == 0)
            break label2360;
          i = 1;
          if ((i == 0) && (!com.tencent.mm.storage.i.yc(locali2.getUsername())))
          {
            Object[] arrayOfObject6 = new Object[2];
            arrayOfObject6[0] = locali2.getUsername();
            arrayOfObject6[1] = Integer.valueOf(locali2.getType());
            z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModContact delChatContact now user:%s ,type:%d", arrayOfObject6);
            com.tencent.mm.model.bg.qW().oW().yC(locali2.getUsername());
          }
        }
        if ((0x800 & locali2.getType()) == 0)
          break label2366;
        if ((locali1 == null) || ((0x800 & locali1.getType()) != (0x800 & locali2.getType())))
          com.tencent.mm.model.bg.qW().oW().yI(locali2.getUsername());
        if ((0x8 & locali2.getType()) == 0)
          break label2410;
        if ((locali1 == null) || ((0x8 & locali1.getType()) != (0x8 & locali2.getType())))
        {
          com.tencent.mm.storage.s locals2 = com.tencent.mm.model.bg.qW().oW();
          String[] arrayOfString2 = new String[1];
          arrayOfString2[0] = locali2.getUsername();
          locals2.c(arrayOfString2, "@blacklist");
        }
        if ((locali1 == null) || ((int)locali1.dhv <= 0) || (locali1.jB() == locali2.jB()) || (locali1.jB() != 0) || (locali2.jB() != 1))
          break label2468;
        Object[] arrayOfObject4 = new Object[1];
        arrayOfObject4[0] = locali2.getUsername();
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "hakon removeParentRefAndUnread user = %s", arrayOfObject4);
        com.tencent.mm.model.bg.qW().oW().yT(locali2.getUsername());
        localr = com.tencent.mm.model.bg.qW().oW().yE("officialaccounts");
        if (localr == null)
          break;
        localr.bt(com.tencent.mm.model.bg.qW().oW().yQ("officialaccounts"));
        Object[] arrayOfObject5 = new Object[1];
        arrayOfObject5[0] = Integer.valueOf(localr.jI());
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "unread count is %d", arrayOfObject5);
        String str4 = com.tencent.mm.model.bg.qW().oW().yR("officialaccounts");
        com.tencent.mm.storage.ar localar = com.tencent.mm.model.bg.qW().oV().zr(str4);
        if ((localar == null) || (localar.kk() <= 0L))
          break label2470;
        localr.v(localar);
        localr.setContent(localar.kt() + ":" + localar.getContent());
        localr.bv(Integer.toString(localar.getType()));
        w localw = com.tencent.mm.model.bg.qW().oW().ih();
        if (localw != null)
        {
          PString localPString1 = new PString();
          PString localPString2 = new PString();
          PInt localPInt = new PInt();
          localar.bJ("officialaccounts");
          localar.setContent(localr.getContent());
          localw.a(localar, localPString1, localPString2, localPInt, true);
          localr.bu(localPString1.value);
          localr.bw(localPString2.value);
          localr.bx(localPInt.value);
        }
        label1874: com.tencent.mm.model.bg.qW().oW().a(localr, localr.getUsername());
        return;
        if ((locali1 == null) || ((int)locali1.dhv <= 0))
          break label182;
        locali2.bb(locali1.jk());
        break label182;
        label1919: l = (int)locali1.dhv;
        break label190;
        com.tencent.mm.model.bg.qW().oT().yy(str1);
        a(locali2, paramsk);
        break label559;
      }
      if (((localcn2 == null) || (com.tencent.mm.sdk.platformtools.ch.jb(localcn2.field_encryptUsername))) && (!com.tencent.mm.sdk.platformtools.ch.jb(str2)))
        localcn2 = com.tencent.mm.model.bg.qW().oU().Ab(str2);
      if ((localcn2 != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(localcn2.field_encryptUsername)))
      {
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "mod stranger remark : " + localcn2.field_encryptUsername);
        locali2.aT(localcn2.field_conRemark);
        locali2.aZ(com.tencent.mm.platformtools.f.jv(localcn2.field_conRemark));
        locali2.ba(com.tencent.mm.platformtools.f.jw(localcn2.field_conRemark));
      }
      for (boolean bool1 = a(locali2, localcn2); ; bool1 = false)
        switch (locali2.getSource())
        {
        case 12:
        default:
          break;
        case 10:
        case 11:
        case 13:
          com.tencent.mm.modelfriend.i locali;
          if ((paramsk != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(paramsk.imi)))
            locali = com.tencent.mm.modelfriend.az.wZ().O(paramsk.imi, paramsk.imj);
          while (true)
          {
            if ((locali == null) || (com.tencent.mm.sdk.platformtools.ch.jb(locali.vw())) || (!locali.vG()))
              break label2325;
            Object[] arrayOfObject3 = new Object[3];
            arrayOfObject3[0] = locali.vw();
            arrayOfObject3[1] = locali.getUsername();
            arrayOfObject3[2] = Boolean.valueOf(bool1);
            z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "remarkName RealName[%s], User[%s], remarkChange[%s]", arrayOfObject3);
            locali.setUsername(locali2.getUsername());
            locali.setStatus(2);
            locali.vF();
            if (!bool1)
            {
              locali2.aT(locali.vw());
              locali2.aZ(com.tencent.mm.platformtools.f.jv(locali.vw()));
              locali2.ba(com.tencent.mm.platformtools.f.jw(locali.vw()));
              bool1 = true;
            }
            if (!com.tencent.mm.g.a.cv(locali2.getType()))
              break;
            com.tencent.mm.modelfriend.az.wZ().a(locali.vu(), locali);
            break;
            boolean bool2 = com.tencent.mm.sdk.platformtools.ch.jb(str2);
            locali = null;
            if (!bool2)
              locali = com.tencent.mm.modelfriend.az.wZ().gl(str2);
          }
          break;
          com.tencent.mm.model.bg.qW().oT().E(locali2);
          break label872;
          j = paramsk.ibt.hOA;
          break label945;
          bool3 = false;
          break label1153;
          label2360: i = 0;
          break label1333;
          label2366: if ((locali1 != null) && ((0x800 & locali1.getType()) == (0x800 & locali2.getType())))
            break label1453;
          com.tencent.mm.model.bg.qW().oW().yJ(locali2.getUsername());
          break label1453;
          label2410: if ((locali1 != null) && ((0x8 & locali1.getType()) == (0x8 & locali2.getType())))
            break label1521;
          com.tencent.mm.storage.s locals1 = com.tencent.mm.model.bg.qW().oW();
          String[] arrayOfString1 = new String[1];
          arrayOfString1[0] = locali2.getUsername();
          locals1.c(arrayOfString1, "");
          break label1521;
          break label11;
          localr.aIB();
          break label1874;
        }
    }
  }

  private void a(com.tencent.mm.storage.ar paramar, com.tencent.mm.protocal.a.q paramq)
  {
    if (dzI.isEmpty())
      z.v("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "no notifiers, ignore");
    while (true)
    {
      return;
      if ((paramar.jK() != 0) || (paramar.getStatus() == 4))
      {
        z.v("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "not new msg, ignore");
        return;
      }
      String str = ai.a(paramq.hOP);
      cj localcj = com.tencent.mm.model.bg.qW().oY().zX(new ck(str).zW(""));
      if ((localcj != null) && (!localcj.aKE()))
      {
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "account no notification");
        return;
      }
      if (this.dzK)
        break;
      this.dzK = true;
      ArrayList localArrayList = new ArrayList();
      synchronized (dzI)
      {
        Iterator localIterator1 = dzI.iterator();
        if (localIterator1.hasNext())
          localArrayList.add((com.tencent.mm.model.az)localIterator1.next());
      }
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
      {
        com.tencent.mm.model.az localaz = (com.tencent.mm.model.az)localIterator2.next();
        new cm(localaz.getLooper()).post(new q(this, localaz, paramar));
      }
    }
    this.dzL.add(paramar);
  }

  private static boolean a(com.tencent.mm.storage.i parami, sk paramsk)
  {
    if ((parami == null) || (com.tencent.mm.sdk.platformtools.ch.jb(parami.getUsername())))
    {
      z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkinit dealModContactExtInfo failed invalid contact");
      return false;
    }
    String str1 = parami.getUsername();
    String str2 = parami.jk();
    com.tencent.mm.n.x localx = com.tencent.mm.n.c.a(str1, paramsk);
    com.tencent.mm.n.af.sJ().a(localx);
    aan localaan = paramsk.ifU;
    if ((!parami.getUsername().endsWith("@chatroom")) && (localaan != null))
    {
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "SnsFlag modcontact " + localaan.dto + " " + paramsk.hVf);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "SnsBg modcontact " + localaan.dtp);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "SnsBgId modcontact " + localaan.dtq);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "SnsBgId modcontact " + localaan.itD);
      if (am.ayh() != null)
        am.ayh().a(parami.getUsername(), localaan);
    }
    boolean bool;
    if (com.tencent.mm.g.a.cv(parami.getType()))
    {
      bool = com.tencent.mm.aj.l.AF().q(str1, 1);
      if (!bool)
        break label407;
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "fmsgConversation updateState succ, user = " + str1);
    }
    while (true)
    {
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModContact, update state(ADDED) FMessageConversation, ret = " + bool);
      if ((com.tencent.mm.g.a.cv(parami.getType())) && ((parami.getSource() == 10) || (parami.getSource() == 13)))
      {
        com.tencent.mm.modelsimple.f.c(ak.getContext(), parami.getUsername(), parami.jk());
        com.tencent.mm.modelfriend.i locali = com.tencent.mm.modelfriend.az.wZ().gl(parami.jk());
        if ((locali != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(locali.vH())))
        {
          locali.setUsername(parami.getUsername());
          int i = com.tencent.mm.modelfriend.az.wZ().a(locali.vH(), locali);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "account sync: update addr " + i);
        }
      }
      a(paramsk, str1, parami);
      return true;
      label407: bool = com.tencent.mm.aj.l.AF().q(str2, 1);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "fmsgConversation updateState succ, encryptUser = " + str2);
    }
  }

  private static boolean a(com.tencent.mm.storage.i parami, cn paramcn)
  {
    if (!com.tencent.mm.sdk.platformtools.ch.jb(paramcn.field_conDescription))
      parami.bp(paramcn.field_conDescription);
    boolean bool1 = com.tencent.mm.model.y.df(parami.getUsername());
    boolean bool2 = false;
    if (!bool1)
    {
      boolean bool3 = com.tencent.mm.g.a.cv(parami.getType());
      bool2 = false;
      if (bool3)
      {
        com.tencent.mm.model.bg.qW().oU().Ac(paramcn.field_encryptUsername);
        bool2 = true;
        if (!com.tencent.mm.sdk.platformtools.ch.jb(paramcn.field_conDescription))
        {
          sl localsl = new sl();
          localsl.imq = parami.getUsername();
          localsl.hwQ = paramcn.field_conDescription;
          com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(54, localsl));
        }
      }
    }
    return bool2;
  }

  private static boolean a(String paramString, LinkedList paramLinkedList)
  {
    if (g.axZ() == null)
      return false;
    String str = g.axZ().We();
    if ((com.tencent.mm.sdk.platformtools.ch.jb(str)) || (!str.equals(paramString)) || (!com.tencent.mm.model.y.dc(paramString)))
      return false;
    if (paramLinkedList != null)
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        dk localdk = (dk)localIterator.next();
        if ((!com.tencent.mm.sdk.platformtools.ch.jb(localdk.gnq)) && (localdk.gnq.equals(com.tencent.mm.model.x.pG())))
          return false;
      }
    }
    if (g.aya() != null)
    {
      if (g.aya().aw(paramString, com.tencent.mm.model.x.pG()))
      {
        z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "kicked self shareing");
        lv locallv = new lv();
        locallv.cOS.cDi = paramString;
        com.tencent.mm.sdk.c.a.aGB().g(locallv);
      }
      g.aya().a(paramString, null, 0.0D, 0.0D, "", "", "");
    }
    if ((g.axZ() != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(g.aya().Wo())))
    {
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = g.axZ().We();
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "sync remove chatroom end track %s", arrayOfObject);
      bh localbh = new bh();
      localbh.cIk.username = g.axZ().We();
      com.tencent.mm.sdk.c.a.aGB().g(localbh);
    }
    return true;
  }

  public static void b(com.tencent.mm.model.az paramaz)
  {
    synchronized (dzI)
    {
      dzI.remove(paramaz);
      return;
    }
  }

  private static void b(String paramString, LinkedList paramLinkedList)
  {
    lm locallm1 = new lm();
    locallm1.cOG.cOI = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallm1);
    if ((com.tencent.mm.sdk.platformtools.ch.jb(paramString)) || (!com.tencent.mm.model.y.dc(paramString)) || (com.tencent.mm.sdk.platformtools.ch.jb(locallm1.cOH.cOK)) || (!paramString.equals(locallm1.cOH.cOK)))
      return;
    if (paramLinkedList != null)
    {
      Iterator localIterator = paramLinkedList.iterator();
      while (localIterator.hasNext())
      {
        dk localdk = (dk)localIterator.next();
        if ((!com.tencent.mm.sdk.platformtools.ch.jb(localdk.gnq)) && (localdk.gnq.equals(com.tencent.mm.model.x.pG())))
          return;
      }
    }
    if (g.axT() != null)
      g.axT().a(paramString, null, "", "", 0);
    lm locallm2 = new lm();
    locallm2.cOG.cOJ = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallm2);
    lk locallk = new lk();
    locallk.cOB.cOC = true;
    com.tencent.mm.sdk.c.a.aGB().g(locallk);
  }

  private static void c(com.tencent.mm.protocal.a.q paramq)
  {
    if (com.tencent.mm.sdk.platformtools.ch.jb(paramq.hOX))
      return;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramq.hOX;
    z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "notifyPushContent, pushContent = %s", arrayOfObject);
    com.tencent.mm.model.bg.ig().a(paramq.hOX, ai.a(paramq.hOP), paramq.hOR);
  }

  public static boolean r(com.tencent.mm.storage.i parami)
  {
    if ((parami == null) || (com.tencent.mm.sdk.platformtools.ch.jb(parami.getUsername())))
    {
      Object[] arrayOfObject1 = new Object[1];
      if (parami == null);
      for (String str = "-1"; ; str = parami.getUsername())
      {
        arrayOfObject1[0] = str;
        z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dealModContactExtInfo username:%s ", arrayOfObject1);
        return false;
      }
    }
    byte[] arrayOfByte = com.tencent.mm.model.bg.qW().oT().yx(parami.getUsername());
    if (com.tencent.mm.sdk.platformtools.ch.B(arrayOfByte))
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = parami.getUsername();
      if (arrayOfByte == null);
      for (int i = -1; ; i = arrayOfByte.length)
      {
        arrayOfObject2[1] = Integer.valueOf(i);
        z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dealModContactExtInfo username:%s  buf:%d", arrayOfObject2);
        return false;
      }
    }
    try
    {
      sk localsk2 = new sk().bY(arrayOfByte);
      localsk1 = localsk2;
      com.tencent.mm.model.bg.qW().oT().yy(parami.getUsername());
      if (localsk1 == null)
      {
        z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkinit dealModContactExtInfo failed parse buf failed.");
        return false;
      }
      return a(parami, localsk1);
    }
    catch (Exception localException)
    {
      while (true)
        sk localsk1 = null;
    }
  }

  public final boolean a(ee paramee, boolean paramBoolean)
  {
    if (!com.tencent.mm.model.bg.oE())
    {
      z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "account storage disabled, discard all commands");
      return false;
    }
    long l = com.tencent.mm.sdk.platformtools.ch.CM();
    byte[] arrayOfByte = ai.a(paramee.hUr);
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Long.valueOf(l);
    arrayOfObject1[1] = Integer.valueOf(paramee.hUq);
    arrayOfObject1[2] = Integer.valueOf(com.tencent.mm.sdk.platformtools.ch.cG(arrayOfByte));
    arrayOfObject1[3] = Thread.currentThread().getName();
    z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd %d cmdid:%d buf:%d thr:[%s]", arrayOfObject1);
    if (com.tencent.mm.sdk.platformtools.ch.B(arrayOfByte))
    {
      z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "docmd: no protobuf found.");
      return false;
    }
    label873: int i2;
    label890: boolean bool13;
    label1741: boolean bool11;
    label2450: boolean bool12;
    label2462: boolean bool9;
    label3145: boolean bool10;
    label3167: va localva;
    boolean bool7;
    label3525: boolean bool8;
    label3547: com.tencent.mm.storage.i locali2;
    com.tencent.mm.storage.i locali3;
    while (true)
    {
      try
      {
        switch (paramee.hUq)
        {
        default:
          z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd: no processing method, cmd id=" + paramee.hUq);
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = Long.valueOf(l);
          arrayOfObject3[1] = Integer.valueOf(paramee.hUq);
          arrayOfObject3[2] = Long.valueOf(com.tencent.mm.sdk.platformtools.ch.ac(l));
          z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd FIN %d cmdid:%d Time:%d", arrayOfObject3);
          return true;
        case 2:
        case 17:
          sk localsk = new sk().bY(arrayOfByte);
          if (paramBoolean)
          {
            a(localsk, arrayOfByte);
            continue;
          }
          break;
        case 4:
        case 5:
        case 6:
        case 1:
        case 7:
        case 8:
        case 22:
        case 9:
        case 13:
        case 15:
        case 23:
        case 25:
        case 24:
        case 33:
        case 35:
        case 44:
        case 999999:
        case 53:
        }
      }
      catch (IOException localIOException)
      {
        z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "docmd: parse protobuf error, " + localIOException.getMessage());
        return false;
      }
      arrayOfByte = null;
      continue;
      String str19 = ai.a(new fa().bj(arrayOfByte).hVf);
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processDelContact user:%s", new Object[] { str19 });
      com.tencent.mm.model.bg.qW().oW().yC(str19);
      com.tencent.mm.model.y.dk(str19);
      continue;
      com.tencent.mm.protocal.a.q localq = new com.tencent.mm.protocal.a.q().aX(arrayOfByte);
      Object[] arrayOfObject10 = new Object[2];
      arrayOfObject10[0] = Long.valueOf(localq.hOY);
      arrayOfObject10[1] = Integer.valueOf(ao.dVZ);
      z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkmsgid  set svrmsgid %d -> %d", arrayOfObject10);
      if ((10008 == ao.dVY) && (ao.dVZ != 0))
      {
        localq.hOY = ao.dVZ;
        ao.dVZ = 0;
      }
      if (com.tencent.mm.model.bg.qW().oV().cX(localq.hOY))
      {
        z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
      }
      else
      {
        com.tencent.mm.model.ch.eq(localq.hOW);
        String str18 = ai.a(localq.hOP);
        if ((!com.tencent.mm.sdk.platformtools.ch.jb(str18)) && (!com.tencent.mm.model.bg.qW().oT().yu(str18)))
          at.qx().ec(str18);
        Object[] arrayOfObject11 = new Object[2];
        arrayOfObject11[0] = str18;
        arrayOfObject11[1] = Integer.valueOf(localq.hOR);
        z.i("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "add msg, user:%s type:%d", arrayOfObject11);
        if (str18.equals("readerapp"))
        {
          localq.hOP = ai.iU("newsapp");
          localq.hOR = 12399999;
        }
        if ((str18.equals("blogapp")) || (str18.equals("newsapp")))
          localq.hOR = 12399999;
        if (localq.hOR == 52)
          localq.hOR = 1000052;
        if (localq.hOR == 53)
          localq.hOR = 1000053;
        com.tencent.mm.o.j localj = com.tencent.mm.o.l.P(Integer.valueOf(localq.hOR));
        if (localj == null)
          localj = com.tencent.mm.o.l.P(str18);
        if (localj != null)
        {
          k localk = localj.a(localq);
          if (localk == null);
          for (com.tencent.mm.storage.ar localar2 = null; ; localar2 = localk.cCp)
          {
            if (localar2 != null)
              break label873;
            z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "extension declared but skipped msg, type=" + localq.hOR + ", svrid=" + localq.hOY);
            c(localq);
            break;
          }
          if ((!com.tencent.mm.model.y.dm(str18)) || (com.tencent.mm.z.b.ys()))
            break label5374;
          i2 = 1;
          if (i2 != 0)
          {
            c(localq);
          }
          else
          {
            z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", " msg , id =" + localar2.kk() + "  " + this.dzJ);
            if ((localar2.kk() > 0L) && (this.dzJ) && (localk.dor))
              a(localar2, localq);
            c(localq);
          }
        }
        else
        {
          Object[] arrayOfObject12 = new Object[1];
          arrayOfObject12[0] = Integer.valueOf(localq.hOR);
          z.f("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "unknown add msg request, type=%d. drop now !!!", arrayOfObject12);
          continue;
          st localst = new st().ca(arrayOfByte);
          com.tencent.mm.storage.ar localar1 = new com.tencent.mm.storage.ar();
          String str17 = (String)com.tencent.mm.model.bg.qW().oQ().get(2);
          aw localaw = com.tencent.mm.model.bg.qW().oV();
          localar1.setStatus(localst.dZy);
          if ((ai.a(localst.hOP) != null) && (ai.a(localst.hOP).equals(str17)))
            localar1.bJ(ai.a(localst.hOQ));
          while (true)
          {
            localaw.b(localst.hOY, localar1);
            break;
            if ((ai.a(localst.hOQ) != null) && (ai.a(localst.hOQ).equals(str17)))
            {
              localar1.bJ(ai.a(localst.hOP));
            }
            else
            {
              z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd : CmdModMsgStatus not found this msg");
              Assert.assertTrue("invalid mod msg cmd, unknown talker", false);
            }
          }
          sy localsy = new sy().cc(arrayOfByte);
          com.tencent.mm.model.bg.qW().oQ().get(2);
          com.tencent.mm.storage.e locale2 = com.tencent.mm.model.bg.qW().oQ();
          com.tencent.mm.n.af.sh();
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "mod user info, bitflag=-1");
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "userinfo state " + localsy.dZy);
          String str11 = ai.a(localsy.hVf);
          String str12 = ai.a(localsy.ifj);
          String str13 = ai.a(localsy.imM);
          String str14 = ai.a(localsy.imN);
          com.tencent.mm.storage.i locali7 = com.tencent.mm.model.bg.qW().oT().ys(str11);
          if ((locali7 == null) || (locali7.getUsername() == null) || (!locali7.getUsername().equals(str11)))
            locali7 = new com.tencent.mm.storage.i(str11);
          locali7.aR(localsy.dti);
          locali7.aU(str12);
          locali7.bn(RegionCodeDecoder.v(localsy.dtm, localsy.Ks, localsy.Kt));
          locali7.bj(localsy.dtf);
          locali7.bh(localsy.dtg);
          locali7.bf(localsy.ifS);
          locali7.bl(localsy.ifQ);
          locali7.aY(localsy.ifR);
          com.tencent.mm.model.bg.qW().oT().E(locali7);
          locale2.set(2, str11);
          locale2.set(4, str12);
          locale2.set(5, str13);
          locale2.set(6, str14);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd : status " + com.tencent.mm.protocal.j.nt(localsy.dZy));
          locale2.set(7, Integer.valueOf(localsy.dZy));
          if (localsy.dth != 0)
          {
            cs localcs = new cs();
            localcs.rS();
            localcs.bj(localsy.dtf);
            localcs.bh(localsy.dtg);
            localcs.setCountryCode(localsy.dtm);
            localcs.ez(localsy.Ks);
            localcs.ey(localsy.Kt);
            localcs.bl(localsy.ifQ);
            z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", " getPersonalCard weibo url : " + localcs.jt() + " nickName :" + localsy.ifR);
            cs.a(localcs);
          }
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "userinfo Plugstate: " + com.tencent.mm.protocal.j.nu(localsy.imO));
          locale2.set(34, Integer.valueOf(localsy.imO));
          com.tencent.mm.model.bg.qW();
          com.tencent.mm.model.b.ci(localsy.imO);
          if (1 != localsy.imt.hVr)
            break label5380;
          bool13 = true;
          locale2.set(8200, Boolean.valueOf(com.tencent.mm.sdk.platformtools.ch.a(Boolean.valueOf(bool13), false)));
          locale2.set(8201, Integer.valueOf(com.tencent.mm.sdk.platformtools.ch.a(Integer.valueOf(localsy.imt.hVs.hVv), 22)));
          locale2.set(8208, Integer.valueOf(com.tencent.mm.sdk.platformtools.ch.a(Integer.valueOf(localsy.imt.hVs.hUn), 8)));
          locale2.set(66049, Integer.valueOf(localsy.ifO));
          locale2.set(66050, localsy.ifP);
          locale2.set(40, Integer.valueOf(localsy.imT));
          locale2.set(41, Integer.valueOf(localsy.ifS));
          locale2.set(43, localsy.ifR);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd PluginSwitch:" + localsy.imT + " WeiboFlag:" + localsy.ifS);
          locale2.set(868518889, Integer.valueOf(localsy.imF));
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "doCmd USERINFO_TXNEWSCATEGORY:" + localsy.imF);
          locale2.set(42, localsy.dti);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "userid:" + localsy.hXa + " username:" + localsy.hXb);
          locale2.set(65825, localsy.hXa);
          com.tencent.mm.n.c.eG(localsy.hXa);
          locale2.set(65826, localsy.hXb);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "getiAlbumFlag " + localsy.dtj);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "getiAlbumStyle " + localsy.dtk);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "getPcAlbumBGImgID " + localsy.dtl);
          String str15 = com.tencent.mm.sdk.platformtools.ch.ja((String)com.tencent.mm.model.bg.qW().oQ().get(65830));
          if ((str15 == null) || (str15.length() == 0))
          {
            String str16 = localsy.imW;
            if ((str16 != null) && (str16.length() > 0))
            {
              com.tencent.mm.model.bg.qW().oQ().set(65830, str16);
              continue;
              ex localex = new ex().bi(arrayOfByte);
              com.tencent.mm.model.bg.qW().oW().yC(ai.a(localex.hVf));
              continue;
              fd localfd = new fd().bk(arrayOfByte);
              bw.j(ai.a(localfd.hVf), localfd.hVi);
              continue;
              pj localpj = new pj().bQ(arrayOfByte);
              ag localag = new ag();
              localag.setUsername(localpj.gnq);
              localag.dx(localpj.ifp);
              localag.dy((int)com.tencent.mm.sdk.platformtools.ch.CL());
              com.tencent.mm.modelfriend.az.xd().a(localag);
              continue;
              a(new fh().bl(arrayOfByte));
              continue;
              ss localss = new ss().bZ(arrayOfByte);
              if (1 == localss.imC)
              {
                cl localcl = com.tencent.mm.model.bg.qW().oY();
                String str10 = ai.a(localss.hVf);
                if (localss.imo != 1)
                  break label5386;
                bool11 = true;
                if (localss.imD != 1)
                  break label5392;
                bool12 = true;
                localcl.b(str10, bool11, bool12);
              }
              else
              {
                z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "unknown micro blog type:" + localss.imC);
                continue;
                sf localsf = new sf().bX(arrayOfByte);
                if (localsf != null)
                {
                  z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModChatRoomMember username:" + localsf.hVf + " nickname:" + localsf.ifj);
                  com.tencent.mm.storage.i locali6 = new com.tencent.mm.storage.i(ai.a(localsf.hVf));
                  locali6.aU(ai.a(localsf.ifj));
                  locali6.aV(ai.a(localsf.hUY));
                  locali6.aW(ai.a(localsf.hUZ));
                  locali6.bj(localsf.dtf);
                  locali6.aT(ai.a(localsf.ilQ));
                  locali6.aZ(ai.a(localsf.ilS));
                  locali6.ba(ai.a(localsf.ilR));
                  locali6.bn(localsf.hUI);
                  com.tencent.mm.n.x localx5 = new com.tencent.mm.n.x();
                  localx5.db(-1);
                  localx5.setUsername(locali6.getUsername());
                  localx5.ff(localsf.hTz);
                  localx5.fe(localsf.hTy);
                  Object[] arrayOfObject9 = new Object[3];
                  arrayOfObject9[0] = localx5.getUsername();
                  arrayOfObject9[1] = localx5.st();
                  arrayOfObject9[2] = localx5.su();
                  z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkhurl chatmember %s b[%s] s[%s]", arrayOfObject9);
                  localx5.T(true);
                  if ((localsf.ilV == 3) || (localsf.ilV == 4))
                  {
                    locali6.bi(localsf.ilV);
                    localx5.bi(localsf.ilV);
                  }
                  while (true)
                  {
                    com.tencent.mm.n.af.sJ().a(localx5);
                    com.tencent.mm.model.bg.qW().oT().E(locali6);
                    com.tencent.mm.q.a locala2 = aa.uY().fz(locali6.getUsername());
                    locala2.field_username = locali6.getUsername();
                    locala2.field_brandList = localsf.dtn;
                    ev localev = localsf.ifV;
                    if (localev != null)
                    {
                      locala2.field_brandFlag = localev.dtr;
                      locala2.field_brandInfo = localev.dtt;
                      locala2.field_brandIconURL = localev.dtu;
                      locala2.field_extInfo = localev.dts;
                    }
                    if (aa.uY().b(locala2))
                      break;
                    aa.uY().a(locala2);
                    break;
                    if (localsf.ilV == 2)
                    {
                      locali6.bi(3);
                      localx5.bi(3);
                      locali6.bi(3);
                      if (!com.tencent.mm.model.x.pG().equals(locali6.getUsername()))
                      {
                        com.tencent.mm.n.af.sh().h(locali6.getUsername(), false);
                        com.tencent.mm.n.af.sh().h(locali6.getUsername(), true);
                        com.tencent.mm.n.af.sL().eN(locali6.getUsername());
                      }
                    }
                  }
                  je localje = new je().bJ(arrayOfByte);
                  switch (localje.iad)
                  {
                  case 4:
                  case 2:
                  case 3:
                  default:
                    z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "unknown function switch id:" + localje.iad);
                    break;
                  case 1:
                    com.tencent.mm.model.bg.qW().oQ().set(17, Integer.valueOf(localje.iae));
                    continue;
                    abk localabk = new abk().cw(arrayOfByte);
                    if (localabk == null)
                      break label5398;
                    bool9 = true;
                    Assert.assertTrue(bool9);
                    if (com.tencent.mm.sdk.platformtools.ch.ja(localabk.gnq).length() <= 0)
                      break label5404;
                    bool10 = true;
                    Assert.assertTrue(bool10);
                    if (!com.tencent.mm.storage.i.xY(localabk.gnq))
                    {
                      z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModTContact: tcontact should ends with @t.qq.com");
                    }
                    else
                    {
                      com.tencent.mm.storage.i locali4 = com.tencent.mm.model.bg.qW().oT().ys(localabk.gnq);
                      String str9;
                      if ((locali4 == null) || ((int)locali4.dhv == 0))
                      {
                        com.tencent.mm.storage.i locali5 = new com.tencent.mm.storage.i(localabk.gnq);
                        locali5.aT(localabk.hTx);
                        locali5.bn(1);
                        locali5.oM();
                        if (com.tencent.mm.model.bg.qW().oT().G(locali5) == -1)
                        {
                          z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModTContact: insert contact failed");
                        }
                        else
                        {
                          str9 = locali5.getUsername();
                          if (str9 == null)
                            z.w("!32@/B4Tb64lLpKycU6bb1/YLVPsRNAI909l", "setMBTAvatarImgFlag failed : invalid username");
                        }
                      }
                      else
                      {
                        while (true)
                        {
                          le localle = new le();
                          localle.cOs.cDf = 1;
                          localle.cOs.user = localabk.gnq;
                          localle.cOs.cMa = localabk.ipY;
                          localle.cOs.cMb = localabk.hUP;
                          com.tencent.mm.sdk.c.a.aGB().g(localle);
                          break;
                          if (!str9.endsWith("@t.qq.com"))
                          {
                            z.w("!32@/B4Tb64lLpKycU6bb1/YLVPsRNAI909l", "setMBTAvatarImgFlag failed : invalid username");
                          }
                          else
                          {
                            com.tencent.mm.n.x localx4 = new com.tencent.mm.n.x();
                            localx4.setUsername(str9);
                            localx4.bi(3);
                            localx4.db(3);
                            com.tencent.mm.n.af.sJ().a(localx4);
                            continue;
                            if (!com.tencent.mm.sdk.platformtools.ch.ja(localabk.hTx).equals(com.tencent.mm.sdk.platformtools.ch.ja(locali4.getUsername())))
                            {
                              locali4.aT(localabk.hTx);
                              if (com.tencent.mm.model.bg.qW().oT().a(locali4.getUsername(), locali4) == -1)
                                z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModTContact: update contact failed");
                            }
                          }
                        }
                        localva = new va().cj(arrayOfByte);
                        if (localva == null)
                          break label5410;
                        bool7 = true;
                        Assert.assertTrue(bool7);
                        if (com.tencent.mm.sdk.platformtools.ch.ja(localva.gnq).length() <= 0)
                          break label5416;
                        bool8 = true;
                        Assert.assertTrue(bool8);
                        if (!com.tencent.mm.storage.i.ya(localva.gnq))
                        {
                          z.w("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModQContact: qcontact should ends with @t.qq.com");
                        }
                        else
                        {
                          locali2 = com.tencent.mm.model.bg.qW().oT().ys(localva.gnq);
                          if ((locali2 != null) && ((int)locali2.dhv != 0))
                            break label3755;
                          locali3 = new com.tencent.mm.storage.i(localva.gnq);
                          locali3.oM();
                          locali3.aU(localva.hTx);
                          locali3.aT(localva.hTx);
                          locali3.bn(4);
                          if (com.tencent.mm.model.bg.qW().oT().G(locali3) != -1)
                            break label3675;
                          z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModQContact: insert contact failed");
                        }
                      }
                    }
                    break;
                  }
                }
              }
            }
          }
        }
      }
    }
    label3675: com.tencent.mm.n.c.eK(locali3.getUsername());
    while (true)
    {
      hh localhh = new hh();
      localhh.cLX.cDf = 1;
      localhh.cLX.user = localva.gnq;
      localhh.cLX.cMa = localva.ipY;
      localhh.cLX.cMb = localva.hUP;
      com.tencent.mm.sdk.c.a.aGB().g(localhh);
      break;
      label3755: if (!com.tencent.mm.sdk.platformtools.ch.ja(localva.hTx).equals(com.tencent.mm.sdk.platformtools.ch.ja(locali2.getUsername())))
      {
        locali2.aU(localva.hTx);
        locali2.aT(localva.hTx);
        if (com.tencent.mm.model.bg.qW().oT().a(locali2.getUsername(), locali2) == -1)
          z.e("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModQContact: update contact failed");
      }
    }
    sd localsd = new sd().bW(arrayOfByte);
    boolean bool4;
    label3850: boolean bool5;
    label3872: boolean bool6;
    label4088: sx localsx;
    boolean bool1;
    label4255: String str4;
    int n;
    String str7;
    Object localObject;
    label4310: boolean bool3;
    com.tencent.mm.storage.e locale1;
    if (localsd != null)
    {
      bool4 = true;
      Assert.assertTrue(bool4);
      if (com.tencent.mm.sdk.platformtools.ch.ja(localsd.gnq).length() <= 0)
        break label5428;
      bool5 = true;
      Assert.assertTrue(bool5);
      com.tencent.mm.storage.i locali1 = new com.tencent.mm.storage.i();
      locali1.setUsername(localsd.gnq);
      locali1.setType(localsd.ewb);
      locali1.bj(localsd.dtf);
      locali1.bn(RegionCodeDecoder.v(localsd.dtm, localsd.Ks, localsd.Kt));
      locali1.bh(localsd.dtg);
      com.tencent.mm.n.x localx3 = new com.tencent.mm.n.x();
      localx3.db(-1);
      localx3.setUsername(localsd.gnq);
      localx3.ff(localsd.hTz);
      localx3.fe(localsd.hTy);
      Object[] arrayOfObject8 = new Object[3];
      arrayOfObject8[0] = localx3.getUsername();
      arrayOfObject8[1] = localx3.st();
      arrayOfObject8[2] = localx3.su();
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkhurl bottle %s b[%s] s[%s]", arrayOfObject8);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "bottlecontact imgflag:" + localsd.ilV + " hd:" + localsd.ilW);
      if (localsd.ilW == 0)
        break label5434;
      bool6 = true;
      localx3.T(bool6);
      if ((localsd.ilV == 3) || (localsd.ilV == 4))
      {
        locali1.bi(localsd.ilV);
        localx3.bi(localsd.ilV);
      }
      while (true)
      {
        com.tencent.mm.n.af.sJ().a(localx3);
        com.tencent.mm.model.bg.qW().oT().D(locali1);
        break;
        if (localsd.ilV == 2)
        {
          locali1.bi(3);
          localx3.bi(3);
          com.tencent.mm.n.af.sh().h(localsd.gnq, false);
          com.tencent.mm.n.af.sh().h(localsd.gnq, true);
          com.tencent.mm.n.af.sL().eN(localsd.gnq);
        }
        else
        {
          locali1.bi(3);
          localx3.bi(3);
        }
      }
      localsx = new sx().cb(arrayOfByte);
      if (localsx == null)
        break label5440;
      bool1 = true;
      Assert.assertTrue(bool1);
      str4 = com.tencent.mm.model.x.pG();
      n = localsx.imG;
      if (n == 2)
      {
        String str5 = com.tencent.mm.storage.i.ye(str4);
        String str6 = (String)com.tencent.mm.model.bg.qW().oQ().get(12553);
        str7 = str5;
        localObject = str6;
        if (localObject != null)
        {
          boolean bool2 = ((String)localObject).equals(localsx.imJ);
          bool3 = false;
          if (bool2);
        }
        else
        {
          com.tencent.mm.n.af.sh().h(str7, true);
          bool3 = true;
          locale1 = com.tencent.mm.model.bg.qW().oQ();
          if (n != 2)
            break label5446;
        }
      }
    }
    label5380: label5386: label5392: label5398: label5404: label5410: label5416: label5428: label5434: label5440: label5446: for (int i1 = 12553; ; i1 = 12297)
    {
      while (true)
      {
        locale1.set(i1, localsx.imJ);
        Object[] arrayOfObject7 = new Object[5];
        arrayOfObject7[0] = Boolean.valueOf(bool3);
        arrayOfObject7[1] = Integer.valueOf(n);
        arrayOfObject7[2] = localsx.imJ;
        arrayOfObject7[3] = localsx.hTy;
        arrayOfObject7[4] = localsx.hTz;
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "ModUserImg beRemove:%b imgtype:%d md5:%s big:%s sm:%s", arrayOfObject7);
        com.tencent.mm.n.x localx2 = new com.tencent.mm.n.x();
        localx2.setUsername(str7);
        localx2.fe(localsx.hTy);
        localx2.ff(localsx.hTz);
        if (!com.tencent.mm.sdk.platformtools.ch.jb(localx2.su()))
        {
          if (n != 1)
            break label4604;
          com.tencent.mm.model.bg.qW().oQ().set(59, Boolean.valueOf(true));
        }
        while (true)
        {
          localx2.T(false);
          localx2.db(56);
          if (!com.tencent.mm.sdk.platformtools.ch.jb(localsx.imJ))
            localx2.T(true);
          com.tencent.mm.n.af.sJ().a(localx2);
          if (!bool3)
            break;
          new com.tencent.mm.n.s().a(str7, new r(this));
          break;
          String str8 = (String)com.tencent.mm.model.bg.qW().oQ().get(12297);
          str7 = str4;
          localObject = str8;
          break label4310;
          label4604: com.tencent.mm.model.bg.qW().oQ().set(60, Boolean.valueOf(true));
        }
        aed localaed = new aed().cC(arrayOfByte);
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "snsExtFlag " + localaed.ifU.dto);
        String str1 = (String)com.tencent.mm.model.bg.qW().oQ().get(2);
        if ((str1 == null) || (str1.length() <= 0))
          break;
        if (am.ayh() != null)
          am.ayh().a(str1, localaed.ifU);
        com.tencent.mm.q.a locala1 = com.tencent.mm.q.r.fE(com.tencent.mm.model.x.pG());
        if (locala1 == null)
          locala1 = new com.tencent.mm.q.a();
        locala1.field_username = str1;
        locala1.field_brandList = localaed.dtn;
        if ((locala1.ui()) && (locala1.tY() != null) && (locala1.tY().uD() != null) && (!com.tencent.mm.sdk.platformtools.ch.jb(locala1.tY().uD().dqu)))
        {
          locala1.field_enterpriseFather = locala1.tY().uD().dqu;
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = str1;
          arrayOfObject6[1] = locala1.field_enterpriseFather;
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "processModUserInfoExt, %s set enterpriseFather %s", arrayOfObject6);
        }
        if (!aa.uY().b(locala1))
          aa.uY().a(locala1);
        int j = localaed.iwR;
        int k = localaed.iwS;
        int m = localaed.iwT;
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "roomSize :" + j + " rommquota: " + k + " invite: " + m);
        com.tencent.mm.model.bg.qW().oQ().set(135175, Integer.valueOf(j));
        com.tencent.mm.model.bg.qW().oQ().set(135176, Integer.valueOf(k));
        com.tencent.mm.model.bg.qW().oQ().set(135177, Integer.valueOf(m));
        com.tencent.mm.model.bg.qW().oQ().set(144385, Integer.valueOf(localaed.iwX));
        com.tencent.mm.n.x localx1 = new com.tencent.mm.n.x();
        localx1.db(-1);
        localx1.setUsername(str1);
        localx1.fe(localaed.hTy);
        localx1.ff(localaed.hTz);
        localx1.T(true);
        localx1.bi(3);
        Object[] arrayOfObject5 = new Object[3];
        arrayOfObject5[0] = localx1.getUsername();
        arrayOfObject5[1] = localx1.st();
        arrayOfObject5[2] = localx1.su();
        z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "dkavatar user:[%s] big:[%s] sm:[%s]", arrayOfObject5);
        com.tencent.mm.n.af.sJ().a(localx1);
        String str2 = localaed.img;
        String str3 = localaed.imh;
        com.tencent.mm.model.bg.qW().oQ().set(274433, str3);
        com.tencent.mm.model.bg.qW().oQ().set(274434, str2);
        if (localaed.hOZ == null)
          break;
        com.tencent.mm.model.bg.qW().oQ().set(286721, localaed.hOZ.hQO);
        com.tencent.mm.model.bg.qW().oQ().set(286722, localaed.hOZ.hQP);
        com.tencent.mm.model.bg.qW().oQ().set(286723, localaed.hOZ.hQQ);
        break;
        try
        {
          int i = com.tencent.mm.a.j.b(arrayOfByte, 0);
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = Integer.valueOf(i);
          z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "local test synccmd, sleep %d", arrayOfObject4);
          if (i <= 0)
            break;
          Thread.sleep(i);
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
      break;
      tf localtf = new tf().cf(arrayOfByte);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(localtf.hOR);
      arrayOfObject2[1] = Long.valueOf(localtf.hOY);
      z.d("!32@/B4Tb64lLpI4z6dpnyFNsehw02vIny62", "rollback, msgtype is %d, msgid is %d", arrayOfObject2);
      if (!com.tencent.mm.model.y.dy(localtf.hPq))
        break;
      jd localjd = new jd();
      localjd.cNn.cDM = localtf.hOY;
      com.tencent.mm.sdk.c.a.aGB().g(localjd);
      break;
      label5374: i2 = 0;
      break label890;
      bool13 = false;
      break label1741;
      bool11 = false;
      break label2450;
      bool12 = false;
      break label2462;
      bool9 = false;
      break label3145;
      bool10 = false;
      break label3167;
      bool7 = false;
      break label3525;
      bool8 = false;
      break label3547;
      bool4 = false;
      break label3850;
      bool5 = false;
      break label3872;
      bool6 = false;
      break label4088;
      bool1 = false;
      break label4255;
    }
  }

  public final void yz()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(this.dzL);
    this.dzL.clear();
    ArrayList localArrayList = new ArrayList();
    synchronized (dzI)
    {
      Iterator localIterator1 = dzI.iterator();
      if (localIterator1.hasNext())
        localArrayList.add((com.tencent.mm.model.az)localIterator1.next());
    }
    Iterator localIterator2 = localArrayList.iterator();
    while (localIterator2.hasNext())
    {
      com.tencent.mm.model.az localaz = (com.tencent.mm.model.az)localIterator2.next();
      new cm(localaz.getLooper()).post(new p(this, localaz, localLinkedList));
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ab.o
 * JD-Core Version:    0.6.2
 */