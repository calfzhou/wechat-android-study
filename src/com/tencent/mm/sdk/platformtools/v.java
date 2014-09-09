package com.tencent.mm.sdk.platformtools;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class v
{
  private static final Pattern iEd = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
  private static final Pattern iEe = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
  private static final Pattern iEf = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

  public static InetAddress AK(String paramString)
  {
    if (iEd.matcher(paramString).matches())
      return InetAddress.getByName(paramString);
    if ((iEe.matcher(paramString).matches()) || (iEf.matcher(paramString).matches()));
    for (int i = 1; i != 0; i = 0)
      return InetAddress.getByName(paramString);
    throw new UnknownHostException("invalid ipv4 or ipv6 dotted string");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.v
 * JD-Core Version:    0.6.2
 */