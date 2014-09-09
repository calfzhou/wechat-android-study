package com.tencent.mm.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Looper;
import com.tencent.mm.compatible.c.v;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.protocal.a.te;
import com.tencent.mm.protocal.a.tm;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;
import com.tencent.mm.protocal.ax;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.co;
import com.tencent.mm.storage.r;
import com.tencent.mm.storage.s;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class b
  implements com.tencent.mm.o.e
{
  private static HashMap cZG;
  private boolean dRZ = false;
  private com.tencent.mm.storage.e djC;
  private com.tencent.mm.storage.o djD;
  private co djE;
  private com.tencent.mm.storage.aw djF;
  private s djG;
  private bb djH;
  private com.tencent.mm.storage.cl djI;
  private com.tencent.mm.storage.c djJ;
  private com.tencent.mm.storage.cm djK;
  private com.tencent.mm.storage.ao djL;
  private ec djM;
  private com.tencent.mm.model.a.b djN;
  private com.tencent.mm.model.a.c djO;
  private com.tencent.mm.as.h djP = null;
  private com.tencent.mm.as.h djQ = null;
  private com.tencent.mm.as.f djR = null;
  private ConcurrentHashMap djS = new ConcurrentHashMap();
  private String djT = "";
  private String djU;
  private String djV;
  private final p djW;
  private long djX = 0L;
  private int djY = 0;
  private int djZ;
  private List dka = new LinkedList();
  private int uin = 0;

  static
  {
    HashMap localHashMap = new HashMap();
    cZG = localHashMap;
    localHashMap.put(Integer.valueOf("CONFIG_TABLE".hashCode()), new l());
    cZG.put(Integer.valueOf("CONTACT_TABLE".hashCode()), new m());
    cZG.put(Integer.valueOf("CHATROOM_MEMBERS_TABLE".hashCode()), new n());
    cZG.put(Integer.valueOf("CONVERSATION_TABLE".hashCode()), new o());
    cZG.put(Integer.valueOf("MESSAGE_TABLE".hashCode()), new d());
    cZG.put(Integer.valueOf("ROLEINFO_TABLE".hashCode()), new e());
    cZG.put(Integer.valueOf("STRANGER_TABLE".hashCode()), new f());
    cZG.put(Integer.valueOf("FILEDOWNLOAD_TABLE".hashCode()), new g());
  }

  public b(String paramString, p paramp)
  {
    this.djT = paramString;
    this.djW = paramp;
  }

  private void a(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, String paramString5, int paramInt2, String paramString6, String paramString7, int paramInt3, int paramInt4, String paramString8, String paramString9, int paramInt5, String paramString10, String paramString11, String paramString12, String paramString13, int paramInt6)
  {
    if (this.uin == 0)
      Assert.assertTrue("AccountStorage.updateProfile uin == 0", false);
    StringBuilder localStringBuilder1;
    String str1;
    String str2;
    if (this.djC != null)
    {
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Boolean.valueOf(bg.oE());
      arrayOfObject1[1] = x.pG();
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "updateProfile last_avatar_path hasUin:%b user:%s", arrayOfObject1);
      bf.dkH.y("last_avatar_path", com.tencent.mm.n.c.eL(x.pG()));
      bf.dkH.y("login_weixin_username", paramString1);
      bf.dkH.a(paramString5, paramInt1, paramString4);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "updateProfile user:%s", new Object[] { paramString1 });
      this.djC.set(2, paramString1);
      this.djC.set(42, paramString2);
      this.djC.set(9, Integer.valueOf(paramInt1));
      com.tencent.mm.n.c.c(paramInt1, 3);
      this.djC.set(4, paramString3);
      this.djC.set(5, paramString4);
      this.djC.set(6, paramString5);
      this.djC.set(7, Integer.valueOf(paramInt2));
      this.djC.set(21, paramString6);
      this.djC.set(22, paramString7);
      this.djC.set(17, Integer.valueOf(paramInt3));
      this.djC.set(25, Integer.valueOf(paramInt4));
      this.djC.set(1, paramString8);
      this.djC.set(29, paramString9);
      this.djC.set(34, Integer.valueOf(paramInt5));
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.toHexString(paramInt5);
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "pluginFlag %s", arrayOfObject2);
      this.djC.set(256, Boolean.valueOf(false));
      this.djC.set(-1535680990, paramString10);
      this.djC.set(46, paramString11);
      this.djC.set(72, paramString12);
      if ((paramString13 != null) && (paramString13.length() > 0))
      {
        this.djC.set(47, paramString13);
        bg.qP().set(18, paramString13);
      }
      this.djC.set(64, Integer.valueOf(paramInt6));
      bg.qW().oQ().Ai();
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "update user profile:");
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--username = " + paramString1);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--nickname = " + paramString3);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--alias = " + paramString2);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--qquin    = " + new com.tencent.mm.a.k(paramInt1));
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--email    = " + paramString4);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--mobile   = " + paramString5);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--fsUrl   = " + paramString9);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--status   = " + com.tencent.mm.protocal.j.nt(paramInt2));
      localStringBuilder1 = new StringBuilder("|--pushmail = ");
      str1 = "code=" + Integer.toHexString(paramInt3);
      switch (paramInt3)
      {
      default:
        str2 = str1 + ", unknown";
      case 1:
      case 2:
      case 0:
      }
    }
    while (true)
    {
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", str2);
      StringBuilder localStringBuilder2 = new StringBuilder("|--sendcard = ");
      String str3 = "code=" + Integer.toHexString(paramInt4);
      if ((paramInt4 & 0x1) != 0)
        str3 = str3 + ", weibo";
      if ((paramInt4 & 0x2) != 0)
        str3 = str3 + ", signature";
      if ((paramInt4 & 0x4) != 0)
        str3 = str3 + ", qzone";
      if ((paramInt4 & 0x8) != 0)
        str3 = str3 + ", friend";
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", str3);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--qqmail = " + paramString10);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--a2 = " + paramString11);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "`--ksid = " + paramString13);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "|--safedevice = " + paramInt6);
      return;
      str2 = str1 + ", open";
      continue;
      str2 = str1 + ", close";
      continue;
      str2 = str1 + ", no-such-function";
    }
  }

  private void bQ(String paramString)
  {
    if (this.djQ != null)
      this.djQ.oG();
    if (this.djP != null)
      this.djP.bQ(paramString);
    if (this.djR != null)
    {
      this.djR.oG();
      this.djR = null;
    }
  }

  public static void ci(int paramInt)
  {
    bg.qF().cW(paramInt);
    if ((paramInt & 0x10) != 0)
    {
      bw.a("medianote", null);
      bg.qW().oW().yC("medianote");
    }
  }

  private boolean oH()
  {
    int i = ch.a((Integer)this.djC.get(14));
    int j = com.tencent.mm.protocal.a.hrn;
    z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, sVer = " + i + ", cVer = " + j);
    am localam = bg.qH();
    if (localam == null)
    {
      z.e("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, dataTransferFactory is null");
      return false;
    }
    List localList = localam.il();
    if ((com.tencent.mm.platformtools.ao.dVQ > 0) && (com.tencent.mm.platformtools.ao.dVR > 0))
      z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, force data transfer");
    long l;
    boolean bool;
    do
    {
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer dataTransferList size = " + localList.size());
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, threadId = " + Thread.currentThread().getId() + ", name = " + Thread.currentThread().getName());
      l = this.djP.dc(Thread.currentThread().getId());
      Iterator localIterator2 = localList.iterator();
      while (localIterator2.hasNext())
        ((al)localIterator2.next()).cH(i);
      if (i == j)
      {
        z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, no need to transfer, sVer = " + i + ", cVer = " + j);
        return false;
      }
      Iterator localIterator1 = localList.iterator();
      bool = false;
      do
      {
        if (!localIterator1.hasNext())
          break;
        bool = ((al)localIterator1.next()).cG(i);
      }
      while (!bool);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "tryDataTransfer, needTransfer = " + bool);
    }
    while (bool);
    return false;
    int k;
    int m;
    if (com.tencent.mm.platformtools.ao.dVQ != 0)
    {
      k = com.tencent.mm.platformtools.ao.dVR;
      m = 0;
    }
    while (true)
    {
      if ((k != 0) && (m < com.tencent.mm.platformtools.ao.dVQ));
      try
      {
        Thread.sleep(com.tencent.mm.platformtools.ao.dVR);
        label365: m++;
        continue;
        if (l > 0L)
          this.djP.dd(l);
        return true;
      }
      catch (InterruptedException localInterruptedException)
      {
        break label365;
      }
    }
  }

  final boolean CD()
  {
    return this.dRZ;
  }

  public final void N(Object paramObject)
  {
    if (this.djC != null)
      this.djC.set(76, paramObject);
  }

  public final void a(bc parambc)
  {
    if (this.dka == null)
    {
      this.dka = new LinkedList();
      return;
    }
    this.dka.add(parambc);
  }

  public final void a(ax paramax, String paramString1, int paramInt, String paramString2, String paramString3)
  {
    a(paramax.hNP.gnq, paramString1, paramInt, paramString2, paramax.hNP.iom, paramString3, paramax.hNP.dZy, paramax.hNP.iou, paramax.hNP.iov, paramax.hNP.hRF, paramax.hNP.inN, paramax.hNP.iot, paramax.hNP.inP, 0, paramax.hNP.ieG, null, null, null, -1);
  }

  public final void a(com.tencent.mm.protocal.l paraml)
  {
    vt localvt1 = paraml.hNr.hVf;
    vt localvt2 = paraml.hNr.ifj;
    vt localvt3 = paraml.hNr.imM;
    vt localvt4 = paraml.hNr.imN;
    vt localvt5 = paraml.hNr.inI;
    vt localvt6 = paraml.hNr.inJ;
    ws localws = paraml.hNr.hRD;
    byte[] arrayOfByte1 = new byte[0];
    byte[] arrayOfByte2 = new byte[0];
    byte[] arrayOfByte3;
    int i;
    label148: int j;
    label165: String str1;
    label192: String str2;
    int k;
    String str3;
    label218: String str4;
    label227: String str5;
    label236: int m;
    String str6;
    if ((paraml.hNr.iod != null) && (paraml.hNr.iod.aLK() > 0))
    {
      arrayOfByte2 = bg.qO().D(new com.tencent.mm.a.k(paraml.hNr.imL).longValue());
      arrayOfByte3 = arrayOfByte1;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = paraml.hNr.ieG;
      if (arrayOfByte3 != null)
        break label371;
      i = -1;
      arrayOfObject[1] = Integer.valueOf(i);
      if (arrayOfByte2 != null)
        break label379;
      j = -1;
      arrayOfObject[2] = Integer.valueOf(j);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "dkwt authkey:%s  a2key:%d  newa2key:%d", arrayOfObject);
      if (localvt1 != null)
        break label387;
      str1 = "";
      str2 = paraml.hNr.dti;
      k = paraml.hNr.imL;
      if (localvt2 != null)
        break label396;
      str3 = "";
      if (localvt3 != null)
        break label405;
      str4 = "";
      if (localvt4 != null)
        break label415;
      str5 = "";
      m = paraml.hNr.dZy;
      if (localvt5 != null)
        break label425;
      str6 = "";
      label254: if (localvt6 != null)
        break label435;
    }
    label387: label396: label405: label415: label425: label435: for (String str7 = ""; ; str7 = localvt6.getString())
    {
      a(str1, str2, k, str3, str4, str5, m, str6, str7, paraml.hNr.hRF, paraml.hNr.inN, paraml.hNr.hQu.aFt(), paraml.hNr.inP, paraml.hNr.imO, paraml.hNr.ieG, ch.cH(arrayOfByte3), ch.cH(arrayOfByte2), ch.cH(ai.a(localws)), paraml.hNr.hRo);
      return;
      arrayOfByte3 = ai.a(paraml.hNr.hRJ);
      break;
      label371: i = arrayOfByte3.length;
      break label148;
      label379: j = arrayOfByte2.length;
      break label165;
      str1 = localvt1.getString();
      break label192;
      str3 = localvt2.getString();
      break label218;
      str4 = localvt3.getString();
      break label227;
      str5 = localvt4.getString();
      break label236;
      str6 = localvt5.getString();
      break label254;
    }
  }

  public final void b(bc parambc)
  {
    if (this.dka == null)
    {
      z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "userStatusChangeListeners == null");
      return;
    }
    this.dka.remove(parambc);
  }

  public final Object cE(int paramInt)
  {
    if (this.djC == null)
      return null;
    return this.djC.get(paramInt);
  }

  public final void cN(String paramString)
  {
    bQ(paramString);
  }

  public final SharedPreferences cO(String paramString)
  {
    int i;
    if (this.uin != 0)
    {
      if (this.djS.containsKey(paramString))
        return (SharedPreferences)this.djS.get(paramString);
      i = this.uin;
    }
    try
    {
      String str3 = ak.getContext().getFilesDir().getParent() + "/shared_prefs/";
      String str4 = ak.aHi() + paramString + i + ".xml";
      String str5 = ak.aHi() + paramString + i + ".xml.bak";
      File localFile1 = new File(str3 + str4);
      if (localFile1.exists())
        localFile1.delete();
      File localFile2 = new File(str3 + str5);
      if (localFile2.exists())
        localFile2.delete();
      label215: String str1 = aj.AN(String.valueOf(this.uin / 2));
      String str2 = ak.aHi() + paramString + aj.AN(new StringBuilder().append(this.uin).append(str1).toString());
      SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences(str2, 0);
      this.djS.put(paramString, localSharedPreferences);
      return localSharedPreferences;
      return null;
    }
    catch (Exception localException)
    {
      break label215;
    }
  }

  final void g(String paramString, int paramInt)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = com.tencent.mm.a.k.getString(paramInt);
    arrayOfObject1[1] = paramString;
    arrayOfObject1[2] = com.tencent.mm.a.k.getString(this.uin);
    arrayOfObject1[3] = this.djT;
    z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "new[%s,%s] old[%s,%s]", arrayOfObject1);
    if (this.dka != null)
      this.dka.clear();
    SharedPreferences localSharedPreferences = ak.getContext().getSharedPreferences(ak.aHi(), 0);
    if (paramInt == 0)
    {
      if (this.uin != 0)
        release();
      paramInt = this.uin;
      this.uin = 0;
      localSharedPreferences.edit().putBoolean("isLogin", false).commit();
    }
    int i;
    long l1;
    if ((bg.qQ().aHs()) && (!bg.qQ().aHp()))
    {
      i = 1;
      if (i != 0)
        bg.qQ().aHo();
      this.dRZ = true;
      l1 = System.currentTimeMillis();
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Boolean.valueOf(this.dRZ);
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "start time check setUinWapper begin mAccountInitializing %b", arrayOfObject2);
      Object[] arrayOfObject3 = new Object[6];
      arrayOfObject3[0] = com.tencent.mm.a.k.getString(paramInt);
      arrayOfObject3[1] = paramString;
      arrayOfObject3[2] = com.tencent.mm.a.k.getString(this.uin);
      arrayOfObject3[3] = this.djT;
      arrayOfObject3[4] = Thread.currentThread().getName();
      arrayOfObject3[5] = ch.aHN();
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "dkacc setAccuin uin:%s[%s] this(old):%s[%s] thread:%s stack:%s", arrayOfObject3);
      if ((this.uin != 0) || (paramInt != this.uin) || (!ch.jb(paramString)))
        break label345;
      z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "setAccUin, Reset by MMCore.resetAccUin");
    }
    while (true)
    {
      this.dRZ = false;
      Object[] arrayOfObject6 = new Object[2];
      arrayOfObject6[0] = Boolean.valueOf(this.dRZ);
      arrayOfObject6[1] = Long.valueOf(System.currentTimeMillis() - l1);
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "start time check setUinWapper end mAccountInitializing %b, total time %d", arrayOfObject6);
      if (i != 0)
        bg.qQ().aHq();
      return;
      i = 0;
      break;
      label345: if ((this.uin == paramInt) && (this.djT.equals(paramString)))
      {
        Object[] arrayOfObject8 = new Object[1];
        arrayOfObject8[0] = Integer.valueOf(paramInt);
        z.v("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "setAccUin, uin not changed, return :%d", arrayOfObject8);
        continue;
      }
      if (!ch.jb(paramString))
        this.djT = paramString;
      if (this.uin != 0)
        release();
      if (this.djW != null)
        this.djW.pC();
      this.uin = paramInt;
      com.tencent.mm.a.k.getString(paramInt);
      com.tencent.mm.sdk.b.b.aMY();
      ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putBoolean("isLogin", true).commit();
      String str1 = com.tencent.mm.a.f.d(("mm" + paramInt).getBytes());
      this.djU = (this.djT + str1 + "/");
      this.djV = (com.tencent.mm.storage.h.dgF + str1 + "/");
      File localFile1 = new File(this.djV);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "dkacc cachePath:" + this.djV + " accPath:" + this.djU);
      boolean bool1 = localFile1.exists();
      boolean bool2 = false;
      if (!bool1)
      {
        Object[] arrayOfObject7 = new Object[3];
        arrayOfObject7[0] = com.tencent.mm.a.k.getString(paramInt);
        arrayOfObject7[1] = this.djV;
        arrayOfObject7[2] = this.djU;
        z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "setUin REBUILD data now ! DO NOT FUCKING TELL ME DB BROKEN !!! uin:%s data:%s sd:%s", arrayOfObject7);
        localFile1.mkdirs();
        if (!this.djV.equalsIgnoreCase(this.djU))
        {
          long l3 = System.currentTimeMillis();
          File localFile30 = new File(this.djU);
          String str7 = str1 + "temp" + System.currentTimeMillis();
          String str8 = com.tencent.mm.compatible.g.h.dOI + str7;
          localFile30.renameTo(new File(str8));
          z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "find the old files and rename then %s" + (System.currentTimeMillis() - l3), new Object[] { str8 });
        }
        bool2 = true;
      }
      this.djM = new ec(this.djV, bool2);
      File localFile2 = new File(this.djU);
      if (!localFile2.exists())
        localFile2.mkdir();
      File localFile3 = new File(pa());
      if (!localFile3.exists())
        localFile3.mkdir();
      File localFile4 = new File(pl());
      if (!localFile4.exists())
        localFile4.mkdir();
      File localFile5 = new File(pb());
      if (!localFile5.exists())
        localFile5.mkdir();
      File localFile6 = new File(pc());
      if (!localFile6.exists())
        localFile6.mkdir();
      File localFile7 = new File(pi());
      if (!localFile7.exists())
        localFile7.mkdir();
      if (this.uin == 0)
        throw new a();
      File localFile8 = new File(this.djT + "locallog");
      if (!localFile8.exists())
        localFile8.mkdir();
      File localFile9 = new File(pj());
      if (!localFile9.exists())
        localFile9.mkdir();
      File localFile10 = new File(pe());
      if (!localFile10.exists())
        localFile10.mkdir();
      File localFile11 = new File(pf());
      if (!localFile11.exists())
        localFile11.mkdir();
      File localFile12 = new File(pk());
      if (!localFile12.exists())
        localFile12.mkdir();
      File localFile13 = new File(pm());
      if (!localFile13.exists())
        localFile13.mkdir();
      File localFile14 = new File(pn());
      if (!localFile14.exists())
        localFile14.mkdir();
      File localFile15 = new File(po());
      if (!localFile15.exists())
        localFile15.mkdir();
      File localFile16 = new File(pp());
      if (!localFile16.exists())
        localFile16.mkdir();
      File localFile17 = new File(pq());
      if (!localFile17.exists())
        localFile17.mkdir();
      File localFile18 = new File(pd());
      if (!localFile18.exists())
        localFile18.mkdir();
      if ((com.tencent.mm.compatible.g.j.nI()) && (this.djT.equals(com.tencent.mm.compatible.g.h.dOI)))
        new q(this.djV, this.djU).start();
      File localFile19 = new File(pa() + ".nomedia");
      if (!localFile19.exists());
      try
      {
        localFile19.createNewFile();
        localFile20 = new File(pb() + ".nomedia");
        if (localFile20.exists());
      }
      catch (IOException localIOException2)
      {
        try
        {
          File localFile20;
          localFile20.createNewFile();
          localFile21 = new File(pc() + ".nomedia");
          if (localFile21.exists());
        }
        catch (IOException localIOException2)
        {
          try
          {
            File localFile21;
            localFile21.createNewFile();
            localFile22 = new File(pe() + ".nomedia");
            if (localFile22.exists());
          }
          catch (IOException localIOException2)
          {
            try
            {
              File localFile22;
              localFile22.createNewFile();
              localFile23 = new File(pf() + ".nomedia");
              if (localFile23.exists());
            }
            catch (IOException localIOException2)
            {
              try
              {
                File localFile23;
                localFile23.createNewFile();
                localFile24 = new File(pk() + ".nomedia");
                if (localFile24.exists());
              }
              catch (IOException localIOException2)
              {
                try
                {
                  File localFile24;
                  localFile24.createNewFile();
                  localFile25 = new File(pm() + ".nomedia");
                  if (localFile25.exists());
                }
                catch (IOException localIOException2)
                {
                  try
                  {
                    File localFile25;
                    localFile25.createNewFile();
                    localFile26 = new File(pn() + ".nomedia");
                    if (localFile26.exists());
                  }
                  catch (IOException localIOException2)
                  {
                    try
                    {
                      File localFile26;
                      localFile26.createNewFile();
                      localFile27 = new File(pp() + ".nomedia");
                      if (localFile27.exists());
                    }
                    catch (IOException localIOException2)
                    {
                      try
                      {
                        File localFile27;
                        localFile27.createNewFile();
                        StringBuilder localStringBuilder = new StringBuilder();
                        if (this.uin == 0)
                          throw new a();
                        localFile28 = new File(new StringBuilder().append(this.djU).append("favorite/").toString() + ".nomedia");
                        if (localFile28.exists());
                      }
                      catch (IOException localIOException2)
                      {
                        try
                        {
                          File localFile28;
                          localFile28.createNewFile();
                          localFile29 = new File(pd() + ".nomedia");
                          if (localFile29.exists());
                        }
                        catch (IOException localIOException2)
                        {
                          try
                          {
                            while (true)
                            {
                              File localFile29;
                              localFile29.createNewFile();
                              String str2 = this.djV + "MicroMsg.db";
                              String str3 = this.djV + "EnMicroMsg.db";
                              bQ(null);
                              this.djP = new com.tencent.mm.as.h(new c(this));
                              com.tencent.mm.as.h localh = this.djP;
                              long l2 = paramInt;
                              String str4 = v.ng();
                              HashMap localHashMap = new HashMap();
                              localHashMap.putAll(cZG);
                              localHashMap.putAll(bg.qF().sa());
                              if (!localh.a(str2, str3, l2, str4, localHashMap, true))
                                throw new a((byte)0);
                              String str5 = this.djP.aKT();
                              if (!ch.jb(str5))
                              {
                                z.e("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "dbinit failed :" + str5);
                                com.tencent.mm.sdk.b.b.m("init db Failed: [ " + str5 + "]", "DBinit");
                              }
                              this.djC = new com.tencent.mm.storage.e(this.djP);
                              if (ec.a(this.djM) >= 620953625);
                              for (String str6 = this.djV; ; str6 = this.djU)
                              {
                                this.djH = new bb(str6);
                                this.djD = new com.tencent.mm.storage.o(this.djP, this.djR);
                                this.djE = new co(this.djP);
                                this.djL = new com.tencent.mm.storage.ao(this.djP);
                                this.djF = new com.tencent.mm.storage.aw(this.djP);
                                this.djG = new s(this.djP);
                                this.djF.a(this.djG, null);
                                this.djI = new com.tencent.mm.storage.cl(this.djP);
                                this.djJ = new com.tencent.mm.storage.c(this.djP);
                                this.djQ = new com.tencent.mm.as.h(new h(this));
                                if (this.djQ.a(str2, str3, paramInt, v.ng(), new HashMap(), true))
                                  break;
                                throw new a((byte)0);
                              }
                              this.djK = new com.tencent.mm.storage.cm(this.djC);
                              this.djK.g(new i(this));
                              this.djK.aKI();
                              if (this.djR == null)
                              {
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "memoryInit ");
                                this.djR = new com.tencent.mm.as.f(this.djP);
                              }
                              this.djN = new com.tencent.mm.model.a.b();
                              this.djO = new com.tencent.mm.model.a.c();
                              ak.getContext().getSharedPreferences(ak.aHi() + paramInt, 0);
                              boolean bool3 = oH();
                              z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "edw setAccUin, needTransfer = " + bool3);
                              z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "edw postDataTransfer begin");
                              if (this.djW != null)
                                this.djW.d(this);
                              int j = ch.a((Integer)this.djC.get(14));
                              int k = com.tencent.mm.protocal.a.hrn;
                              if (j == 0)
                                bg.R(true);
                              label2561: boolean bool5;
                              if (k == j)
                              {
                                bool4 = false;
                                if (bool4)
                                {
                                  this.djC.set(8197, "");
                                  this.djC.set(15, Integer.valueOf(0));
                                }
                                if (j == k)
                                  break label3087;
                                bool5 = true;
                                label2601: if ((j > 620822536) || (j == k))
                                  break label3093;
                                this.djC.set(274480, Boolean.valueOf(true));
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "[initialize] need init emoji");
                                label2638: if (j == k)
                                  break label3118;
                                z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "account storage version changed from " + Integer.toHexString(j) + " to " + Integer.toHexString(k) + ", init=" + bool4);
                                if (((Integer)bg.qP().get(37, Integer.valueOf(0))).intValue() == 0)
                                  bg.qP().set(37, Integer.valueOf(j));
                                this.djC.set(14, Integer.valueOf(k));
                                bg.qW().oQ().set(30, Boolean.valueOf(false));
                                this.djC.set(-2046825377, Boolean.valueOf(false));
                                this.djC.set(-2046825369, Boolean.valueOf(false));
                                com.tencent.mm.k.i.Ck().d(262145, false);
                                com.tencent.mm.k.i.Ck().d(262146, true);
                                this.djC.set(54, Boolean.valueOf(false));
                                this.djC.set(-2046825368, Boolean.valueOf(false));
                                this.djC.set(-29414083, Integer.valueOf(0));
                                this.djC.set(-2046825366, Boolean.valueOf(true));
                                this.djC.set(62, Boolean.valueOf(true));
                                ak.getContext().getSharedPreferences("update_config_prefs", com.tencent.mm.compatible.g.m.nN()).edit().clear().commit();
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "cpan update qq browser recommend count.");
                              }
                              while (true)
                              {
                                Object[] arrayOfObject4 = new Object[2];
                                arrayOfObject4[0] = Boolean.valueOf(bool5);
                                arrayOfObject4[1] = Integer.valueOf(ec.a(this.djM));
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "check is update :%b , minHistory:%d", arrayOfObject4);
                                if (bool5)
                                {
                                  z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "start time check version upgrade olddb transfer");
                                  cm.a(this.djP);
                                  cn.a(this.djP);
                                  cl.a(this.djP);
                                }
                                if (this.djW != null)
                                  this.djW.a(this, bool5);
                                bf.dkH.y("last_login_uin", com.tencent.mm.a.k.getString(paramInt));
                                Object[] arrayOfObject5 = new Object[1];
                                arrayOfObject5[0] = com.tencent.mm.a.k.getString(paramInt);
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "setAccUin done :%s", arrayOfObject5);
                                break;
                                if ((k > 570425344) && (j <= 570425344))
                                {
                                  bool4 = true;
                                  break label2561;
                                }
                                if ((k <= 570556456) || (j > 570556456))
                                  break label3183;
                                bool4 = true;
                                break label2561;
                                label3087: bool5 = false;
                                break label2601;
                                label3093: this.djC.set(274480, Boolean.valueOf(false));
                                z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "[initialize] need not init emoji");
                                break label2638;
                                label3118: as.AO("show_whatsnew");
                              }
                              localIOException11 = localIOException11;
                              continue;
                              localIOException10 = localIOException10;
                              continue;
                              localIOException9 = localIOException9;
                              continue;
                              localIOException8 = localIOException8;
                              continue;
                              localIOException7 = localIOException7;
                              continue;
                              localIOException6 = localIOException6;
                              continue;
                              localIOException5 = localIOException5;
                              continue;
                              localIOException4 = localIOException4;
                              continue;
                              localIOException3 = localIOException3;
                            }
                            localIOException2 = localIOException2;
                          }
                          catch (IOException localIOException1)
                          {
                            while (true)
                            {
                              continue;
                              label3183: boolean bool4 = false;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final boolean isSDCardAvailable()
  {
    boolean bool1 = this.djT.startsWith(com.tencent.mm.compatible.g.h.dOH);
    long l1 = ch.CM();
    long l2 = l1 - this.djX;
    if ((bool1) && (oE()) && (l2 > 0L) && (l2 < 1000L) && (new File(this.djT).exists()));
    do
    {
      return true;
      this.djX = l1;
      boolean bool2 = com.tencent.mm.compatible.g.j.nI();
      Object[] arrayOfObject = new Object[5];
      arrayOfObject[0] = Boolean.valueOf(bool2);
      arrayOfObject[1] = com.tencent.mm.a.k.getString(this.uin);
      arrayOfObject[2] = Long.valueOf(l2);
      arrayOfObject[3] = this.djT;
      arrayOfObject[4] = com.tencent.mm.compatible.g.h.dOH;
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "isSDCardAvail:%b uin:%s toNow:%d sysPath:[%s] sdRoot:[%s]", arrayOfObject);
      if (!bool2)
        return false;
    }
    while ((bool1) || (!oE()));
    z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "summer isSDCardAvailable accHasReady and remount");
    bg.qV();
    return true;
  }

  public final int oD()
  {
    return this.uin;
  }

  final boolean oE()
  {
    return this.uin != 0;
  }

  public final String oF()
  {
    return this.djT;
  }

  public final void oG()
  {
    bQ(null);
  }

  public final void oI()
  {
    new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper()).post(new j(this));
  }

  public final boolean oJ()
  {
    return (0x1 & this.djY) != 0;
  }

  public final int oK()
  {
    return this.djZ;
  }

  public final com.tencent.mm.as.h oO()
  {
    return this.djP;
  }

  public final com.tencent.mm.as.h oP()
  {
    return this.djQ;
  }

  public final com.tencent.mm.storage.e oQ()
  {
    if (this.uin == 0)
      throw new a();
    return this.djC;
  }

  public final com.tencent.mm.storage.cm oR()
  {
    if (this.uin == 0)
      throw new a();
    return this.djK;
  }

  public final bb oS()
  {
    if (this.uin == 0)
      throw new a();
    return this.djH;
  }

  public final com.tencent.mm.storage.o oT()
  {
    if (this.uin == 0)
      throw new a();
    return this.djD;
  }

  public final co oU()
  {
    if (this.uin == 0)
      throw new a();
    return this.djE;
  }

  public final com.tencent.mm.storage.aw oV()
  {
    if (this.uin == 0)
      throw new a();
    return this.djF;
  }

  public final s oW()
  {
    if (this.uin == 0)
      throw new a();
    return this.djG;
  }

  public final com.tencent.mm.storage.ao oX()
  {
    if (this.uin == 0)
      throw new a();
    return this.djL;
  }

  public final com.tencent.mm.storage.cl oY()
  {
    if (this.uin == 0)
      throw new a();
    return this.djI;
  }

  public final com.tencent.mm.storage.c oZ()
  {
    if (this.uin == 0)
      throw new a();
    return this.djJ;
  }

  public final String pa()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "image/";
  }

  public final String pb()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "image2/";
  }

  public final String pc()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "avatar/";
  }

  public final String pd()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "remark/";
  }

  public final String pe()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "voice/";
  }

  public final String pf()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "voice2/";
  }

  public final String pg()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "recbiz/";
  }

  public final String ph()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "speextemp/";
  }

  public final String pi()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "emoji/";
  }

  public final String pj()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "mailapp/";
  }

  public final String pk()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "video/";
  }

  public final String pl()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "image/shakeTranImg/";
  }

  public final String pm()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "package/";
  }

  public final String pn()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "openapi/";
  }

  public final String po()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "attachment/";
  }

  public final String pp()
  {
    if (this.uin == 0)
      throw new a();
    return this.djU + "brandicon/";
  }

  public final String pq()
  {
    if (this.uin == 0)
      throw new a();
    return this.djV + "logcat/";
  }

  public final String pr()
  {
    return this.djV + "MicroMsg.db";
  }

  public final String ps()
  {
    return this.djV + "EnMicroMsg.db";
  }

  public final String pt()
  {
    return this.djV;
  }

  public final String pu()
  {
    return this.djU;
  }

  public final void pv()
  {
    String str1 = com.tencent.mm.a.f.d(("mm" + this.uin).getBytes());
    this.djV = (com.tencent.mm.storage.h.dgF + str1 + "/");
    String str2 = com.tencent.mm.compatible.g.h.dOI + str1 + "/";
    com.tencent.mm.a.c.deleteFile(str2 + "EnMicroMsg.db.dump");
    com.tencent.mm.a.c.j(this.djV + "EnMicroMsg.db", str2 + "EnMicroMsg.db.dump");
    com.tencent.mm.a.c.deleteFile(str2 + "EnMicroMsg.db.dumptmp");
    com.tencent.mm.a.c.j(this.djV + "MicroMsg.db.tem", str2 + "EnMicroMsg.db.dumptmp");
    com.tencent.mm.a.c.deleteFile(str2 + "IndexMicroMsg.db.dump");
    com.tencent.mm.a.c.j(this.djV + "IndexMicroMsg.db", str2 + "IndexMicroMsg.db.dump");
  }

  public final void pw()
  {
    String str1 = com.tencent.mm.a.f.d(("mm" + this.uin).getBytes());
    this.djV = (com.tencent.mm.storage.h.dgF + str1 + "/");
    String str2 = com.tencent.mm.compatible.g.h.dOI + str1 + "/dump_logcat/";
    com.tencent.mm.a.c.a(new File(str2));
    com.tencent.mm.sdk.platformtools.p.f(this.djV + "logcat/", str2, false);
  }

  public final com.tencent.mm.model.a.b px()
  {
    if (this.uin == 0)
      throw new a();
    return this.djN;
  }

  public final com.tencent.mm.model.a.c py()
  {
    if (this.uin == 0)
      throw new a();
    return this.djO;
  }

  final void release()
  {
    Object[] arrayOfObject1 = new Object[3];
    arrayOfObject1[0] = com.tencent.mm.a.k.getString(this.uin);
    arrayOfObject1[1] = Thread.currentThread().getName();
    arrayOfObject1[2] = ch.aHN();
    z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "account storage release  uin:%s thread:%s stack:%s", arrayOfObject1);
    if (this.uin == 0)
    {
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = ch.aHN().toString();
      arrayOfObject2[1] = bg.qE();
      z.e("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "[arthurdan.AccountNR] Fatal crash error!!! uin is 0 when release(), this callStack is:%s, last reset stack is:%s", arrayOfObject2);
      return;
    }
    bg.qF().rZ();
    if (this.djD != null)
      this.djD.sx();
    if (bg.ii() != null)
    {
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "DownloadPlayer().release");
      bg.ii().release();
      z.i("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "DownloadPlayer().clearCallBack");
      bg.ii().kU();
    }
    bQ(null);
    reset();
    this.djS.clear();
  }

  final void reset()
  {
    this.uin = 0;
    ak.getContext().getSharedPreferences(ak.aHi(), 0).edit().putBoolean("isLogin", false).commit();
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault());
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Integer.valueOf(this.uin);
    arrayOfObject[1] = bg.qE();
    arrayOfObject[2] = localSimpleDateFormat.format(new Date());
    z.w("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "[arthurdan.AccountNR] account storage reset! uin:%d, resetStack is:%s, resetTime:%s", arrayOfObject);
  }

  public final void v(int paramInt1, int paramInt2)
  {
    int i = 1;
    if ((this.djY != paramInt1) || (this.djZ != paramInt2));
    for (int j = i; ; j = 0)
    {
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(paramInt1);
      arrayOfObject[i] = Integer.valueOf(paramInt2);
      arrayOfObject[2] = Integer.valueOf(this.djY);
      z.d("!32@/B4Tb64lLpIaKqQrIg/z8CiDfdaO9WDN", "online status, %d, %d, %d", arrayOfObject);
      if (j != 0)
        break;
      return;
    }
    r localr1;
    if (((0x1 & this.djY) == 0) && ((paramInt1 & 0x1) != 0))
      if (i != 0)
      {
        com.tencent.mm.storage.i locali = bg.qW().oT().ys("filehelper");
        if ((locali == null) || (ch.jb(locali.getUsername())))
          ah.q(locali);
        if (!com.tencent.mm.g.a.cv(locali.getType()))
        {
          locali.oz();
          bg.qW().oT().a(locali.getUsername(), locali);
        }
        localr1 = bg.qW().oW().yE("filehelper");
        if (localr1 != null)
          break label252;
        r localr2 = new r("filehelper");
        localr2.k(ch.CM());
        bg.qW().oW().d(localr2);
      }
    while (true)
    {
      this.djY = paramInt1;
      this.djZ = paramInt2;
      new com.tencent.mm.sdk.platformtools.cm(Looper.getMainLooper()).post(new k(this));
      return;
      i = 0;
      break;
      label252: localr1.k(ch.CM());
      bg.qW().oW().a(localr1, "filehelper");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.b
 * JD-Core Version:    0.6.2
 */