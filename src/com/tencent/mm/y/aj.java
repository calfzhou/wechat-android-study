package com.tencent.mm.y;

import android.os.RemoteException;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.aq;
import com.tencent.mm.o.av;
import com.tencent.mm.o.m;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.a.adq;
import com.tencent.mm.protocal.a.adr;
import com.tencent.mm.protocal.a.bb;
import com.tencent.mm.protocal.a.cy;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class aj
  implements o
{
  aj(ag paramag)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    String str1 = ag.a(this.dyA);
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = ag.b(this.dyA);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    arrayOfObject1[2] = paramkeep_ProgressInfo;
    arrayOfObject1[3] = paramkeep_SceneResult;
    z.d(str1, "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", arrayOfObject1);
    if (paramInt == -21005)
    {
      String str13 = ag.a(this.dyA);
      Object[] arrayOfObject11 = new Object[1];
      arrayOfObject11[0] = ag.b(this.dyA);
      z.w(str13, "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", arrayOfObject11);
      if (ag.c(this.dyA) != null)
        ag.c(this.dyA).xY();
      ag.d(this.dyA).a(3, paramInt, "", this.dyA);
      return 0;
    }
    if (paramInt != 0)
    {
      String str11 = ag.a(this.dyA);
      Object[] arrayOfObject9 = new Object[2];
      arrayOfObject9[0] = ag.b(this.dyA);
      arrayOfObject9[1] = Integer.valueOf(paramInt);
      z.e(str11, "cdntra cdnCallback clientid:%s startRet:%d", arrayOfObject9);
      v.dX((int)ag.e(this.dyA));
      v.dW((int)ag.e(this.dyA));
      com.tencent.mm.plugin.f.c.n localn3;
      Object[] arrayOfObject10;
      if (paramkeep_SceneResult != null)
      {
        localn3 = com.tencent.mm.plugin.f.c.n.fTF;
        arrayOfObject10 = new Object[16];
        arrayOfObject10[0] = Integer.valueOf(paramInt);
        arrayOfObject10[1] = Integer.valueOf(1);
        arrayOfObject10[2] = Long.valueOf(ag.f(this.dyA));
        arrayOfObject10[3] = Long.valueOf(ch.CM());
        arrayOfObject10[4] = Integer.valueOf(i.z(com.tencent.mm.sdk.platformtools.ak.getContext()));
        arrayOfObject10[5] = Integer.valueOf(ag.g(this.dyA));
        arrayOfObject10[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
        arrayOfObject10[7] = paramkeep_SceneResult.field_transInfo;
        arrayOfObject10[8] = "";
        arrayOfObject10[9] = "";
        arrayOfObject10[10] = "";
        arrayOfObject10[11] = "";
        arrayOfObject10[12] = "";
        arrayOfObject10[13] = "";
        arrayOfObject10[14] = "";
        if (paramkeep_SceneResult != null)
          break label436;
      }
      label436: for (String str12 = ""; ; str12 = paramkeep_SceneResult.report_Part2)
      {
        arrayOfObject10[15] = str12;
        localn3.d(10421, arrayOfObject10);
        ag.d(this.dyA).a(3, paramInt, "", this.dyA);
        if (ag.c(this.dyA) != null)
          ag.c(this.dyA).xY();
        return 0;
      }
    }
    l locall1 = ap.yg().Q(ag.h(this.dyA));
    if (locall1.xM() != ag.h(this.dyA))
    {
      k.vl().fO(ag.b(this.dyA));
      String str10 = ag.a(this.dyA);
      Object[] arrayOfObject8 = new Object[2];
      arrayOfObject8[0] = Long.valueOf(ag.h(this.dyA));
      arrayOfObject8[1] = ag.b(this.dyA);
      z.e(str10, "cdntra get imginfo failed maybe delete by user imgLocalId:%d client:%s", arrayOfObject8);
      if (ag.c(this.dyA) != null)
        ag.c(this.dyA).xY();
      return 0;
    }
    if (paramkeep_ProgressInfo != null)
    {
      ag.a(this.dyA, locall1, paramkeep_ProgressInfo.field_finishedLength, 0L, 0);
      return 0;
    }
    adr localadr2;
    if (paramkeep_SceneResult != null)
    {
      if (paramkeep_SceneResult.field_retCode == 0)
        break label1119;
      String str7 = ag.a(this.dyA);
      Object[] arrayOfObject5 = new Object[3];
      arrayOfObject5[0] = ag.b(this.dyA);
      arrayOfObject5[1] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject5[2] = paramkeep_SceneResult;
      z.e(str7, "cdntra clientid:%s sceneResult.retCode:%d sceneResult[%s]", arrayOfObject5);
      boolean bool = ch.B(paramkeep_SceneResult.field_sKeyrespbuf);
      localadr2 = null;
      if (!bool)
        localadr2 = new adr();
    }
    while (true)
    {
      try
      {
        localadr2.cA(paramkeep_SceneResult.field_sKeyrespbuf);
        String str9 = ag.a(this.dyA);
        Object[] arrayOfObject7 = new Object[2];
        arrayOfObject7[0] = Integer.valueOf(localadr2.hRz.hQw);
        arrayOfObject7[1] = localadr2.hRz.hQx.toString();
        z.d(str9, "parse skeyrespbuf: ret:%d,msg:%s", arrayOfObject7);
        v.dX((int)ag.e(this.dyA));
        v.dW((int)ag.e(this.dyA));
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject6 = new Object[16];
        arrayOfObject6[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
        arrayOfObject6[1] = Integer.valueOf(1);
        arrayOfObject6[2] = Long.valueOf(ag.f(this.dyA));
        arrayOfObject6[3] = Long.valueOf(ch.CM());
        arrayOfObject6[4] = Integer.valueOf(i.z(com.tencent.mm.sdk.platformtools.ak.getContext()));
        arrayOfObject6[5] = Integer.valueOf(ag.g(this.dyA));
        arrayOfObject6[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
        arrayOfObject6[7] = paramkeep_SceneResult.field_transInfo;
        arrayOfObject6[8] = "";
        arrayOfObject6[9] = "";
        arrayOfObject6[10] = "";
        arrayOfObject6[11] = "";
        arrayOfObject6[12] = "";
        arrayOfObject6[13] = "";
        arrayOfObject6[14] = "";
        if (paramkeep_SceneResult == null)
        {
          str8 = "";
          arrayOfObject6[15] = str8;
          localn2.d(10421, arrayOfObject6);
          if ((localadr2 == null) || (localadr2.hRz.hQw == 0))
            continue;
          ag.d(this.dyA).a(4, localadr2.hRz.hQw, localadr2.hRz.hQx.toString(), this.dyA);
          if (ag.c(this.dyA) != null)
            ag.c(this.dyA).xY();
          return 0;
        }
      }
      catch (IOException localIOException2)
      {
        z.e(ag.a(this.dyA), "UploadMsgImgResponse parse fail: %s", new Object[] { localIOException2 });
        localadr2 = null;
        continue;
      }
      catch (b.a.a.b localb)
      {
        z.e(ag.a(this.dyA), "UploadMsgImgResponse parse UninitializedMessageException: %s", new Object[] { localb });
        localadr2 = null;
        continue;
        String str8 = paramkeep_SceneResult.report_Part2;
        continue;
        ag.d(this.dyA).a(3, paramkeep_SceneResult.field_retCode, "", this.dyA);
        continue;
      }
      label1119: String str2 = ag.a(this.dyA);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_UploadHitCacheType);
      arrayOfObject2[1] = Boolean.valueOf(paramkeep_SceneResult.field_needSendMsgField);
      z.i(str2, "uploadMsgImg by cdn, UploadHitCacheType: %d, needSendMsg:%b", arrayOfObject2);
      String str3 = ag.i(this.dyA);
      if (ch.jb(str3))
      {
        String str5 = "<msg><img aeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" cdnmidimgurl=\"" + paramkeep_SceneResult.field_fileId + "\" cdnbigimgurl=\"" + paramkeep_SceneResult.field_fileId + "\" ";
        String str6 = str5 + "cdnthumburl=\"" + paramkeep_SceneResult.field_fileId + "\" cdnthumbaeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" ";
        str3 = str6 + "length=\"" + paramkeep_SceneResult.field_midimgLength + "\" hdlength=\"" + paramkeep_SceneResult.field_fileLength + "\"/></msg>";
        z.i(ag.a(this.dyA), "cdn callback new build cdnInfo:%s", new Object[] { str3 });
      }
      locall1.gO(str3);
      ap.yg().a(locall1.xM(), locall1);
      l locall2 = ap.yg().Q(ag.e(this.dyA));
      locall2.gO(str3);
      ap.yg().a(locall2.xM(), locall2);
      if (paramkeep_SceneResult.field_needSendMsgField)
      {
        bg.qX().d(new an((adq)ag.j(this.dyA).sO(), locall1, paramkeep_SceneResult, new ak(this, paramkeep_SceneResult, locall1)));
      }
      else
      {
        com.tencent.mm.plugin.f.c.n localn1 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject3 = new Object[16];
        arrayOfObject3[0] = Integer.valueOf(0);
        arrayOfObject3[1] = Integer.valueOf(1);
        arrayOfObject3[2] = Long.valueOf(ag.f(this.dyA));
        arrayOfObject3[3] = Long.valueOf(ch.CM());
        arrayOfObject3[4] = Integer.valueOf(i.z(com.tencent.mm.sdk.platformtools.ak.getContext()));
        arrayOfObject3[5] = Integer.valueOf(ag.g(this.dyA));
        arrayOfObject3[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
        arrayOfObject3[7] = paramkeep_SceneResult.field_transInfo;
        arrayOfObject3[8] = "";
        arrayOfObject3[9] = "";
        arrayOfObject3[10] = "";
        arrayOfObject3[11] = "";
        arrayOfObject3[12] = "";
        arrayOfObject3[13] = "";
        arrayOfObject3[14] = "";
        arrayOfObject3[15] = paramkeep_SceneResult.report_Part2;
        localn1.d(10421, arrayOfObject3);
        adr localadr1 = new adr();
        try
        {
          localadr1.cA(paramkeep_SceneResult.field_sKeyrespbuf);
          if (localadr1.hOO != 0);
          long l;
          for (int i = localadr1.hOO; ; i = (int)l)
          {
            String str4 = ag.a(this.dyA);
            Object[] arrayOfObject4 = new Object[2];
            arrayOfObject4[0] = Integer.valueOf(localadr1.hRz.hQw);
            arrayOfObject4[1] = localadr1.hRz.hQx.toString();
            z.d(str4, "parse skeyrespbuf: ret:%d,msg:%s", arrayOfObject4);
            ag.a(this.dyA, locall1, locall1.sp(), i, localadr1.hOV);
            ag.d(this.dyA).a(0, 0, "", this.dyA);
            if (ag.c(this.dyA) == null)
              break;
            ag.c(this.dyA).xY();
            break;
            l = localadr1.hOY;
          }
        }
        catch (IOException localIOException1)
        {
          z.e(ag.a(this.dyA), "UploadMsgImgResponse parse fail: %s", new Object[] { localIOException1 });
          ag.d(this.dyA).a(3, paramkeep_SceneResult.field_retCode, "", this.dyA);
        }
        if (ag.c(this.dyA) != null)
          ag.c(this.dyA).xY();
      }
    }
    return 0;
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    z.d(ag.a(this.dyA), "getcdnauthinfo, mediaid:%s", new Object[] { paramString });
    adq localadq = (adq)ag.j(this.dyA).sO();
    cy localcy = new cy();
    localcy.hTf = localadq.iws.getString();
    localcy.hPq = localadq.hOP.getString();
    localcy.hPs = localadq.hOQ.getString();
    localcy.hTg = localadq.iwz;
    localcy.hTh = localadq.iwA;
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(localcy);
    localb.b(new adr());
    localb.fi("/cgi-bin/micromsg-bin/uploadmsgimg");
    localb.de(625);
    localb.df(9);
    localb.dg(1000000009);
    a locala = localb.sU();
    com.tencent.mm.network.n localn = ag.k(this.dyA).tE();
    if (localn != null)
    {
      if (aq.a(localn.qL(), localn.tC(), locala.tk(), paramByteArrayOutputStream))
      {
        String str3 = ag.a(this.dyA);
        Object[] arrayOfObject3 = new Object[1];
        arrayOfObject3[0] = localcy.hTf;
        z.d(str3, "getCdnAuthInfo successed.clientimgid:%s", arrayOfObject3);
        return;
      }
      String str2 = ag.a(this.dyA);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localcy.hTf;
      z.e(str2, "getCdnAuthInfo failed. clientimgid:%s", arrayOfObject2);
      return;
    }
    String str1 = ag.a(this.dyA);
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = localcy.hTf;
    z.e(str1, "get accinfo return null. clientimgid:%s", arrayOfObject1);
  }

  public final byte[] d(String paramString, byte[] paramArrayOfByte)
  {
    String str1 = bg.qX().rk().tE().qL();
    PInt localPInt = new PInt();
    try
    {
      byte[] arrayOfByte = av.a(paramArrayOfByte, str1.getBytes(), localPInt, new adr());
      String str2 = ag.a(this.dyA);
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = paramString;
      arrayOfObject[1] = Integer.valueOf(localPInt.value);
      z.i(str2, "decodePrepareResponse, clientmediaid:%s, ret:%d", arrayOfObject);
      return arrayOfByte;
    }
    catch (RemoteException localRemoteException)
    {
      z.e(ag.a(this.dyA), "decodePrepareResponse RemoteException:%s", new Object[] { localRemoteException });
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.aj
 * JD-Core Version:    0.6.2
 */