package com.tencent.mm.r;

import com.tencent.mm.a.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

public final class b
{
  private static final d dju = new d(100);
  public String cIA;
  public String diG;
  public String drk;
  public String drl;
  public String drm;
  public String drn;
  public String dro;
  public String drp;
  public String drq;
  public String drr;
  public String drs;

  public static final b fN(String paramString)
  {
    b localb1;
    if (ch.jb(paramString))
    {
      z.e("!32@/B4Tb64lLpI2mIlt4ggMR99w3X13vLwr", "empty xml to parse");
      localb1 = null;
    }
    int j;
    do
    {
      return localb1;
      int i = paramString.indexOf("<qamsg");
      if (i > 0)
        paramString = paramString.substring(i);
      j = paramString.hashCode();
      localb1 = (b)dju.get(Integer.valueOf(j));
    }
    while (localb1 != null);
    Map localMap = x.bB(paramString, "qamsg");
    if (localMap == null)
    {
      z.e("!32@/B4Tb64lLpI2mIlt4ggMR99w3X13vLwr", "parse msg failed");
      return null;
    }
    try
    {
      b localb2 = new b();
      localb2.diG = ((String)localMap.get(".qamsg.$fromUser"));
      localb2.drk = ((String)localMap.get(".qamsg.$fromNickname"));
      localb2.cIA = ((String)localMap.get(".qamsg.$title"));
      localb2.drl = ((String)localMap.get(".qamsg.question.$id"));
      localb2.drm = ((String)localMap.get(".qamsg.question.$fromUser"));
      localb2.drn = ((String)localMap.get(".qamsg.question.content"));
      localb2.dro = ((String)localMap.get(".qamsg.answer.$id"));
      localb2.drp = ((String)localMap.get(".qamsg.answer.$fromUser"));
      localb2.drq = ((String)localMap.get(".qamsg.answer.content"));
      localb2.dro = ((String)localMap.get(".qamsg.answer1.$id"));
      localb2.drr = ((String)localMap.get(".qamsg.answer1.$fromUser"));
      localb2.drs = ((String)localMap.get(".qamsg.answer1.content"));
      dju.b(Integer.valueOf(j), localb2);
      return localb2;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpI2mIlt4ggMR99w3X13vLwr", "parse qamessage xml failed");
    }
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.r.b
 * JD-Core Version:    0.6.2
 */