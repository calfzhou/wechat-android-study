package com.tencent.mm.sdk.platformtools;

public final class k
{
  public static String aNb()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("[tag ] %s\n", new Object[] { "MicroMessenger_Android_Release #4373" }));
    localStringBuilder.append(String.format("[by  ] %s\n", new Object[] { "/home/android" }));
    localStringBuilder.append(String.format("[host] %s\n", new Object[] { "amm-dev" }));
    localStringBuilder.append(String.format("[time] %s\n", new Object[] { "08/28/2014 02:01 PM" }));
    localStringBuilder.append(String.format("[cmd ] %s\n", new Object[] { "unknown" }));
    localStringBuilder.append(String.format("[rev ] %s\n", new Object[] { "798589" }));
    Object[] arrayOfObject = new Object[1];
    String str = "https://scm-gy.tencent.com/gzrd/gzrd_mail_rep/MicroMsg_proj/branches/android/RB-5.4-v2";
    int i = str.indexOf("MicroMsg_proj");
    if (i < 0);
    while (true)
    {
      arrayOfObject[0] = str;
      localStringBuilder.append(String.format("[path] %s\n", arrayOfObject));
      return localStringBuilder.toString();
      str = str.substring(i);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.k
 * JD-Core Version:    0.6.2
 */