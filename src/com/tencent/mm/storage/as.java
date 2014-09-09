package com.tencent.mm.storage;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class as
{
  private int cCn = 0;
  private String cJz = "";
  private String cOA;
  private String cOE = "";
  private String cOF = "";
  private int cOn;
  private String cOy;
  private String cOz;
  private String dkC = "";
  private String duA = "";
  private String duB = "";
  private String duC = "";
  private String duF = "";
  private String hlo = "";
  private long ijA = 0L;
  private int ijB = 0;
  private String ijC = "";
  private String ijD = "";
  private String ijE = "";
  private String ijw = "";
  private int ijx = 0;
  private String ijy = "";
  private String ijz = "";
  private String wP = "";

  public static as zl(String paramString)
  {
    as localas = new as();
    String str1 = ch.Y(paramString, "").trim();
    if (!str1.startsWith("<"))
    {
      int i = str1.indexOf(":");
      if (i != -1)
        str1 = str1.substring(i + 1);
    }
    Map localMap = x.bB(str1, "msg");
    if (localMap != null);
    try
    {
      if (localMap.get(".msg.$fromusername") == null)
      {
        localas.ijw = ((String)localMap.get(".msg.$username"));
        if (localMap.get(".msg.$fromnickname") != null)
          break label618;
        localas.duA = ((String)localMap.get(".msg.$nickname"));
        label113: localas.wP = ((String)localMap.get(".msg.$alias"));
        localas.dkC = ((String)localMap.get(".msg.$fullpy"));
        localas.duB = ((String)localMap.get(".msg.$shortpy"));
        localas.cJz = ((String)localMap.get(".msg.$source"));
        localas.ijx = Integer.valueOf((String)localMap.get(".msg.$imagestatus")).intValue();
        localas.cCn = Integer.valueOf((String)localMap.get(".msg.$scene")).intValue();
        localas.ijy = ((String)localMap.get(".msg.$mobileidentify"));
        localas.ijz = ((String)localMap.get(".msg.$mobilelongidentify"));
        if ((localMap.get(".msg.$qqnum") != null) && (((String)localMap.get(".msg.$qqnum")).length() > 0))
          localas.ijA = Long.valueOf((String)localMap.get(".msg.$qqnum")).longValue();
        localas.cOy = ((String)localMap.get(".msg.$sign"));
        if ((localMap.get(".msg.$sex") != null) && (((String)localMap.get(".msg.$sex")).length() > 0))
          localas.cOn = Integer.valueOf((String)localMap.get(".msg.$sex")).intValue();
        localas.cOA = ((String)localMap.get(".msg.$city"));
        localas.cOz = ((String)localMap.get(".msg.$province"));
        localas.duC = ((String)localMap.get(".msg.$qqnickname"));
        localas.duF = ((String)localMap.get(".msg.$qqremark"));
        if (!TextUtils.isEmpty((CharSequence)localMap.get(".msg.$certflag")))
          break label636;
      }
      label618: label636: for (String str2 = "0"; ; str2 = (String)localMap.get(".msg.$certflag"))
      {
        localas.ijB = Integer.valueOf(str2).intValue();
        localas.cOE = ch.ja((String)localMap.get(".msg.$certinfo"));
        localas.ijC = ch.ja((String)localMap.get(".msg.$brandIconUrl"));
        localas.cOF = ch.ja((String)localMap.get(".msg.$regionCode"));
        localas.ijD = ch.ja((String)localMap.get(".msg.$bigheadimgurl"));
        localas.ijE = ch.ja((String)localMap.get(".msg.$smallheadimgurl"));
        localas.hlo = ch.ja((String)localMap.get(".msg.$googlecontact"));
        Object[] arrayOfObject = new Object[3];
        arrayOfObject[0] = localas.ijw;
        arrayOfObject[1] = localas.ijD;
        arrayOfObject[2] = localas.ijE;
        z.d("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "dkavatar FriendContent user:[%s] big:[%s] sm:[%s]", arrayOfObject);
        return localas;
        localas.ijw = ((String)localMap.get(".msg.$fromusername"));
        break;
        localas.duA = ((String)localMap.get(".msg.$fromnickname"));
        break label113;
      }
      return localas;
    }
    catch (Exception localException)
    {
    }
    return localas;
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

  public final String aJU()
  {
    if ((this.duF != null) && (this.duF.length() > 0))
      return this.duF;
    if ((this.duC != null) && (this.duC.length() > 0))
      return this.duC;
    return Long.toString(this.ijA);
  }

  public final String aJV()
  {
    return this.ijz;
  }

  public final String aJW()
  {
    return this.ijC;
  }

  public final String aJX()
  {
    return this.hlo;
  }

  public final String getDisplayName()
  {
    if (!TextUtils.isEmpty(this.duA))
      return this.duA;
    if (!TextUtils.isEmpty(this.wP))
      return this.wP;
    z.f("!32@/B4Tb64lLpLj7S4izLo0fEWYz+HNsMhY", "username is nullOrNil");
    return ch.ja(this.ijw);
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

  public final int jd()
  {
    return this.ijB;
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
    String[] arrayOfString;
    if (!ch.jb(this.cOF))
    {
      arrayOfString = this.cOF.split("_");
      if (arrayOfString.length > 0)
        if ((arrayOfString.length <= 2) || (!RegionCodeDecoder.zS(arrayOfString[0])))
          break label62;
    }
    label62: for (this.cOz = RegionCodeDecoder.aKA().bv(arrayOfString[0], arrayOfString[1]); ; this.cOz = RegionCodeDecoder.aKA().zU(arrayOfString[0]))
      return this.cOz;
  }

  public final String jq()
  {
    String[] arrayOfString;
    if (!ch.jb(this.cOF))
    {
      arrayOfString = this.cOF.split("_");
      if (arrayOfString.length > 0)
      {
        if (arrayOfString.length <= 2)
          break label56;
        this.cOA = RegionCodeDecoder.aKA().w(arrayOfString[0], arrayOfString[1], arrayOfString[2]);
      }
    }
    while (true)
    {
      return this.cOA;
      label56: if (arrayOfString.length == 2)
        this.cOA = RegionCodeDecoder.aKA().bv(arrayOfString[0], arrayOfString[1]);
      else
        this.cOA = "";
    }
  }

  public final String ju()
  {
    return this.cOE;
  }

  public final String wR()
  {
    return this.duC;
  }

  public final String wU()
  {
    return this.duF;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.as
 * JD-Core Version:    0.6.2
 */