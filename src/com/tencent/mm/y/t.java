package com.tencent.mm.y;

import com.tencent.mm.a.f;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.k;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.a.q;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import java.util.Map;

public final class t extends com.tencent.mm.model.u
{
  protected final ar a(q paramq, String paramString1, String paramString2, String paramString3)
  {
    n localn = ap.yg();
    ar localar = super.a(paramq, paramString1, paramString2, paramString3);
    if (localar.kk() != 0L)
      return localar;
    localn.R(paramq.hOY);
    if (paramq.hOT != 2)
    {
      z.e("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "data type img, but has no imgstatus_hasimg ?!");
      return localar;
    }
    byte[] arrayOfByte = ai.a(paramq.hOU);
    Map localMap = x.bB(localar.getContent(), "msg");
    if (!ch.jb(localar.getContent()))
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = localar.getContent();
      z.i("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "cdntra content:[%s]", arrayOfObject2);
      if ((localMap == null) || (ch.getInt((String)localMap.get(".msg.img.$hdlength"), 0) <= 0));
    }
    for (long l1 = localn.a(arrayOfByte, paramq.hOY, true, localar.getContent(), new PString(), new PInt(), new PInt()); ; l1 = -1L)
    {
      PString localPString = new PString();
      PInt localPInt1 = new PInt();
      PInt localPInt2 = new PInt();
      long l2 = localn.a(arrayOfByte, paramq.hOY, false, localar.getContent(), localPString, localPInt1, localPInt2);
      if (l2 > 0L)
      {
        localar.bK(localPString.value);
        localar.bJ(localPInt1.value);
        localar.bK(localPInt2.value);
        if (l1 > 0L)
        {
          l locall = ap.yg().Q(l2);
          locall.dR((int)l1);
          ap.yg().a(l2, locall);
        }
      }
      if ((ch.B(arrayOfByte)) && (localMap != null))
      {
        String str1 = (String)localMap.get(".msg.img.$cdnthumbaeskey");
        String str2 = (String)localMap.get(".msg.img.$cdnthumburl");
        int i = ch.getInt((String)localMap.get(".msg.img.$cdnthumblength"), 0);
        String str3 = localn.f(f.d(("SERVERID://" + localar.kl()).getBytes()), "th_", "");
        long l3 = localar.kl();
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Long.valueOf(l3);
        arrayOfObject1[1] = paramString1;
        z.d("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "cdntra getThumbByCdn msgsvrid:%d from:%s ", arrayOfObject1);
        long l4 = ch.CM();
        String str4 = str3 + ".tmp";
        com.tencent.mm.modelcdntran.n localn1 = new com.tencent.mm.modelcdntran.n();
        localn1.field_mediaId = i.a("downimgthumb", localar.kn(), paramString1, String.valueOf(l3));
        localn1.field_fullpath = str4;
        localn1.field_fileType = CdnTransportEngine.dry;
        localn1.field_totalLen = i;
        localn1.field_aesKey = str1;
        localn1.field_fileId = str2;
        localn1.field_priority = CdnTransportEngine.drv;
        localn1.dsw = new u(this, l3, localar, l4, i, str3, str4);
        localar.setStatus(4);
        k.vl().a(localn1);
      }
      return localar;
    }
  }

  public final void d(ar paramar)
  {
    ap.yg().i(paramar);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.t
 * JD-Core Version:    0.6.2
 */