package com.tencent.mm.booter;

import com.tencent.mm.c.a.fv;
import com.tencent.mm.c.a.gx;
import com.tencent.mm.c.a.hh;
import com.tencent.mm.c.a.iu;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.cx;
import com.tencent.mm.model.x;
import com.tencent.mm.modelstat.d;
import com.tencent.mm.modelstat.j;
import com.tencent.mm.modelstat.r;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.protocal.a.ov;
import com.tencent.mm.protocal.a.rs;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import com.tencent.mm.storage.o;
import com.tencent.mm.storage.s;
import java.util.LinkedList;
import java.util.List;

final class af
  implements Runnable
{
  af(ac paramac)
  {
  }

  public final void run()
  {
    if (!com.tencent.mm.model.bg.oE())
      return;
    if (ap.a((Integer)com.tencent.mm.model.bg.qW().oQ().get(15)) == 0);
    for (int i = 1; i != 0; i = 0)
    {
      z.e("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "not init finish , do not post sync task");
      return;
    }
    long l1 = ap.CM();
    if ((l1 - NotifyReceiver.lz() > 0L) && (l1 - NotifyReceiver.lz() < 10000L))
    {
      Object[] arrayOfObject9 = new Object[1];
      arrayOfObject9[0] = Long.valueOf(l1 - NotifyReceiver.lz());
      z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "sync task limit now - last : %d", arrayOfObject9);
      return;
    }
    NotifyReceiver.r(l1);
    z.i("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "begin post sync task");
    long l2 = ap.CN();
    if (com.tencent.mm.model.at.qz() != null)
      com.tencent.mm.model.at.qz().qB();
    z.d("!56@/B4Tb64lLpIuznxMDiXSbCBB+u2jDmZMIb5W52Bwm8Ukktzj6vE4YA==", "collectGroupCard");
    LinkedList localLinkedList = new LinkedList();
    new LinkedList();
    List localList = com.tencent.mm.model.bg.qW().oZ().aIe();
    if (localList != null)
    {
      for (int i9 = 0; i9 < localList.size(); i9++)
      {
        z.d("!56@/B4Tb64lLpIuznxMDiXSbCBB+u2jDmZMIb5W52Bwm8Ukktzj6vE4YA==", "groupCard " + (String)localList.get(i9));
        ov localov = new ov();
        localov.ieB = ((String)localList.get(i9));
        localLinkedList.add(localov);
      }
      fv localfv = new fv();
      localfv.cKT.cKU = localLinkedList;
      com.tencent.mm.sdk.c.a.aGB().g(localfv);
    }
    int j;
    int k;
    label816: boolean bool;
    if ((com.tencent.mm.model.bg.oE()) && (!com.tencent.mm.model.bg.rd()) && ((0x10 & x.pO()) == 0))
    {
      j = 1;
      if ((j != 0) && (ag.lx()))
      {
        e locale = com.tencent.mm.model.bg.qW().oQ();
        int i1 = ap.a((Integer)locale.get(67073));
        int i2 = ap.a((Integer)locale.get(67074));
        int i3 = ap.a((Integer)locale.get(67075));
        int i4 = ap.a((Integer)locale.get(67076));
        aw localaw = com.tencent.mm.model.bg.qW().oV();
        int i5 = localaw.am("medianote", 1);
        int i6 = localaw.am("medianote", 3);
        int i7 = localaw.am("medianote", 34);
        int i8 = localaw.am("medianote", 43);
        bb localbb = com.tencent.mm.model.bg.qW().oS();
        if (i5 - i1 > 0)
        {
          rs localrs1 = new rs();
          localrs1.ihG = (i5 - i1);
          localrs1.ihH = 1;
          localbb.a(new com.tencent.mm.storage.bg(29, localrs1));
          locale.set(67073, Integer.valueOf(i5));
        }
        if (i6 - i2 > 0)
        {
          rs localrs2 = new rs();
          localrs2.ihG = (i6 - i2);
          localrs2.ihH = 3;
          localbb.a(new com.tencent.mm.storage.bg(29, localrs2));
          locale.set(67074, Integer.valueOf(i6));
        }
        if (i7 - i3 > 0)
        {
          rs localrs3 = new rs();
          localrs3.ihG = (i7 - i3);
          localrs3.ihH = 34;
          localbb.a(new com.tencent.mm.storage.bg(29, localrs3));
          locale.set(67075, Integer.valueOf(i7));
        }
        if (i8 - i4 > 0)
        {
          rs localrs4 = new rs();
          localrs4.ihG = (i8 - i4);
          localrs4.ihH = 43;
          localbb.a(new com.tencent.mm.storage.bg(29, localrs4));
          locale.set(67076, Integer.valueOf(i8));
        }
        com.tencent.mm.model.bg.qW().oQ().set(66817, Long.valueOf(ap.CL()));
      }
      long l3 = com.tencent.mm.sdk.platformtools.ch.a((Long)com.tencent.mm.model.bg.qW().oQ().get(66821), 0L);
      long l4 = com.tencent.mm.sdk.platformtools.ch.CL();
      z.d("MicroMsg.NetSceneNetStatReport", "check expired now:" + l4 + " second:" + l3 + " sub:" + (l4 - l3));
      if (l4 - l3 <= 3600L)
        break label1183;
      com.tencent.mm.model.bg.qW().oQ().set(66821, Long.valueOf(l4));
      k = 1;
      if ((k != 0) && (com.tencent.mm.model.bg.qW().isSDCardAvailable()))
        com.tencent.mm.model.bg.qX().d(new d());
      com.tencent.mm.an.a.run();
      ai.run();
      cx.rV().rW();
      ah.run();
      if (com.tencent.mm.an.c.lx())
        com.tencent.mm.an.c.aFs();
      aj.run();
      com.tencent.mm.plugin.f.c.i.run();
      if (com.tencent.mm.model.bg.qI())
      {
        z.i("!44@/B4Tb64lLpIuznxMDiXSbOAIHvxP9kj34in5ft1NlOg=", "is new register, try insert qmessage intro conversation");
        hh localhh = new hh();
        localhh.cLX.cDf = 2;
        com.tencent.mm.sdk.c.a.aGB().g(localhh);
        com.tencent.mm.model.bg.qJ();
      }
      com.tencent.mm.ad.i.update();
      long l5 = System.currentTimeMillis();
      bool = ((Boolean)com.tencent.mm.model.bg.qW().oQ().get(233475, Boolean.valueOf(false))).booleanValue();
      if (com.tencent.mm.model.bg.qW().oT().aIu() > 0)
        break label1189;
      if (!bool)
      {
        com.tencent.mm.model.bg.qW().oW().yC("officialaccounts");
        com.tencent.mm.model.bg.qW().oQ().set(233475, Boolean.valueOf(true));
      }
      label998: Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Long.valueOf(System.currentTimeMillis() - l5);
      z.i("!44@/B4Tb64lLpIuznxMDiXSbOAIHvxP9kj34in5ft1NlOg=", "use time %d ms", arrayOfObject1);
      if ((com.tencent.mm.model.bg.oE()) && (!com.tencent.mm.model.bg.rd()))
        break label1213;
      label1040: if (com.tencent.mm.model.bg.oE())
        break label1382;
      z.e("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "Account is not ready");
      label1055: com.tencent.mm.modelsimple.at.run();
      if (ap.ac(ap.a((Long)com.tencent.mm.model.bg.qW().oQ().get(282881))) <= 172800000L)
        break label2083;
    }
    label1183: label2083: for (int n = 1; ; n = 0)
    {
      if (n != 0)
      {
        com.tencent.mm.model.bg.qW().oQ().set(282881, Long.valueOf(ap.CM()));
        iu localiu = new iu();
        com.tencent.mm.sdk.c.a.aGB().g(localiu);
      }
      com.tencent.mm.sdk.c.a.aGB().g(new gx());
      Object[] arrayOfObject4 = new Object[1];
      arrayOfObject4[0] = Long.valueOf(ap.ad(l2));
      z.d("!32@/B4Tb64lLpKcoq2tqqkpMh2WNrKeFFpl", "end post sync task, cost=%d", arrayOfObject4);
      return;
      j = 0;
      break;
      k = 0;
      break label816;
      label1189: if (!bool)
        break label998;
      com.tencent.mm.model.bg.qW().oQ().set(233475, Boolean.valueOf(false));
      break label998;
      label1213: if (com.tencent.mm.sdk.platformtools.ch.jb(com.tencent.mm.an.b.aFr()))
      {
        com.tencent.mm.model.ch.eq("ver" + com.tencent.mm.protocal.a.hrn);
        break label1040;
      }
      if (1000L * com.tencent.mm.sdk.platformtools.ch.ab(com.tencent.mm.sdk.platformtools.ch.a((Long)com.tencent.mm.model.bg.qW().oQ().get(77833), 0L)) < 604800000L)
        break label1040;
      n localn2 = n.fTF;
      Object[] arrayOfObject8 = new Object[7];
      arrayOfObject8[0] = com.tencent.mm.an.b.aFm();
      arrayOfObject8[1] = com.tencent.mm.an.b.aFn();
      arrayOfObject8[2] = com.tencent.mm.an.b.aFo();
      arrayOfObject8[3] = com.tencent.mm.an.b.aFp();
      arrayOfObject8[4] = com.tencent.mm.an.b.aFq();
      arrayOfObject8[5] = "";
      arrayOfObject8[6] = com.tencent.mm.an.b.aFr();
      localn2.d(10719, arrayOfObject8);
      com.tencent.mm.model.bg.qW().oQ().set(77833, Long.valueOf(com.tencent.mm.sdk.platformtools.ch.CL()));
      z.d("!44@/B4Tb64lLpIuznxMDiXSbA0w7JhnEny/QRWxkcJUoqk=", "report PostTaskHardwareInfo done ");
      break label1040;
      label1382: long l6 = com.tencent.mm.sdk.platformtools.ch.a((Long)com.tencent.mm.model.bg.qW().oQ().get(74));
      if ((10010 == ao.dVY) && (ao.dVZ > 0))
      {
        l6 = com.tencent.mm.sdk.platformtools.ch.CL() - ao.dVZ;
        Object[] arrayOfObject7 = new Object[2];
        arrayOfObject7[0] = Integer.valueOf(ao.dVZ);
        arrayOfObject7[1] = Long.valueOf(l6);
        z.d("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "GET DK_TEST_LAST_REPORT_DATAFLOW val:%d old:%d", arrayOfObject7);
        ao.dVZ = 0;
      }
      long l7 = com.tencent.mm.sdk.platformtools.ch.CL();
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = Long.valueOf(l7);
      arrayOfObject2[1] = Long.valueOf(l6);
      arrayOfObject2[2] = Long.valueOf(l7 - l6);
      z.d("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", " now:%d old:%d diff:%d", arrayOfObject2);
      if (1000L * (l7 - l6) < 86400000L)
        break label1055;
      com.tencent.mm.model.bg.qW().oQ().set(74, Long.valueOf(l7));
      if (r.Ap() == null)
      {
        z.e("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "ERR: SubCoreStat.getNetStatStg() is null");
        break label1055;
      }
      long l8 = com.tencent.mm.sdk.platformtools.ch.CM() / 86400000L - 1L;
      com.tencent.mm.modelstat.f localf = r.Ap().ex((int)l8);
      if ((localf == null) || (localf.dDW != (int)l8))
      {
        Object[] arrayOfObject3 = new Object[2];
        if (localf == null);
        for (int m = -1; ; m = localf.dDW)
        {
          arrayOfObject3[0] = Integer.valueOf(m);
          arrayOfObject3[1] = Long.valueOf(l8);
          z.e("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "ERR: NetStatInfo:%d lastDate:%d", arrayOfObject3);
          break;
        }
      }
      if (r.An() == null)
      {
        z.e("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "ERR: SubCoreStat.getMobileInfoStg() is null");
        break label1055;
      }
      com.tencent.mm.modelstat.b localb = r.An().zR();
      if (localb == null)
      {
        z.w("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "SubCoreStat.getMobileInfoStg().checkInfo null , give default.");
        localb = new com.tencent.mm.modelstat.b();
      }
      Object[] arrayOfObject5 = new Object[14];
      arrayOfObject5[0] = Long.valueOf(l8);
      arrayOfObject5[1] = Integer.valueOf(localf.dDW);
      arrayOfObject5[2] = Integer.valueOf(localf.dEi);
      arrayOfObject5[3] = Integer.valueOf(localf.dEu);
      arrayOfObject5[4] = Integer.valueOf(localf.dEh);
      arrayOfObject5[5] = Integer.valueOf(localf.dEt);
      arrayOfObject5[6] = Integer.valueOf(localf.dEg);
      arrayOfObject5[7] = Integer.valueOf(localf.dEs);
      arrayOfObject5[8] = Integer.valueOf(localf.dEf);
      arrayOfObject5[9] = Integer.valueOf(localf.dEr);
      arrayOfObject5[10] = Integer.valueOf(localb.dDM);
      arrayOfObject5[11] = Integer.valueOf(localb.dDN);
      arrayOfObject5[12] = localb.ispName;
      arrayOfObject5[13] = localb.extraInfo;
      z.i("!44@/B4Tb64lLpIuznxMDiXSbBEWI7IoQuD9IVYHX5ShmlA=", "last:%d peroid:%d [%d,%d][%d,%d][%d,%d][%d,%d] ispCode:%d subType:%d ispname:%s extra:%s", arrayOfObject5);
      n localn1 = n.fTF;
      Object[] arrayOfObject6 = new Object[13];
      arrayOfObject6[0] = Long.valueOf(l8 * 86400000L / 1000L);
      arrayOfObject6[1] = Integer.valueOf(localf.dEi);
      arrayOfObject6[2] = Integer.valueOf(localf.dEu);
      arrayOfObject6[3] = Integer.valueOf(localf.dEh);
      arrayOfObject6[4] = Integer.valueOf(localf.dEt);
      arrayOfObject6[5] = Integer.valueOf(localf.dEg);
      arrayOfObject6[6] = Integer.valueOf(localf.dEs);
      arrayOfObject6[7] = Integer.valueOf(localf.dEf);
      arrayOfObject6[8] = Integer.valueOf(localf.dEr);
      arrayOfObject6[9] = Integer.valueOf(localb.dDM);
      arrayOfObject6[10] = Integer.valueOf(localb.dDN);
      arrayOfObject6[11] = localb.ispName;
      arrayOfObject6[12] = localb.extraInfo;
      localn1.d(10900, arrayOfObject6);
      break label1055;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.af
 * JD-Core Version:    0.6.2
 */