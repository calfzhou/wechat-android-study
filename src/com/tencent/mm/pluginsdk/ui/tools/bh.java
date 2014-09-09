package com.tencent.mm.pluginsdk.ui.tools;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class bh
{
  static Pattern sAddressPattern = Pattern.compile("(?:(http|https|file)\\:\\/\\/)?(?:([-A-Za-z0-9$_.+!*'(),;?&=]+(?:\\:[-A-Za-z0-9$_.+!*'(),;?&=]+)?)@)?([a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_-][a-zA-Z0-9 -퟿豈-﷏ﷰ-￯%_\\.-]*|\\[[0-9a-fA-F:\\.]+\\])?(?:\\:([0-9]*))?(\\/?[^#]*)?.*", 2);
  String mAuthInfo;
  String mHost;
  String mPath;
  int mPort;
  String mScheme;

  public bh(String paramString)
  {
    if (paramString == null)
      throw new NullPointerException();
    this.mScheme = "";
    this.mHost = "";
    this.mPort = -1;
    this.mPath = "/";
    this.mAuthInfo = "";
    Matcher localMatcher = sAddressPattern.matcher(paramString);
    String str4;
    if (localMatcher.matches())
    {
      String str1 = localMatcher.group(1);
      if (str1 != null)
        this.mScheme = str1.toLowerCase();
      String str2 = localMatcher.group(2);
      if (str2 != null)
        this.mAuthInfo = str2;
      String str3 = localMatcher.group(3);
      if (str3 != null)
        this.mHost = str3;
      str4 = localMatcher.group(4);
      if ((str4 == null) || (str4.length() <= 0));
    }
    while (true)
    {
      String str5;
      try
      {
        this.mPort = Integer.parseInt(str4);
        str5 = localMatcher.group(5);
        if ((str5 != null) && (str5.length() > 0))
        {
          if (str5.charAt(0) == '/')
            this.mPath = str5;
        }
        else
        {
          if ((this.mPort != 443) || (!this.mScheme.equals("")))
            break label273;
          this.mScheme = "https";
          if (this.mScheme.equals(""))
            this.mScheme = "http";
          return;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new Exception("Bad port");
      }
      this.mPath = ("/" + str5);
      continue;
      throw new Exception("Bad address");
      label273: if (this.mPort == -1)
        if (this.mScheme.equals("https"))
          this.mPort = 443;
        else
          this.mPort = 80;
    }
  }

  public final String toString()
  {
    String str1 = "";
    if (((this.mPort != 443) && (this.mScheme.equals("https"))) || ((this.mPort != 80) && (this.mScheme.equals("http"))))
      str1 = ":" + Integer.toString(this.mPort);
    String str2 = "";
    if (this.mAuthInfo.length() > 0)
      str2 = this.mAuthInfo + "@";
    return this.mScheme + "://" + str2 + this.mHost + str1 + this.mPath;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bh
 * JD-Core Version:    0.6.2
 */