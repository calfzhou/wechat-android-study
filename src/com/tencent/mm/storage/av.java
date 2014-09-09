package com.tencent.mm.storage;

import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class av
{
  private int cCn = 0;
  private int cEg;
  private int cOn;
  private String cOy;
  private String content = "";
  private String dkC = "";
  private String dmj;
  private String dmk;
  private String dml;
  private String duA = "";
  private String duB = "";
  private String duC = "";
  private String duF = "";
  private String hfH;
  private String hlo;
  private long ijA = 0L;
  private String ijD = "";
  private String ijE = "";
  private int ijL = 0;
  private String ijM;
  private String ijN;
  private String ijw = "";
  private int ijx = 0;
  private String ijy = "";
  private String ijz = "";
  private String wP = "";

  public static av zp(String paramString)
  {
    av localav = new av();
    Map localMap = x.bB(paramString, "msg");
    if (localMap != null);
    try
    {
      localav.ijw = ((String)localMap.get(".msg.$fromusername"));
      localav.wP = ((String)localMap.get(".msg.$alias"));
      localav.duA = ((String)localMap.get(".msg.$fromnickname"));
      localav.dkC = ((String)localMap.get(".msg.$fullpy"));
      localav.duB = ((String)localMap.get(".msg.$shortpy"));
      localav.content = ((String)localMap.get(".msg.$content"));
      localav.ijx = Integer.valueOf((String)localMap.get(".msg.$imagestatus")).intValue();
      localav.cCn = Integer.valueOf((String)localMap.get(".msg.$scene")).intValue();
      localav.ijy = ((String)localMap.get(".msg.$mhash"));
      localav.ijz = ((String)localMap.get(".msg.$mfullhash"));
      if ((localMap.get(localMap.get(".msg.$qqnum")) != null) && (((String)localMap.get(localMap.get(".msg.$qqnum"))).length() > 0))
        localav.ijA = Long.valueOf((String)localMap.get(".msg.$qqnum")).longValue();
      localav.duC = ((String)localMap.get(".msg.$qqnickname"));
      localav.duF = ((String)localMap.get(".msg.$qqremark"));
      localav.cOy = ((String)localMap.get(".msg.$sign"));
      if ((localMap.get(".msg.$sex") != null) && (((String)localMap.get(".msg.$sex")).length() > 0))
        localav.cOn = Integer.valueOf((String)localMap.get(".msg.$sex")).intValue();
      localav.dmk = ((String)localMap.get(".msg.$city"));
      localav.dml = ((String)localMap.get(".msg.$province"));
      localav.dmj = ((String)localMap.get(".msg.$country"));
      if (localMap.get(".msg.$snsflag") != null)
      {
        localav.ijL = Integer.valueOf((String)localMap.get(".msg.$snsflag")).intValue();
        localav.ijM = ((String)localMap.get(".msg.$snsbgimgid"));
      }
      localav.hfH = ((String)localMap.get(".msg.$ticket"));
      Object[] arrayOfObject1 = new Object[1];
      arrayOfObject1[0] = localav.hfH;
      z.d("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "dkverify ticket:%s", arrayOfObject1);
      localav.ijD = ch.ja((String)localMap.get(".msg.$bigheadimgurl"));
      localav.ijE = ch.ja((String)localMap.get(".msg.$smallheadimgurl"));
      localav.cEg = Integer.valueOf(ch.Y((String)localMap.get(".msg.$opcode"), "0")).intValue();
      localav.ijN = ch.ja((String)localMap.get(".msg.$encryptusername"));
      localav.hlo = ch.ja((String)localMap.get(".msg.$googlecontact"));
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = localav.ijw;
      arrayOfObject2[1] = localav.ijD;
      arrayOfObject2[2] = localav.ijE;
      z.d("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "dkavatar VerifyContent user:[%s] big:[%s] sm:[%s]", arrayOfObject2);
      return localav;
    }
    catch (Exception localException)
    {
    }
    return localav;
  }

  public final int Ew()
  {
    return this.cCn;
  }

  public final String aJO()
  {
    return this.ijD;
  }

  public final String aJP()
  {
    return this.ijE;
  }

  public final String aJQ()
  {
    return this.ijw;
  }

  public final int aJR()
  {
    return this.ijx;
  }

  public final String aJS()
  {
    return this.ijy;
  }

  public final long aJT()
  {
    return this.ijA;
  }

  public final String aJV()
  {
    return this.ijz;
  }

  public final String aJX()
  {
    return this.hlo;
  }

  public final String aKg()
  {
    return this.hfH;
  }

  public final int aKh()
  {
    return this.ijL;
  }

  public final String aKi()
  {
    return this.ijM;
  }

  public final int aKj()
  {
    return this.cEg;
  }

  public final String aKk()
  {
    return this.ijN;
  }

  public final String getContent()
  {
    return this.content;
  }

  public final String getDisplayName()
  {
    if ((this.duA != null) && (this.duA.length() > 0))
      return this.duA;
    z.f("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "username is nullOrNil");
    return this.ijw;
  }

  public final String iS()
  {
    return this.wP;
  }

  public final String iV()
  {
    return this.duA;
  }

  public final String iW()
  {
    return this.duB;
  }

  public final String iX()
  {
    return this.dkC;
  }

  public final int jj()
  {
    return this.cOn;
  }

  public final String jo()
  {
    return this.cOy;
  }

  public final String jp()
  {
    if (!ch.jb(this.dmj))
    {
      if ((!ch.jb(this.dml)) && (!ch.jb(this.dmk)) && (RegionCodeDecoder.zS(this.dmj)))
        return RegionCodeDecoder.aKA().bv(this.dmj, this.dml);
      return RegionCodeDecoder.aKA().zU(this.dmj);
    }
    return this.dml;
  }

  public final String jq()
  {
    if ((!ch.jb(this.dmj)) && (!ch.jb(this.dml)))
    {
      if (ch.jb(this.dmk))
        return RegionCodeDecoder.aKA().bv(this.dmj, this.dml);
      return RegionCodeDecoder.aKA().w(this.dmj, this.dml, this.dmk);
    }
    return this.dmk;
  }

  public final String wR()
  {
    return this.duC;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.av
 * JD-Core Version:    0.6.2
 */