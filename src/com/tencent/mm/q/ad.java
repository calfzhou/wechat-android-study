package com.tencent.mm.q;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.y;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;

final class ad
  implements o
{
  ad(aa paramaa)
  {
  }

  public final void a(q paramq)
  {
    if (((paramq.dqL != p.dqH) && (paramq.dqL != p.dqJ)) || (paramq.dqN == null));
    label890: label894: 
    while (true)
    {
      return;
      com.tencent.mm.storage.i locali = bg.qW().oT().ys(paramq.dqM);
      if (locali != null)
      {
        if (!locali.aIg())
        {
          aa.d(paramq.dqN);
          return;
        }
        if (!y.du(locali.getUsername()))
        {
          r localr1 = bg.qW().oW().yE(paramq.dqM);
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = paramq.dqM;
          z.v("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "hakon onEvent bizName = %s", arrayOfObject1);
          if ((paramq.dqN.ui()) && (paramq.dqN.tY() != null) && (paramq.dqN.tY().uD() != null) && (!ch.jb(paramq.dqN.tY().uD().dqu)))
          {
            if (ch.jb(paramq.dqN.field_enterpriseFather))
            {
              paramq.dqN.field_enterpriseFather = paramq.dqN.tY().uD().dqu;
              aa.uY().b(paramq.dqN);
              Object[] arrayOfObject5 = new Object[2];
              arrayOfObject5[0] = paramq.dqM;
              arrayOfObject5[1] = paramq.dqN.field_enterpriseFather;
              z.d("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "hakon bizStgExt, %s set enterpriseFather %s", arrayOfObject5);
            }
            if (localr1 == null)
            {
              r localr4 = new r(paramq.dqM);
              localr4.bx(ch.ja(paramq.dqN.tY().uD().dqu));
              localr4.aIB();
              bg.qW().oW().d(localr4);
            }
          }
          if (localr1 != null)
          {
            int i;
            if (paramq.dqN.ui())
            {
              if (paramq.dqN.tY() == null)
              {
                z.e("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "getExtInfo() == null");
                return;
              }
              if (paramq.dqN.tY().uD() == null)
              {
                z.e("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "enterpriseBizInfo == null");
                return;
              }
              localr1.bx(ch.ja(paramq.dqN.tY().uD().dqu));
              Object[] arrayOfObject4 = new Object[2];
              arrayOfObject4[0] = paramq.dqM;
              arrayOfObject4[1] = localr1.jR();
              z.v("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "hakon isEnterpriseChildType, %s, %s", arrayOfObject4);
              i = 1;
            }
            while (true)
            {
              if (i == 0)
                break label894;
              bg.qW().oW().a(localr1, localr1.getUsername());
              if (ch.jb(localr1.jR()))
                break;
              if ("officialaccounts".equals(localr1.jR()))
              {
                r localr3 = bg.qW().oW().yE("officialaccounts");
                if (localr3 == null)
                {
                  localr3 = new r("officialaccounts");
                  localr3.aIB();
                  bg.qW().oW().d(localr3);
                }
                if (!ch.jb(localr3.getContent()))
                  break;
                z.d("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "conv content is null");
                String str2 = bg.qW().oW().aII();
                if (ch.jb(str2))
                {
                  z.w("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "last convBiz is null");
                  return;
                  if (paramq.dqN.uh())
                  {
                    Object[] arrayOfObject3 = new Object[1];
                    arrayOfObject3[0] = paramq.dqM;
                    z.v("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "hakon isEnterpriseFatherType, %s", arrayOfObject3);
                    i = 1;
                    continue;
                  }
                  if ((!paramq.dqN.uf()) && (!y.dO(locali.getUsername())) && (!"officialaccounts".equals(localr1.jR())))
                  {
                    localr1.bx("officialaccounts");
                    i = 1;
                    continue;
                  }
                  if ((!paramq.dqN.uf()) || (localr1.jR() == null))
                    break label890;
                  localr1.bx(null);
                  i = 1;
                  continue;
                }
                ar localar2 = bg.qW().oV().zr(str2);
                if ((localar2 == null) || (localar2.kk() == 0L))
                {
                  z.w("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "last biz msg is error");
                  return;
                }
                bg.qW().oV().a(localar2.kk(), localar2);
                return;
              }
              Object[] arrayOfObject2 = new Object[2];
              arrayOfObject2[0] = paramq.dqM;
              arrayOfObject2[1] = localr1.jR();
              z.d("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "hakon username = %s, parentRef = %s", arrayOfObject2);
              r localr2 = bg.qW().oW().yE(localr1.jR());
              if (localr2 == null)
              {
                localr2 = new r(localr1.jR());
                localr2.aIB();
                localr2.Ab();
                bg.qW().oW().d(localr2);
              }
              if (!ch.jb(localr2.getContent()))
                break;
              z.d("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "conv content is null");
              String str1 = bg.qW().oW().yR(localr1.jR());
              if (ch.jb(str1))
              {
                z.w("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "last enterprise convBiz is null");
                return;
              }
              ar localar1 = bg.qW().oV().zr(str1);
              if ((localar1 == null) || (localar1.kk() == 0L))
              {
                z.w("!32@/B4Tb64lLpIAhUt0Bg2QTg4i7yLWzKSf", "last enterprise biz msg is error");
                return;
              }
              bg.qW().oV().a(localar1.kk(), localar1);
              return;
              i = 0;
            }
          }
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.q.ad
 * JD-Core Version:    0.6.2
 */