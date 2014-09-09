package com.tencent.mm.booter;

import com.tencent.mm.sdk.platformtools.z;

final class an
{
  int diQ;
  int diR = 1;
  int diS;
  int diT;
  int diU;

  public final boolean ce(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    if ((arrayOfString == null) || (arrayOfString.length != 5))
    {
      z.e("!32@/B4Tb64lLpIUGQfqwvb6Vvq1+gSmGxdU", "error format");
      return false;
    }
    try
    {
      this.diQ = Integer.parseInt(arrayOfString[0]);
      this.diR = Integer.parseInt(arrayOfString[1]);
      this.diS = Integer.parseInt(arrayOfString[2]);
      this.diT = Integer.parseInt(arrayOfString[3]);
      this.diU = Integer.parseInt(arrayOfString[4]);
      return true;
    }
    catch (Exception localException)
    {
      z.e("!32@/B4Tb64lLpIUGQfqwvb6Vvq1+gSmGxdU", "ParseFrom parse failed");
    }
    return false;
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = Integer.valueOf(this.diQ);
    arrayOfObject[1] = Integer.valueOf(this.diR);
    arrayOfObject[2] = Integer.valueOf(this.diS);
    arrayOfObject[3] = Integer.valueOf(this.diT);
    arrayOfObject[4] = Integer.valueOf(this.diU);
    return String.format("%d,%d,%d,%d,%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.an
 * JD-Core Version:    0.6.2
 */