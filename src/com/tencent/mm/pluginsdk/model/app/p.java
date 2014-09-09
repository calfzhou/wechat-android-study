package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.c.a.h;
import com.tencent.mm.c.a.mt;
import com.tencent.mm.c.a.mv;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.o.j;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.cl;
import com.tencent.mm.y.ap;

public final class p
  implements j
{
  public final com.tencent.mm.o.k a(com.tencent.mm.protocal.a.q paramq)
  {
    z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "process add app message");
    String str1 = ai.a(paramq.hOP);
    String str2 = ai.a(paramq.hOQ);
    com.tencent.mm.o.k localk;
    if ((ch.jb(str1)) || (ch.jb(str2)))
    {
      z.e("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "empty fromuser or touser");
      localk = null;
    }
    label284: label504: label891: com.tencent.mm.ai.a locala;
    label583: label600: label733: label865: label872: label1266: 
    do
    {
      String str5;
      com.tencent.mm.ai.b localb;
      ar localar3;
      do
      {
        return localk;
        String str3 = ai.a(paramq.hOS);
        String str4 = new String(str3);
        if (y.dc(str1))
        {
          int n = bw.ek(str4);
          if (n != -1)
          {
            str3 = (str4 + " ").substring(n + 2).trim();
            str4.substring(0, n).trim();
          }
        }
        str5 = ch.xw(str3);
        localb = com.tencent.mm.ai.b.iS(str5);
        if (localb == null)
        {
          z.e("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "parse app message failed, insert failed");
          return null;
        }
        k localk1 = bf.GO().uY(localb.appId);
        if ((localk1 == null) || (localk1.field_appVersion < localb.dRb))
          bf.aza().uX(localb.appId);
        String str6 = ai.a(paramq.hOS);
        aw localaw = bg.qW().oV();
        cl localcl = bg.qW().oY();
        String str7 = x.pG();
        String str8 = ai.a(paramq.hOP);
        String str9 = ai.a(paramq.hOQ);
        int i;
        String str10;
        ar localar1;
        String str11;
        int k;
        boolean bool;
        int j;
        ar localar2;
        if ((localcl.has(str8)) || (str7.equals(str8)))
        {
          i = 1;
          if (i == 0)
            break label865;
          str10 = str9;
          localar1 = localaw.q(str10, paramq.hOY);
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = Long.valueOf(paramq.hOY);
          arrayOfObject1[1] = Long.valueOf(localar1.kk());
          z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "dkmsgid doInsertMessage svrid:%d localid:%d", arrayOfObject1);
          if ((localar1.kk() != 0L) && (604800000L + localar1.kn() < bw.b(str8, paramq.hOV)))
          {
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Long.valueOf(paramq.hOY);
            arrayOfObject3[1] = Long.valueOf(localar1.kk());
            z.w("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "dkmsgid doInsertMessage msg Too Old Remove it. svrid:%d localid:%d", arrayOfObject3);
            bw.v(localar1.kk());
            localar1.o(0L);
          }
          if (localar1.kk() == 0L)
          {
            localar1 = new ar();
            localar1.p(paramq.hOY);
            localar1.q(bw.b(str8, paramq.hOV));
          }
          localar1.setType(s.m(localb.type, localb.cCB, localb.dRo));
          if (localar1.getType() != 285212721)
            break label872;
          str11 = localb.content;
          localar1.setContent(str11);
          if (localar1.getType() == 285212721)
            localar1.bO(localb.ddY);
          if ((paramq.hOT != 2) || (localar1.kk() != 0L))
            break label1114;
          switch (localar1.getType())
          {
          default:
            k = 0;
            if (k == 0)
              if (localb.type == 2)
              {
                bool = true;
                byte[] arrayOfByte = ai.a(paramq.hOU);
                if (!ch.jb(localb.dRg))
                  break label891;
                String str17 = ap.yg().a(arrayOfByte, bool, Bitmap.CompressFormat.PNG);
                z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", com.tencent.mm.compatible.g.k.nL() + " thumbData MsgInfo path:" + str17);
                if (!ch.jb(str17))
                {
                  localar1.bK(str17);
                  z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "new thumbnail saved, path" + str17);
                }
                if (i == 0)
                  break label1266;
                localar1.bv(1);
                localar1.bJ(str9);
                j = paramq.dZy;
                localar2 = localar1;
                localar2.setStatus(j);
                localar1.bP(paramq.hOW);
                if (localar1.kk() != 0L)
                  break label1310;
                localar1.o(bw.e(localar1));
                h localh = new h();
                localh.cHl.cCp = localar1;
                localh.cHl.cHm = localb;
                com.tencent.mm.sdk.c.a.aGB().g(localh);
              }
            break;
          case -1879048191:
          case -1879048190:
          case -1879048189:
          }
        }
        for (localk = new com.tencent.mm.o.k(localar1, true); ; localk = new com.tencent.mm.o.k(localar1, false))
        {
          if ((localar1.getType() == 301989937) && (y.dL(localar1.kt())))
            localar1.o(0L);
          if (localk.cCp != null)
            break label1336;
          return null;
          i = 0;
          break;
          str10 = str8;
          break label284;
          str11 = str6;
          break label504;
          k = 1;
          break label583;
          bool = false;
          break label600;
          long l1 = localar1.kl();
          String str14 = localb.dRj;
          String str15 = localb.dRg;
          int m = localb.dRh;
          Object[] arrayOfObject2 = new Object[4];
          arrayOfObject2[0] = Long.valueOf(localar1.kl());
          arrayOfObject2[1] = str14;
          arrayOfObject2[2] = Integer.valueOf(m);
          arrayOfObject2[3] = str15;
          z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "cdntra getThumbByCdn msgsvrid:%d aes:%s thumblen:%d url:%s ", arrayOfObject2);
          long l2 = ch.CM();
          String str16 = ap.yg().f(ch.CM(), "", "");
          com.tencent.mm.modelcdntran.n localn = new com.tencent.mm.modelcdntran.n();
          localn.field_mediaId = i.a("downappthumb", localar1.kn(), str8, String.valueOf(l1));
          localn.field_fullpath = str16;
          localn.field_fileType = CdnTransportEngine.dry;
          localn.field_totalLen = m;
          localn.field_aesKey = str14;
          localn.field_fileId = str15;
          localn.field_priority = CdnTransportEngine.drv;
          localn.dsw = new q(this, localar1, l2, m, str16, bool);
          com.tencent.mm.modelcdntran.k.vl().a(localn);
          break label705;
          if (ch.jb(localb.thumburl))
            break label705;
          z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "get cdn image " + localb.thumburl);
          f localf = new f();
          localf.url = localb.thumburl;
          String str12 = com.tencent.mm.a.f.d(ch.CM().getBytes());
          localf.huG = ap.yg().gP(str12);
          ap.yg();
          String str13 = com.tencent.mm.y.n.gQ(str12);
          new d(localf).start();
          localar1.bK(str13);
          z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "new thumbnail saved, path " + localf.huG);
          break label705;
          localar1.bv(0);
          localar1.bJ(str8);
          if (paramq.dZy > 3)
          {
            j = paramq.dZy;
            localar2 = localar1;
            break label733;
          }
          j = 3;
          localar2 = localar1;
          break label733;
          localaw.b(paramq.hOY, localar1);
        }
        localar3 = localk.cCp;
      }
      while ((localar3.getType() == 285212721) || (localar3.getType() == 301989937));
      if (localar3.getType() == -1879048190)
      {
        mv localmv = new mv();
        localmv.cPp.cPq = str5;
        localmv.cPp.description = localb.description;
        localmv.cPp.cCp = localar3;
        com.tencent.mm.sdk.c.a.aGB().g(localmv);
      }
      locala = new com.tencent.mm.ai.a();
      localb.a(locala);
      locala.field_msgId = localar3.kk();
    }
    while (bf.GN().b(locala));
    label705: label1114: return null;
  }

  public final void d(ar paramar)
  {
    z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "onPreDelMessage " + paramar.kp());
    mt localmt = new mt();
    localmt.cPo.path = paramar.kp();
    com.tencent.mm.sdk.c.a.aGB().g(localmt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.p
 * JD-Core Version:    0.6.2
 */