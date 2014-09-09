package com.tencent.mm.x;

import android.text.TextUtils;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelfriend.ad;
import com.tencent.mm.modelfriend.ae;
import com.tencent.mm.modelfriend.az;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.y;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.aa;
import com.tencent.mm.o.m;
import com.tencent.mm.platformtools.f;
import com.tencent.mm.protocal.a.oq;
import com.tencent.mm.protocal.a.or;
import com.tencent.mm.protocal.a.qu;
import com.tencent.mm.protocal.a.qv;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public final class e extends com.tencent.mm.o.x
  implements ab
{
  private m dlH;
  private final com.tencent.mm.o.a dmI;
  private int dwA;
  private int dwB;
  private int dwC;
  private HashMap dwD = new HashMap();
  private String dwE;
  private ArrayList dwy;
  private int dwz;

  public e(ArrayList paramArrayList, int paramInt, HashMap paramHashMap, String paramString)
  {
    com.tencent.mm.o.b localb = new com.tencent.mm.o.b();
    localb.a(new qu());
    localb.b(new qv());
    localb.fi("/cgi-bin/micromsg-bin/listgooglecontact");
    localb.de(488);
    localb.df(0);
    localb.dg(0);
    this.dmI = localb.sU();
    this.dwy = paramArrayList;
    this.dwz = paramInt;
    this.dwA = 0;
    this.dwC = 1;
    this.dwD = paramHashMap;
    this.dwE = paramString;
  }

  private void a(qv paramqv)
  {
    while (true)
    {
      ArrayList localArrayList;
      int j;
      String str1;
      String str2;
      String str3;
      try
      {
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Integer.valueOf(paramqv.huF);
        z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz6gc8SOGCpxzm4p5KogigROPg9tnRTZ9fbfXBh8omVbo=", "handleListGoogleContactCGIResponse Count:%d", arrayOfObject);
        if ((paramqv.hQc == null) || (paramqv.hQc.size() <= 0))
          break label492;
        int i = paramqv.hQc.size();
        localArrayList = new ArrayList();
        j = 0;
        if (j >= i)
          break label483;
        oq localoq = (oq)paramqv.hQc.get(j);
        if (TextUtils.isEmpty(localoq.gnq))
          break label507;
        i locali = bg.qW().oT().ys(localoq.gnq);
        if ((locali == null) || (!com.tencent.mm.g.a.cv(locali.getType())))
          break label501;
        k = 2;
        if ((this.dwD == null) || (!this.dwD.containsKey(localoq.hQI)))
          break label495;
        ad localad = (ad)this.dwD.get(localoq.hQI);
        localad.field_username = localoq.gnq;
        localad.field_nickname = localoq.hwV;
        localad.field_usernamepy = f.jw(localoq.hwV);
        localad.field_nicknameqp = f.jv(localoq.hwV);
        localad.field_ret = localoq.hQw;
        localad.field_small_url = localoq.iez;
        localad.field_big_url = localoq.iey;
        localad.field_status = k;
        localad.field_googlecgistatus = 2;
        if ((k == 2) || (k == 0))
        {
          localad.field_contecttype = ("weixin" + j);
          localad.field_googlenamepy = f.jw(localad.field_googlename);
          localArrayList.add(localad);
          str1 = localad.field_googleid;
          str2 = localad.field_googlephotourl;
          str3 = this.dwE;
          if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)))
            break label495;
          if (TextUtils.isEmpty(str3))
            break label495;
        }
        else
        {
          localad.field_contecttype = "google";
          continue;
        }
      }
      finally
      {
      }
      String str4 = str1 + "@google";
      com.tencent.mm.n.x localx = af.sJ().fg(str4);
      if (localx == null)
        localx = new com.tencent.mm.n.x();
      localx.setUsername(str4);
      localx.bi(3);
      localx.fe(c.D(str2, str3));
      localx.ff(c.D(str2, str3));
      localx.T(true);
      localx.db(31);
      af.sJ().a(localx);
      break label495;
      label483: az.xh().e(localArrayList);
      label492: return;
      label495: j++;
      continue;
      label501: int k = 0;
      continue;
      label507: k = 1;
    }
  }

  protected final int a(aj paramaj)
  {
    return aa.doM;
  }

  public final int a(r paramr, m paramm)
  {
    z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz6gc8SOGCpxzm4p5KogigROPg9tnRTZ9fbfXBh8omVbo=", "doScene");
    this.dlH = paramm;
    qu localqu = (qu)this.dmI.sO();
    if (this.dwy != null)
    {
      LinkedList localLinkedList = new LinkedList();
      this.dwB = this.dwy.size();
      for (int i = this.dwA; (i < this.dwB) && (i < 500 + this.dwA); i++)
      {
        or localor = new or();
        localor.hQI = ((ad)this.dwy.get(i)).field_googlegmail;
        localLinkedList.add(localor);
      }
      localqu.hQc = localLinkedList;
      localqu.huF = localLinkedList.size();
      if (500 + this.dwA <= this.dwB)
        break label233;
    }
    label233: for (this.dwC = 0; ; this.dwC = 1)
    {
      localqu.hSL = this.dwC;
      localqu.igs = this.dwz;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(this.dwB);
      arrayOfObject[1] = Integer.valueOf(this.dwA);
      arrayOfObject[2] = Integer.valueOf(this.dwC);
      z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz6gc8SOGCpxzm4p5KogigROPg9tnRTZ9fbfXBh8omVbo=", "doscene mTotalSize:%d, mStarIndex:%d, mContinueFlag:%d", arrayOfObject);
      return a(paramr, this.dmI, this);
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(paramInt1);
    arrayOfObject[1] = Integer.valueOf(paramInt2);
    arrayOfObject[2] = Integer.valueOf(paramInt3);
    arrayOfObject[3] = paramString;
    z.i("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz6gc8SOGCpxzm4p5KogigROPg9tnRTZ9fbfXBh8omVbo=", "NetId:%d, ErrType:%d, ErrCode:%d, errMsg:%s", arrayOfObject);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.dlH.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    a(xD());
    if (this.dwC == 1)
    {
      this.dwA = (500 + this.dwA);
      if (a(tp(), this.dlH) < 0)
      {
        z.e("!76@/B4Tb64lLpKHrGLZvbPyiBIPb+9i/+Gz6gc8SOGCpxzm4p5KogigROPg9tnRTZ9fbfXBh8omVbo=", "doScene again failed");
        this.dlH.a(3, -1, "", this);
      }
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 488;
  }

  protected final int sB()
  {
    return 20;
  }

  public final qv xD()
  {
    return (qv)this.dmI.sP();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.x.e
 * JD-Core Version:    0.6.2
 */