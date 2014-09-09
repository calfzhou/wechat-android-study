package com.tencent.mm.aa;

import com.tencent.mm.modelfriend.az;
import com.tencent.mm.modelfriend.bi;
import com.tencent.mm.modelfriend.bj;
import com.tencent.mm.network.ab;
import com.tencent.mm.network.aj;
import com.tencent.mm.network.r;
import com.tencent.mm.o.a;
import com.tencent.mm.o.b;
import com.tencent.mm.o.m;
import com.tencent.mm.protocal.a.qt;
import com.tencent.mm.protocal.a.qw;
import com.tencent.mm.protocal.a.qx;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d extends com.tencent.mm.o.x
  implements ab
{
  private int dSt = 0;
  private m dlH;
  private final a dsx;

  public d(int paramInt1, int paramInt2)
  {
    b localb = new b();
    localb.a(new qw());
    localb.b(new qx());
    localb.fi("/cgi-bin/micromsg-bin/listlinkedinfriend");
    localb.de(676);
    localb.df(0);
    localb.dg(0);
    this.dsx = localb.sU();
    qw localqw = (qw)this.dsx.sO();
    localqw.cCn = paramInt1;
    localqw.igt = paramInt2;
    this.dSt = paramInt2;
  }

  public final int CJ()
  {
    return ((qx)this.dsx.sP()).igv;
  }

  public final int a(r paramr, m paramm)
  {
    this.dlH = paramm;
    return a(paramr, this.dsx, this);
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, aj paramaj, byte[] paramArrayOfByte)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    arrayOfObject1[2] = Integer.valueOf(paramInt3);
    arrayOfObject1[3] = paramString;
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvninVxBMd/6gOufbF40IWDsrZbcmI3Wlsw==", "[oneliang][NetSceneListLinkedInFriend][onGYNetEnd]:netId:%s,errType:%s,errCode:%s,errMsg:%s", arrayOfObject1);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      LinkedList localLinkedList = ((qx)this.dsx.sP()).igw;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(localLinkedList.size());
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvninVxBMd/6gOufbF40IWDsrZbcmI3Wlsw==", "[oneliang][NetSceneListLinkedInFriend][onGYNetEnd]:net end ok,friend list size:%d", arrayOfObject2);
      if (localLinkedList != null)
      {
        if (this.dSt == 0)
          az.CG().clear();
        Iterator localIterator = localLinkedList.iterator();
        if (localIterator.hasNext())
        {
          qt localqt = (qt)localIterator.next();
          bi localbi = new bi();
          localbi.field_wechatId = com.tencent.mm.model.x.pG();
          localbi.field_linkedInId = localqt.ifr;
          localbi.field_name = localqt.name;
          localbi.field_position = localqt.igm;
          localbi.field_picUrl = localqt.ign;
          localbi.field_wechatUsername = localqt.igo;
          localbi.field_wechatSmallHead = localqt.igp;
          localbi.field_wechatBigHead = localqt.igq;
          localbi.field_linkedInProfileUrl = localqt.igr;
          localbi.field_nickname = localqt.duA;
          if (!ch.jb(localbi.field_wechatUsername))
            if (localbi.field_wechatUsername.endsWith("@stranger"))
              localbi.field_status = 1;
          while (true)
          {
            az.CG().a(localbi);
            break;
            localbi.field_status = 3;
            continue;
            localbi.field_status = 2;
          }
        }
      }
    }
    this.dlH.a(paramInt2, paramInt3, paramString, this);
  }

  public final int getType()
  {
    return 676;
  }

  public final boolean hasNext()
  {
    return ((qx)this.dsx.sP()).igu == 1;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.aa.d
 * JD-Core Version:    0.6.2
 */