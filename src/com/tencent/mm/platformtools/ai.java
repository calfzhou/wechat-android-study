package com.tencent.mm.platformtools;

import com.tencent.mm.ao.b;
import com.tencent.mm.protocal.a.vt;
import com.tencent.mm.protocal.a.ws;

public final class ai
{
  public static String a(vt paramvt)
  {
    if (paramvt == null)
      return null;
    return paramvt.getString();
  }

  public static String a(vt paramvt, String paramString)
  {
    if (paramvt == null)
      return paramString;
    return paramvt.getString();
  }

  public static byte[] a(ws paramws)
  {
    if ((paramws == null) || (paramws.aLL() == null))
      return null;
    return paramws.aLL().toByteArray();
  }

  public static byte[] a(ws paramws, byte[] paramArrayOfByte)
  {
    if ((paramws == null) || (paramws.aLL() == null))
      return paramArrayOfByte;
    return paramws.aLL().toByteArray();
  }

  public static String b(ws paramws)
  {
    if ((paramws == null) || (paramws.aLL() == null))
      return null;
    return paramws.aLL().aFt();
  }

  public static vt iU(String paramString)
  {
    if (paramString == null)
      return null;
    vt localvt = new vt();
    localvt.wF(paramString);
    return localvt;
  }

  public static ws z(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
      return null;
    ws localws = new ws();
    localws.cl(paramArrayOfByte);
    return localws;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.ai
 * JD-Core Version:    0.6.2
 */