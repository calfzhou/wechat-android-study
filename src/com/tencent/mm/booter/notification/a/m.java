package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import com.tencent.mm.compatible.g.u;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.bw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.modelvoice.bp;
import com.tencent.mm.n;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.av;
import com.tencent.mm.storage.aw;
import com.tencent.mm.storage.c;
import com.tencent.mm.storage.i;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.lang.ref.WeakReference;
import junit.framework.Assert;

public final class m
{
  private static WeakReference dwc;
  private static int dwd = 0;
  private static int dwe = 0;
  private String dwb = "";
  private String ijh = "";
  private String mTitle = "";

  public static String a(int paramInt1, String paramString1, String paramString2, int paramInt2, Context paramContext)
  {
    return a(null, paramInt1, paramString1, paramString2, paramInt2, paramContext, new PString(), new PString(), new PInt(), false, false);
  }

  private static String a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, PString paramPString1, PString paramPString2)
  {
    String str1 = "";
    if ((y.dn(paramString1)) || (y.dp(paramString1)))
    {
      if (paramString2 != null)
      {
        int k = paramString2.indexOf(":");
        if ((k >= 0) && (k < paramString2.length()))
        {
          String str3 = paramString2.substring(0, k);
          if ((i.xY(str3)) || (i.ya(str3)))
          {
            str1 = y.dh(str3);
            paramPString2.value = str3;
            paramString2 = paramString2.substring(k + 1);
          }
        }
      }
      if (ch.ja(str1).length() > 0)
        break label252;
      if (paramString3 != null)
        break label246;
    }
    while (true)
    {
      paramPString1.value = paramString2;
      return paramPString1.value;
      if ((!i.xY(paramString1)) && (!i.ya(paramString1)))
        break;
      y.dh(paramString1);
      paramPString2.value = paramString1;
      if (paramInt == 1)
      {
        StringBuilder localStringBuilder5 = new StringBuilder().append(paramContext.getString(n.bKX, new Object[] { "" }));
        if (paramString3 == null);
        while (true)
        {
          paramPString1.value = paramString2;
          paramPString2.value = "";
          return paramPString1.value;
          paramString2 = paramString3;
        }
      }
      if (paramString3 == null);
      while (true)
      {
        paramPString1.value = paramString2;
        paramPString2.value = "";
        return paramPString1.value;
        paramString2 = paramString3;
      }
      label246: paramString2 = paramString3;
    }
    label252: StringBuilder localStringBuilder1 = new StringBuilder();
    int i;
    String str2;
    label292: int j;
    label326: StringBuilder localStringBuilder4;
    if (paramInt == 1)
    {
      i = n.bKX;
      StringBuilder localStringBuilder2 = localStringBuilder1.append(paramContext.getString(i));
      if (paramString3 != null)
        break label371;
      str2 = paramString2;
      paramPString1.value = str2;
      StringBuilder localStringBuilder3 = new StringBuilder();
      if (paramInt != 1)
        break label378;
      j = n.bKX;
      localStringBuilder4 = localStringBuilder3.append(paramContext.getString(j, new Object[] { str1 }));
      if (paramString3 != null)
        break label386;
    }
    while (true)
    {
      return paramString2;
      i = n.bLh;
      break;
      label371: str2 = paramString3;
      break label292;
      label378: j = n.bLh;
      break label326;
      label386: paramString2 = paramString3;
    }
  }

  private static String a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, Context paramContext, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1;
    boolean bool2;
    label29: int i20;
    if (paramContext != null)
    {
      bool1 = true;
      Assert.assertTrue("context is null", bool1);
      if ((paramString2 == null) || (paramString2.length() <= 0))
        break label77;
      bool2 = true;
      Assert.assertTrue("username is null", bool2);
      if (paramBoolean1)
        break label127;
      if ((!y.dn(paramString2)) || (x.pT()))
        break label83;
      i20 = 1;
    }
    while (true)
    {
      if (i20 == 0)
        break label127;
      return paramContext.getString(n.cgr);
      bool1 = false;
      break;
      label77: bool2 = false;
      break label29;
      label83: if ((y.dp(paramString2)) && (!x.pP()))
        i20 = 1;
      else if ((y.dt(paramString2)) && (!x.pW()))
        i20 = 1;
      else
        i20 = 0;
    }
    label127: if (y.dt(paramString2))
    {
      if (paramBoolean1)
        return "";
      boolean bool4 = x.pW();
      long l = ch.a((Long)bg.qW().oQ().get(65793), 0L);
      if (!bool4)
        return paramContext.getString(n.cgr);
      if (l == 0L)
        return paramContext.getString(n.bKV);
      if (1000L * ch.ab(l) > 1209600000L)
      {
        int i19 = n.bKU;
        Object[] arrayOfObject11 = new Object[1];
        arrayOfObject11[0] = Long.valueOf(1000L * ch.ab(l) / 86400000L);
        return paramContext.getString(i19, arrayOfObject11);
      }
      return "";
    }
    if ((paramString3 != null) && (paramBoolean1))
      paramString3 = cq(paramString3);
    for (int i = 1; ; i = 0)
    {
      paramPString1.value = paramString3;
      String str67;
      String str1;
      String str2;
      if ((paramInt1 == 0) && (y.dc(paramString2)))
      {
        int i18 = bw.ek(paramString3);
        if (i18 > 0)
        {
          str67 = paramString3.substring(0, i18).trim();
          String str68 = y.u(str67, paramString2);
          str1 = (paramString3 + " ").substring(i18 + 1);
          str2 = str68;
        }
      }
      for (String str3 = str67; ; str3 = "")
      {
        int k;
        Object localObject1;
        if (y.dG(paramString2))
        {
          int i16 = paramString3.indexOf(":");
          if (i16 != -1)
          {
            paramPString2.value = paramString3.substring(0, i16);
            int i17 = i16 + 1;
            paramString3 = paramString3.substring(i17);
          }
          k = 0;
          localObject1 = paramString3;
        }
        while (true)
        {
          label728: Object localObject2;
          String str5;
          int m;
          int j;
          label897: label940: label1266: String str57;
          switch (paramInt2)
          {
          default:
          case 3:
          case 23:
          case 33:
          case 47:
          case 1048625:
          case 13:
          case 39:
          case 11:
          case 36:
          case 34:
          case 43:
          case 62:
          case 12299999:
          case -1879048191:
          case -1879048190:
          case -1879048189:
          case 50:
          case 53:
          case 52:
          case -1879048188:
          case 37:
          case 40:
          case 35:
          case 42:
          case 48:
            label1418: label1455: 
            do
            {
              localObject2 = "";
              str5 = null;
              m = 0;
              while (true)
              {
                if (!y.jdMethod_do(paramString2))
                  break label5303;
                if (1 != paramInt1)
                  break label5039;
                if (ch.jb((String)localObject2))
                  break label4999;
                paramPString1.value = ((String)localObject2);
                return localObject2;
                r localr = bg.qW().oW().yE(paramString2);
                if ((localr == null) || (!localr.cw(2097152)))
                {
                  j = 0;
                  if (!paramBoolean2)
                    break label5848;
                }
                j = 1;
                int i14 = paramString3.indexOf(":");
                if (i14 == -1)
                  break label5848;
                paramPString2.value = paramString3.substring(0, i14);
                int i15 = i14 + 1;
                String str66 = paramString3.substring(i15);
                k = j;
                localObject1 = str66;
                break;
                String str63 = paramContext.getString(n.btR);
                String str64;
                if (str3.length() > 0)
                {
                  str64 = str3 + ": ";
                  if (str3.length() <= 0)
                    break label940;
                }
                for (String str65 = "%s: "; ; str65 = "")
                {
                  paramPString1.value = str65;
                  localObject1 = str64;
                  localObject2 = str63;
                  str5 = null;
                  m = 0;
                  break;
                  str64 = "";
                  break label897;
                }
                com.tencent.mm.storage.z localz = com.tencent.mm.storage.z.yW((String)localObject1);
                String str62 = localz.AN() + ": ";
                if ((paramString1 != null) && (paramString1.length() == 32));
                while (true)
                {
                  paramPString1.value = "";
                  paramPString2.value = localz.AN();
                  localObject1 = str62;
                  localObject2 = paramString1;
                  str5 = null;
                  m = 0;
                  break;
                  paramString1 = paramContext.getString(n.btb);
                }
                localObject1 = a(paramContext, paramInt1, paramString2, (String)localObject1, paramContext.getString(n.btR), paramPString1, paramPString2);
                localObject2 = "";
                str5 = null;
                m = 0;
                continue;
                localObject1 = a(paramContext, paramInt1, paramString2, (String)localObject1, null, paramPString1, paramPString2);
                localObject2 = "";
                str5 = null;
                m = 0;
                continue;
                if ((i.xY(paramString2)) || (i.ya(paramString2)) || (y.dn(paramString2)) || (y.dp(paramString2)))
                {
                  localObject1 = a(paramContext, paramInt1, paramString2, (String)localObject1, paramContext.getString(n.buw), paramPString1, paramPString2);
                  localObject2 = "";
                  str5 = null;
                  m = 0;
                }
                else
                {
                  if ((localObject1 != null) && (((String)localObject1).length() > 0) && (!y.jdMethod_do(paramString2)))
                  {
                    if (!y.dc(paramString2))
                      break label1266;
                    bp localbp = new bp((String)localObject1);
                    localObject1 = localbp.AN() + ": ";
                    paramPString1.value = "%s:";
                    paramPString2.value = localbp.AN();
                  }
                  while (true)
                  {
                    localObject2 = paramContext.getString(n.buw);
                    str5 = null;
                    m = 0;
                    break;
                    localObject1 = "";
                  }
                  if ((i.xY(paramString2)) || (i.ya(paramString2)) || (y.dn(paramString2)) || (y.dp(paramString2)))
                  {
                    localObject1 = a(paramContext, paramInt1, paramString2, (String)localObject1, paramContext.getString(n.buv), paramPString1, paramPString2);
                    localObject2 = "";
                    str5 = null;
                    m = 0;
                  }
                  else
                  {
                    if ((localObject1 != null) && (((String)localObject1).length() > 0) && (!y.jdMethod_do(paramString2)))
                    {
                      if (y.dc(paramString2))
                      {
                        com.tencent.mm.ak.o localo = new com.tencent.mm.ak.o((String)localObject1);
                        localObject1 = localo.AN() + ": ";
                        paramPString1.value = "%s:";
                        paramPString2.value = localo.AN();
                      }
                    }
                    else
                      if (62 != paramInt2)
                        break label1455;
                    for (int i13 = n.cBO; ; i13 = n.buv)
                    {
                      localObject2 = paramContext.getString(i13);
                      str5 = null;
                      m = 0;
                      break;
                      localObject1 = "";
                      break label1418;
                    }
                    localObject1 = "";
                    localObject2 = paramContext.getString(n.buy);
                    str5 = null;
                    m = 0;
                    continue;
                    localObject1 = "";
                    localObject2 = paramContext.getString(n.bux);
                    str5 = null;
                    m = 0;
                    continue;
                    if (((String)localObject1).equals(ar.iju))
                    {
                      localObject1 = "";
                      localObject2 = paramContext.getString(n.buy);
                      str5 = null;
                      m = 0;
                    }
                    else
                    {
                      if (!((String)localObject1).equals(ar.ijt))
                        break label728;
                      localObject1 = "";
                      localObject2 = paramContext.getString(n.buz);
                      str5 = null;
                      m = 0;
                      continue;
                      localObject1 = "";
                      localObject2 = paramContext.getString(n.buy);
                      str5 = null;
                      m = 0;
                      continue;
                      localObject1 = "";
                      localObject2 = paramContext.getString(n.buz);
                      str5 = null;
                      m = 0;
                      continue;
                      if ((localObject1 == null) || (((String)localObject1).length() <= 0))
                        break label728;
                      av localav = av.zp((String)localObject1);
                      if ((localav.aJQ() != null) && (localav.aJQ().length() > 0));
                      switch (localav.Ew())
                      {
                      case 19:
                      case 20:
                      case 21:
                      default:
                        int i12 = n.bLs;
                        Object[] arrayOfObject10 = new Object[1];
                        arrayOfObject10[0] = localav.getDisplayName();
                        localObject1 = paramContext.getString(i12, arrayOfObject10);
                        paramPString1.value = ((String)localObject1);
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        break;
                      case 18:
                        int i11 = n.bLa;
                        Object[] arrayOfObject9 = new Object[1];
                        arrayOfObject9[0] = localav.getDisplayName();
                        localObject1 = paramContext.getString(i11, arrayOfObject9);
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        break;
                      case 22:
                      case 23:
                      case 24:
                      case 26:
                      case 27:
                      case 28:
                      case 29:
                        int i10 = n.bLj;
                        Object[] arrayOfObject8 = new Object[1];
                        arrayOfObject8[0] = localav.getDisplayName();
                        localObject1 = paramContext.getString(i10, arrayOfObject8);
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        break;
                      case 25:
                        int i9 = n.bJX;
                        Object[] arrayOfObject7 = new Object[1];
                        arrayOfObject7[0] = localav.getDisplayName();
                        String str61 = paramContext.getString(i9, arrayOfObject7);
                        paramPString1.value = str61;
                        localObject1 = str61;
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        continue;
                        if ((localObject1 == null) || (((String)localObject1).length() <= 0))
                          break label728;
                        as localas2 = as.zl((String)localObject1);
                        if ((localas2.aJQ() != null) && (localas2.aJQ().length() > 0))
                        {
                          int i8 = n.bKn;
                          Object[] arrayOfObject6 = new Object[1];
                          arrayOfObject6[0] = localas2.getDisplayName();
                          localObject1 = paramContext.getString(i8, arrayOfObject6);
                          paramPString1.value = ((String)localObject1);
                        }
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        continue;
                        if (ch.ja((String)localObject1).length() <= 0)
                          break label728;
                        au localau = bg.qW().oV().zB((String)localObject1);
                        int i7 = n.bKT;
                        Object[] arrayOfObject5 = new Object[2];
                        arrayOfObject5[0] = localau.zj();
                        arrayOfObject5[1] = localau.getTitle();
                        String str60 = paramContext.getString(i7, arrayOfObject5);
                        paramPString1.value = str60;
                        localObject1 = str60;
                        localObject2 = "";
                        str5 = null;
                        m = 0;
                        continue;
                        if (ch.ja((String)localObject1).length() <= 0)
                          break label728;
                        String str58;
                        if (y.dc(paramString2))
                        {
                          str58 = bw.em((String)localObject1);
                          if (!TextUtils.isEmpty(str58));
                        }
                        else
                        {
                          str58 = paramString2;
                        }
                        as localas1 = bg.qW().oV().zD((String)localObject1);
                        String str59 = bg.qW().oT().ys(str58).od();
                        if (y.dc(str59))
                          str59 = v.d(v.cX(str59));
                        if (paramInt1 == 1)
                        {
                          int i5 = n.bJY;
                          Object[] arrayOfObject3 = new Object[2];
                          arrayOfObject3[0] = str59;
                          arrayOfObject3[1] = localas1.getDisplayName();
                          localObject1 = paramContext.getString(i5, arrayOfObject3);
                          int i6 = n.bJY;
                          Object[] arrayOfObject4 = new Object[2];
                          arrayOfObject4[0] = "%s";
                          arrayOfObject4[1] = localas1.getDisplayName();
                          paramPString1.value = paramContext.getString(i6, arrayOfObject4);
                          paramPString2.value = str58;
                          localObject2 = "";
                          str5 = null;
                          m = 0;
                        }
                        else
                        {
                          int i3 = n.bJZ;
                          Object[] arrayOfObject1 = new Object[2];
                          arrayOfObject1[0] = str59;
                          arrayOfObject1[1] = localas1.getDisplayName();
                          localObject1 = paramContext.getString(i3, arrayOfObject1);
                          int i4 = n.bJZ;
                          Object[] arrayOfObject2 = new Object[2];
                          arrayOfObject2[0] = "%s";
                          arrayOfObject2[1] = localas1.getDisplayName();
                          paramPString1.value = paramContext.getString(i4, arrayOfObject2);
                          paramPString2.value = str58;
                          localObject2 = "";
                          str5 = null;
                          m = 0;
                        }
                        break;
                      }
                    }
                  }
                }
              }
            }
            while (ch.ja((String)localObject1).length() <= 0);
            if (y.dc(paramString2))
            {
              int i2 = bw.ek((String)localObject1);
              if (i2 != -1)
              {
                str57 = ((String)localObject1).substring(0, i2).trim();
                label2428: bw.en((String)localObject1);
              }
            }
            break;
          case 335544369:
          case 402653233:
          case 419430449:
          case 369098801:
          case -1879048186:
          case -1879048185:
          case 49:
          case 16777265:
          case 268435505:
          case 285212721:
          case 318767153:
          case 55:
          case 57:
          }
          for (String str54 = str57; ; str54 = paramString2)
          {
            if (paramInt1 == 1)
            {
              String str56 = paramContext.getString(n.bPI);
              paramPString1.value = str56;
              localObject1 = str56;
              localObject2 = "";
              str5 = null;
              m = 0;
              break;
            }
            String str55 = paramContext.getString(n.bPI);
            paramPString1.value = paramContext.getString(n.bPI);
            paramPString2.value = str54;
            localObject1 = str55;
            localObject2 = "";
            str5 = null;
            m = 0;
            break;
            com.tencent.mm.ai.b localb5 = com.tencent.mm.ai.b.iS(ch.xw(str1));
            if (localb5.dRp != 0)
              if (localb5.dRp == 1)
                localObject2 = paramContext.getString(n.ccE);
            while (true)
            {
              localObject1 = "";
              paramPString2.value = str3;
              paramPString1.value = "";
              str5 = null;
              m = 0;
              break;
              if (localb5.dRp == 2)
                localObject2 = paramContext.getString(n.ccG);
              else if (localb5.dRp == 3)
                localObject2 = paramContext.getString(n.ccF);
              else
                localObject2 = paramContext.getString(n.ccH);
            }
            String str52 = ch.xw(str1);
            String str53 = "";
            com.tencent.mm.ai.b localb4 = com.tencent.mm.ai.b.iS(str52);
            if (localb4 != null)
            {
              paramPString1.value = (paramContext.getString(n.ccP) + ch.ja(localb4.title));
              str53 = paramPString1.value;
            }
            paramPString2.value = str3;
            localObject1 = str53;
            localObject2 = "";
            str5 = null;
            m = 0;
            break;
            String str50 = ch.xw(str1);
            String str51 = "";
            com.tencent.mm.ai.b localb3 = com.tencent.mm.ai.b.iS(str50);
            int i1;
            if (localb3 != null)
            {
              if (paramInt1 != 1)
                break label2848;
              i1 = 1;
              label2767: switch (localb3.dRL)
              {
              case 2:
              default:
                paramPString1.value = ch.ja(localb3.title);
              case 1:
              case 3:
              case 4:
              }
            }
            while (true)
            {
              str51 = paramPString1.value;
              paramPString2.value = str3;
              localObject1 = str51;
              localObject2 = "";
              str5 = null;
              m = 0;
              break;
              label2848: i1 = 0;
              break label2767;
              if (i1 != 0)
              {
                paramPString1.value = paramContext.getString(n.buE);
              }
              else
              {
                paramPString1.value = paramContext.getString(n.buH);
                continue;
                if (i1 != 0)
                {
                  paramPString1.value = paramContext.getString(n.buF);
                }
                else
                {
                  paramPString1.value = paramContext.getString(n.buC);
                  continue;
                  if (i1 != 0)
                    paramPString1.value = paramContext.getString(n.buG);
                  else
                    paramPString1.value = paramContext.getString(n.buD);
                }
              }
            }
            switch (com.tencent.mm.ai.b.iS(ch.xw(str1)).dRp)
            {
            default:
              localObject2 = paramContext.getString(n.btS);
              label3014: if (str3.length() <= 0)
                break;
            case 10000:
            case 20000:
            }
            for (String str49 = str3 + ": "; ; str49 = "")
            {
              if ((!y.dG(paramString2)) && (k == 0))
                paramPString2.value = str3;
              paramPString1.value = "";
              localObject1 = str49;
              str5 = null;
              m = 0;
              break;
              localObject2 = paramContext.getString(n.btT);
              break label3014;
              localObject2 = paramContext.getString(n.btU);
              break label3014;
            }
            com.tencent.mm.ai.b localb2 = com.tencent.mm.ai.b.iS(ch.xw(str1));
            if (localb2 == null)
            {
              com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKR3MWtFvfaIDsuuSU5RlhdLOCB6ErGWdM=", "decode msg content failed");
              return "";
            }
            String str47;
            if (str3.length() > 0)
            {
              str47 = str3 + ": " + localb2.title;
              label3181: if ((!y.dG(paramString2)) && (k == 0))
                paramPString2.value = str3;
              if (str3.length() <= 0)
                break label3264;
            }
            label3264: for (String str48 = "%s: " + localb2.title; ; str48 = localb2.title)
            {
              paramPString1.value = str48;
              localObject1 = str47;
              localObject2 = "";
              str5 = null;
              m = 0;
              break;
              str47 = localb2.title;
              break label3181;
            }
            String str44 = paramContext.getString(n.bsI);
            String str45;
            if (str3.length() > 0)
            {
              str45 = str3 + ": ";
              label3314: if ((!y.dG(paramString2)) && (k == 0))
                paramPString2.value = str3;
              if (str3.length() <= 0)
                break label3376;
            }
            label3376: for (String str46 = "%s: "; ; str46 = "")
            {
              paramPString1.value = str46;
              localObject1 = str45;
              localObject2 = str44;
              str5 = null;
              m = 0;
              break;
              str45 = "";
              break label3314;
            }
            com.tencent.mm.ai.b localb1 = com.tencent.mm.ai.b.iS(ch.xw(str1));
            if (localb1 == null)
            {
              com.tencent.mm.sdk.platformtools.z.e("!44@/B4Tb64lLpKR3MWtFvfaIDsuuSU5RlhdLOCB6ErGWdM=", "decode msg content failed");
              return "";
            }
            switch (localb1.type)
            {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            default:
              localObject2 = "";
              localObject1 = "";
              str5 = null;
              m = 0;
              break;
            case 1:
              String str42;
              if (str3.length() > 0)
              {
                str42 = str3 + ": " + localb1.title;
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label3642;
              }
              for (String str43 = "%s: " + localb1.title; ; str43 = localb1.title)
              {
                paramPString1.value = str43;
                localObject1 = str42;
                localObject2 = "";
                str5 = null;
                m = 0;
                break;
                str42 = localb1.title;
                break label3559;
              }
            case 2:
              String str39 = paramContext.getString(n.btR);
              String str40;
              if (str3.length() > 0)
              {
                str40 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label3754;
              }
              for (String str41 = "%s: "; ; str41 = "")
              {
                paramPString1.value = str41;
                localObject1 = str40;
                localObject2 = str39;
                str5 = null;
                m = 0;
                break;
                str40 = "";
                break label3692;
              }
            case 3:
              String str36 = paramContext.getString(n.btL);
              String str37;
              if (str3.length() > 0)
              {
                str37 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label3867;
              }
              for (String str38 = "%s: "; ; str38 = "")
              {
                paramPString1.value = str38;
                m = 1;
                str5 = localb1.title;
                localObject1 = str37;
                localObject2 = str36;
                break;
                str37 = "";
                break label3801;
              }
            case 4:
              String str33 = paramContext.getString(n.buv);
              String str34;
              if (str3.length() > 0)
              {
                str34 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label3980;
              }
              for (String str35 = "%s: "; ; str35 = "")
              {
                paramPString1.value = str35;
                m = 1;
                str5 = localb1.title;
                localObject1 = str34;
                localObject2 = str33;
                break;
                str34 = "";
                break label3914;
              }
            case 6:
              String str30 = paramContext.getString(n.btz);
              String str31;
              if (str3.length() > 0)
              {
                str31 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label4093;
              }
              for (String str32 = "%s: "; ; str32 = "")
              {
                paramPString1.value = str32;
                m = 1;
                str5 = localb1.title;
                localObject1 = str31;
                localObject2 = str30;
                break;
                str31 = "";
                break label4027;
              }
            case 7:
              String str27 = paramContext.getString(n.bsI);
              String str28;
              if (str3.length() > 0)
              {
                str28 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label4202;
              }
              for (String str29 = "%s: "; ; str29 = "")
              {
                paramPString1.value = str29;
                localObject1 = str28;
                localObject2 = str27;
                str5 = null;
                m = 0;
                break;
                str28 = "";
                break label4140;
              }
            case 5:
              String str24 = paramContext.getString(n.buu);
              String str25;
              if (str3.length() > 0)
              {
                str25 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label4315;
              }
              for (String str26 = "%s: "; ; str26 = "")
              {
                paramPString1.value = str26;
                m = 1;
                str5 = localb1.title;
                localObject1 = str25;
                localObject2 = str24;
                break;
                str25 = "";
                break label4249;
              }
            case 8:
              String str22 = paramContext.getString(n.btc);
              if (str3.length() > 0);
              for (String str23 = str3 + ": "; ; str23 = "")
              {
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                paramPString1.value = "";
                localObject1 = str23;
                localObject2 = str22;
                str5 = null;
                m = 0;
                break;
              }
            case 15:
              String str20 = paramContext.getString(n.btd);
              if (str3.length() > 0);
              for (String str21 = str3 + ": "; ; str21 = "")
              {
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                paramPString1.value = "";
                localObject1 = str21;
                localObject2 = str20;
                str5 = null;
                m = 0;
                break;
              }
            case 17:
              String str18;
              if (str3.length() > 0)
              {
                str18 = str3 + ": " + localb1.title;
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label4623;
              }
              for (String str19 = "%s: " + localb1.title; ; str19 = localb1.title)
              {
                paramPString1.value = str19;
                localObject1 = str18;
                localObject2 = "";
                str5 = null;
                m = 0;
                break;
                str18 = localb1.title;
                break label4540;
              }
            case 19:
              String str15 = paramContext.getString(n.btY);
              String str16;
              if (str3.length() > 0)
              {
                str16 = str3 + ": ";
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() <= 0)
                  break label4735;
              }
              for (String str17 = "%s: "; ; str17 = "")
              {
                paramPString1.value = str17;
                localObject1 = str16;
                localObject2 = str15;
                str5 = null;
                m = 0;
                break;
                str16 = "";
                break label4673;
              }
            case 16:
              label3559: label3692: label4093: label4735: String str13 = paramContext.getString(n.cCy);
              label3642: label3801: label4202: if (str3.length() > 0);
              label3754: label3914: label4315: for (String str14 = str3 + ": " + str13 + localb1.title; ; str14 = str13 + localb1.title)
              {
                if ((!y.dG(paramString2)) && (k == 0))
                  paramPString2.value = str3;
                if (str3.length() > 0)
                  str13 = "%s: " + str13;
                paramPString1.value = str13;
                localObject1 = str14;
                localObject2 = "";
                str5 = null;
                m = 0;
                break;
              }
              label3867: label4027: label4540: label4673: if (i != 0)
                localObject1 = cr((String)localObject1);
              label3980: label4140: String str12 = cq(com.tencent.mm.ai.b.jc((String)localObject1));
              label4249: paramPString1.value = str12;
              label4623: localObject1 = str12;
              localObject2 = "";
              str5 = null;
              m = 0;
              break;
              paramPString1.value = com.tencent.mm.ai.b.iT((String)localObject1);
              localObject2 = paramPString1.value;
              str5 = null;
              m = 0;
              break;
              String str4 = com.tencent.mm.r.a.b(com.tencent.mm.r.b.fN((String)localObject1));
              paramPString1.value = str4;
              localObject1 = str4;
              localObject2 = "";
              str5 = null;
              m = 0;
              break;
              label4999: String[] arrayOfString3 = ((String)localObject1).split("@bottle:");
              if (arrayOfString3.length > 1)
              {
                paramPString1.value = arrayOfString3[1];
                return arrayOfString3[1];
              }
              paramPString1.value = "";
              return null;
              label5039: String[] arrayOfString1 = ((String)localObject1).split(":");
              if ((arrayOfString1 == null) || (arrayOfString1.length <= 0))
              {
                paramPString1.value = "";
                return null;
              }
              String str9 = arrayOfString1[0];
              boolean bool3 = ch.jb(str9);
              String str10 = null;
              if (!bool3)
              {
                i locali = bg.qW().oT().ys(str9);
                str10 = null;
                if (locali != null)
                {
                  String str11 = locali.jq();
                  str10 = null;
                  if (str11 != null)
                    str10 = locali.jq();
                }
                if ((str10 == null) || (str10.length() <= 0))
                  str10 = locali.jp();
              }
              if (!ch.jb((String)localObject2))
              {
                paramPString1.value = (str10 + ": " + (String)localObject2);
                return str10 + ": " + (String)localObject2;
              }
              String[] arrayOfString2 = ((String)localObject1).split("@bottle:");
              if (arrayOfString2.length > 1)
              {
                paramPString1.value = (str10 + ": " + arrayOfString2[1]);
                return str10 + ": " + arrayOfString2[1];
              }
              paramPString1.value = str10;
              return str10;
              label5303: if (ch.jb((String)localObject1))
                paramPString1.value = "";
              String str7;
              int n;
              if (!ch.jb(str3))
              {
                if ((str2 != null) && (str2.length() > 0))
                  localObject1 = g((String)localObject1, str3, str2);
                if (ch.jb(paramPString2.value))
                {
                  paramPString1.value = g(paramPString1.value, str3, "%s");
                  paramPString2.value = str3;
                }
                String str6 = u.cJ((String)localObject1);
                paramPString1.value = u.cJ(paramPString1.value);
                str7 = str6 + (String)localObject2;
                paramPString1.value += (String)localObject2;
                if (paramBoolean1)
                {
                  if ((paramPString1.value.length() != 32) || ((paramInt2 != 47) && (paramInt2 != 1048625)))
                    break label5550;
                  paramPString1.value = str7;
                  n = 1;
                  if (n == 0)
                    a(paramInt2, paramPString1, paramPString2, paramPInt);
                }
                if (m == 0)
                  break label5829;
              }
              label5550: label5827: label5829: for (String str8 = str7.concat(" " + str5); ; str8 = str7)
              {
                return ch.ja(str8);
                n = 0;
                break;
                if ((y.dG(paramString2)) || (k != 0))
                {
                  if ((localObject2 != null) && (((String)localObject2).length() > 0))
                    localObject1 = localObject2;
                  if (ch.jb((String)localObject1))
                  {
                    paramPString1.value = "";
                    paramPString2.value = "";
                    return "";
                  }
                  if (paramInt1 == 0)
                  {
                    paramPString1.value = ("%s:" + (String)localObject1);
                    if (!paramBoolean1)
                      break label5751;
                    a(paramInt2, paramPString1, paramPString2, paramPInt);
                    localObject2 = localObject1;
                  }
                }
                while (true)
                {
                  if ((m != 0) && (str5 != null))
                    localObject2 = ((String)localObject2).concat(" " + str5);
                  if (i != 0)
                    localObject2 = cr((String)localObject2);
                  return ch.ja(com.tencent.mm.ar.a.Bb((String)localObject2));
                  paramPString1.value = (paramContext.getString(n.btI) + ":" + (String)localObject1);
                  break;
                  label5751: return y.dh(paramPString2.value) + ":" + (String)localObject1;
                  if ((localObject2 != null) && (((String)localObject2).length() > 0))
                    paramPString1.value = ((String)localObject2);
                  while (true)
                  {
                    if (!paramBoolean1)
                      break label5827;
                    a(paramInt2, paramPString1, paramPString2, paramPInt);
                    break;
                    localObject2 = localObject1;
                  }
                }
              }
              str57 = paramString2;
              break label2428;
            }
          }
          label5848: k = j;
          localObject1 = paramString3;
        }
        str1 = paramString3;
        str2 = "";
      }
    }
  }

  private static void a(int paramInt, PString paramPString1, PString paramPString2, PInt paramPInt)
  {
    int i = 150;
    if ((paramPString1.value.length() == 32) && ((paramInt == 47) || (paramInt == 1048625)))
      return;
    paramPString1.value = com.tencent.mm.ar.a.Bb(paramPString1.value);
    String str4;
    if (paramPString1.value.length() >= i)
    {
      String str3 = paramPString1.value;
      str4 = paramPString1.value;
      if (i >= str4.length())
        break label147;
      if (str4.charAt(i) != '%')
        label88: paramPString1.value = str3.substring(0, i);
    }
    else
    {
      if (dwc != null)
        break label157;
    }
    label147: label157: for (TextPaint localTextPaint = null; ; localTextPaint = (TextPaint)dwc.get())
    {
      if ((!paramPString1.value.replace("%%", "").contains("%s")) && (localTextPaint != null))
        break label171;
      paramPInt.value = 0;
      return;
      i++;
      break;
      i = str4.length();
      break label88;
    }
    label171: String str1 = paramPString1.value;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramPString2.value;
    String str2 = String.format(str1, arrayOfObject);
    Context localContext = ak.getContext();
    int j;
    CharSequence localCharSequence;
    if (dwe > 0)
    {
      j = dwe;
      localCharSequence = com.tencent.mm.ar.b.d(localContext, str2, j);
      if (dwd <= 0)
        break label280;
    }
    label280: for (int k = dwd; ; k = com.tencent.mm.sdk.platformtools.e.a(ak.getContext(), 200.0F))
    {
      paramPString1.value = TextUtils.ellipsize(localCharSequence, localTextPaint, k, TextUtils.TruncateAt.END).toString();
      paramPInt.value = 1;
      return;
      j = com.tencent.mm.sdk.platformtools.e.a(ak.getContext(), 14.0F);
      break;
    }
  }

  public static void a(TextPaint paramTextPaint)
  {
    if ((dwc == null) || (dwc.get() == null))
      dwc = new WeakReference(paramTextPaint);
  }

  private static String b(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    return com.tencent.mm.ar.a.Bj(com.tencent.mm.ar.a.ar(paramContext, a(0, paramString2, paramString1, paramInt, paramContext)));
  }

  public static String b(ar paramar, PString paramPString1, PString paramPString2, PInt paramPInt, boolean paramBoolean)
  {
    return a(paramar.kp(), paramar.jK(), paramar.kt(), paramar.getContent(), paramar.getType(), ak.getContext(), paramPString1, paramPString2, paramPInt, true, paramBoolean);
  }

  public static void bV(int paramInt)
  {
    dwd = paramInt;
  }

  public static void bW(int paramInt)
  {
    dwe = paramInt;
  }

  private static String cq(String paramString)
  {
    if (paramString != null)
      paramString = paramString.replaceAll("%", "%%");
    return paramString;
  }

  private static String cr(String paramString)
  {
    if (paramString != null)
      paramString = paramString.replaceAll("%%", "%");
    return paramString;
  }

  private static String cs(String paramString)
  {
    if (paramString == null)
      paramString = "";
    while (paramString.length() < 150)
      return paramString;
    return paramString.substring(0, 150) + "...";
  }

  private static String g(String paramString1, String paramString2, String paramString3)
  {
    if ((ch.jb(paramString1)) || (ch.jb(paramString2)) || (ch.jb(paramString3)));
    int i;
    do
    {
      return paramString1;
      i = paramString1.indexOf(paramString2);
    }
    while (i < 0);
    return paramString1.substring(0, i) + paramString3 + paramString1.substring(i + paramString2.length());
  }

  public final void a(Context paramContext, String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    b(paramContext, paramString1, paramString2, paramInt1);
    label19: label24: String str1;
    label74: String str3;
    if (paramInt2 >= 0)
    {
      if (paramInt3 < 0)
        break label195;
      if (paramInt4 < 0)
        break label207;
      if ((paramInt2 != 1) || (paramInt4 <= 0))
        break label215;
      Resources localResources2 = paramContext.getResources();
      int k = com.tencent.mm.l.bqR;
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt4);
      str1 = localResources2.getQuantityString(k, paramInt4, arrayOfObject2);
      int j = l.cm(null);
      boolean bool = l.cl(paramString2);
      if (j > 0)
      {
        StringBuilder localStringBuilder = new StringBuilder().append(paramContext.getString(n.bQJ));
        if ((paramInt3 <= 1) && (bool))
          break label266;
        str3 = " " + paramString1;
        label140: str1 = str3;
      }
      this.ijh = str1;
      this.mTitle = paramContext.getString(n.bOX);
      if (!paramBoolean)
        break label273;
    }
    label266: label273: for (String str2 = null; ; str2 = paramContext.getString(n.cDL))
    {
      this.dwb = str2;
      return;
      paramInt2 = com.tencent.mm.model.z.dZ(y.dkj);
      break;
      label195: paramInt3 = com.tencent.mm.model.z.a(y.dkj, null);
      break label19;
      label207: paramInt4 = com.tencent.mm.model.z.qs();
      break label24;
      label215: Resources localResources1 = paramContext.getResources();
      int i = com.tencent.mm.l.bqT;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(paramInt2);
      arrayOfObject1[1] = Integer.valueOf(paramInt3);
      str1 = localResources1.getQuantityString(i, paramInt2, arrayOfObject1);
      break label74;
      str3 = "";
      break label140;
    }
  }

  public final void a(Context paramContext, String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, boolean paramBoolean)
  {
    int i;
    boolean bool1;
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpJN/RyYD3u7HBEKGpQXNnnJUPdv5kg2FEI=", "get total unread, but has not set uin");
      i = 0;
      bool1 = i.yc(paramString2);
      if (paramInt2 < 0)
        break label352;
    }
    Object localObject3;
    Object localObject2;
    Object localObject1;
    boolean bool2;
    label160: String str3;
    label180: String str4;
    label194: Object localObject4;
    while (true)
    {
      if (!bool1)
        break label360;
      int n = Math.max(1, paramInt2);
      String str9 = paramContext.getString(n.bOX);
      Resources localResources3 = paramContext.getResources();
      int i1 = com.tencent.mm.l.bqR;
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(n);
      localObject3 = localResources3.getQuantityString(i1, n, arrayOfObject3);
      localObject2 = str9;
      localObject1 = localObject3;
      bool2 = a.dc(paramString2);
      if (bool2)
      {
        int m = l.cm(paramString2);
        boolean bool3 = l.cl(paramString2);
        if (m > 0)
        {
          StringBuilder localStringBuilder3 = new StringBuilder().append(paramContext.getString(n.bQJ));
          if (bool3)
            break label557;
          if (i <= 1)
            break label536;
          localObject1 = (String)localObject1;
        }
      }
      if (!paramBoolean)
        break label564;
      str3 = null;
      if (!paramBoolean)
        break label851;
      str4 = paramContext.getString(n.cDK);
      if (i <= 1)
        break label858;
      StringBuilder localStringBuilder1 = new StringBuilder();
      Resources localResources1 = paramContext.getResources();
      int j = com.tencent.mm.l.cBH;
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = Integer.valueOf(i);
      localObject4 = localResources1.getQuantityString(j, i, arrayOfObject1) + str4;
      label261: this.mTitle = ((String)localObject2);
      this.ijh = ((String)localObject4);
      this.dwb = str3;
      return;
      Cursor localCursor = bg.qW().oW().bD(paramString2, null);
      i = 0;
      if (localCursor != null)
      {
        int i2 = localCursor.getCount();
        i = 0;
        if (i2 > 0)
        {
          localCursor.moveToFirst();
          i = localCursor.getInt(0);
        }
      }
      if (localCursor == null)
        break;
      localCursor.close();
      break;
      label352: paramInt2 = com.tencent.mm.model.z.qs();
    }
    label360: String str1;
    if (TextUtils.isEmpty(paramString2))
      str1 = null;
    while (true)
    {
      label371: if (ch.jb(str1))
      {
        if (!a.dc(paramString2))
          break label524;
        str1 = paramContext.getString(n.bAg);
      }
      label524: for (String str2 = com.tencent.mm.ar.a.ar(paramContext, str1); ; str2 = paramContext.getString(n.bOX))
      {
        localObject1 = b(paramContext, paramString1, paramString2, paramInt1);
        localObject2 = str2;
        localObject3 = localObject1;
        break;
        i locali = bg.qW().oT().ys(paramString2);
        if (locali == null)
        {
          str1 = null;
          break label371;
        }
        if ((a.dc(paramString2)) && (ch.jb(locali.iV())))
        {
          str1 = bg.qW().oZ().dh(paramString2);
          if (!ch.jb(str1))
            break label371;
          str1 = null;
          break label371;
        }
        if ((locali.od() == null) || (locali.od().length() <= 0))
          break label877;
        str1 = locali.od();
        break label371;
      }
      label536: localObject1 = " " + paramString1;
      break label160;
      label557: localObject1 = "";
      break label160;
      label564: if (!ch.jb(paramString3))
      {
        str3 = paramString3;
        break label180;
      }
      if (!bool2)
      {
        str3 = (String)localObject2 + ": " + cs((String)localObject3);
        break label180;
      }
      if (((String)localObject3).contains(":\n"))
      {
        String str5 = bw.en((String)localObject3);
        StringBuilder localStringBuilder2 = new StringBuilder();
        String str7;
        if (((String)localObject3).contains(":\n"))
          str7 = y.u(((String)localObject3).substring(0, ((String)localObject3).indexOf(":\n")), paramString2);
        while (true)
        {
          str3 = str7 + ": " + cs(str5);
          break;
          String str6;
          if (y.dc(paramString2))
          {
            String str8 = bw.em((String)localObject3);
            if (str8 != null)
              str6 = y.dh(str8.trim());
          }
          while (true)
          {
            if (!paramString2.contains("@bottle"))
              break label805;
            Resources localResources2 = paramContext.getResources();
            int k = com.tencent.mm.l.bqR;
            Object[] arrayOfObject2 = new Object[1];
            arrayOfObject2[0] = Integer.valueOf(1);
            str7 = localResources2.getQuantityString(k, 1, arrayOfObject2);
            break;
            str6 = y.dh(paramString2);
            continue;
            str6 = y.dh(paramString2);
          }
          label805: if ((ch.jb(str6)) && (y.dc(paramString2)))
            str6 = paramContext.getString(n.bAg);
          str7 = com.tencent.mm.ar.a.ar(paramContext, str6);
        }
      }
      str3 = cs((String)localObject3);
      break label180;
      label851: str4 = str3;
      break label194;
      label858: if (bool2)
      {
        localObject4 = str4;
        break label261;
      }
      localObject4 = localObject1;
      break label261;
      label877: str1 = null;
    }
  }

  public final String getDesc()
  {
    return this.ijh;
  }

  public final String getTitle()
  {
    return this.mTitle;
  }

  public final String me()
  {
    return this.dwb;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.m
 * JD-Core Version:    0.6.2
 */