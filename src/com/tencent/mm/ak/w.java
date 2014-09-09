package com.tencent.mm.ak;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.y;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.n;
import com.tencent.mm.o.f;
import com.tencent.mm.o.j;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.io.File;
import java.util.Map;

public final class w
  implements j
{
  public final com.tencent.mm.o.k a(com.tencent.mm.protocal.a.q paramq)
  {
    if (paramq == null)
    {
      z.e("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "onPreAddMessage cmdAM is null , give up.");
      return null;
    }
    String str1 = ai.a(paramq.hOP);
    if (str1.equals(f.c(2, "")))
      return null;
    ar localar1 = bg.qW().oV().q(str1, paramq.hOY);
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Long.valueOf(paramq.hOY);
    arrayOfObject1[1] = Long.valueOf(localar1.kk());
    z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "dkmsgid prepareMsgInfo svrid:%d localid:%d", arrayOfObject1);
    if ((localar1.kk() != 0L) && (604800000L + localar1.kn() < bw.b(str1, paramq.hOV)))
    {
      Object[] arrayOfObject10 = new Object[2];
      arrayOfObject10[0] = Long.valueOf(paramq.hOY);
      arrayOfObject10[1] = Long.valueOf(localar1.kk());
      z.w("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", arrayOfObject10);
      bw.v(localar1.kk());
      localar1.o(0L);
    }
    if (localar1.kk() != 0L)
    {
      Object[] arrayOfObject9 = new Object[1];
      arrayOfObject9[0] = Long.valueOf(paramq.hOY);
      z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "Msgid:%d duplicate give up ", arrayOfObject9);
      return null;
    }
    String str2 = ai.a(paramq.hOS);
    q localq = new q();
    localq.setUser(str1);
    localq.q(paramq.hOV);
    localq.p(paramq.hOY);
    localq.hW(paramq.hOS.getString());
    z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "parseVideoMsgXML content:" + str2);
    Map localMap = com.tencent.mm.sdk.platformtools.x.bB(str2, "msg");
    if (localMap == null)
      return null;
    while (true)
    {
      String str3;
      String str4;
      int i;
      String str6;
      ar localar2;
      long l1;
      try
      {
        localq.cZ(ch.getInt((String)localMap.get(".msg.videomsg.$length"), 0));
        localq.eJ(ch.getInt((String)localMap.get(".msg.videomsg.$playlength"), 0));
        localq.hU((String)localMap.get(".msg.videomsg.$fromusername"));
        str3 = (String)localMap.get(".msg.videomsg.$cdnthumbaeskey");
        str4 = (String)localMap.get(".msg.videomsg.$cdnthumburl");
        i = ch.getInt((String)localMap.get(".msg.videomsg.$cdnthumblength"), 0);
        int j = ch.getInt((String)localMap.get(".msg.videomsg.$type"), 0);
        z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "video msg exportType :" + j);
        if (j != 44)
          break label1521;
        k = 1;
        localq.eL(k);
        if (localq.AN().equals(f.c(2, "")))
          return null;
        String str5 = (String)localMap.get(".msg.commenturl");
        str6 = r.ia(localq.AN());
        localq.hT(str6);
        localar2 = new ar();
        localar2.p(localq.kl());
        localar2.bK(localq.getFileName());
        localar2.setStatus(paramq.dZy);
        localar2.q(bw.b(localq.getUser(), localq.kn()));
        localar2.bJ(localq.getUser());
        if (paramq.hOR == 62)
        {
          localar2.setType(62);
          localar2.setContent(o.a(localq.AN(), 0L, false));
          localar2.bO(str5);
          localar2.bP(paramq.hOW);
          l1 = bw.e(localar2);
          if (l1 > 0L)
            break label698;
          Object[] arrayOfObject8 = new Object[2];
          arrayOfObject8[0] = Long.valueOf(l1);
          arrayOfObject8[1] = Long.valueOf(localq.kl());
          z.e("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "onPreAddMessage insert msg failed local:%d svrid:%d", arrayOfObject8);
          return null;
        }
      }
      catch (Exception localException)
      {
        z.e("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "parsing voice msg xml failed");
        return null;
      }
      localar2.setType(43);
      continue;
      label698: localq.eK((int)l1);
      localq.V(ch.CL());
      localq.dP(0);
      localq.setStatus(111);
      z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "Insert fileName[" + localq.getFileName() + "] size:" + localq.sp() + " svrid:" + localq.kl() + " timelen:" + localq.AU() + " user:" + localq.getUser() + " human:" + localq.AN());
      if (!m.AL().a(localq))
      {
        z.d("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "Insert Error fileName:" + localq.getFileName());
        return null;
      }
      String str7 = m.AL().ic(str6);
      byte[] arrayOfByte = ai.a(paramq.hOU);
      if (!ch.B(arrayOfByte))
      {
        r.a(str7, 0, arrayOfByte);
        if (localar2.aNW())
        {
          if (!bc.bP(ak.getContext()))
            break label1133;
          Object[] arrayOfObject7 = new Object[3];
          arrayOfObject7[0] = Long.valueOf(localar2.kk());
          arrayOfObject7[1] = Long.valueOf(localar2.kl());
          arrayOfObject7[2] = localar2.kp();
          z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match wifi, do auto download short video [msgid-%d-%d] [%s]", arrayOfObject7);
          v.ii(localar2.kp());
        }
      }
      while (true)
      {
        return new com.tencent.mm.o.k(localar2, true);
        long l2 = localq.kl();
        long l3 = ch.CM();
        String str8 = str7 + ".tmp";
        n localn = new n();
        localn.field_mediaId = com.tencent.mm.modelcdntran.i.a("downvideothumb", localq.kn(), localq.getUser(), String.valueOf(l2));
        localn.field_fullpath = str8;
        localn.field_fileType = CdnTransportEngine.dry;
        localn.field_totalLen = i;
        localn.field_aesKey = str3;
        localn.field_fileId = str4;
        localn.field_priority = CdnTransportEngine.drv;
        localn.dsw = new x(this, localq, l3, i, str7, str8);
        com.tencent.mm.modelcdntran.k.vl().a(localn);
        break;
        label1133: if (bc.bE(ak.getContext()))
        {
          Object[] arrayOfObject6 = new Object[3];
          arrayOfObject6[0] = Long.valueOf(localar2.kk());
          arrayOfObject6[1] = Long.valueOf(localar2.kl());
          arrayOfObject6[2] = localar2.kp();
          z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match edge, do not auto download short video [msgid-%d-%d] [%s]", arrayOfObject6);
        }
        else
        {
          com.tencent.mm.storage.i locali = bg.qW().oT().ys(localar2.kt());
          if (y.dc(localar2.kt()))
          {
            if (locali.jv() == 0)
            {
              Object[] arrayOfObject5 = new Object[3];
              arrayOfObject5[0] = Long.valueOf(localar2.kk());
              arrayOfObject5[1] = Long.valueOf(localar2.kl());
              arrayOfObject5[2] = localar2.kp();
              z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match muted chatroom and not wifi, do not auto download short video [msgid-%d-%d] [%s]", arrayOfObject5);
            }
            else if ((bc.bO(ak.getContext())) || (bc.bF(ak.getContext())))
            {
              Object[] arrayOfObject4 = new Object[3];
              arrayOfObject4[0] = Long.valueOf(localar2.kk());
              arrayOfObject4[1] = Long.valueOf(localar2.kl());
              arrayOfObject4[2] = localar2.kp();
              z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match 3G/4G and unmuted chatroom, do auto download short video [msgid-%d-%d] [%s]", arrayOfObject4);
              v.ii(localar2.kp());
            }
            else
            {
              z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "unknown auto download short video step A");
            }
          }
          else if (locali.zW())
          {
            Object[] arrayOfObject3 = new Object[3];
            arrayOfObject3[0] = Long.valueOf(localar2.kk());
            arrayOfObject3[1] = Long.valueOf(localar2.kl());
            arrayOfObject3[2] = localar2.kp();
            z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match muted and not wifi, do not auto download short video [msgid-%d-%d] [%s]", arrayOfObject3);
          }
          else if ((bc.bO(ak.getContext())) || (bc.bF(ak.getContext())))
          {
            Object[] arrayOfObject2 = new Object[3];
            arrayOfObject2[0] = Long.valueOf(localar2.kk());
            arrayOfObject2[1] = Long.valueOf(localar2.kl());
            arrayOfObject2[2] = localar2.kp();
            z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "match 3G/4G and unmuted, do auto download short video [msgid-%d-%d] [%s]", arrayOfObject2);
            v.ii(localar2.kp());
          }
          else
          {
            z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "unknown auto download short video step B");
          }
        }
      }
      label1521: int k = 0;
    }
  }

  public final void d(ar paramar)
  {
    if (paramar == null);
    String str;
    do
    {
      return;
      str = paramar.kp();
    }
    while ((ch.jb(str)) || (!m.AL().hZ(str)));
    try
    {
      new File(m.AL().ic(str)).delete();
      new File(m.AL().ib(str)).delete();
      return;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpKT0Ff1DaNVTWjs/xAN/V6v", "ERR: Delete file Failed" + com.tencent.mm.compatible.g.k.nL() + " file:" + str + " msg:" + localException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.w
 * JD-Core Version:    0.6.2
 */